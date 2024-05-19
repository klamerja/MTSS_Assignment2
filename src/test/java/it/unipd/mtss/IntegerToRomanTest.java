////////////////////////////////////////////////////////////////////
// Mirco Borella 2075530
// Klaudio Merja 2075538
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testEccFuoriRange1(){
        Exception ex = assertThrows(Exception.class, () -> IntegerToRoman.convert(1001));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange2(){
        Exception ex = assertThrows(Exception.class, () -> IntegerToRoman.convert(0));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange3(){
        Exception ex = assertThrows(Exception.class, () -> IntegerToRoman.convert(-69));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange4(){
        Exception ex = assertThrows(Exception.class, () -> IntegerToRoman.convert(-1069));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testConversioneNum1() throws Exception {
        assertEquals("I", IntegerToRoman.convert(1));            
    }

    @Test
    public void testConversioneNum3() throws Exception {
        assertEquals("III", IntegerToRoman.convert(3));            
    }

    @Test
    public void testConversioneNum9() throws Exception {
        assertEquals("IX", IntegerToRoman.convert(9));            
    }

    @Test
    public void testConversioneNum14() throws Exception {
        assertEquals("XIV", IntegerToRoman.convert(14));            
    }

    @Test
    public void testConversioneNum21() throws Exception {
        assertEquals("XXI", IntegerToRoman.convert(21));            
    }

    @Test
    public void testConversioneNum46() throws Exception {
        assertEquals("XLVI", IntegerToRoman.convert(46));            
    }

    @Test
    public void testConversioneNum57() throws Exception {
        assertEquals("LVII", IntegerToRoman.convert(57));            
    }

    @Test
    public void testConversioneNum78() throws Exception {
        assertEquals("LXXVIII", IntegerToRoman.convert(78));            
    }

    @Test
    public void testConversioneNum105() throws Exception {
        assertEquals("CV", IntegerToRoman.convert(105));            
    }

    @Test
    public void testConversioneNum282() throws Exception {
        assertEquals("CCLXXXII", IntegerToRoman.convert(282));            
    }

    @Test
    public void testConversioneNum449() throws Exception {
        assertEquals("CDXLIX", IntegerToRoman.convert(449));            
    }

    @Test
    public void testConversioneNum581() throws Exception {
        assertEquals("DLXXXI", IntegerToRoman.convert(581));            
    }

    @Test
    public void testConversioneNum777() throws Exception {
        assertEquals("DCCLXXVII", IntegerToRoman.convert(777));            
    }

    @Test
    public void testConversioneNum998() throws Exception {
        assertEquals("CMXCVIII", IntegerToRoman.convert(998));            
    }

    @Test
    public void testConversioneNum1000() throws Exception {
        assertEquals("M", IntegerToRoman.convert(1000));            
    }

}