public class Presidente extends EmpleadoDeGobierno{
    public Presidente() {
    }
    @Override
    public void procesarSolicitud(Documento doc) {
        if(doc.getTipo().equals(3) || doc.getTipo().equals(2) || doc.getTipo().equals(1)){
            System.out.println("Leeré el documento");
        }
        else if(getSigEmpleado() != null){
            getSigEmpleado().procesarSolicitud(doc);
        }
    }
}
