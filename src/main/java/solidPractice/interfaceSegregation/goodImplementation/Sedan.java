package solidPractice.interfaceSegregation.goodImplementation;

import solidPractice.interfaceSegregation.goodImplementation.Interfaces.ICarro;
import solidPractice.interfaceSegregation.goodImplementation.Interfaces.ISedan;

public class Sedan implements ICarro, ISedan {
    @Override
    public void manejar() {
        System.out.println("Manejar sedan");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar sedan");
    }

    @Override
    public void mantenimientoLlantasRin15() {
        System.out.println("Mantenimiento rin 15");
    }
}
