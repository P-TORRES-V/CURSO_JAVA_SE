import java.sql.SQLOutput;

public class UpdatingVariable {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50  descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $ 30 c/u
        // comida :$45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadena de texto
        String employeeName = "Paul Torres";
        employeeName = employeeName + " Vilcapoma";
        System.out.println(employeeName);
        employeeName = "Williams " + employeeName;
        System.out.println(employeeName);
    }
}
