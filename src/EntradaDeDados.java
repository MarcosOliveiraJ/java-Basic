import java.util.Scanner;

public class EntradaDeDados {
    static void main(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite vosso nome: ");
        String nome = sc.next();
        System.out.println("Digite vossa idade: ");
        int idade = sc.nextInt();
        System.out.printf("Digite vosso peso: ");
        double peso = sc.nextDouble();
        System.out.printf("Digite vossa altura: ");
        double altura = sc.nextDouble();

        System.out.println("Seu nome: "+nome);
        System.out.println("Sua idade: "+idade);
        System.out.println("Seu peso: "+peso);
        System.out.println("Sua altura: "+altura);
        System.out.printf("IMC: "+(peso/(altura*altura)));
    }
}
