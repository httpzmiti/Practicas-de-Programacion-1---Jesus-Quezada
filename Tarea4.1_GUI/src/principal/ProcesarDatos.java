public class ProcesarDatos {
    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    // Método para capturar los datos
    public void capturarDatos(String matricula, String nombres, String apellidos, String cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }

    // Método para presentar los datos
    public String presentarDatos() {
        return "Matrícula: " + matricula + "\n" +
               "Nombres: " + nombres + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Cuatrimestre: " + cuatrimestre;
    }
}
