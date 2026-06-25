package io.github.devhonorio.acesso_API.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devhonorio.acesso_API.adapter.entities.PessoaEntity;
import io.github.devhonorio.acesso_API.adapter.entities.UsuarioEntity;
import io.github.devhonorio.acesso_API.core.ports.UsuarioRepositoryPort;
import io.github.devhonorio.acesso_API.domain.Pessoa;
import io.github.devhonorio.acesso_API.domain.Usuario;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort{


    private final UsuarioRepository usuarioRepository;
    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;
    

    @Override
    public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class); //converte o usuario de dominio para usuario entity
        usuarioEntity.setPessoaEntity(createPessoa(usuario.getPessoa())); //cria a pessoa entity e seta no usuario entity
        UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity); //salva o usuario entity no banco de dados e retorna o usuario entity salvo
        return modelMapper.map(novoUsuario, Usuario.class); //converte o usuario entity salvo para usuario de dominio e retorna
    }

    @Override
    public Usuario obtainByEmail(String email) {
        UsuarioEntity usuarioByEmail = usuarioRepository.findByEmail(email);
        if(usuarioByEmail == null) {
            return null;
        }
        return modelMapper.map(usuarioByEmail, Usuario.class);
    }

    private PessoaEntity createPessoa(Pessoa pessoa) { //cria a pessoa entity e retorna
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class); //converte a pessoa de dominio para pessoa entity
        return pessoaRepository.save(pessoaEntity); //salva a pessoa entity no banco de dados e retorna a pessoa entity salva
    }

}
