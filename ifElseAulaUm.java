package AulaTres;
import java.util.Scanner;

public class ifElseAulaUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double notaUm = sc.nextDouble();
        System.out.println("Digite sua segunda nota");
        double notaDois = sc.nextDouble();
        System.out.println("Digite sua terceira nota");
        double notaTres = sc.nextDouble();
        double Media = (notaUm+notaDois+notaTres)/3;
        System.out.println(Media);

        if(Media < 4){
            System.out.println("Reprovado");
        }else if (Media <= 6){
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }
}
