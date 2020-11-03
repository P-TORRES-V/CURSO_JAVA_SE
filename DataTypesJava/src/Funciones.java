public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //area de un circulo
        //pi * r2
        circleArea(y);

        //area de una esfera
        // 4*PI*R2
        sphereArea(y);

        //columen de una esfera
        //(4/3) * pi *r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar( 500, "MXN"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;

        }

        return quantity;
    }
}




