package io.github.devhonorio.acesso_API.adapter.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.devhonorio.acesso_API.core.ports.MoradorRepositoryPort;
import io.github.devhonorio.acesso_API.core.ports.MoradorServicePort;
import io.github.devhonorio.acesso_API.core.ports.UsuarioRepositoryPort;
import io.github.devhonorio.acesso_API.core.ports.UsuarioServicePort;
import io.github.devhonorio.acesso_API.core.services.MoradorService;
import io.github.devhonorio.acesso_API.core.services.UsuarioService;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServiceImplement(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServiceImplement(MoradorRepositoryPort moradorRepositoryPort) {
        return new MoradorService(moradorRepositoryPort);
    }

}
