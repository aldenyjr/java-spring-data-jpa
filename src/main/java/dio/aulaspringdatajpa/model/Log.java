package dio.aulaspringdatajpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @Column(length = 15)
    private String ip;

    @Column(length = 7)
    private String placa;

    @Column(name = "data_registro")
    private LocalDateTime dataRegistro;

    @Column(name = "id_servicos")
    private Integer servico;

    @Column(length = 17)
    private String chassi;

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", placa='" + placa + '\'' +
                ", dataRegistro=" + dataRegistro +
                ", servico=" + servico +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
