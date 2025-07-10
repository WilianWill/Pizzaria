public class Bebebida {
    public String nome;
    public String marca;
    public double valor;
    public int quantidade;

    public Bebebida(String nome, String marca, double valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    /* Getters */

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValor() {
        return this.valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

     /* Setters*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

