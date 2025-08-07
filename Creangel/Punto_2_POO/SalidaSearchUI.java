import java.util.List;

public class SalidaSearchUI implements SalidaSistema {

    @Override
    public void mostrarSalida(List<Documento> documentos) {
        System.out.println("=== Interfaz de Búsqueda ===");
        for (Documento doc : documentos) {
            System.out.println("- Resultado: " + doc.toString());
        }
        System.out.println();
    }
}
