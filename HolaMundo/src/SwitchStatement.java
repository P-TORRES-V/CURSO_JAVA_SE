public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Blue Dark";// es el metodo seleccionado; si no seleccionas una opccion valida saldra el texto por defecto(default)

        switch (colorModeSelected){
            case "Light":
                System.out.println("seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionate modo Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste modo Blue Dark Mode");
                break;
            case "Dark" :
                System.out.println("Seleccionaste modo Dark Mode");
                break;

                default:
                    System.out.println("Selecciona una opccion ");
        }
    }
}
