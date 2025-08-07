import java.util.*;

public class FuenteExcel implements FuenteDatos {

    @Override
    public List<Documento> obtenerDocumentos() {
        List<Documento> lista = new ArrayList<>();
        lista.add(new Documento("Generacion", "Datos del 2025", "Excel"));
        lista.add(new Documento("Tipos de Generacion", "Tecnologias", "Excel"));
        return lista;
    }
}

