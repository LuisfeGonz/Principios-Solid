package solidPractice.openClose;

public class MainOpenClose{
    public static void main(String args[]){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calculoCuadrado();

        Rectangulo rec = new Rectangulo();
        rec.calcularArea();

        Triangulo tri = new Triangulo();
        tri.calcularArea();
    }
}
