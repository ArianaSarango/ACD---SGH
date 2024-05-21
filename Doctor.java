public class Doctor {
    private String numColegiado;
    private String especialidadMedica;

    public Doctor(String numColegiado, String especialidadMedica) {
        this.numColegiado = numColegiado;
        this.especialidadMedica = especialidadMedica;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("12345", "Dermatología");

        System.out.println("Detalles del doctor:");
        System.out.println("Número de colegiado: " + doctor.getNumColegiado());
        System.out.println("Especialidad médica: " + doctor.getEspecialidadMedica());
    }
}
