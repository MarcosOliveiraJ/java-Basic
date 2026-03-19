class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(100, nome, 20, 10);
    }

    public int disparoPreciso() {
        System.out.println(getNome() + " usou DISPARO PRECISO!");
        return (int) (getAtaque() * 1.6);
    }
}
