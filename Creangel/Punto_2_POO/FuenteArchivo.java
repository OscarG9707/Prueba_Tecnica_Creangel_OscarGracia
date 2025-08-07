import java.util.*;

public class FuenteArchivo implements FuenteDatos {

    @Override
    public List<Documento> obtenerDocumentos() {
        List<Documento> lista = new ArrayList<>();
        lista.add(new Documento("Manual de Usuario", "Contenido del manual", "Archivo"));
        lista.add(new Documento("Licencia.txt", "Términos y condiciones", "Archivo"));
        return lista;
    }
}
