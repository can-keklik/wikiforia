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

import org.sweble.wikitext.engine.config.I18nAlias;
import org.sweble.wikitext.engine.nodes.EngPage;
import org.sweble.wikitext.engine.nodes.EngProcessedPage;
import org.sweble.wikitext.parser.nodes.WtNode;
import se.lth.cs.nlp.mediawiki.model.Page;
import se.lth.cs.nlp.mediawiki.model.WikipediaPage;
import se.lth.cs.nlp.wikipedia.lang.TemplateConfig;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 * Sweble Wikimarkup to text
 */
public class SwebleWikimarkupToCategory extends SwebleWikimarkupParserBase<WikipediaPage> {

    public SwebleWikimarkupToCategory(TemplateConfig config) {
        super(config);
        this.parse=false;
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

    protected WikipediaPage extractWithoutParse(Page page) {
        TreeSet<String> categoryAliases = this.config.getNamespace("category").getAliases();
        String text = "\n"+ matchCategories(page.getContent(), categoryAliases.first());
        return new WikipediaPage(page, text);
    }

    protected String matchCategories(String content, String categoryAlias){
        char[] haystack = content.toCharArray();
        char[] needle = ("[["+categoryAlias+":").toCharArray();
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
        String out="";
        for(int starting:pins){
            int i=starting+needle.length;
            while((haystack[i]!=']' && haystack[i+1]!=']')){
                i++;
            }
            int ending = i;
            String cat = "";
            boolean fault=false;
            for(int j=starting+2;j<=ending && !fault;j++){
                cat+=haystack[j];
                if(haystack[j]=='[' || haystack[j]==']'){
                    fault=true;
                }
            }
            if(!fault) {
                cat = cat.split("\\|")[0];
                out+=cat.trim()+"\n";
            }
        }
        return out;
    }
}
