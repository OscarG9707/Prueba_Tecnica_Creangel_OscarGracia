import java.util.*;

public class App {
    public static void main(String[] args) {
        // Crear las fuentes de datos
        List<FuenteDatos> fuentes = new ArrayList<>();
        fuentes.add(new FuenteArchivo());
        fuentes.add(new FuenteWeb());
        fuentes.add(new FuenteExcel());

        // Recolectar todos los documentos
        List<Documento> todosLosDocumentos = new ArrayList<>();
        for (FuenteDatos fuente : fuentes) {
            todosLosDocumentos.addAll(fuente.obtenerDocumentos());
        }

        // Mostrar todos los documentos recolectados
        System.out.println("Todos los documentos obtenidos:");
        for (Documento doc : todosLosDocumentos) {
            doc.mostrar();
        }

        // Salidas del sistema
        SalidaSistema salida1 = new SalidaSearchUI();
        SalidaSistema salida2 = new SalidaDashboard();

        // Mostrar en ambas salidas
        salida1.mostrarSalida(todosLosDocumentos);
        salida2.mostrarSalida(todosLosDocumentos);

        // ------------------------------------------
        // Fase 2: Filtrado por palabra clave
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra clave para filtrar los documentos: ");
        String palabraClave = scanner.nextLine().toLowerCase();

        // Filtrar documentos
        List<Documento> documentosFiltrados = new ArrayList<>();
        for (Documento doc : todosLosDocumentos) {
            if (doc.getContenido().toLowerCase().contains(palabraClave)) {
                documentosFiltrados.add(doc);
            }
        }

        // Mostrar documentos filtrados
        System.out.println("\nDocumentos que contienen la palabra clave \"" + palabraClave + "\":\n");
        salida1.mostrarSalida(documentosFiltrados);
        salida2.mostrarSalida(documentosFiltrados);
    }
}
