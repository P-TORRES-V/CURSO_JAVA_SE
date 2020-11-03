import java.util.EmptyStackException;

public class DataTypes {
    public static void main(String[] args) {
        //Int solo permite agregar hasta diez digitos
        int n = 1234567890;
        // se tiene que especificar la letr "L" al final
        long nL = 12345678901L;
        // permite igual a que double pero se tiene que colocar la letra "f"

        float nF = 123.456F;
        //nos permite usar con el punto y separarlo
        double nD = 123.456;
        var salary = 1000;
        // pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;
        System.out.println(totalSalary);
        System.out.println(salary);
        System.out.println(pension);

        var employeeName = "Paul Torres";
        System.out.println(" EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);





    }
}
