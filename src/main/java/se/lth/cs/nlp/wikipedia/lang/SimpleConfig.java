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

import org.apache.commons.lang.StringUtils;
import se.lth.cs.nlp.mediawiki.model.Page;
import se.lth.cs.nlp.wikipedia.WikipediaPageType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleConfig extends TemplateConfig {
	public SimpleConfig() {
		addNamespaceAlias(-2, "Media");
		addNamespaceAlias(-1, "Special");
		addNamespaceAlias(0, "");
		addNamespaceAlias(1, "Talk");
		addNamespaceAlias(2, "User");
		addNamespaceAlias(3, "User_talk");
		addNamespaceAlias(5, "Wikipedia_talk");
		addNamespaceAlias(6, "File");
		addNamespaceAlias(7, "File_talk");
		addNamespaceAlias(8, "MediaWiki");
		addNamespaceAlias(9, "MediaWiki_talk");
		addNamespaceAlias(10, "Template");
		addNamespaceAlias(11, "Template_talk");
		addNamespaceAlias(12, "Help");
		addNamespaceAlias(13, "Help_talk");
		addNamespaceAlias(14, "Category");
		addNamespaceAlias(15, "Category_talk");

		addI18nCIAlias("redirect", "#REDIRECT");
		addI18nCIAlias("notoc", "__NOTOC__");
		addI18nCIAlias("nogallery", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__FORCETOC__");
		addI18nCIAlias("toc", "__TOC__");
		addI18nCIAlias("noeditsection", "__NOEDITSECTION__");
		addI18nAlias("!", "!");
		addI18nAlias("currentmonth", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "CURRENTMONTHABBREV");
		addI18nAlias("currentday", "CURRENTDAY");
		addI18nAlias("currentday2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "CURRENTYEAR");
		addI18nAlias("currenttime", "CURRENTTIME");
		addI18nAlias("currenthour", "CURRENTHOUR");
		addI18nAlias("localmonth", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonth1", "LOCALMONTH1");
		addI18nAlias("localmonthname", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "LOCALMONTHABBREV");
		addI18nAlias("localday", "LOCALDAY");
		addI18nAlias("localday2", "LOCALDAY2");
		addI18nAlias("localdayname", "LOCALDAYNAME");
		addI18nAlias("localyear", "LOCALYEAR");
		addI18nAlias("localtime", "LOCALTIME");
		addI18nAlias("localhour", "LOCALHOUR");
		addI18nAlias("numberofpages", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "NUMBEROFEDITS");
		addI18nAlias("pagename", "PAGENAME");
		addI18nAlias("pagenamee", "PAGENAMEE");
		addI18nAlias("namespace", "NAMESPACE");
		addI18nAlias("namespacee", "NAMESPACEE");
		addI18nAlias("namespacenumber", "NAMESPACENUMBER");
		addI18nAlias("talkspace", "TALKSPACE");
		addI18nAlias("talkspacee", "TALKSPACEE");
		addI18nAlias("subjectspace", "SUBJECTSPACE", "ARTICLESPACE");
		addI18nAlias("subjectspacee", "SUBJECTSPACEE", "ARTICLESPACEE");
		addI18nAlias("fullpagename", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "SUBPAGENAMEE");
		addI18nAlias("rootpagename", "ROOTPAGENAME");
		addI18nAlias("rootpagenamee", "ROOTPAGENAMEE");
		addI18nAlias("basepagename", "BASEPAGENAME");
		addI18nAlias("basepagenamee", "BASEPAGENAMEE");
		addI18nAlias("talkpagename", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "TALKPAGENAMEE");
		addI18nAlias("subjectpagename", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
		addI18nAlias("subjectpagenamee", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
		addI18nCIAlias("msg", "MSG:");
		addI18nCIAlias("subst", "SUBST:");
		addI18nCIAlias("safesubst", "SAFESUBST:");
		addI18nCIAlias("msgnw", "MSGNW:");
		addI18nAlias("img_thumbnail", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "right");
		addI18nAlias("img_left", "left");
		addI18nAlias("img_none", "none");
		addI18nAlias("img_width", "$1px");
		addI18nAlias("img_center", "center", "centre");
		addI18nAlias("img_framed", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "frameless");
		addI18nAlias("img_lang", "lang=$1");
		addI18nAlias("img_page", "page=$1", "page $1");
		addI18nAlias("img_upright", "upright", "upright=$1", "upright $1");
		addI18nAlias("img_border", "border");
		addI18nAlias("img_baseline", "baseline");
		addI18nAlias("img_sub", "sub");
		addI18nAlias("img_super", "super", "sup");
		addI18nAlias("img_top", "top");
		addI18nAlias("img_text_top", "text-top");
		addI18nAlias("img_middle", "middle");
		addI18nAlias("img_bottom", "bottom");
		addI18nAlias("img_text_bottom", "text-bottom");
		addI18nAlias("img_link", "link=$1");
		addI18nAlias("img_alt", "alt=$1");
		addI18nAlias("img_class", "class=$1");
		addI18nCIAlias("int", "INT:");
		addI18nAlias("sitename", "SITENAME");
		addI18nCIAlias("ns", "NS:");
		addI18nCIAlias("nse", "NSE:");
		addI18nCIAlias("localurl", "LOCALURL:");
		addI18nCIAlias("localurle", "LOCALURLE:");
		addI18nCIAlias("articlepath", "ARTICLEPATH");
		addI18nCIAlias("pageid", "PAGEID");
		addI18nCIAlias("server", "SERVER");
		addI18nCIAlias("servername", "SERVERNAME");
		addI18nCIAlias("scriptpath", "SCRIPTPATH");
		addI18nCIAlias("stylepath", "STYLEPATH");
		addI18nCIAlias("grammar", "GRAMMAR:");
		addI18nCIAlias("gender", "GENDER:");
		addI18nCIAlias("notitleconvert", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("currentweek", "CURRENTWEEK");
		addI18nAlias("currentdow", "CURRENTDOW");
		addI18nAlias("localweek", "LOCALWEEK");
		addI18nAlias("localdow", "LOCALDOW");
		addI18nAlias("revisionid", "REVISIONID");
		addI18nAlias("revisionday", "REVISIONDAY");
		addI18nAlias("revisionday2", "REVISIONDAY2");
		addI18nAlias("revisionmonth", "REVISIONMONTH");
		addI18nAlias("revisionmonth1", "REVISIONMONTH1");
		addI18nAlias("revisionyear", "REVISIONYEAR");
		addI18nAlias("revisiontimestamp", "REVISIONTIMESTAMP");
		addI18nAlias("revisionuser", "REVISIONUSER");
		addI18nAlias("revisionsize", "REVISIONSIZE");
		addI18nCIAlias("plural", "PLURAL:");
		addI18nCIAlias("fullurl", "FULLURL:");
		addI18nCIAlias("fullurle", "FULLURLE:");
		addI18nCIAlias("canonicalurl", "CANONICALURL:");
		addI18nCIAlias("canonicalurle", "CANONICALURLE:");
		addI18nCIAlias("lcfirst", "LCFIRST:");
		addI18nCIAlias("ucfirst", "UCFIRST:");
		addI18nCIAlias("lc", "LC:");
		addI18nCIAlias("uc", "UC:");
		addI18nCIAlias("raw", "RAW:");
		addI18nAlias("displaytitle", "DISPLAYTITLE");
		addI18nAlias("rawsuffix", "R");
		addI18nCIAlias("nocommafysuffix", "NOSEP");
		addI18nAlias("newsectionlink", "__NEWSECTIONLINK__");
		addI18nAlias("nonewsectionlink", "__NONEWSECTIONLINK__");
		addI18nAlias("currentversion", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "URLENCODE:");
		addI18nCIAlias("anchorencode", "ANCHORENCODE");
		addI18nAlias("currenttimestamp", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "LOCALTIMESTAMP");
		addI18nAlias("directionmark", "DIRECTIONMARK", "DIRMARK");
		addI18nCIAlias("language", "#LANGUAGE:");
		addI18nAlias("contentlanguage", "CONTENTLANGUAGE", "CONTENTLANG");
		addI18nAlias("pagesinnamespace", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "FORMATNUM");
		addI18nCIAlias("padleft", "PADLEFT");
		addI18nCIAlias("padright", "PADRIGHT");
		addI18nCIAlias("special", "special");
		addI18nCIAlias("speciale", "speciale");
		addI18nAlias("defaultsort", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "FILEPATH:");
		addI18nCIAlias("tag", "tag");
		addI18nAlias("hiddencat", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "PAGESIZE");
		addI18nAlias("index", "__INDEX__");
		addI18nAlias("noindex", "__NOINDEX__");
		addI18nAlias("numberingroup", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "PROTECTIONLEVEL");
		addI18nAlias("cascadingsources", "CASCADINGSOURCES");
		addI18nCIAlias("formatdate", "formatdate", "dateformat");
		addI18nCIAlias("url_path", "PATH");
		addI18nCIAlias("url_wiki", "WIKI");
		addI18nCIAlias("url_query", "QUERY");
		addI18nCIAlias("noerror", "defaultsort_noerror","displaytitle_noerror");
		addI18nCIAlias("noreplace", "defaultsort_noreplace", "displaytitle_noreplace");
		addI18nCIAlias("pagesincategory_all", "all");
		addI18nCIAlias("pagesincategory_pages", "pages");
		addI18nCIAlias("pagesincategory_subcats", "subcats");
		addI18nCIAlias("pagesincategory_files", "files");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://simple.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "simple";
	}

	private static final Pattern stubTextPattern = Pattern.compile("\\{\\{\\s*?(.*?stub)\\s*?\\}\\}", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	private static final Pattern disambiguationTextPattern = Pattern.compile("\\{\\{\\.*?(disambiguation|disambig|disamb|geodis|hndis|dab)\\.*?\\}\\}", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	private static final Pattern listTitlePattern = Pattern.compile("(^list\\s+of)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.DOTALL);
	private static final Pattern disambiguationTitlePattern = Pattern.compile(".*?\\((\\s)*disambiguation(\\s)*\\)", Pattern.CASE_INSENSITIVE);
	private static final Pattern templateContent = Pattern.compile("\\{\\{(.+)?\\}\\}");

	private static final String[] disambiguationParts = {"disambiguation", "disambig", "disamb", "geodis", "hndis", "dab"};

	public static boolean matchDisambiguation(String text) {
		Matcher matcher = templateContent.matcher(text);
		while(matcher.find()) {
			String templateContent = matcher.group(1).toLowerCase();
			for (String disambiguationPart : disambiguationParts) {
				if(templateContent.contains(disambiguationPart))
					return true;
			}
		}

		return false;
	}

	public static boolean matchStub(String text) {
		Matcher matcher = templateContent.matcher(text);
		while(matcher.find()) {
			String templateContent = matcher.group(1);
			if(StringUtils.containsIgnoreCase("stub", text))
				return true;
		}

		return false;
	}

	@Override
	public WikipediaPageType classifyPageType(Page page) {
		WikipediaPageType type = super.classifyPageType(page);
		if(type == WikipediaPageType.ARTICLE) {
			//Matcher matcher = disambiguationTextPattern.matcher(page.getContent());
			if(matchDisambiguation(page.getContent()) || disambiguationTitlePattern.matcher(page.getTitle()).find() ) {
				return WikipediaPageType.DISAMBIGUATION;
			}

			//Matcher matcher = stubTextPattern.matcher(page.getContent());
			if(matchStub(page.getContent())) {
				return WikipediaPageType.STUB;
			}

			if(listTitlePattern.matcher(page.getTitle()).find())
				return WikipediaPageType.LIST;

			return WikipediaPageType.ARTICLE;
		}
		else
			return type;
	}
}
