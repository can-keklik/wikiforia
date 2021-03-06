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

public class BsConfig extends TemplateConfig {
	public BsConfig() {
		addNamespaceAlias(-2, "Mediji", "Medija");
		addNamespaceAlias(-1, "Posebno");
		addNamespaceAlias(1, "Razgovor");
		addNamespaceAlias(2, "Korisnik");
		addNamespaceAlias(3, "Razgovor_sa_korisnikom");
		addNamespaceAlias(5, "Razgovor_{{grammar:instrumental|Wikipedia}}");
		addNamespaceAlias(6, "Datoteka", "Slika");
		addNamespaceAlias(7, "Razgovor_o_datoteci", "Razgovor_o_datoteci");
		addNamespaceAlias(8, "MediaWiki", "MedijaViki");
		addNamespaceAlias(9, "MediaWiki_razgovor", "Razgovor_o_MedijaVikiju");
		addNamespaceAlias(10, "Šablon");
		addNamespaceAlias(11, "Razgovor_o_šablonu");
		addNamespaceAlias(12, "Pomoć");
		addNamespaceAlias(13, "Razgovor_o_pomoći");
		addNamespaceAlias(14, "Kategorija");
		addNamespaceAlias(15, "Razgovor_o_kategoriji");

		addI18nCIAlias("redirect", "#PREUSMJERI", "#REDIRECT");
		addI18nCIAlias("notoc", "__BEZSADRŽAJA__", "__NOTOC__");
		addI18nCIAlias("nogallery", "__BEZGALERIJE__", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__FORSIRANISADRŽAJ__", "__FORCETOC__");
		addI18nCIAlias("toc", "__SADRŽAJ__", "__TOC__");
		addI18nCIAlias("noeditsection", "__BEZ_IZMJENA__", "__BEZIZMJENA__", "__NOEDITSECTION__");
		addI18nAlias("currentmonth", "TRENUTNIMJESEC", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "TRENUTNIMJESEC1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "TRENUTNIMJESECIME", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "TRENUTNIMJESECROD", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "TRENUTNIMJESECSKR", "CURRENTMONTHABBREV");
		addI18nAlias("currentday", "TRENUTNIDAN", "CURRENTDAY");
		addI18nAlias("currentday2", "TRENUTNIDAN2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "TRENUTNIDANIME", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "TRENUTNAGODINA", "CURRENTYEAR");
		addI18nAlias("currenttime", "TRENUTNOVRIJEME", "CURRENTTIME");
		addI18nAlias("currenthour", "TRENUTNISAT", "CURRENTHOUR");
		addI18nAlias("localmonth", "LOKALNIMJESEC", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonth1", "LOKALNIMJESEC1", "LOCALMONTH1");
		addI18nAlias("localmonthname", "LOKALNIMJESECIME", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "LOKALNIMJESECIMEROD", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "LOKALNIMJESECSKR", "LOCALMONTHABBREV");
		addI18nAlias("localday", "LOKALNIDAN", "LOCALDAY");
		addI18nAlias("localday2", "LOKALNIDAN2", "LOCALDAY2");
		addI18nAlias("localdayname", "LOKALNIDANIME", "LOCALDAYNAME");
		addI18nAlias("localyear", "LOKALNAGODINA", "LOCALYEAR");
		addI18nAlias("localtime", "LOKALNOVRIJEME", "LOCALTIME");
		addI18nAlias("localhour", "LOKALNISAT", "LOCALHOUR");
		addI18nAlias("numberofpages", "BROJSTRANICA", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "BROJČLANAKA", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "BROJDATOTEKA", "BROJFAJLOVA", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "BROJKORISNIKA", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "BROJAKTIVNIHKORISNIKA", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "BROJPROMJENA", "NUMBEROFEDITS");
		addI18nAlias("numberofviews", "BROJPREGLEDA", "NUMBEROFVIEWS");
		addI18nAlias("pagename", "STRANICA", "PAGENAME");
		addI18nAlias("pagenamee", "STRANICE", "PAGENAMEE");
		addI18nAlias("namespace", "IMENSKIPROSTOR", "NAMESPACE");
		addI18nAlias("namespacee", "IMENSKIPROSTORI", "NAMESPACEE");
		addI18nAlias("talkspace", "PROSTORZARAZGOVOR", "TALKSPACE");
		addI18nAlias("talkspacee", "PROSTORIZARAZGOVOR", "TALKSPACEE");
		addI18nAlias("subjectspace", "PROSTORSUBJEKTA", "PROSTORCLANAKA", "SUBJECTSPACE", "ARTICLESPACE");
		addI18nAlias("subjectspacee", "PROSTORISUBJEKTA", "PROSTORICLANKA", "SUBJECTSPACEE", "ARTICLESPACEE");
		addI18nAlias("fullpagename", "PUNOIMESTRANE", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "PUNOIMESTRANEE", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "IMEPODSTRANICE", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "IMENAPODSTRANICE", "SUBPAGENAMEE");
		addI18nAlias("basepagename", "IMEBAZNESTRANICE", "BASEPAGENAME");
		addI18nAlias("basepagenamee", "IMENABAZNESTRANICE", "BASEPAGENAMEE");
		addI18nAlias("talkpagename", "IMESTRANICERAZGOVORA", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "IMENASTRANICERAZGOVORA", "TALKPAGENAMEE");
		addI18nAlias("subjectpagename", "IMESTRANICESUBKJEKTA", "IMESTRANICECLANKA", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
		addI18nAlias("subjectpagenamee", "IMENASTRANICESUBJEKTA", "IMENASTRANICECLANAKA", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
		addI18nCIAlias("msg", "POR:", "MSG:");
		addI18nCIAlias("subst", "ZAMJENI:", "SUBST:");
		addI18nCIAlias("msgnw", "NVPOR:", "MSGNW:");
		addI18nAlias("img_thumbnail", "mini", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "mini=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "desno", "d", "right");
		addI18nAlias("img_left", "lijevo", "l", "left");
		addI18nAlias("img_none", "n", "bez", "none");
		addI18nAlias("img_width", "$1piksel", "$1p", "$1px");
		addI18nAlias("img_center", "centar", "c", "center", "centre");
		addI18nAlias("img_framed", "okvir", "ram", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "bez_okvira", "frameless");
		addI18nAlias("img_page", "stranica=$1", "stranica $1", "page=$1", "page $1");
		addI18nAlias("img_upright", "na_gore", "na_gore=$1", "na_gore_$1", "upright", "upright=$1", "upright $1");
		addI18nAlias("img_border", "granica", "border");
		addI18nAlias("img_baseline", "pocetna_linija", "baseline");
		addI18nAlias("img_sub", "odjeljak", "sub");
		addI18nAlias("img_top", "vrh", "top");
		addI18nAlias("img_text_top", "vrh_teksta", "text-top");
		addI18nAlias("img_middle", "sredina", "middle");
		addI18nAlias("img_bottom", "dugme", "bottom");
		addI18nAlias("img_text_bottom", "tekst-dugme", "text-bottom");
		addI18nAlias("sitename", "IMESAJTA", "SITENAME");
		addI18nCIAlias("ns", "IP:", "NS:");
		addI18nCIAlias("localurl", "LOKALNAADRESA:", "LOCALURL:");
		addI18nCIAlias("localurle", "LOKALNEADRESE:", "LOCALURLE:");
		addI18nCIAlias("servername", "IMESERVERA", "SERVERNAME");
		addI18nCIAlias("scriptpath", "SKRIPTA", "SCRIPTPATH");
		addI18nCIAlias("grammar", "GRAMATIKA:", "GRAMMAR:");
		addI18nCIAlias("gender", "POL:", "GENDER:");
		addI18nCIAlias("notitleconvert", "__BEZTC__", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__BEZCC__", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("currentweek", "TRENUTNASEDMICA", "CURRENTWEEK");
		addI18nAlias("currentdow", "TRENUTNIDOV", "CURRENTDOW");
		addI18nAlias("localweek", "LOKALNASEDMICA", "LOCALWEEK");
		addI18nAlias("revisionid", "IDREVIZIJE", "REVISIONID");
		addI18nAlias("revisionday", "REVIZIJEDANA", "REVISIONDAY");
		addI18nAlias("revisionday2", "REVIZIJEDANA2", "REVISIONDAY2");
		addI18nAlias("revisionmonth", "REVIZIJAMJESECA", "REVISIONMONTH");
		addI18nAlias("revisionyear", "REVIZIJAGODINE", "REVISIONYEAR");
		addI18nAlias("revisiontimestamp", "REVIZIJAVREMENSKOGPECATA", "REVISIONTIMESTAMP");
		addI18nCIAlias("plural", "MNOŽINA:", "PLURAL:");
		addI18nCIAlias("fullurl", "PUNURL:", "FULLURL:");
		addI18nCIAlias("fullurle", "PUNURLE:", "FULLURLE:");
		addI18nCIAlias("lcfirst", "LCPRVI:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "UCPRVI:", "UCFIRST:");
		addI18nAlias("displaytitle", "POKAZINASLOV", "DISPLAYTITLE");
		addI18nAlias("newsectionlink", "__LINKNOVESEKCIJE__", "__NEWSECTIONLINK__");
		addI18nAlias("currentversion", "SADASNJAVERZIJA", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "DEKODIRAJADRESU", "URLENCODE:");
		addI18nAlias("currenttimestamp", "SADASNJIVREMENSKIPECAT", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "LOKALNIVREMENSKIPECAT", "LOCALTIMESTAMP");
		addI18nCIAlias("language", "#JEZIK:", "#LANGUAGE:");
		addI18nAlias("pagesinnamespace", "STRANICEUIMENSKOMPROSTORU:", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "BROJADMINISTRATORA", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "NUMERICKIFORMAT", "FORMATNUM");
		addI18nCIAlias("padleft", "JASTUKLIJEVO", "PADLEFT");
		addI18nCIAlias("padright", "JASTUKDESNO", "PADRIGHT");
		addI18nCIAlias("special", "specijalno", "special");
		addI18nCIAlias("filepath", "STAZADATOTEKE:", "FILEPATH:");
		addI18nCIAlias("tag", "oznaka", "tag");
		addI18nAlias("hiddencat", "__SAKRIVENAKATEGORIJA__", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "STRANICEUKATEGORIJI", "STRANICEUKAT", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "VELICINASTRANICE", "PAGESIZE");
		addI18nAlias("index", "__SADRZAJ__", "__INDEX__");
		addI18nAlias("noindex", "__BEZSADRZAJA__", "__NOINDEX__");
		addI18nAlias("numberingroup", "BROJUGRUPI", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__STATISTICNOPREUSMJERENJE__", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "NIVOZASTITE", "PROTECTIONLEVEL");
		addI18nCIAlias("formatdate", "formatdatuma", "formatdate", "dateformat");
		addI18nCIAlias("url_path", "PUTANJA", "PATH");
		addI18nCIAlias("url_query", "UPIT", "QUERY");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://bs.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "bs";
	}
}
