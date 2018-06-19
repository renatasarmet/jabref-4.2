package org.jabref.logic.importer.fileformat;

import org.jabref.logic.importer.ImportFormatPreferences;
import org.jabref.logic.importer.fileformat.endnote.*;
import org.jabref.logic.importer.fileformat.endnote.Number;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class EndnoteRecordTest {
    private Record record;
    private Database database;
    private String recnumber;
    private RemoteDatabaseProvider remoteDatabaseProvider;
    private Language language;
    private ImageUrls imageUrls;
    private RelatedUrls relatedUrls;
    private TextUrls textUrls;
    private PdfUrls pdfUrls;
    private WebUrls weburls;
    private Url url;
    private Urls urls;
    private AccessDate accessDate;
    private ModifiedDate modifiedDate;
    private Custom1 custom1;
    private Custom2 custom2;
    private Custom3 custom3;
    private Custom4 custom4;
    private Custom5 custom5;
    private Custom6 custom6;
    private Custom7 custom7;
    private Misc1 misc1;
    private Misc2 misc2;
    private Misc3 misc3;
    private Style style;
    private AuthAddress authAddress;
    private AuthAffiliaton authAffiliaton;
    private Title title;
    private SecondaryTitle secondaryTitle;
    private TertiaryTitle tertiaryTitle;
    private AltTitle altTitle;
    private ShortTitle shortTitle;
    private TranslatedTitle translatedTitle;
    private Titles titles;
    private FullTitle fullTitle;
    private Abbr1 abbr1;
    private Abbr2 abbr2;
    private Abbr3 abbr3;
    private Pages pages;
    private Volume volume;
    private NumVols numVols;
    private Edition edition;
    private Section section;
    private ReprintEdition reprintEdition;
    private ReprintStatus reprintStatus;
    private Keyword keyword;
    private Keywords keywords;
    private Dates dates;
    private Year year;
    private PubDates pubDates;
    private CopyrightDates copyrightDates;
    private ReviewedItem reviewedItem;
    private Availability availability;
    private RemoteSource remoteSource;
    private MeetingPlace meetingPlace;
    private WorkLocation workLocation;
    private WorkExtent workExtent;
    private PackMethod packMethod;
    private Date date;
    private SourceApp sourceApp;
    private RefType refType;
    private Number number;
    private Issue issue;
    private SecondaryVolume secondaryVolume;
    private SecondaryIssue secodaryissue;
    private PubLocation publocation;
    private Publisher publisher;
    private OrigPub origpub;
    private Isbn isbn;
    private AccessionNum accessionnum;
    private CallNum callnum;
    private ReportId reportid;
    private Coden coden;
    private ElectronicResourceNum electronicresourcenum;
    private Abstract abstractt;
    private Label label;
    private Image image;
    private Caption caption;
    private Notes notes;
    private ResearchNotes researchnotes;
    private WorkType worktype;
    private Size size;
    private ReproRatio reproratio;
    private RemoteDatabaseName remotedatabasename;
    private Author author;
    private Authors authors;
    private Contributors contributors;
    private SecondaryAuthors secondaryauthors;
    private TertiaryAuthors tertiaryauthors;
    private SubsidiaryAuthors subsidiaryauthors;
    private TranslatedAuthors translatedauthors;
    private Periodical periodical;
    private Records records;
    private Xml xml;

    @BeforeEach
    public void setUp() {
        database = new ObjectFactory().createDatabase();
        record = new ObjectFactory().createRecord();
        remoteDatabaseProvider = new ObjectFactory().createRemoteDatabaseProvider();
        language = new ObjectFactory().createLanguage();
        imageUrls = new ObjectFactory().createImageUrls();
        relatedUrls = new ObjectFactory().createRelatedUrls();
        textUrls = new ObjectFactory().createTextUrls();
        pdfUrls = new ObjectFactory().createPdfUrls();
        weburls = new ObjectFactory().createWebUrls();
        url = new ObjectFactory().createUrl();
        urls = new ObjectFactory().createUrls();
        accessDate = new ObjectFactory().createAccessDate();
        modifiedDate = new ObjectFactory().createModifiedDate();
        custom1 = new ObjectFactory().createCustom1();
        custom2 = new ObjectFactory().createCustom2();
        custom3 = new ObjectFactory().createCustom3();
        custom4 = new ObjectFactory().createCustom4();
        custom5 = new ObjectFactory().createCustom5();
        custom6 = new ObjectFactory().createCustom6();
        custom7 = new ObjectFactory().createCustom7();
        misc1 = new ObjectFactory().createMisc1();
        misc2 = new ObjectFactory().createMisc2();
        misc3 = new ObjectFactory().createMisc3();
        style = new ObjectFactory().createStyle();
        authAddress = new ObjectFactory().createAuthAddress();
        authAffiliaton = new ObjectFactory().createAuthAffiliaton();
        title = new ObjectFactory().createTitle();
        secondaryTitle = new ObjectFactory().createSecondaryTitle();
        tertiaryTitle = new ObjectFactory().createTertiaryTitle();
        altTitle = new ObjectFactory().createAltTitle();
        shortTitle = new ObjectFactory().createShortTitle();
        translatedTitle = new ObjectFactory().createTranslatedTitle();
        titles = new ObjectFactory().createTitles();
        fullTitle =  new ObjectFactory().createFullTitle();
        abbr1 = new ObjectFactory().createAbbr1();
        abbr2 =  new ObjectFactory().createAbbr2();
        abbr3 = new ObjectFactory().createAbbr3();
        pages = new ObjectFactory().createPages();
        volume = new ObjectFactory().createVolume();
        numVols = new ObjectFactory().createNumVols();
        edition = new ObjectFactory().createEdition();
        section = new ObjectFactory().createSection();
        reprintEdition = new ObjectFactory().createReprintEdition();
        reprintStatus = new ObjectFactory().createReprintStatus();
        keyword = new ObjectFactory().createKeyword();
        keywords = new ObjectFactory().createKeywords();
        dates = new ObjectFactory().createDates();
        year = new ObjectFactory().createYear();
        pubDates = new ObjectFactory().createPubDates();
        copyrightDates = new ObjectFactory().createCopyrightDates();
        reviewedItem = new ObjectFactory().createReviewedItem();
        availability = new ObjectFactory().createAvailability();
        remoteSource = new ObjectFactory().createRemoteSource();
        meetingPlace = new ObjectFactory().createMeetingPlace();
        workLocation = new ObjectFactory().createWorkLocation();
        workExtent = new ObjectFactory().createWorkExtent();
        packMethod = new ObjectFactory().createPackMethod();
        date = new ObjectFactory().createDate();
        sourceApp = new ObjectFactory().createSourceApp();
        refType = new ObjectFactory().createRefType();
        number = new ObjectFactory().createNumber();
        issue = new ObjectFactory().createIssue();
        secondaryVolume = new ObjectFactory().createSecondaryVolume();
        secodaryissue = new ObjectFactory().createSecondaryIssue();
        publocation = new ObjectFactory().createPubLocation();
        publisher = new ObjectFactory().createPublisher();
        origpub = new ObjectFactory().createOrigPub();
        isbn = new ObjectFactory().createIsbn();
        accessionnum = new ObjectFactory().createAccessionNum();
        callnum = new ObjectFactory().createCallNum();
        reportid = new ObjectFactory().createReportId();
        coden = new ObjectFactory().createCoden();
        electronicresourcenum = new ObjectFactory().createElectronicResourceNum();
        abstractt = new ObjectFactory().createAbstract();
        label = new ObjectFactory().createLabel();
        image = new ObjectFactory().createImage();
        caption = new ObjectFactory().createCaption();
        notes = new ObjectFactory().createNotes();
        researchnotes = new ObjectFactory().createResearchNotes();
        worktype = new ObjectFactory().createWorkType();
        size = new ObjectFactory().createSize();
        reproratio  = new ObjectFactory().createReproRatio();
        remotedatabasename = new ObjectFactory().createRemoteDatabaseName();
        author = new ObjectFactory().createAuthor();
        authors = new ObjectFactory().createAuthors();
        contributors = new ObjectFactory().createContributors();
        secondaryauthors = new ObjectFactory().createSecondaryAuthors();
        tertiaryauthors = new ObjectFactory().createTertiaryAuthors();
        subsidiaryauthors = new ObjectFactory().createSubsidiaryAuthors();
        translatedauthors = new ObjectFactory().createTranslatedAuthors();
        periodical = new ObjectFactory().createPeriodical();
        records = new ObjectFactory().createRecords();
        xml = new ObjectFactory().createXml();
    }


    public void comparaStyle(Style expected){
        assertEquals(style.getColor(), expected.getColor());
        assertEquals(style.getFace(), expected.getFace());
        assertEquals(style.getFont(), expected.getFont());
        assertEquals(style.getSize(), expected.getSize());
        assertEquals(style.getvalue(), expected.getvalue());
    }

    /* INICIO TESTE DA CLASSE DATABASE PARA USAR EM RECORD */

    @Test
    public void testGetDatabaseName() {
        database.setName("Name Test");
        assertEquals("Name Test", database.getName());
    }

    @Test
    public void testGetDatabasePath() {
        database.setPath("Path Teste");
        assertEquals("Path Teste", database.getPath());
    }

    @Test
    public void testGetDatabaseValue() {
        database.setvalue("Value Teste");
        assertEquals("Value Teste", database.getvalue());
    }

    /* FIM TESTE DATABASE */

      /* INICIO TESTES DA CLASSE URL */

     @Test
     public void testGetHasUtUrl(){
         url.setHasUt("Ut Test");
         assertEquals("Ut Test", url.getHasUt());
     }

     @Test
     public void testPpvAppUrl(){
         url.setPpvApp("PvpApp Test");
         assertEquals("PvpApp Test", url.getPpvApp());
     }

     @Test
     public void testPpvRefUrl(){
         url.setPpvRef("PvpRef Test");
         assertEquals("PvpRef Test", url.getPpvRef());
     }

     @Test
     public void testPpvUtUrl(){
         url.setPpvUt("PvpUt Test");
         assertEquals("PvpUt Test", url.getPpvUt());
     }

     @Test
     public void testGetStyleUrl(){
         url.setStyle(style);
         comparaStyle(url.getStyle());
     }

     /* FIM TESTE URL */

    /* INICIO TESTES DA CLASSE STYLE PARA USAR EM MISC3 */

    @Test
    public void testGetColorStyle(){
        style.setColor("Color Test");
        assertEquals("Color Test", style.getColor());
    }

    @Test
    public void testGetFaceStyle(){
        style.setFace("Face Test");
        assertEquals("Face Test", style.getFace());
    }

    @Test
    public void testGetFontStyle(){
        style.setFont("Font Test");
        assertEquals("Font Test", style.getFont());
    }

    @Test
    public void testGetSizeStyle(){
        style.setSize("Size Test");
        assertEquals("Size Test", style.getSize());
    }

    @Test
    public void testGetValueStyle(){
        style.setvalue("Value Test");
        assertEquals("Value Test", style.getvalue());
    }

    /* FIM  TESTE STYLE */

    /* INICIO TESTE DA CLASSE MISC3 PARA USAR EM RECORD */

    @Test
    public void testGetStyleMisc3(){
        misc3.setStyle(style);
        comparaStyle(misc3.getStyle());
    }

    /* FIM TESTE MISC3 */

    /* INICIO TESTE DA CLASSE MISC2 PARA USAR EM RECORD */

    @Test
    public void testGetStyleMisc2(){
        misc2.setStyle(style);
        comparaStyle(misc2.getStyle());
    }

    /* FIM TESTE MISC2 */

    /* INICIO TESTE DA CLASSE MISC1 PARA USAR EM RECORD */

    @Test
    public void testGetStyleMisc1(){
        misc1.setStyle(style);
        comparaStyle(misc1.getStyle());
    }

    /* FIM TESTE MISC1 */

    /* INICIO TESTE DA CLASSE CUSTOM7 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom7(){
        custom7.setStyle(style);
        comparaStyle(custom7.getStyle());
    }

    /* FIM TESTE CUSTOM7 */

    /* INICIO TESTE DA CLASSE CUSTOM6 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom6(){
        custom6.setStyle(style);
        comparaStyle(custom6.getStyle());
    }

    /* FIM TESTE CUSTOM6 */

    /* INICIO TESTE DA CLASSE CUSTOM5 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom5(){
        custom5.setStyle(style);
        comparaStyle(custom5.getStyle());
    }

    /* FIM TESTE CUSTOM5 */

    /* INICIO TESTE DA CLASSE CUSTOM4 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom4(){
        custom4.setStyle(style);
        comparaStyle(custom4.getStyle());
    }

    /* FIM TESTE CUSTOM4 */

    /* INICIO TESTE DA CLASSE CUSTOM3 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom3(){
        custom3.setStyle(style);
        comparaStyle(custom3.getStyle());
    }

    /* FIM TESTE CUSTOM3 */

    /* INICIO TESTE DA CLASSE CUSTOM2 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom2(){
        custom2.setStyle(style);
        comparaStyle(custom2.getStyle());
    }

    /* FIM TESTE CUSTOM2 */

    /* INICIO TESTE DA CLASSE CUSTOM1 PARA USAR EM RECORD */

    @Test
    public void testGetStyleCustom1(){
        custom1.setStyle(style);
        comparaStyle(custom1.getStyle());
    }

    /* FIM TESTE CUSTOM1 */

    /* INICIO TESTE DA CLASSE MODIFIEDDATE PARA USAR EM RECORD */

    @Test
    public void testGetStyleModifiedDate(){
        modifiedDate.setStyle(style);
        comparaStyle(modifiedDate.getStyle());
    }

    /* FIM TESTE MODIFIEDDATE */

    /* INICIO TESTE DA CLASSE ACCESSDATE PARA USAR EM RECORD */

    @Test
    public void testGetStyleAccessDate(){
        accessDate.setStyle(style);
        comparaStyle(accessDate.getStyle());
    }

    /* FIM TESTE ACCESSDATE */

    /* INICIO TESTE DA CLASSE WEBURLS PARA USAR EM URLS */

    @Test
    public void TestGerUrlWebUrls(){
        List<Url> listUrl = new ArrayList<Url>();
        assertEquals(listUrl, weburls.getUrl());
    }

    /* FIM TESTE WEBURLS */

    /* INICIO TESTE DA CLASSE PDFURLS PARA USAR EM URLS */

    @Test
    public void TestGerUrlPdfUrls(){
        List<Url> listUrl = new ArrayList<Url>();
        assertEquals(listUrl, pdfUrls.getUrl());
    }

    /* FIM TESTE PDFURLS */

    /* INICIO TESTE DA CLASSE TEXTURLS PARA USAR EM URLS */

    @Test
    public void TestGerUrlTextUrls(){
        List<Url> listUrl = new ArrayList<Url>();
        assertEquals(listUrl, textUrls.getUrl());
    }

    /* FIM TESTE TEXTURLS */

    /* INICIO TESTE DA CLASSE RELATEDURLS PARA USAR EM URLS */

    @Test
    public void TestGerUrlRelatedUrls(){
        List<Url> listUrl = new ArrayList<Url>();
        assertEquals(listUrl, relatedUrls.getUrl());
    }

    /* FIM TESTE RELATEDURLS */

    /* INICIO TESTE DA CLASSE IMAGEURLS PARA USAR EM URLS */

    @Test
    public void TestGerUrlImageUrls(){
        List<Url> listUrl = new ArrayList<Url>();
        assertEquals(listUrl, imageUrls.getUrl());
    }

    /* FIM TESTE IMAGEURLS */

    /* INCIO TESTE URLS PARA USAR EM RECORS */

    @Test
    public void TestGetWebUrlsUrls(){
        urls.setWebUrls(weburls);
        assertEquals(weburls.getUrl(), urls.getWebUrls().getUrl());
    }

    @Test
    public void TestGetPdfUrlsUrls(){
        urls.setPdfUrls(pdfUrls);
        assertEquals(pdfUrls.getUrl(), urls.getPdfUrls().getUrl());
    }

    @Test
    public void TestGetTextUrlsUrls(){
        urls.setTextUrls(textUrls);
        assertEquals(textUrls.getUrl(), urls.getTextUrls().getUrl());
    }

    @Test
    public void TestGetRelatedUrlsUrls(){
        urls.setRelatedUrls(relatedUrls);
        assertEquals(relatedUrls.getUrl(), urls.getRelatedUrls().getUrl());
    }

    @Test
    public void TestGetImageUrlsUrls(){
        urls.setImageUrls(imageUrls);
        assertEquals(imageUrls.getUrl(), urls.getImageUrls().getUrl());
    }

    /* FIM TESTE URLS */

    /* INICIO TESTES DA CLASSE LANGUAGE PARA USAR EM RECORDS */

    @Test
    public void testGetStyleLanguage(){
        language.setStyle(style);
        comparaStyle(language.getStyle());
    }

    /* FIM TESTE LANGUAGE*/

    /* INICIO TESTES DA CLASSE REMOTEDATABASEPROVIDER PARA USAR EM RECORDS */

    @Test
    public void testGetStyleRemoteDatabaseProvider(){
        remoteDatabaseProvider.setStyle(style);
        comparaStyle(remoteDatabaseProvider.getStyle());
    }

    /* FIM TESTE REMOTEDATABASEPROVIDER*/


    /* INICIO TESTE CLASSE AUTHADDRESS PARA USAR EM RECORD*/
    @Test
    public void testGetStyleAuthAddress() {
        authAddress.setStyle(style);
        comparaStyle(authAddress.getStyle());
    }

    /* FIM TESTE AUTHADDRESS */

    /* INICIO TESTE CLASSE AUTHAFFILIATON PARA USAR EM RECORD*/
    @Test
    public void testGetStyleAuthAffiliaton() {
        authAffiliaton.setStyle(style);
        comparaStyle(authAffiliaton.getStyle());
    }

    /* FIM TESTE AUTHAFFILIATON */


    /* INICIO TESTE CLASSE TITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleTitle() {
        title.setStyle(style);
        comparaStyle(title.getStyle());
    }
    /* FIM TESTE TITLE */

    /* INICIO TESTE CLASSE SECUNDARYTITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleSecundaryTitle() {
        secondaryTitle.setStyle(style);
        comparaStyle(secondaryTitle.getStyle());
    }
    /* FIM TESTE SECUNDARYTITLE */


    /* INICIO TESTE CLASSE TERTIARYTITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleTertinaryTitle() {
        tertiaryTitle.setStyle(style);
        comparaStyle(tertiaryTitle.getStyle());
    }
    /* FIM TESTE TERTIARYTITLE */

    /* INICIO TESTE CLASSE ALTTITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleAltTitle() {
        altTitle.setStyle(style);
        comparaStyle(altTitle.getStyle());
    }
    /* FIM TESTE ALTTITLE */

    /* INICIO TESTE CLASSE SHORTTITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleShortTitle() {
        shortTitle.setStyle(style);
        comparaStyle(shortTitle.getStyle());
    }
    /* FIM SHORTTITLE SHORTTITLE */

    /* INICIO TESTE CLASSE TRANSLATETITLE PARA USAR EM TITLES */
    @Test
    public void testGetStyleTranslateTitle() {
        translatedTitle.setStyle(style);
        comparaStyle(translatedTitle.getStyle());
    }
    /* FIM SHORTTITLE TRANSLATETITLE */


    /* INICIO TESTE CLASSE TITLES PARA USAR EM RECORD */
    @Test
    public void testGetTitleTitles() {
        titles.setTitle(title);
        assertEquals(title.getStyle(), titles.getTitle().getStyle());
    }

    @Test
    public void testGetSecondaryTitleTitles() {
        titles.setSecondaryTitle(secondaryTitle);
        assertEquals(secondaryTitle.getStyle(), titles.getSecondaryTitle().getStyle());
    }

    @Test
    public void testGetTertiaryTitleTitles() {
        titles.setTertiaryTitle(tertiaryTitle);
        assertEquals(tertiaryTitle.getStyle(), titles.getTertiaryTitle().getStyle());
    }

    @Test
    public void testGetAltTitleTitles() {
        titles.setAltTitle(altTitle);
        assertEquals(altTitle.getStyle(),titles.getAltTitle().getStyle());
    }

    @Test
    public void testGetShortTitleTitles() {
        titles.setShortTitle(shortTitle);
        assertEquals(shortTitle.getStyle(), titles.getShortTitle().getStyle());
    }

    @Test
    public void testGetTranslatedTitleTitles() {
        titles.setTranslatedTitle(translatedTitle);
        assertEquals(translatedTitle.getStyle(), titles.getTranslatedTitle().getStyle());
    }

    /* FIM TESTE TITLES */


    /* INICIO TESTE CLASSE PAGES PARA USAR EM RECORD */

    @Test
    public void testGetEndPages(){
        pages.setEnd("End Test");
        assertEquals("End Test", pages.getEnd());
    }

    @Test
    public void testGetStartPages(){
        pages.setStart("Start Test");
        assertEquals("Start Test", pages.getStart());
    }

    @Test
    public void testGetStylePages(){
        pages.setStyle(style);
        comparaStyle(pages.getStyle());
    }

    /* FIM TESTE PAGES */


    /* INICIO TESTE CLASSE VOLUME PARA USAR EM RECORD */

    @Test
    public void testGetStyleVolume(){
        volume.setStyle(style);
        comparaStyle(volume.getStyle());
    }

    /* FIM TESTE VOLUME */

    /* INICIO TESTE CLASSE NUMVOLS PARA USAR EM RECORD */

    @Test
    public void testGetStyleNumVols(){
        numVols.setStyle(style);
        comparaStyle(numVols.getStyle());
    }

    /* FIM TESTE NUMVOLS */

    /* INICIO TESTE CLASSE EDITION PARA USAR EM RECORD */

    @Test
    public void testGetStyleEdition(){
        edition.setStyle(style);
        comparaStyle(edition.getStyle());
    }

    /* FIM TESTE EDITION */

    /* INICIO TESTE CLASSE SECTION PARA USAR EM RECORD */

    @Test
    public void testGetStyleSection(){
        section.setStyle(style);
        comparaStyle(section.getStyle());
    }

    /* FIM TESTE SECTION */

    /* INICIO TESTE CLASSE REPRINTEDITION PARA USAR EM RECORD */

    @Test
    public void testGetStyleReprintEdition(){
        reprintEdition.setStyle(style);
        comparaStyle(reprintEdition.getStyle());
    }

    /* FIM TESTE REPRINTEDITION */

    /* INICIO TESTE CLASSE REPRINTSTATUS PARA USAR EM RECORD */

    @Test
    public void testGetDateReprintStatus(){
        reprintStatus.setDate("Date Test");
        assertEquals("Date Test", reprintStatus.getDate());
    }

    @Test
    public void testGetStatusReprintStatus(){
        reprintStatus.setStatus("Status Test");
        assertEquals("Status Test", reprintStatus.getStatus());
    }

    /* FIM TESTE REPRINTSTATUS */


    /* INICIO TESTE CLASSE KEYWORD PARA USAR EM KEYWORDS */

    @Test
    public void testGetStyleKeywordKeywords(){
        keyword.setStyle(style);
        comparaStyle(keyword.getStyle());
    }

    /* FIM TESTE KEYWORD */


    /* INICIO TESTE CLASSE KEYWORDS PARA USAR EM RECORD */

    @Test
    public void testGetKeywordKeywords(){
        List<Keyword> listKeyword = new ArrayList<Keyword>();
        assertEquals(listKeyword, keywords.getKeyword());
    }
    /* FIM TESTE KEYWORDS */


    /* INICIO TESTE CLASSE YEAR PARA USAR EM DATES */
    @Test
    public void testGetDayYearDates(){
        year.setDay("Day Test");
        assertEquals("Day Test", year.getDay());
    }

    @Test
    public void testGetJulianYearDates(){
        year.setJulian("Julian Test");
        assertEquals("Julian Test", year.getJulian());
    }

    @Test
    public void testGetMonthYearDates(){
        year.setMonth("Month Test");
        assertEquals("Month Test", year.getMonth());
    }

    @Test
    public void testGetYearYearDates(){
        year.setYear("Year Test");
        assertEquals("Year Test", year.getYear());
    }

    @Test
    public void testGetStyleYearDates(){
        year.setStyle(style);
        comparaStyle(year.getStyle());
    }

    /* FIM TESTE YEAR */


    /* INICIO TESTE CLASSE DATE PARA USAR EM PUBDATES */
    @Test
    public void testGetDayDatePubDatesDates(){
        date.setDay("Day Test");
        assertEquals("Day Test", date.getDay());
    }

    @Test
    public void testGetJulianDatePubDatesDates(){
        date.setJulian("Julian Test");
        assertEquals("Julian Test", date.getJulian());
    }

    @Test
    public void testGetMonthDatePubDatesDates(){
        date.setMonth("Month Test");
        assertEquals("Month Test", date.getMonth());
    }

    @Test
    public void testGetYearDatePubDatesDates(){
        date.setYear("Year Test");
        assertEquals("Year Test", date.getYear());
    }

    @Test
    public void testGetStyleDatePubDatesDates(){
        date.setStyle(style);
        comparaStyle(date.getStyle());
    }
    /* FIM TESTE DATE */


    /* INICIO TESTE CLASSE PUBDATES PARA USAR EM DATES*/
    @Test
    public void testGetDatePubDatesDates(){
        List<Date> listDate = new ArrayList<Date>();
        assertEquals(listDate, pubDates.getDate());
    }

    /* FIM TESTE PUBDATES */

    /* INICIO TESTE CLASSE COPYRIGHTDATES PARA USAR EM DATES*/
    @Test
    public void testGetDateCopyrightDatesDates(){
        List<Date> listDate = new ArrayList<Date>();
        assertEquals(listDate, copyrightDates.getDate());
    }

    /* FIM TESTE COPYRIGHTDATES */


    /* INICIO TESTE CLASSE DATES PARA USAR EM RECORD */
    @Test
    public void testGetYearDates(){
        dates.setYear(year);
        assertEquals(year, dates.getYear());
    }

    @Test
    public void testGetPubDatesDates(){
        dates.setPubDates(pubDates);
        assertEquals(pubDates,dates.getPubDates());
    }

    @Test
    public void testGetCopyrightDatesDates(){
        dates.setCopyrightDates(copyrightDates);
        assertEquals(copyrightDates,dates.getCopyrightDates());
    }

    /* FIM TESTE DATES */


    /* INICIO TESTE CLASSE REVIEWEDITEM PARA USAR EM RECORD */
    @Test
    public void testGetStyleReviewedItem(){
        reviewedItem.setStyle(style);
        comparaStyle(reviewedItem.getStyle());
    }

    /* FIM TESTE REVIEWEDITEM */

    /* INICIO TESTE CLASSE AVAILABILITY PARA USAR EM RECORD */
    @Test
    public void testGetStyleAvailability(){
        availability.setStyle(style);
        comparaStyle(availability.getStyle());
    }

    /* FIM TESTE AVAILABILITY */

    /* INICIO TESTE CLASSE REMOTESOURCE PARA USAR EM RECORD */
    @Test
    public void testGetStyleRemoteSource(){
        remoteSource.setStyle(style);
        comparaStyle(remoteSource.getStyle());
    }

    /* FIM TESTE REMOTESOURCE */

    /* INICIO TESTE CLASSE MEETINGPLACE PARA USAR EM RECORD */
    @Test
    public void testGetStyleMeetingPlace(){
        meetingPlace.setStyle(style);
        comparaStyle(meetingPlace.getStyle());
    }

    /* FIM TESTE MEETINGPLACE */


    /* INICIO TESTE CLASSE WORKLOCATION PARA USAR EM RECORD */
    @Test
    public void testGetStyleWorkLocation(){
        workLocation.setStyle(style);
        comparaStyle(workLocation.getStyle());
    }

    /* FIM TESTE WORKLOCATION */

    /* INICIO TESTE CLASSE WORKEXTENT PARA USAR EM RECORD */
    @Test
    public void testGetStyleWorkExtent(){
        workExtent.setStyle(style);
        comparaStyle(workExtent.getStyle());
    }

    /* FIM TESTE WORKEXTENT */

    /* INICIO TESTE CLASSE PACKMETHOD PARA USAR EM RECORD */
    @Test
    public void testGetStylePackMethod(){
        packMethod.setStyle(style);
        comparaStyle(packMethod.getStyle());
    }

    /* FIM TESTE PACKMETHOD */

    /* INICIO TESTE DA CLASSE SOURCEAPP PARA USAR EM RECORD */

    @Test
    public void testGetSourceAppName(){
        sourceApp.setName("Name Test");
        assertEquals("Name Test", sourceApp.getName());
    }

    @Test
    public void testGetSourceAppVersion(){
        sourceApp.setVersion("Version Test");
        assertEquals("Version Test", sourceApp.getVersion());
    }

    @Test
    public void testGetSourceAppValue(){
        sourceApp.setvalue("Value Test");
        assertEquals("Value Test", sourceApp.getvalue());
    }

    /* FIM TESTE SOURCEAPP */

    /* INICIO TESTE DA CLASSE REFTYPE PARA USAR EM RECORD */

    @Test
    public void testGetRefTypeName(){
        refType.setName("Name Test");
        assertEquals("Name Test", refType.getName());
    }

    @Test
    public void testGetRefTypeValue(){
        refType.setvalue("Value Test");
        assertEquals("Value Test", refType.getvalue());
    }

    /* FIM TESTE REFTYPE */

    /* INICIO TESTE DA CLASSE PERIODICAL PARA USAR EM RECORD */

    @Test
    public void testGetStyleFullTitle(){
        fullTitle.setStyle(style);
        comparaStyle(fullTitle.getStyle());
    }

    @Test
    public void testGetAbbr1Periodical(){
        abbr1.setStyle(style);
        comparaStyle(abbr1.getStyle());
    }

    @Test
    public void testGetAbbr2Periodical(){
        abbr2.setStyle(style);
        comparaStyle(abbr2.getStyle());
    }

    @Test
    public void testGetAbbr3Periodical(){
        abbr3.setStyle(style);
        comparaStyle(abbr3.getStyle());
    }

    /* FIM TESTE PERIODICAL */


    /* INICIO TESTE DA CLASSE NUMBER PARA USAR EM RECORD */

    @Test
    public void testGetStyleNumber(){
        number.setStyle(style);
        comparaStyle(number.getStyle());
    }

    /* FIM TESTE NUMBER */


    /* INICIO TESTE DA CLASSE ISSUE PARA USAR EM RECORD */

    @Test
    public void testGetStyleIssue(){
        issue.setStyle(style);
        comparaStyle(issue.getStyle());
    }

    /* FIM TESTE ISSUE */

    /* INICIO TESTE DA CLASSE SECONDARYVOLUME PARA USAR EM RECORD */

    @Test
    public void testGetStyleSecondaryVolume(){
        secondaryVolume.setStyle(style);
        comparaStyle(secondaryVolume.getStyle());
    }

    /* FIM TESTE SECONDARYVOLUME */


    /* INICIO TESTE DA CLASSE SECUNDARYISSUE PARA USAR EM RECORD */

    @Test
    public void testGetStyleSecundaryIssue(){
        secodaryissue.setStyle(style);
        comparaStyle(secodaryissue.getStyle());
    }

    /* FIM TESTE SECUNDARYISSUE */


    /* INICIO TESTE DA CLASSE PUBLOCATION PARA USAR EM RECORD */

    @Test
    public void testGetStylePubLocation(){
        publocation.setStyle(style);
        comparaStyle(publocation.getStyle());
    }

    /* FIM TESTE PUBLOCATION */


    /* INICIO TESTE DA CLASSE PUBLISHER PARA USAR EM RECORD*/

    @Test
    public void testGetStylePublisher(){
        publisher.setStyle(style);
        comparaStyle(publisher.getStyle());
    }

    /* FIM TESTE PUBLISHER */

    /* INICIO TESTE DA CLASSE ORIGPUB PARA USAR EM RECORD */

    @Test
    public void testGetStyleOrigPub(){
        origpub.setStyle(style);
        comparaStyle(origpub.getStyle());
    }

    /* FIM TESTE ORIGPUB */


    /* INICIO TESTE DA CLASSE ISBN PARA USAR EM RECORD */

    @Test
    public void testGetStyleIsbn(){
        isbn.setStyle(style);
        comparaStyle(isbn.getStyle());
    }


    /* FIM TESTE ISBN */


    /* INICIO TESTE DA CLASSE ACCESSIONNUM PARA USAR EM RECORD */

    @Test
    public void testGetStyleAccessionNum(){
        accessionnum.setStyle(style);
        comparaStyle(accessionnum.getStyle());
    }

    /* FIM TESTE ACCESSIONNUM */

    /* INICIO TESTE DA CLASSE CALLNUM PARA USAR EM RECORD */

    @Test
    public void testGetStyleCallNum(){
        callnum.setStyle(style);
        comparaStyle(callnum.getStyle());
    }

    /* FIM TESTE CALLNUM */

    /* INICIO TESTE DA CLASSE REPORTID PARA USAR EM RECORD */

    @Test
    public void testGetStyleReportId(){
        reportid.setStyle(style);
        comparaStyle(reportid.getStyle());
    }

    /* FIM TESTE REPORTID */

    /* INICIO TESTE DA CLASSE ELETRONICRESOURCENUM PARA USAR EM RECORD */

    @Test
    public void testGetStyleElectronicResourceNum(){
        electronicresourcenum.setStyle(style);
        comparaStyle(electronicresourcenum.getStyle());
    }

    /* FIM TESTE ELETRONICRESOURCENUM */

    /* INICIO TESTE DA CLASSE ABSTRACT PARA USAR EM RECORD */

    @Test
    public void testGetStyleAbstract(){
        abstractt.setStyle(style);
        comparaStyle(abstractt.getStyle());
    }

    /* FIM TESTE ABSTRACT */


    /* INICIO TESTE DA CLASSE LABEL PARA USAR EM RECORD */

    @Test
    public void testGetStyleLabel(){
        label.setStyle(style);
        comparaStyle(label.getStyle());
    }

    /* FIM TESTE LABEL */


    /* INICIO TESTE DA CLASSE CODEN PARA USAR EM RECORD */

    @Test
    public void testGetStyleCoden(){
        coden.setStyle(style);
        comparaStyle(coden.getStyle());
    }

    /* FIM TESTE CODEN */

    /* INICIO TESTE DA CLASSE IMAGE PARA USAR EM RECORD */

    @Test
    public void testGetFileImage(){
        image.setFile("File Test");
        assertEquals("File Test", image.getFile());
    }

    @Test
    public void testGetNameImage(){
        image.setName("Name Test");
        assertEquals("Name Test", image.getName());
    }

    @Test
    public void testGetValueImage(){
        image.setvalue("Value Test");
        assertEquals("Value Test", image.getvalue());
    }

    /* FIM TESTE IMAGE */


    /* INICIO TESTE DA CLASSE CAPTION PARA USAR EM RECORD */

    @Test
    public void testGetStyleCaption(){
        caption.setStyle(style);
        comparaStyle(caption.getStyle());
    }

    /* FIM TESTE CAPTION */


    /* INICIO TESTE DA CLASSE NOTES PARA USAR EM RECORD */

    @Test
    public void testGetStyleNotes(){
        notes.setStyle(style);
        comparaStyle(notes.getStyle());
    }

    /* FIM TESTE NOTES */

    /* INICIO TESTE DA CLASSE RESEARCHNOTES PARA USAR EM RECORD */

    @Test
    public void testGetStyleResearchNotes(){
        researchnotes.setStyle(style);
        comparaStyle(researchnotes.getStyle());
    }

    /* FIM TESTE RESEARCHNOTES */

    /* INICIO TESTE DA CLASSE WORKTYPE PARA USAR EM RECORD */

    @Test
    public void testGetStyleWorkType(){
        worktype.setStyle(style);
        comparaStyle(worktype.getStyle());
    }

    /* FIM TESTE WORKTYPE */


    /* INICIO TESTE DA CLASSE SIZE PARA USAR EM RECORD */

    @Test
    public void testGetStyleSize(){
        size.setStyle(style);
        comparaStyle(size.getStyle());
    }

    /* FIM TESTE SIZE */

    /* INICIO TESTE DA CLASSE REPRORATIO PARA USAR EM RECORD */

    @Test
    public void testGetStyleReproRatio(){
        reproratio.setStyle(style);
        comparaStyle(reproratio.getStyle());
    }

    /* FIM TESTE REPRORATIO */

    /* INICIO TESTE DA CLASSE REMOTEDATABASENAME PARA USAR EM RECORD */

    @Test
    public void testGetStyleRemoteDatabaseName(){
        remotedatabasename.setStyle(style);
        comparaStyle(remotedatabasename.getStyle());
    }

    /* FIM TESTE REMOTEDATABASENAME */


    /* INICIO TESTE DA CLASSE AUTHOR PARA USAR EM AUTHORS */

    @Test
    public void testGetCorpNameAuthorsContributors(){
        author.setCorpName("CorpName Test");
        assertEquals("CorpName Test", author.getCorpName());
    }

    @Test
    public void testGetFirstNameAuthorsContributors(){
        author.setFirstName("FirstName Test");
        assertEquals("FirstName Test", author.getFirstName());
    }

    @Test
    public void testGetInitialsAuthorsContributors(){
        author.setInitials("Initials Test");
        assertEquals("Initials Test", author.getInitials());
    }

    @Test
    public void testGetLastNameAuthorsContributors(){
        author.setLastName("LastName Test");
        assertEquals("LastName Test", author.getLastName());
    }

    @Test
    public void testGetMiddleInitialAuthorsContributors(){
        author.setMiddleInitial("MiddleInitial Test");
        assertEquals("MiddleInitial Test", author.getMiddleInitial());
    }

    @Test
    public void testGetRoleAuthorsContributors(){
        author.setRole("Role Test");
        assertEquals("Role Test", author.getRole());
    }

    @Test
    public void testGetSalutationAuthorsContributors(){
        author.setSalutation("Salutation Test");
        assertEquals("Salutation Test", author.getSalutation());
    }

    @Test
    public void testGetSuffixAuthorsContributors(){
        author.setSuffix("Suffix Test");
        assertEquals("Suffix Test", author.getSuffix());
    }

    @Test
    public void testGetTitleAuthorsContributors(){
        author.setTitle("Title Test");
        assertEquals("Title Test", author.getTitle());
    }

    @Test
    public void testGetStyleAuthorsContributors(){
        author.setStyle(style);
        comparaStyle(author.getStyle());
    }


    /* INICIO TESTE DA CLASSE AUTHORS PARA USAR EM CONTRIBUTORS */

    @Test
    public void testGetAuthorAuthorsContributors(){
        List<Author> listAuthor = new ArrayList<Author>();
        assertEquals(listAuthor, authors.getAuthor());
    }

    @Test
    public void testGetAuthorSecondaryAuthorsContributors(){
        List<Author> listAuthor = new ArrayList<Author>();
        assertEquals(listAuthor, secondaryauthors.getAuthor());
    }

    @Test
    public void testGetAuthorTertiaryAuthorsContributors(){
        List<Author> listAuthor = new ArrayList<Author>();
        assertEquals(listAuthor, tertiaryauthors.getAuthor());
    }

    @Test
    public void testGetAuthorSubsidiaryAuthorsContributors(){
        List<Author> listAuthor = new ArrayList<Author>();
        assertEquals(listAuthor, subsidiaryauthors.getAuthor());
    }

    @Test
    public void testGetAuthorTranslatedAuthorsContributors(){
        List<Author> listAuthor = new ArrayList<Author>();
        assertEquals(listAuthor, translatedauthors.getAuthor());
    }

    /* FIM TESTE AUTHORS */

    /* INICIO TESTE CLASSE CONTRIBUTORS PARA USAR EM RECORD */
    @Test
    public void testGetAuthorsContributors(){
        contributors.setAuthors(authors);
        assertEquals(authors, contributors.getAuthors());
    }

    @Test
    public void testGetSecondaryAuthorsContributors(){
        contributors.setSecondaryAuthors(secondaryauthors);
        assertEquals(secondaryauthors, contributors.getSecondaryAuthors());
    }

    @Test
    public void testGetTertiaryAuthorsContributors(){
        contributors.setTertiaryAuthors(tertiaryauthors);
        assertEquals(tertiaryauthors, contributors.getTertiaryAuthors());
    }

    @Test
    public void testGetSubsidiaryAuthorsContributors(){
        contributors.setSubsidiaryAuthors(subsidiaryauthors);
        assertEquals(subsidiaryauthors, contributors.getSubsidiaryAuthors());
    }

    @Test
    public void testGetTranslatedAuthorsContributors(){
        contributors.setTranslatedAuthors(translatedauthors);
        assertEquals(translatedauthors, contributors.getTranslatedAuthors());
    }

    /* FIM TESTE CONTRIBUTORS */


    /* INICIO TESTE CLASSE RECORD */

    @Test
    public void testGetDatabaseRecord() {
        record.setDatabase(database);
        assertEquals(database.getName(), record.getDatabase().getName());
        assertEquals(database.getPath(), record.getDatabase().getPath());
        assertEquals(database.getvalue(), record.getDatabase().getvalue());
    }


    @Test
    public void testGetRecNumberRecord() {
        record.setRecNumber("RecNumber Test");
        assertEquals("RecNumber Test", record.getRecNumber());
    }

    @Test
    public void testGetRemoteDatabaseProvider(){
        record.setRemoteDatabaseProvider(remoteDatabaseProvider);
        assertEquals(remoteDatabaseProvider.getStyle(), record.getRemoteDatabaseProvider().getStyle());
    }

    @Test
    public void testGetLanguage(){
        record.setLanguage(language);
        assertEquals(language.getStyle(), record.getLanguage().getStyle());
    }

    @Test
    public void testGetUrls(){
        record.setUrls(urls);

        assertEquals(urls.getWebUrls(), record.getUrls().getWebUrls());
        assertEquals(urls.getPdfUrls(), record.getUrls().getPdfUrls());
        assertEquals(urls.getTextUrls(), record.getUrls().getTextUrls());
        assertEquals(urls.getRelatedUrls(), record.getUrls().getRelatedUrls());
        assertEquals(urls.getImageUrls(), record.getUrls().getImageUrls());
    }

    @Test
    public void testGetAccessDateRecord(){
        record.setAccessDate(accessDate);
        assertEquals(accessDate.getStyle(), record.getAccessDate().getStyle());
    }

    @Test
    public void testGetModifiedDateRecord(){
        record.setModifiedDate(modifiedDate);
        assertEquals(modifiedDate.getStyle(), record.getModifiedDate().getStyle());
    }

    @Test
    public void testGetCustom1Record(){
        record.setCustom1(custom1);
        assertEquals(custom1.getStyle(), record.getCustom1().getStyle());
    }

    @Test
    public void testGetCustom2Record(){
        record.setCustom2(custom2);
        assertEquals(custom2.getStyle(), record.getCustom2().getStyle());
    }

    @Test
    public void testGetCustom3Record(){
        record.setCustom3(custom3);
        assertEquals(custom3.getStyle(), record.getCustom3().getStyle());
    }

    @Test
    public void testGetCustom4Record(){
        record.setCustom4(custom4);
        assertEquals(custom4.getStyle(), record.getCustom4().getStyle());
    }

    @Test
    public void testGetCustom5Record(){
        record.setCustom5(custom5);
        assertEquals(custom5.getStyle(), record.getCustom5().getStyle());
    }

    @Test
    public void testGetCustom6Record(){
        record.setCustom6(custom6);
        assertEquals(custom6.getStyle(), record.getCustom6().getStyle());
    }

    @Test
    public void testGetCustom7Record(){
        record.setCustom7(custom7);
        assertEquals(custom7.getStyle(), record.getCustom7().getStyle());
    }

    @Test
    public void testGetMisc1Record(){
        record.setMisc1(misc1);
        assertEquals(misc1.getStyle(), record.getMisc1().getStyle());
    }

    @Test
    public void testGetMisc2Record(){
        record.setMisc2(misc2);
        assertEquals(misc2.getStyle(), record.getMisc2().getStyle());
    }

    @Test
    public void testGetMisc3Record(){
        record.setMisc3(misc3);
        assertEquals(misc3.getStyle(), record.getMisc3().getStyle());
    }

    @Test
    public void testGetAuthAddressRecord(){
        record.setAuthAddress(authAddress);
        assertEquals(authAddress.getStyle(), record.getAuthAddress().getStyle());
    }

    @Test
    public void testGetAuthAffiliatonRecord(){
        record.setAuthAffiliaton(authAffiliaton);
        assertEquals(authAffiliaton.getStyle(), record.getAuthAffiliaton().getStyle());
    }


    @Test
    public void testGetTitlesRecord() {
        record.setTitles(titles);

        titles.setTitle(title);

        titles.setSecondaryTitle(secondaryTitle);

        titles.setTertiaryTitle(tertiaryTitle);

        titles.setAltTitle(altTitle);

        titles.setShortTitle(shortTitle);

        titles.setTranslatedTitle(translatedTitle);

        assertEquals(titles.getTitle().getStyle(),record.getTitles().getTitle().getStyle());
        assertEquals(titles.getSecondaryTitle().getStyle(), record.getTitles().getSecondaryTitle().getStyle());
        assertEquals(titles.getTertiaryTitle().getStyle(), record.getTitles().getTertiaryTitle().getStyle());
        assertEquals(titles.getAltTitle().getStyle(), record.getTitles().getAltTitle().getStyle());
        assertEquals(titles.getShortTitle().getStyle(), record.getTitles().getShortTitle().getStyle());
        assertEquals(titles.getTranslatedTitle().getStyle(), record.getTitles().getTranslatedTitle().getStyle());

    }

    @Test
    public void testGetPagesRecord() {
        record.setPages(pages);

        assertEquals(pages.getEnd(), record.getPages().getEnd());
        assertEquals(pages.getStart(), record.getPages().getStart());
        assertEquals(pages.getStyle(), record.getPages().getStyle());
    }

    @Test
    public void testGetVolumeRecord(){
        record.setVolume(volume);
        assertEquals(volume.getStyle(), record.getVolume().getStyle());
    }

    @Test
    public void testGetNumVolsRecord(){
        record.setNumVols(numVols);
        assertEquals(numVols.getStyle(), record.getNumVols().getStyle());
    }

    @Test
    public void testGetEditionRecord(){
        record.setEdition(edition);
        assertEquals(edition.getStyle(), record.getEdition().getStyle());
    }

    @Test
    public void testGetSectionRecord(){
        record.setSection(section);
        assertEquals(section.getStyle(), record.getSection().getStyle());
    }

    @Test
    public void testGetSectionReprintEdition(){
        record.setReprintEdition(reprintEdition);
        assertEquals(reprintEdition.getStyle(), record.getReprintEdition().getStyle());
    }

    @Test
    public void testGetReprintStatus(){
        record.setReprintStatus(reprintStatus);
        assertEquals(reprintStatus.getDate(),record.getReprintStatus().getDate());
        assertEquals(reprintStatus.getStatus(), record.getReprintStatus().getStatus());
    }

    @Test
    public void testGetKeywords(){
        record.setKeywords(keywords);
        assertEquals(keywords,record.getKeywords());
    }

    @Test
    public void testGetDates(){
        record.setDates(dates);
        assertEquals(dates, record.getDates());
    }

    @Test
    public void testGetReviewedItem(){
        record.setReviewedItem(reviewedItem);
        assertEquals(reviewedItem, record.getReviewedItem());
    }

    @Test
    public void testGetAvailability(){
        record.setAvailability(availability);
        assertEquals(availability, record.getAvailability());
    }

    @Test
    public void testGetRemoteSource(){
        record.setRemoteSource(remoteSource);
        assertEquals(remoteSource, record.getRemoteSource());
    }

    @Test
    public void testGetMeetingPlace(){
        record.setMeetingPlace(meetingPlace);
        assertEquals(meetingPlace, record.getMeetingPlace());
    }

    @Test
    public void testGetWorkLocation(){
        record.setWorkLocation(workLocation);
        assertEquals(workLocation, record.getWorkLocation());
    }

    @Test
    public void testGetWorkExtent(){
        record.setWorkExtent(workExtent);
        assertEquals(workExtent, record.getWorkExtent());
    }

    @Test
    public void testGetPackMethod(){
        record.setPackMethod(packMethod);
        assertEquals(packMethod, record.getPackMethod());
    }


    @Test
    public void testGetSourceAppRecord(){
        record.setSourceApp(sourceApp);
        assertEquals(sourceApp.getName(), record.getSourceApp().getName());
        assertEquals(sourceApp.getVersion(), record.getSourceApp().getVersion());
        assertEquals(sourceApp.getvalue(), record.getSourceApp().getvalue());
    }

    @Test
    public void testGetRefTypeRecord(){
        record.setRefType(refType);
        assertEquals(refType.getName(), record.getRefType().getName());
        assertEquals(refType.getvalue(), record.getRefType().getvalue());
    }

    @Test
    public void testGetPeriodicalRecord(){
        record.setPeriodical(periodical);

        periodical.setFullTitle(fullTitle);
        periodical.setAbbr1(abbr1);
        periodical.setAbbr2(abbr2);
        periodical.setAbbr3(abbr3);

        assertEquals(periodical.getFullTitle().getStyle(), record.getPeriodical().getFullTitle().getStyle());
        assertEquals(periodical.getAbbr1().getStyle(), record.getPeriodical().getAbbr1().getStyle());
        assertEquals(periodical.getAbbr2().getStyle(), record.getPeriodical().getAbbr2().getStyle());
        assertEquals(periodical.getAbbr3().getStyle(), record.getPeriodical().getAbbr3().getStyle());

    }

    @Test
    public void testGetNumberRecord(){
        record.setNumber(number);
        assertEquals(number.getStyle(), record.getNumber().getStyle());
    }

    @Test
    public void testGetIssueRecord(){
        record.setIssue(issue);
        assertEquals(issue.getStyle(), record.getIssue().getStyle());
    }



    @Test
    public void testGetSecondaryVolumeRecord(){
        record.setSecondaryVolume(secondaryVolume);
        assertEquals(secondaryVolume.getStyle(), record.getSecondaryVolume().getStyle());
    }

    @Test
    public void testGetSecundaryIssueRecord(){
        record.setSecondaryIssue(secodaryissue);
        assertEquals(secodaryissue.getStyle(), record.getSecondaryIssue().getStyle());
    }

    @Test
    public void testGetPubLocationRecord(){
        record.setPubLocation(publocation);
        assertEquals(publocation.getStyle(), record.getPubLocation().getStyle());
    }

    @Test
    public void testGetPublisherRecord(){
        record.setPublisher(publisher);
        assertEquals(publisher.getStyle(), record.getPublisher().getStyle());
    }

    @Test
    public void testGetOrigPubRecord(){
        record.setOrigPub(origpub);
        assertEquals(origpub.getStyle(), record.getOrigPub().getStyle());
    }

    @Test
    public void testGetIsbnRecord(){
        record.setIsbn(isbn);
        assertEquals(isbn.getStyle(), record.getIsbn().getStyle());
    }

    @Test
    public void testGetAccessionNumRecord(){
        record.setAccessionNum(accessionnum);
        assertEquals(accessionnum.getStyle(), record.getAccessionNum().getStyle());
    }

    @Test
    public void testGetCallNumRecord(){
        record.setCallNum(callnum);
        assertEquals(callnum.getStyle(), record.getCallNum().getStyle());
    }

    @Test
    public void testGetReportIdRecord(){
        record.setReportId(reportid);
        assertEquals(reportid.getStyle(), record.getReportId().getStyle());
    }

    @Test
    public void testGetCodenRecord(){
        record.setCoden(coden);
        assertEquals(coden.getStyle(), record.getCoden().getStyle());
    }

    @Test
    public void testGetElectronicResourceNumRecord(){
        record.setElectronicResourceNum(electronicresourcenum);
        assertEquals(electronicresourcenum.getStyle(), record.getElectronicResourceNum().getStyle());
    }

    @Test
    public void testGetAbstractRecord(){
        record.setAbstract(abstractt);
        assertEquals(abstractt.getStyle(), record.getAbstract().getStyle());
    }

    @Test
    public void testGetLabelRecord(){
        record.setLabel(label);
        assertEquals(label.getStyle(), record.getLabel().getStyle());
    }

    @Test
    public void testGetImageRecord(){
        record.setImage(image);
        assertEquals(image.getFile(), record.getImage().getFile());
        assertEquals(image.getName(), record.getImage().getName());
        assertEquals(image.getvalue(), record.getImage().getvalue());
    }

    @Test
    public void testGetCaptionRecord(){
        record.setCaption(caption);
        assertEquals(caption.getStyle(), record.getCaption().getStyle());
    }

    @Test
    public void testGetNotesRecord(){
        record.setNotes(notes);
        assertEquals(notes.getStyle(), record.getNotes().getStyle());
    }

    @Test
    public void testGetResearchNotesRecord(){
        record.setResearchNotes(researchnotes);
        assertEquals(researchnotes.getStyle(), record.getResearchNotes().getStyle());
    }

    @Test
    public void testGetWorkTypeRecord(){
        record.setWorkType(worktype);
        assertEquals(worktype.getStyle(), record.getWorkType().getStyle());
    }

    @Test
    public void testGetSizeRecord(){
        record.setSize(size);
        assertEquals(size.getStyle(), record.getSize().getStyle());
    }

    @Test
    public void testGetReproRatioRecord(){
        record.setReproRatio(reproratio);
        assertEquals(reproratio.getStyle(), record.getReproRatio().getStyle());
    }

    @Test
    public void testGetRemoteDatabaseNameRecord(){
        record.setRemoteDatabaseName(remotedatabasename);
        assertEquals(remotedatabasename.getStyle(), record.getRemoteDatabaseName().getStyle());
    }


    @Test
    public void testGetContributors(){
        record.setContributors(contributors);
        assertEquals(contributors, record.getContributors());
    }

    /* FIM TESTE RECORD */

    /* INICIO TESTE CLASSE RECORDS */

    @Test
    public void testGetRecordRecords(){
        List<Record> listRecord = new ArrayList<Record>();
        assertEquals(listRecord, records.getRecord());
    }
    /* FIM TESTE RECORDS */

    /* INICIO TESTE CLASSE XML */
    @Test
    public void testGetRecordsXml(){
        xml.setRecords(records);
        assertEquals(records, xml.getRecords());
    }

    /* FIM TESTE XML */

}
