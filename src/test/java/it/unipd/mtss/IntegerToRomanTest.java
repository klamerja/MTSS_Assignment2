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
    public void testConversioneNum1(){
        try {
            assertEquals("I", IntegerToRoman.convert(1));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum3(){
        try {
            assertEquals("III", IntegerToRoman.convert(3));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum9(){
        try {
            assertEquals("IX", IntegerToRoman.convert(9));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum14(){
        try {
            assertEquals("XIV", IntegerToRoman.convert(14));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum21(){
        try {
            assertEquals("XXI", IntegerToRoman.convert(21));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum46(){
        try {
            assertEquals("XLVI", IntegerToRoman.convert(46));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum57(){
        try {
            assertEquals("LVII", IntegerToRoman.convert(57));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum78(){
        try {
            assertEquals("LXXVIII", IntegerToRoman.convert(78));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum105(){
        try {
            assertEquals("CV", IntegerToRoman.convert(105));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testConversioneNum282(){
        try {
            assertEquals("CCLXXXII", IntegerToRoman.convert(282));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum449(){
        try {
            assertEquals("CDXLIX", IntegerToRoman.convert(449));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum581(){
        try {
            assertEquals("DLXXXI", IntegerToRoman.convert(581));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum777(){
        try {
            assertEquals("DCCLXXVII", IntegerToRoman.convert(777));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum998(){
        try {
            assertEquals("CMXCVIII", IntegerToRoman.convert(998));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConversioneNum1000(){
        try {
            assertEquals("M", IntegerToRoman.convert(1000));            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}