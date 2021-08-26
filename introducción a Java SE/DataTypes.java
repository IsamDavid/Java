import jdk.internal.org.xml.sax.EntityResolver;

public class DataTypes {
    public static void main(String[] args) {
        //Se pueden crear hasta 10 dígitos
        int n = 1234567890;

        //Debemos de poner una L al final para reconocer que es un long
        long nL = 12345678901L;


        //Para calculos matemáticos que requieren precisión 
        double nD = 123.3456789021;
        
        //Es importante utilizar una F al final para que detecte que es un float
        float nF = 123.3456789021F;

    }
}
