package io.github.devhonorio.acesso_API.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.devhonorio.acesso_API.adapter.dtos.UsuarioDto;
import io.github.devhonorio.acesso_API.domain.Usuario;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDto usuarioDto) {
        return new Usuario(
                usuarioDto.getId(),
                usuarioDto.getNome(),
                usuarioDto.getEmail(),
                usuarioDto.getSenha(),
                usuarioDto.getAdministrador()
        );
    }

    public UsuarioDto toDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getAdministrador()
        );
}
        
}
