package solidPractice.interfaceSegregation.wrong;

public class Sedan implements ICarro {

    @Override
    public void manejar() {
        System.out.println("Manejar");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }

    @Override
    public void mantenimientoLlantasRin15() {
        System.out.println("Rin 15");
    }

    @Override
    public void mantenimientoLlantasRin18() {
        //No se utiliza
    }


}
