public class EJERCICIO_02 {
    public static void main(String[] args) {
        //char c = ‘z’; conviertelo a int
        //int i = 250; conviertelo a long y luego de long a short
        //double d = 301.067; conviertelo a long
        //int i = 100; súmale 5000.66 y conviertelo a float
        //int i = 737; multiplícalo por 100 y conviertelo a byte
        //double d = 298.638; divídelo entre 25 y conviertelo a long

        char c = 'z';
        int cI = (int) c;
        //
        int i = 250;
        long iL = i;
        short iS = (short)iL;
        //
        double d = 301.067;
        long dL = (long)d;
        //
        int a = 100 ;
        float aF = (float)(a + 5000.66);
        //
        int a1 = 737;
        a1 *= 100;
        byte a1B = (byte)a1;
        //
        double d1 = 298.638;
        d1 /=25;
        long d1L = (long)d1;

        System.out.println("#01\n"+"Char a int: "+"z = "+cI+"\n");
        System.out.println("#02\n"+"Int a Long: "+i+"="+iL+"\n"+"Long a Short: "+iL+"="+iS+"\n");
        System.out.println("#03\n"+"Double a Long: "+"301.067= "+dL+"\n");
        System.out.println("#4\n"+"Int más Float: 100+5000.66= "+(a+5000.66)+"\n");
        System.out.println("#5\n"+"Int más byte: "+a1B+"\n");
        System.out.println("#06\n"+"double a long: "+d1L+"\n");


    }
}
//Ejercicio #3
//
//Se debe tener descargados los JDKs en los cuales se compilará.
//se tiene que configurar los JAVA_HOME en función de la versión que se utlizara.
//En el sistema operativo puede ser mac o windows, el procedimiento es el mismo.