public interface GestionCitas {
    boolean programarCita(CitaMedica cita);
    boolean cancelarCita(CitaMedica cita);
    boolean realizarCita();
}
