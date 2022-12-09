import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) throws Exception {
        numero(); 
    }

    public static void numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero que deseja inverter: ");
        int numero = sc.nextInt();
        sc.close();

        numeroInverso(numero);

    }

    public static void numeroInverso(int numero) {
        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;
        }

        System.out.println("O inverso do numero é: " + i);
    }
}
