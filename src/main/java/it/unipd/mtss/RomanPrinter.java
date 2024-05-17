////////////////////////////////////////////////////////////////////
// Mirco Borella 2075530
// Klaudio Merja 2075538
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    
    public static String print(int num) throws Exception{
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber){
        HashMap<Character, String[]> asciiArt;
        asciiArt=new HashMap<>();
        asciiArt.put('I', i);
        asciiArt.put('V', v);
        asciiArt.put('X', x);
        asciiArt.put('L', l);
        asciiArt.put('C', c);
        asciiArt.put('D', d);
        asciiArt.put('M', m);

        //Creo e inizializzo output
        String[] outputMatrix = new String[6];
        for (int i = 0; i < 6; i++) {
            outputMatrix[i]="";
        }

        //Converto il numero romano da stringa in array di caratteri singoli
        char[] arr = romanNumber.toCharArray();

        //Per ogni carattere, aggiungo l'ascii art all'output
        for (char carArr : arr) {
            for(int i=0;i<6;i++){
                outputMatrix[i]+=asciiArt.get(Character.valueOf(carArr))[i];
            }
        }

        //Concateno in un unica stringa di output
        String out = "";
        for (int i = 0; i < outputMatrix.length-1; i++) {
            out = out + outputMatrix[i] + "\n";
        }
        out = out + outputMatrix[5];
        return out;
    }

    public static final String[] i = {" _____ ", 
                                      "|_   _|", 
                                      "  | |  ", 
                                      "  | |  ", 
                                      " _| |_ ", 
                                      "|_____|"};

    public static final String[] v = {"__      __", 
                                      "\\ \\    / /", 
                                      " \\ \\  / / ", 
                                      "  \\ \\/ /  ", 
                                      "   \\  /   ", 
                                      "    \\/    "};

    public static final String[] x = {"__   __", 
                                      "\\ \\ / /", 
                                      " \\ V / ", 
                                      "  > <  ",
                                      " / . \\ ", 
                                      "/_/ \\_\\"};

    public static final String[] l = {" _      ", 
                                      "| |     ", 
                                      "| |     ", 
                                      "| |     ", 
                                      "| |____ ", 
                                      "|______|"};

    public static final String[] c = {"  _____ ", 
                                      " / ____|", 
                                      "| |     ", 
                                      "| |     ", 
                                      "| |____ ", 
                                      " \\_____|"};

    public static final String[] d = {" _____  ", 
                                      "|  __ \\ ", 
                                      "| |  | |", 
                                      "| |  | |",
                                      "| |__| |", 
                                      "|_____/ "};     

    public static final String[] m = {" __  __ ", 
                                      "|  \\/  |", 
                                      "| \\  / |", 
                                      "| |\\/| |",
                                      "| |  | |", 
                                      "|_|  |_|"};
}
