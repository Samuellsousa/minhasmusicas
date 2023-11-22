public class Compra {
    private String descricao;
    private  double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao + "valor =" + valor;
    }
}
