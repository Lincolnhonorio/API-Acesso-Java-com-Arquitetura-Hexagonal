package io.github.devhonorio.acesso_API.adapter.dtos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nome; 
    private String email;
    private String senha;
    private Boolean administrador;
}