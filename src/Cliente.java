import java.util.List;

public class Cliente {
    private int clienteId;
    private String nome;
    private String email;
    private String telefone;
    private List<Endereco> endereco;

    public Cliente(String nome, String email, String telefone, List<Endereco> endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    /* Getters */

    public int getId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    /* Setters */

    public void setId(int id) {
        this.clienteId = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }


}
