package dio.aulaspringdatajpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @Column(length = 40)
    @NotNull
    private String nome;


    @OneToOne
    @JoinColumn(name = "id_projetos")
    @NotNull
    private Projeto projeto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
