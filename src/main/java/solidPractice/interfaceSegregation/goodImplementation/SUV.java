package solidPractice.interfaceSegregation.goodImplementation;

import solidPractice.interfaceSegregation.goodImplementation.Interfaces.ICarro;
import solidPractice.interfaceSegregation.goodImplementation.Interfaces.ISuv;

public class SUV implements ICarro, ISuv {

    @Override
    public void manejar() {
        System.out.println("Manejar suv");
    }

    @Override
    public void frenar() {
        System.out.println(("Frenar suv"));
    }

    @Override
    public void mantenimientoLlantasRin18() {
        System.out.println("Mantenimiento Rin 18");
    }
}
