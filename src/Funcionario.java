public class Funcionario {
    private String nome;
    private String cargo;
   
   
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }


     /* Getters */
    public String getNome() {
        return this.nome;
    }
    public String getCargo() {
        return this.cargo;
    }

    /* Setters */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
