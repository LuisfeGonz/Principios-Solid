package solidPractice.dependencyInvertion;

public class Ventas extends Empleado{
    @Override
    public void task(){
        super.task();
        System.out.println("Ventas");
    }
}
