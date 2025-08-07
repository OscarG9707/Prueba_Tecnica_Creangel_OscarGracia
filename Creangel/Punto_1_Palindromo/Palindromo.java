import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba una palabra o frase para reordenar: ");
        String textoUsuario = entrada.nextLine();

        String resultado = generarPalindromo(textoUsuario);
        System.out.println("Resultado: " + resultado);

        entrada.close();
    }


    public static String generarPalindromo(String texto) {

        // Se convierte el texto a minúsculas y se quitan los espacios
        texto = texto.toLowerCase().replaceAll("\\s", "");

        //Cuenta cuántas veces aparece cada letra
        Map<Character, Integer> conteoLetras = new HashMap<>();

        for (char letra : texto.toCharArray()) {
            conteoLetras.put(letra, conteoLetras.getOrDefault(letra, 0) + 1);
        }

        // Se inicializan las variables para controlar el número de letras impares
        int letrasImpares = 0;
        char letraCentral = 0;

        // Construcción de la mitad izquierda del palíndromo
        StringBuilder ladoIzquierdo = new StringBuilder();

        // Se recorre el mapa de letras
        for (Map.Entry<Character, Integer> entradaLetra : conteoLetras.entrySet()) {
            char letra = entradaLetra.getKey();
            int cantidad = entradaLetra.getValue();

            // Se evalua si la letra aparece una cantidad impar de veces
            if (cantidad % 2 != 0) {
                letrasImpares++; 
                letraCentral = letra; // Se guarda la letra impar en una nueva variable que puede quedar como letra central
            }

            // Se agrega la mitad de las letras al lado izquierdo
            for (int i = 0; i < cantidad / 2; i++) {
                ladoIzquierdo.append(letra);
            }
        }

        // Si hay más de una letra impar, no es posible formar palíndromo
        if (letrasImpares > 1) return "Not Possible";

        // El lado derecho se obtiene invirtiendo el izquierdo
        String izquierdaStr = ladoIzquierdo.toString();
        String derechaStr = new StringBuilder(izquierdaStr).reverse().toString();

        // Si hay una letra central, se ubica en el medio, si no, solo se unen los lados
        if (letrasImpares == 1) {
            return izquierdaStr + letraCentral + derechaStr;
        } else {
            return izquierdaStr + derechaStr;
        }
    }
}
