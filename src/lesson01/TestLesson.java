package lesson01;

public class TestLesson {
    public static void main(String[] args){

        /*
        0000 0101 - bitu
        7654 3210 - stepeni
        2222 2222 - osnova

        4 => 0100 => 2^7*0+2^6*0+2^5*0+2^4*0+2^3*0+2^2*1+2^1*0+2^0*0
        5 => 0101
        7 => 0111 => (2^2*1)+(2^1*1)+(2^0*1)
         */

        /*
        long 8b => 2^64
        int 4b => 2^32 => -2ml..2ml
        short 2b => 2^16 => -32000...32000
        byte 1b => 2^8 => -128...127

        float 4b
        double 8b

        boolean  true/false

        char 2b => 2^16 0...65000
         */
        int x = 5;
        byte variable1;
        long phoneNumber = 994563789;
        char symbolA = 'A';
        char symbola = 97;
        String name = "Roman";

        System.out.println("My first Program");
        System.out.println();
        System.out.println("Symbol A = "+symbolA+" other text.");
        System.out.println("Symbol a = "+symbola);
        System.out.println(phoneNumber);

    }
}
