package io.github.devhonorio.acesso_API.core.services;

import io.github.devhonorio.acesso_API.core.ports.MoradorRepositoryPort;
import io.github.devhonorio.acesso_API.core.ports.MoradorServicePort;
import io.github.devhonorio.acesso_API.domain.Morador;


public class MoradorService implements MoradorServicePort {

    private final MoradorRepositoryPort moradorRepositoryPort;

    
    public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
        this.moradorRepositoryPort = moradorRepositoryPort;
    }

    @Override
    public Morador createMorador(Morador morador) {
       return moradorRepositoryPort.create(morador);
    }

}

