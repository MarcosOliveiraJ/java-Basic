void main() {
        Pedido meuPedido = new Pedido(101, "Ana Silva");

        System.out.println("Status Inicial: " + meuPedido.getStatus());

        meuPedido.avancarStatus();
        meuPedido.avancarStatus();
        System.out.println("Status após avançar: " + meuPedido.getStatus());

        meuPedido.cancelarPedido();
        System.out.println("Status Final: " + meuPedido.getStatus());
    }
