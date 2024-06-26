package GestionPersonal;
import java.util.ArrayList;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class GestionPersonal {
    private ArrayList<Departamento> departamentos;
    private ArrayList<Empleado> empleados;

    // Constructor
    public GestionPersonal() {
        this.departamentos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {

        empleados.add(empleado);
    }

    public double calcularSalario(int idEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == idEmpleado) {
                double salario = empleado.getSalario();
                String salarioFormateado = String.format("%.0f", salario);
                return Double.parseDouble(salarioFormateado);
            }
        }
        return -1;
    }

    public boolean existeEmpleadoConID(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void mostrarEstructuraJerarquica() {
        System.out.println("\n-------------------------------------------------------------------------");
        Departamento mantenimiento = new Departamento("Mantenimiento");
        Departamento administracion = new Departamento("Administración");
        Departamento contabilidad = new Departamento("Contabilidad");
        Departamento recursosHumanos = new Departamento("Recursos Humanos");
        Departamento ventasMarketing = new Departamento("Ventas y Marketing");
        Departamento produccionOperaciones = new Departamento("Producción o Operaciones");
        Departamento tecnologiaInformacion = new Departamento("Tecnología de la Información (TI)");
        System.out.println("\n-------------------------------------------------------------------------");
    }
    public void generarInformeProductividad() {
        System.out.println("Informe de Productividad por Departamento:");
        for (Departamento departamento : departamentos) {
            System.out.println("\n-------------------------------------------------------------------------");
            System.out.println("Departamento: " + departamento.getNombre());
            System.out.println("Productividad: $" + departamento.calcularProductividad());
            System.out.println("\n-------------------------------------------------------------------------");

        }
    }
}