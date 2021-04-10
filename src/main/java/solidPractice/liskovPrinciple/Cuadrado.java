package solidPractice.liskovPrinciple;

public class Cuadrado extends CalcularArea {
    public void calculoCuadrado(){
        calcularArea();
        System.out.println("Cuadrado.");
    }
}
