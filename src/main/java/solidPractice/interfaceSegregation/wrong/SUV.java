package solidPractice.interfaceSegregation.wrong;

public class SUV implements ICarro {

    @Override
    public void manejar() {
        System.out.println("Manejar");
    }

    @Override
    public void frenar() {
        System.out.println(("Frenar"));
    }

    @Override
    public void mantenimientoLlantasRin15() {
        //No se utiliza
    }

    /**
     * Crear este metodo arruina la interfaz ICarro y la clase Sedan
     */
    @Override
    public void mantenimientoLlantasRin18() {
        System.out.println("Rin 18");
    }
}
