package solidPractice.dependencyInvertion;

public class Ingenieria extends Empleado {
    @Override
    public void task(){
        super.task();
        System.out.println("Ingenieria");
    }
}
