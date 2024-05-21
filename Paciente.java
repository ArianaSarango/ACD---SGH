import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private final List<CitaMedica> citas;
    private final ExpedienteMedico expediente;

    public Paciente(String nombre, String id, String dni, String direccion) {
        super(nombre, id, dni, direccion);
        this.citas = new ArrayList<>();
        this.expediente = new ExpedienteMedico();
    }

    public void agregarCita(CitaMedica cita) {
        citas.add(cita);
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

    public ExpedienteMedico getExpediente() {
        return expediente;
    }
}
