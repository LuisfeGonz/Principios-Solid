package solidPractice.dependencyInvertion;

public class Contabilidad extends Empleado{
    @Override
    public void task(){
        super.task();
        System.out.println("Conta");
    }
}
