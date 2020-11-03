public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("archivo Enviado");


        }else {
            System.out.println("por favor enciende tu Blouetooth, par iniciar la tranferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}
