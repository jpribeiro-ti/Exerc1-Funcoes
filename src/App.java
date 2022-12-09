import java.util.Scanner;

public class App {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva um número: ");        
        int n = teclado.nextInt();

        teclado.close();

        // 5 5 5 5 5
        imprimeNum(n);

    }

    static void imprimeNum(int n) {
        int i, j;

        for (i=1; i <= n; i++) {
            for (j=0; j < i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
}