
public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary += 200;
        System.out.println(salary);

        //pensión: $50 descuento
        System.out.println(salary);
        salary-=50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45

        salary+= (30*2) - 45;
        System.out.println(salary);

        //Actualizar cadenas de texto
        String employeeName = "David ";
        employeeName = employeeName + "Espinosa Flores";
        System.out.println(employeeName);

        employeeName = "Isam " + employeeName;
        System.out.println(employeeName);


        //
    }
}
