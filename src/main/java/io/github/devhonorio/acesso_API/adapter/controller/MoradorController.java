package io.github.devhonorio.acesso_API.adapter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.devhonorio.acesso_API.adapter.converters.MoradorConverter;
import io.github.devhonorio.acesso_API.adapter.dtos.MoradorDto;
import io.github.devhonorio.acesso_API.core.ports.MoradorServicePort;
import io.github.devhonorio.acesso_API.domain.Morador;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("api/moradores")
@RequiredArgsConstructor
public class MoradorController {

    
    private final MoradorServicePort moradorServicePort;
    private final MoradorConverter moradorConverter;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MoradorDto create(@RequestBody MoradorDto moradorDto) {

        Morador novoMorador = moradorServicePort.createMorador(moradorConverter.toDomain(moradorDto)); //Convertendo o DTO para o domínio antes de chamar o serviço
        
        return moradorConverter.toDto(novoMorador); //Convertendo o domínio de volta para DTO antes de retornar a resposta
    }

}
