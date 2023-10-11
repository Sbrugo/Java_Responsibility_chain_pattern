public class Diputado extends EmpleadoDeGobierno{
    public Diputado() {
    }
    @Override
    public void procesarSolicitud(Documento doc) {
        if(doc.getTipo().equals(1)) {
            System.out.println("Leeré el documento");
        }
        if(getSigEmpleado()!= null){
            getSigEmpleado().procesarSolicitud(doc);
        }
    }
}
