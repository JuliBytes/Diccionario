import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpanishEnglishDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Diccionario Español - Inglés
            Map<String, String> dictionary = new HashMap<>();
            dictionary.put("Hola", "Hello");
            dictionary.put("Adiós", "Bye");
            dictionary.put("Casa", "House");
            dictionary.put("Baño", "Bathroom");
            dictionary.put("Perro", "Dog");
            dictionary.put("Gato", "Cat");
            dictionary.put("Manzana", "Apple");
            dictionary.put("Naranja", "Orange");
            dictionary.put("Azul", "Blue");
            dictionary.put("Verde", "Green");

            // Palabras al azar
            String[] randomWords = {"Hola", "Casa", "Perro", "Manzana", "Azul"};

            // Contador de respuestas correctas
            int correctAnswers = 0;

            // Solicitar al usuario que ingrese la traducción
            for (String word : randomWords) {
                System.out.print("Traduce '" + word + "' al inglés: ");
                String userTranslation = scanner.nextLine().trim().toLowerCase();

                // Verificar si es correcto
                if (dictionary.containsKey(word) && dictionary.get(word).equalsIgnoreCase(userTranslation)) {
                    System.out.println("¡Correcto!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrecto. La traducción correcta es: " + dictionary.get(word));
                }
            }

            // Mostrar resultados
            System.out.println("\nRespuestas correctas: " + correctAnswers);
            System.out.println("Respuestas incorrectas: " + (randomWords.length - correctAnswers));

            // Preguntar si quiere intentarlo de nuevo
            System.out.print("¿Quieres intentarlo de nuevo? (S/N): ");
        } while (scanner.nextLine().equalsIgnoreCase("S"));

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}


