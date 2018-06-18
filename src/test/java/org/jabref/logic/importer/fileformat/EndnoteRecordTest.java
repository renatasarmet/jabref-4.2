package org.jabref.logic.importer.fileformat;

import org.jabref.logic.importer.ImportFormatPreferences;
import org.jabref.logic.importer.fileformat.endnote.*;
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

    @BeforeEach
    public void setUp() {
        database = new ObjectFactory().createDatabase();
        record = new Record();
        custom7 = new Custom7();
        misc1 = new Misc1();
        misc2 = new Misc2();
        misc3 = new Misc3();
        style = new Style();
        authAddress = new AuthAddress();
        authAffiliaton = new AuthAffiliaton();
        title = new Title();
        secondaryTitle = new SecondaryTitle();
        tertiaryTitle = new TertiaryTitle();
        altTitle = new AltTitle();
        shortTitle = new ShortTitle();
        translatedTitle = new TranslatedTitle();
        titles = new Titles();
        fullTitle = new FullTitle();
        abbr1 = new Abbr1();
        abbr2 = new Abbr2();
        abbr3 = new Abbr3();
        pages = new Pages();
        volume = new Volume();
        numVols = new NumVols();
        edition = new Edition();
        section = new Section();
        reprintEdition = new ReprintEdition();
        reprintStatus = new ReprintStatus();
        keyword = new Keyword();
        keywords = new Keywords();
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

    /* FIM TESTE RECORD */

}
