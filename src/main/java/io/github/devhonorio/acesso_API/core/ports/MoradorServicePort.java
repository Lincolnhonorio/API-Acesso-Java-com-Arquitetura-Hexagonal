package io.github.devhonorio.acesso_API.core.ports;

import org.springframework.stereotype.Service;

import io.github.devhonorio.acesso_API.domain.Morador;

@Service
public interface MoradorServicePort { 
    Morador createMorador(Morador morador);
}