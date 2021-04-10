package solidPractice.dependencyInvertion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args []){
        /**


        List<Contabilidad> empleadosConta = new ArrayList<>();
        empleadosConta.add(new Contabilidad());

        List<Ingenieria> empleadosIng = new ArrayList<>();
        empleadosIng = new ArrayList<>();

        List<Ventas> empleadosVentas = new ArrayList<>();
        empleadosVentas = new ArrayList<>();

        int count = empleadosConta.size() + empleadosIng.size() + empleadosVentas.size();

         */

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Contabilidad());
        empleados.add(new Ingenieria());
        empleados.add(new Ventas());

        int count = empleados.size();

        for (Empleado emp :
                empleados) {
            emp.task();
        }

        System.out.println(count);
    }
}
