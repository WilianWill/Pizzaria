public class Pizza {
    
    private String nome;
    private String tamanho;
    private String sabor;
    private double valor;


    public Pizza(String nome, String tamnho, String sabor, double valor) {
        this.nome = nome;
        this.tamanho = tamnho;
        this.sabor = sabor;
        this.valor = valor;
    }

    /* Getters */ 

    public String getNome() {
        return this.nome;
    }
    public String getTamanho() {
        return this.tamanho;
    }
    public String getSabor() {
        return this.sabor;
    }
    public double getValor() {
        return this.valor;
    }

    /* Stters */ 

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
