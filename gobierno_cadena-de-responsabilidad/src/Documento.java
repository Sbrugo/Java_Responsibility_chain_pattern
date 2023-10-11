public class Documento {
    private String contenido;
    private Integer tipo;
    public Documento(String contenido, Integer tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }
    public void setContenido(String cont){
        this.contenido= cont;
    }
    public void setTipo(Integer tipo){
        this.tipo=tipo;
    }
    public String getContenido() {
        return contenido;
    }
    public Integer getTipo() {
        return tipo;
    }
}
