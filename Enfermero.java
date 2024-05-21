public class Enfermero {
    public void asistirProcedimiento() {
        System.out.println("Asistiendo en un procedimiento...");
    }

    public void tomarSignosVitales() {
        System.out.println("Tomando signos vitales...");
    }

    public static void main(String[] args) {
        Enfermero enfermero = new Enfermero();

        enfermero.asistirProcedimiento();
        enfermero.tomarSignosVitales();
    }
}
