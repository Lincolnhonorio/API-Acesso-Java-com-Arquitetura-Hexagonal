package io.github.devhonorio.acesso_API.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devhonorio.acesso_API.adapter.entities.UsuarioEntity;
import io.github.devhonorio.acesso_API.core.ports.UsuarioRepositoryPort;
import io.github.devhonorio.acesso_API.domain.Usuario;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort{


    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;
    

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity novoUsuario = usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(novoUsuario, Usuario.class);
    }
}
