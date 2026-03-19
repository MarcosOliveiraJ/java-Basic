import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- Crie seu herói");
        Personagem jogador = escolher(sc, "seu herói");

        System.out.println("\nEscolha um inimigo");
        Personagem inimigo = escolher(sc, "o inimigo");

        System.out.println("\nBatalha: " + jogador.getNome() + " vs " + inimigo.getNome());

        while (jogador.getPv() > 0 && inimigo.getPv() > 0) {
            System.out.println("\nTurno de " + jogador.getNome() + " (PV: " + jogador.getPv() + ")");
            System.out.println("1- Atacar | 2- Especial | 3- Status");
            int op = sc.nextInt();

            if (op == 3) {
                jogador.mostrarStatus();
                continue;
            }

            int dano = (op == 1) ? jogador.atacar() : especial(jogador);
            inimigo.receberDano(dano);

            if (inimigo.getPv() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado!");
                break;
            }

            System.out.println("\nTurno de " + inimigo.getNome() + " (PV: " + inimigo.getPv() + ")");
            jogador.receberDano(especial(inimigo));
        }

        System.out.println("\nFim do jogo");
        System.out.println(jogador.getPv() > 0 ? "Vencedor: " + jogador.getNome() : "Vencedor: " + inimigo.getNome());

        sc.close();
    }

    static int especial(Personagem p) {
        switch (p.getClass().getSimpleName()) {
            case "Mago":
                return ((Mago) p).lancarMagia();
            case "Guerreiro":
                return ((Guerreiro) p).golpePesado();
            case "Arqueiro":
                return ((Arqueiro) p).disparoPreciso();
            default:
                return p.atacar();
        }
    }
    static Personagem escolher(Scanner sc, String alvo) {
        System.out.println("Escolha a classe para " + alvo + ":");
        System.out.println("1- Mago | 2- Guerreiro | 3- Arqueiro");
        int c = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        return switch (c) {
            case 1 -> new Mago(nome);
            case 2 -> new Guerreiro(nome);
            case 3 -> new Arqueiro(nome);
            default -> {
                System.out.println("Opção inválida! Criando Guerreiro por padrão.");
                yield new Guerreiro(nome);
            }
        };
    }
}