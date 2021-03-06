/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class DvConfig extends TemplateConfig {
	public DvConfig() {
		addNamespaceAlias(-2, "މީޑިއާ");
		addNamespaceAlias(-1, "ޚާއްސަ", "ހާއްޞަ");
		addNamespaceAlias(0, "");
		addNamespaceAlias(1, "ޚިޔާލު");
		addNamespaceAlias(2, "މެމްބަރު");
		addNamespaceAlias(3, "މެމްބަރުގެ_ވާހަކަ");
		addNamespaceAlias(5, "Wikipediaގެ_ވާހަކަ");
		addNamespaceAlias(6, "ފައިލު", "ފައިލް");
		addNamespaceAlias(7, "ފައިލުގެ_ޚިޔާލު", "ފައިލް_ޚިޔާލު");
		addNamespaceAlias(8, "މީޑިއާވިކީ");
		addNamespaceAlias(9, "މިޑިއާވިކީ_ޚިޔާލު", "މީޑިޔާވިކި_ޚިޔާލު");
		addNamespaceAlias(10, "ފަންވަތް");
		addNamespaceAlias(11, "ފަންވަތުގެ_ޚިޔާލު", "ފަންވަތް_ޚިޔާލު");
		addNamespaceAlias(12, "އެހީ");
		addNamespaceAlias(13, "އެހީގެ_ޚިޔާލު", "އެހީ_ޚިޔާލު");
		addNamespaceAlias(14, "ޤިސްމު");
		addNamespaceAlias(15, "ޤިސްމުގެ_ޚިޔާލު", "ޤިސްމު_ޚިޔާލު");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://dv.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "dv";
	}
}
