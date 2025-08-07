import java.util.List;

public class SalidaDashboard implements SalidaSistema {

    @Override
    public void mostrarSalida(List<Documento> documentos) {
        System.out.println("=== Panel del Dashboard ===");
        for (Documento doc : documentos) {
            System.out.println("[Dashboard] Mostrando documento:");
            doc.mostrar();
        }
        System.out.println();
    }
}
