public class CitaMedica {
    private String fecha;
    private String hora;
    private String motivo;
    private String estado;

    public CitaMedica(String fecha, String hora, String motivo, String estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static void main(String[] args) {
        CitaMedica cita = new CitaMedica("2024-05-21", "10:00", "Consulta de rutina", "Pendiente");

        System.out.println("Detalles de la cita médica:");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Motivo: " + cita.getMotivo());
        System.out.println("Estado: " + cita.getEstado());
    }
}
