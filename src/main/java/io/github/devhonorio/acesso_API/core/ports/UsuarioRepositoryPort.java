package io.github.devhonorio.acesso_API.core.ports;

import io.github.devhonorio.acesso_API.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);

    public Usuario obtainByEmail(String email);

}
