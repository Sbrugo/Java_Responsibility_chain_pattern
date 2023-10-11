public abstract class EmpleadoDeGobierno {
    private EmpleadoDeGobierno sigEmpleado;
    public abstract void procesarSolicitud(Documento doc);
    public void setSigEmpleado(EmpleadoDeGobierno empleado){
        this.sigEmpleado = empleado;
    }
    public EmpleadoDeGobierno getSigEmpleado(){
        return sigEmpleado;
    }
}
