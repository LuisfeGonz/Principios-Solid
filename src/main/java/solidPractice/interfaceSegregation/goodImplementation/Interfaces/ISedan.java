package solidPractice.interfaceSegregation.goodImplementation.Interfaces;

public interface ISedan {
    /**
     * extends ICarro
     * Esto ayudaria a que en las clases
     * Sedan y Suv unicamente se implementen
     * ISedan e ISuv respectivamente
     */
    void mantenimientoLlantasRin15();
}
