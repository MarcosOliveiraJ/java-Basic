class Mago extends Personagem {
    public Mago(String nome) {
        super(80, nome, 25, 5);
    }

    public int lancarMagia() {
        System.out.println(getNome() + " lançou uma BOLA DE FOGO!");
        return (int) (getAtaque() * 1.8);
    }
}