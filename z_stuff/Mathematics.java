package de.basics.z_stuff;

public class Mathematics {
    public static void main(String[] args){
    // M A T H. M E T H O D E N

        // M A T H. P I
        double zahlPI = Math.PI;
        System.out.println(zahlPI);

        // M A T H. S Q R T
        /**Wurzel ziehen*/
        byte seiteA = 3;
        byte seiteB = 6;
        double hypotenuse = Math.sqrt(Math.pow(seiteA,2)+Math.pow(seiteB,2));
        System.out.println(hypotenuse);


        // M A T H. P O W
        /**Zahlen potenzieren (Basis, Exponent)*/
        byte xBasis = 8;
        byte yExponent = 2;
        double wurzelZiehen = Math.pow(xBasis,yExponent);
        System.out.println(wurzelZiehen);


        // M A T H. R A N D O M
        System.out.println((int)Math.random() * 10);


        // R U N D E N
        System.out.println(Math.ceil(Math.PI));         // aufrunden
        System.out.println(Math.floor(Math.PI));        // abrunden
        System.out.println(Math.round(Math.PI));        // automatisch runden
    }
}