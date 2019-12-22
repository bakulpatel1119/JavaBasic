public class JavaBasic {

    // No Return type - No Parameter - Static Method

    public static void removeCharacterS(){
        String sample1 = "This is very easy programme";

        //This will Remove all occurrences of character “s” and print remaining string
        System.out.println(sample1.replace("s",""));
    }


    public static void removeSpace(){
        String sample2 = "This is very esay programme";

        //This will Remove space(s) and will print string without any space
        System.out.println(sample2.replaceAll("\\s+",""));
    }


    public static void stringLength(){
        String sample3 = "This is very easy programme";

        //This will count and print the length of the string.
        System.out.println(sample3.length());
    }


        public static void extractCharacters(){
        String sample4 = "This $300 is equivalent of £200 but not for @100";

        //This will Extract special characters and will print remaining string
        String S=sample4.replaceAll("[^a-zA-Z0-9\\s+]","");
        System.out.println(S);

        }


    public static void extractNumber(){
        String sample5 = "The cost of iPhone is £1,250";

        //This will Extract the number and will print remaining string
        String s= sample5.replaceAll("[^a-zA-z£$\\s+]","");
        System.out.println(s);
    }


    public static void intToDouble(){
        int sample6 = 450;
        //This will convert and print int value to double
        double sample6a = sample6;
        System.out.println(sample6a);

    }


    public static void stringToInteger(){
        String sample7 = "125";

        //This will covert and print string value to integer
        int num = Integer.valueOf(sample7);
        System.out.println(num);
    }


    public static void doubleToString(){
        double sample8 = 123.45;

        //This will convert and print double value to string
        String str = Double.toString(sample8);
        System.out.println(str);
    }


    public static void stringToDouble(){
        String sample9 = "560.25";

        //This will convert and print string to double value
        double d = Double.valueOf(sample9);
        System.out.println(d);
    }


    public static void replaceDollarToPound(){
        String sample10= "$250.00";

        //This will replace and print currency symbol from $ to £ from string
        System.out.println(sample10.replace("$","£"));
    }


    public static void answerinDecimal(){
        double d = 1;
        double e = 3;

        //This will Find out and print answer of 1/3 in decimal points
        System.out.println(d/e);
    }

// THIS HOMEWORK WAS GIVEN BY MAMA TO FIND OUT MIDDLE CHARACTER OF THE STRING (HINT - GIVEN SUBSTRING)


    public static void substring(){
        String word1 = "There";
        String word2 = "England";
        String word3 = "Orange";

        //This will find and print middle character of strings

        String word11 = word1.substring(2,3);
        String word22 = word2.substring(3,4);
        String word33 = word3.substring(2,4);
        System.out.println(word11);
        System.out.println(word22);
        System.out.println(word33);
    }


    // Main Method

    public static void main(String[]args){
        removeCharacterS();       // Static method 'removeCharacterS()' can come direct in static main method area
        stringLength();           // Static method 'stringLength()' can come direct in static main method area
        removeSpace();            // Static method 'removeSpace()' can come direct in static main method area
        extractCharacters();      //Static method 'extractCharacters()' can come direct in static main method area
        extractNumber();          // Static method 'extractNumber()' can come direct in static main method area
        intToDouble();            // Static method 'intToDouble()' can come direct in static main method area
        stringToInteger();        // Static method 'stringToInteger()' can come direct in static main method area
        doubleToString();         // Static method 'doubleToString()' can come direct in static main method area
        stringToDouble();         // Static method 'stringToDouble()' can come direct in static main method area
        answerinDecimal();        // Static method 'answerinDecimal()' can come direct in static main method area
        replaceDollarToPound();   // Static method 'replaceDollarToPound()' can come direct in static main method area
        substring();              // Static method 'replaceDollarToPound()' can come direct in static main method area
    }
}