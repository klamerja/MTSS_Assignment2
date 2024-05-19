////////////////////////////////////////////////////////////////////
// Mirco Borella 2075530
// Klaudio Merja 2075538
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testEccFuoriRange1(){
        Exception ex = assertThrows(Exception.class, () -> RomanPrinter.print(1001));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange2(){
        Exception ex = assertThrows(Exception.class, () -> RomanPrinter.print(0));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange3(){
        Exception ex = assertThrows(Exception.class, () -> RomanPrinter.print(-69));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testEccFuoriRange4(){
        Exception ex = assertThrows(Exception.class, () -> RomanPrinter.print(-1069));            
        assertEquals("Numero non valido", ex.getMessage());
    }

    @Test
    public void testStampaAscii1() throws Exception{
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|", RomanPrinter.print(1));
    }

    @Test
    public void testStampaAscii5() throws Exception{
        assertEquals("__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    ", RomanPrinter.print(5));
    }

    @Test
    public void testStampaAscii10() throws Exception{
        assertEquals("__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\", RomanPrinter.print(10));
    }

    @Test
    public void testStampaAscii50() throws Exception{
        assertEquals(" _      \n| |     \n| |     \n| |     \n| |____ \n|______|", RomanPrinter.print(50));
    }

    @Test
    public void testStampaAscii100() throws Exception{
        assertEquals("  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|", RomanPrinter.print(100));
    }

    @Test
    public void testStampaAscii500() throws Exception{
        assertEquals(" _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ ", RomanPrinter.print(500));
    }

    @Test
    public void testStampaAscii1000() throws Exception{
        assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|", RomanPrinter.print(1000));
    }

    @Test
    public void testStampaAscii3() throws Exception{
        assertEquals(" _____  _____  _____ \n|_   _||_   _||_   _|\n  | |    | |    | |  \n  | |    | |    | |  \n _| |_  _| |_  _| |_ \n|_____||_____||_____|", RomanPrinter.print(3));
    }

    @Test
    public void testStampaAscii21() throws Exception{
        assertEquals("__   ____   __ _____ \n\\ \\ / /\\ \\ / /|_   _|\n \\ V /  \\ V /   | |  \n  > <    > <    | |  \n / . \\  / . \\  _| |_ \n/_/ \\_\\/_/ \\_\\|_____|", RomanPrinter.print(21));
    }

    @Test
    public void testStampaAscii78() throws Exception{
        assertEquals(" _      __   ____   ____      __ _____  _____  _____ \n| |     \\ \\ / /\\ \\ / /\\ \\    / /|_   _||_   _||_   _|\n| |      \\ V /  \\ V /  \\ \\  / /   | |    | |    | |  \n| |       > <    > <    \\ \\/ /    | |    | |    | |  \n| |____  / . \\  / . \\    \\  /    _| |_  _| |_  _| |_ \n|______|/_/ \\_\\/_/ \\_\\    \\/    |_____||_____||_____|", RomanPrinter.print(78));
    }


    @Test
    public void testStampaAscii282() throws Exception{
        assertEquals("  _____   _____  _      __   ____   ____   __ _____  _____ \n / ____| / ____|| |     \\ \\ / /\\ \\ / /\\ \\ / /|_   _||_   _|\n| |     | |     | |      \\ V /  \\ V /  \\ V /   | |    | |  \n| |     | |     | |       > <    > <    > <    | |    | |  \n| |____ | |____ | |____  / . \\  / . \\  / . \\  _| |_  _| |_ \n \\_____| \\_____||______|/_/ \\_\\/_/ \\_\\/_/ \\_\\|_____||_____|", RomanPrinter.print(282));
    }

    @Test
    public void testStampaAscii777() throws Exception{
        assertEquals(" _____    _____   _____  _      __   ____   ____      __ _____  _____ \n|  __ \\  / ____| / ____|| |     \\ \\ / /\\ \\ / /\\ \\    / /|_   _||_   _|\n| |  | || |     | |     | |      \\ V /  \\ V /  \\ \\  / /   | |    | |  \n| |  | || |     | |     | |       > <    > <    \\ \\/ /    | |    | |  \n| |__| || |____ | |____ | |____  / . \\  / . \\    \\  /    _| |_  _| |_ \n|_____/  \\_____| \\_____||______|/_/ \\_\\/_/ \\_\\    \\/    |_____||_____|", RomanPrinter.print(777));
    }
}