class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(120, nome, 15, 25);
    }

    public int golpePesado() {
        System.out.println(getNome() + " usou GOLPE PESADO!");
        return (int) (getAtaque() * 1.5);
    }
}

