public class Casting {
    public static void main(String[] args) {
        // en un año ubique 30 perritos
        // cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);


        //ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        //castear (obligar a dar un resultado, con mas exactitud )
        double c = (double) a/b;
        System.out.println(c);

        //
        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }

    }

