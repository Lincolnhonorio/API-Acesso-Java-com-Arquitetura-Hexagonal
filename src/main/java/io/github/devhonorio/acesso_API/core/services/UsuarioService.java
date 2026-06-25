package io.github.devhonorio.acesso_API.core.services;

import io.github.devhonorio.acesso_API.core.ports.UsuarioRepositoryPort;
import io.github.devhonorio.acesso_API.core.ports.UsuarioServicePort;
import io.github.devhonorio.acesso_API.domain.Usuario;


public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
        if(usuarioExistente != null){
            throw new RuntimeException("Usuário duplicado");
        }
        return usuarioRepositoryPort.create(usuario);
    }

}

