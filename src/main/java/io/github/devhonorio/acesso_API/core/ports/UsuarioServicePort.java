package io.github.devhonorio.acesso_API.core.ports;

import org.springframework.stereotype.Service;

import io.github.devhonorio.acesso_API.domain.Usuario;

@Service
public interface UsuarioServicePort { 

    Usuario createUsuario(Usuario usuario);
}