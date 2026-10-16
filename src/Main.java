import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.print("Ingresa un número entero positivo (N): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, ingresa un número entero positivo mayor que 0.");
            } else {
                System.out.println("--- Resultados para el número " + n + " ---");

                // A. Usando FOR (divisores propios: desde 1 hasta n-1)
                int sumaFor = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sumaFor += i;
                    }
                }
                boolean esPerfectoFor = (sumaFor == n);
                System.out.println("FOR -> Suma: " + sumaFor + " -> " + (esPerfectoFor ? "Es perfecto" : "No es perfecto"));

                // B. Usando WHILE
                int sumaWhile = 0;
                int j = 1;
                while (j < n) {
                    if (n % j == 0) {
                        sumaWhile += j;
                    }
                    j++;
                }
                boolean esPerfectoWhile = (sumaWhile == n);
                System.out.println("WHILE -> Suma: " + sumaWhile + " -> " + (esPerfectoWhile ? "Es perfecto" : "No es perfecto"));

                // C. Usando DO-WHILE
                int sumaDoWhile = 0;
                int k = 1;
                if (n > 1) {
                    do {
                        if (n % k == 0) {
                            sumaDoWhile += k;
                        }
                        k++;
                    } while (k < n);
                }
                boolean esPerfectoDoWhile = (sumaDoWhile == n);
                System.out.println("DO-WHILE -> Suma: " + sumaDoWhile + " -> " + (esPerfectoDoWhile ? "Es perfecto" : "No es perfecto"));
            }

            System.out.print("¿Deseas evaluar otro número? (si/no): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        System.out.println("¡Programa finalizado!");

    }
}
