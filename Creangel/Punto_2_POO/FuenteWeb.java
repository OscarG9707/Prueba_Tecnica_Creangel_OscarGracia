import java.util.*;

public class FuenteWeb implements FuenteDatos {

    @Override
    public List<Documento> obtenerDocumentos() {
        List<Documento> lista = new ArrayList<>();
        lista.add(new Documento("XM", "Generacion en Colombia", "Web"));
        lista.add(new Documento("Noticias", "Titulares del día", "Web"));
        return lista;
    }
}

