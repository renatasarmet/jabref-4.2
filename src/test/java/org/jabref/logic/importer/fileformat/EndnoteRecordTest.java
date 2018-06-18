package org.jabref.logic.importer.fileformat;

import org.jabref.logic.importer.ImportFormatPreferences;
import org.jabref.logic.importer.fileformat.endnote.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;

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
        title.setStyle(style);
        titles.setTitle(title);
        comparaStyle(titles.getTitle().getStyle());
    }

    @Test
    public void testGetSecondaryTitleTitles() {
        secondaryTitle.setStyle(style);
        titles.setSecondaryTitle(secondaryTitle);
        comparaStyle(titles.getSecondaryTitle().getStyle());
    }

    @Test
    public void testGetTertiaryTitleTitles() {
        tertiaryTitle.setStyle(style);
        titles.setTertiaryTitle(tertiaryTitle);
        comparaStyle(titles.getTertiaryTitle().getStyle());
    }

    @Test
    public void testGetAltTitleTitles() {
        altTitle.setStyle(style);
        titles.setAltTitle(altTitle);
        comparaStyle(titles.getAltTitle().getStyle());
    }

    @Test
    public void testGetShortTitleTitles() {
        shortTitle.setStyle(style);
        titles.setShortTitle(shortTitle);
        comparaStyle(titles.getShortTitle().getStyle());
    }

    @Test
    public void testGetTranslatedTitleTitles() {
        translatedTitle.setStyle(style);
        titles.setTranslatedTitle(translatedTitle);
        comparaStyle(titles.getTranslatedTitle().getStyle());
    }

    /* FIM TESTE TITLES */




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

        title.setStyle(style);
        titles.setTitle(title);

        secondaryTitle.setStyle(style);
        titles.setSecondaryTitle(secondaryTitle);

        tertiaryTitle.setStyle(style);
        titles.setTertiaryTitle(tertiaryTitle);

        altTitle.setStyle(style);
        titles.setAltTitle(altTitle);

        shortTitle.setStyle(style);
        titles.setShortTitle(shortTitle);

        translatedTitle.setStyle(style);
        titles.setTranslatedTitle(translatedTitle);

        comparaStyle(record.getTitles().getTitle().getStyle());
        comparaStyle(record.getTitles().getSecondaryTitle().getStyle());
        comparaStyle(record.getTitles().getTertiaryTitle().getStyle());
        comparaStyle(record.getTitles().getAltTitle().getStyle());
        comparaStyle(record.getTitles().getShortTitle().getStyle());
        comparaStyle(record.getTitles().getTranslatedTitle().getStyle());
    }

    /* FIM TESTE RECORD */

}
