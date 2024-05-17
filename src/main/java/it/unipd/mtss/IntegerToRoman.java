////////////////////////////////////////////////////////////////////
// Mirco Borella 2075530
// Klaudio Merja 2075538
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

class IntegerToRoman{
    
    private static final int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] simboli = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) throws Exception { 
        if(number > 1000 || number < 1){
            throw new Exception("Numero non valido");
        }
        String output = "";

        for (int i = 0; i < valori.length; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                output += simboli[i];
            }
        }

        return output;
    }
}
