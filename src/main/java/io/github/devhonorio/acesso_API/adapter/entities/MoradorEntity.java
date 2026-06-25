package io.github.devhonorio.acesso_API.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tb_morador")
public class MoradorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String CPF;
    private String endereco;
    private String celular;

    @OneToOne(cascade=jakarta.persistence.CascadeType.PERSIST)
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoa;
}
