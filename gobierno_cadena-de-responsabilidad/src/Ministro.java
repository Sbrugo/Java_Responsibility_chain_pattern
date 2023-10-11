public class Ministro extends EmpleadoDeGobierno{
    public Ministro() {
    }
    @Override
    public void procesarSolicitud(Documento doc) {
        if(doc.getTipo().equals(2) || doc.getTipo().equals(1)){
            System.out.println("Leeré el documento");
        }
        if(getSigEmpleado() != null){
            getSigEmpleado().procesarSolicitud(doc);
        }
    }
}
