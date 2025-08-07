public class Documento {
    private String titulo;
    private String contenido;
    private String fuenteOrigen;

    public Documento(String titulo, String contenido, String fuenteOrigen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fuenteOrigen = fuenteOrigen;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Fuente: " + fuenteOrigen);
        System.out.println("-----------------------------------");
    }
    @Override
    public String toString() {
        return titulo + " (" + fuenteOrigen + ")";
    }

    public String getContenido() {
    return contenido;
    }
}

