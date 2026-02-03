import java.util.Scanner;
import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite vosso nome: ");
        String nome = sc.next();
        System.out.print("Digite vossa idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite vosso peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite vossa altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("\n resultados");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("IMC: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal (Ideal)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }
}
