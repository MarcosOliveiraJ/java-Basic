public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(){}

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void avancarStatus() {
        switch (this.status) {
            case AGUARDANDO_PAGAMENTO -> this.status = StatusPedido.PROCESSANDO;
            case PROCESSANDO -> this.status = StatusPedido.ENVIADO;
            case ENVIADO -> this.status = StatusPedido.ENTREGUE;
            default -> System.out.println("O status não pode mais ser avançado.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
