package solidPractice.liskovPrinciple;

public class MainLiskov {
    public static void main(String args[]){

        /**
         * No Liskov
         */
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calculoCuadrado();

        Rectangulo rec = new Rectangulo();
        rec.calcularArea();

        /**
         * Liskov
         * Si x es subclase de y,
         * entonces los objetos tipo y
         * pueden ser reemplazados
         * por objetos tipo x
         */
        CalcularArea c_a = new Rectangulo();
        //Rectangulo reemplaza a Calcular area
    }
}
