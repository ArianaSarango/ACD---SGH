public class ExpedienteMedico {
    private String id;

    public ExpedienteMedico() {
        this.id = id;
    }

    public void diagnostico() {
        System.out.println("Realizando diagnóstico...");
    }

    public void tratamiento() {
        System.out.println("Aplicando tratamiento...");
    }

    public void alergia() {
        System.out.println("Revisando alergias...");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        ExpedienteMedico expediente = new ExpedienteMedico();
        expediente.diagnostico();
        expediente.tratamiento();
        expediente.alergia();
    }
}
