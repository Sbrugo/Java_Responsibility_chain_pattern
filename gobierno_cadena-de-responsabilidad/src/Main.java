public class Main {
    public static void main(String[] args) {

        EmpleadoDeGobierno empleadoDiputado1 = new Diputado();
        EmpleadoDeGobierno empleadoMinistro1 = new Ministro();
        EmpleadoDeGobierno empleadoPresidente1 = new Presidente();

        empleadoDiputado1.setSigEmpleado(empleadoMinistro1);
        empleadoMinistro1.setSigEmpleado(empleadoPresidente1);

        Documento documento1 = new Documento("Hola, soy el primer documento", 3);

        empleadoDiputado1.procesarSolicitud(documento1);
    }
}