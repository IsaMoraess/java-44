import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //metade e dobro de um numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println("O dobro do seu número é: ");
        System.out.println(Math.pow(numero,2));
        System.out.println("A metade metade do seu número é: ");
        System.out.println(Math.pow(numero,2)/2);
    }
}
