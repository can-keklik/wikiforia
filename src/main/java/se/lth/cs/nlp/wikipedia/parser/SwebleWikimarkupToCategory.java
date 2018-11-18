/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.lth.cs.nlp.wikipedia.parser;

import org.apache.commons.collections.set.UnmodifiableSet;
import org.sweble.wikitext.engine.config.I18nAlias;
import org.sweble.wikitext.engine.nodes.EngPage;
import org.sweble.wikitext.engine.nodes.EngProcessedPage;
import org.sweble.wikitext.parser.nodes.WtNode;
import se.lth.cs.nlp.mediawiki.model.Page;
import se.lth.cs.nlp.mediawiki.model.WikipediaPage;
import se.lth.cs.nlp.wikipedia.lang.TemplateConfig;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Sweble Wikimarkup to text
 */
public class SwebleWikimarkupToCategory extends SwebleWikimarkupParserBase<WikipediaPage> {

    private boolean templates = false;
    private Set allowedTags = null;

    public SwebleWikimarkupToCategory(TemplateConfig config) {
        super(config);
        this.parse=true;
    }

    public SwebleWikimarkupToCategory(TemplateConfig config, boolean templates) {
        super(config);
        this.parse=true;
        this.templates = true;
    }

    private final Pattern trimLineStartFix = Pattern.compile("^[\\t ]+", Pattern.MULTILINE);
    private final Pattern trimLineEndFix = Pattern.compile("[\\t ]+$", Pattern.MULTILINE);

    @Override
    protected WikipediaPage extract(Page page, EngProcessedPage cp) {
        TreeSet<String> categoryAliases = this.config.getNamespace("category").getAliases();
        SwebleCategoryAstWalker walker = new SwebleCategoryAstWalker(config, categoryAliases.first());
        String text = (String)walker.go(cp.getPage());
        text= "\n"+text;
        return new WikipediaPage(page, text);
    }

    public void constructAllowedTags(String path){
        HashSet<String> tags = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                tags.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.allowedTags = Collections.unmodifiableSet(tags);
    }

    protected WikipediaPage extractWithoutParse(Page page) {
        TreeSet<String> categoryAliases = this.config.getNamespace("category").getAliases();
        String text = null;
        if(this.templates){
            text = "\n"+ matchTemplates(page.getContent());
        }else{
            text = "\n"+ matchCategories(page.getContent(), categoryAliases.first());
            if(allowedTags!=null){
                text += matchTags(page.getContent()) + matchTemplates(page.getContent());
            }
        }
        return new WikipediaPage(page, text);
    }

    protected String matchCategories(String content, String categoryAlias){
        return match(content,"[["+categoryAlias,"]]", true,null,null);
    }

    protected String matchTemplates(String content){

        return match(content,"{{tl|","}}", false,null ,null);
    }
    protected String matchTags(String content){
        return match(content,"{{","}}", false, allowedTags, "Graph!Tag:");
    }

    protected String match(String content, String prefix, String suffix, boolean splitPipes, Set allowedContent, String cpref){
        char[] haystack = content.toCharArray();
        char[] closing = suffix.toCharArray();
        char[] needle = (prefix).toCharArray();
        ArrayList<Integer> pins = new ArrayList<Integer>();
        for(int i=0; i<haystack.length-needle.length;i++){
            int j=0;
            boolean brk=false;
            while(j<needle.length && !brk) {
                if (haystack[i + j] == needle[j]) {
                    j++;
                }else{
                    brk=true;
                }
            }
            if(!brk){
                pins.add(i);
            }
        }
        StringBuilder out = new StringBuilder();
        for(int starting:pins){
            int i=starting+needle.length;
            boolean closingFound=false;
            do {
                boolean different=false;
                int length = closing.length;
                for (int k=0;(k<length && !different);k++){
                    if(haystack[i+k]!=closing[k]){
                        different = true;
                    }
                }
                if(different){
                    i++;
                }else{
                    closingFound = true;
                }
            }while(!closingFound);

            StringBuilder cat = new StringBuilder();
            boolean fault=false;
            for(int j=starting+2;j<i && !fault;j++){
                cat.append(haystack[j]);
                /*if(haystack[j]=='[' || haystack[j]==']'){
                    fault=true;
                }
                if(haystack[j]=='{' || haystack[j]=='}'){
                    fault=true;
                }*/
            }
            if(allowedContent!=null && !allowedContent.contains(cat.toString()))
            {
                fault=true;
            }
            if(!fault) {
                String catF = null;
                if(splitPipes) {
                    catF = cat.toString().split("\\|")[0].trim();
                }else{
                    catF = cat.toString().trim();
                }
                if(cpref!=null){
                    catF=cpref+catF;
                }
                if(!catF.equals("")) {
                    out.append(catF).append("\n");
                }
            }
        }
        return out.toString();
    }
}
