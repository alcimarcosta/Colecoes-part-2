package principal;

import java.util.Objects;

public class Cliente {

    private String nome;
    private String sexo;

    public Cliente(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(nome, cliente.nome) && Objects.equals(sexo, cliente.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
