abstract class Personagem {
    private String nome;
    private int pv, ataque, defesa;

    public Personagem(int pv, String nome, int ataque, int defesa) {
        this.pv = pv;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int atacar() {
        return ataque;
    }

    public void receberDano(int dano) {

        int finalDano = (int) (dano * (1 - defesa / 100.0));
        if (dano > 0 && finalDano <= 0) finalDano = 1;
        pv -= finalDano;
        if (pv < 0) pv = 0;

        System.out.println(nome + " recebeu " + finalDano + " de dano.");
        System.out.println("Vida atual: " + pv);
    }

    public void mostrarStatus() {
        System.out.println("[" + nome + "] PV: " + pv + " | ATK: " + ataque + " | DEF: " + defesa + "%");
    }

    public String getNome() {
        return nome;
    }

    public int getPv() {
        return pv;
    }

    public int getAtaque() {
        return ataque;
    }
}