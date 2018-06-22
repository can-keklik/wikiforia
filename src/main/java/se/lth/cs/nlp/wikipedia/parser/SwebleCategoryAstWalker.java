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

import de.fau.cs.osr.ptk.common.AstVisitor;
import org.apache.commons.lang.StringUtils;
import org.sweble.wikitext.engine.PageTitle;
import org.sweble.wikitext.engine.config.WikiConfig;
import org.sweble.wikitext.engine.nodes.EngPage;
import org.sweble.wikitext.parser.nodes.*;
import org.sweble.wikitext.parser.parser.LinkTargetException;

import java.util.TreeSet;

/**
 * A Sweble AST walker that extracts text content from the parser AST tree.
 */
public class SwebleCategoryAstWalker extends AstVisitor<WtNode> {
    private final WikiConfig config;

    private StringBuilder sb;

    private String currentSectionTitle;

    private boolean filterOutput;
    private boolean expectSectionTitle;
    private String categoryAlias;

    // =========================================================================

    public SwebleCategoryAstWalker(WikiConfig config, String categoryAlias)
    {
        this.config = config;
        this.categoryAlias = categoryAlias;
    }

    @Override
    protected boolean before(WtNode node)
    {
        // This method is called by go() before visitation starts
        sb = new StringBuilder();
        currentSectionTitle = "";
        expectSectionTitle = false;
        return super.before(node);
    }

    @Override
    protected Object after(WtNode node, Object result)
    {
        return sb.toString();
    }

    // =========================================================================


    public void visit(WtNode n)
    {
        for(WtNode sub:n){
            if(sub instanceof WtInternalLink) {
                WtText text = (WtText)sub.get(0).get(0);
                String content = text.getContent();
                if(content.startsWith(this.categoryAlias)){
                    sb.append(content+"\n");
                }
            }
            visit(sub);
        }

    }

    // =========================================================================

    private boolean isInsideFilteredSection() {
        if(filterOutput) {
            return true;
        }

        if(this.currentSectionTitle.equalsIgnoreCase("See also") ||
                this.currentSectionTitle.equalsIgnoreCase("Notes") ||
                this.currentSectionTitle.equalsIgnoreCase("Writings") ||
                this.currentSectionTitle.equalsIgnoreCase("References") ||
                this.currentSectionTitle.equalsIgnoreCase("Publications") ||
                this.currentSectionTitle.equalsIgnoreCase("Bibliography") ||
                this.currentSectionTitle.equalsIgnoreCase("Bibliografi") ||
                this.currentSectionTitle.equalsIgnoreCase("Further reading") ||
                this.currentSectionTitle.equalsIgnoreCase("External links") ||
                this.currentSectionTitle.equalsIgnoreCase("Se även") ||
                this.currentSectionTitle.equalsIgnoreCase("Källor") ||
                this.currentSectionTitle.equalsIgnoreCase("Externa länkar") ||
                this.currentSectionTitle.equalsIgnoreCase("Referenser") ||
                this.currentSectionTitle.equalsIgnoreCase("Litteratur") ||
                this.currentSectionTitle.equalsIgnoreCase("参见") ||
                this.currentSectionTitle.equalsIgnoreCase("相关条目") ||
                this.currentSectionTitle.equalsIgnoreCase("注释") ||
                this.currentSectionTitle.equalsIgnoreCase("参考资料") ||
                this.currentSectionTitle.equalsIgnoreCase("外部链接") ||
                this.currentSectionTitle.equalsIgnoreCase("参看")) {
            return true;
        } else {
            return false;
        }

    }
}