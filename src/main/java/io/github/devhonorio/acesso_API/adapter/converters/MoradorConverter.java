package io.github.devhonorio.acesso_API.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.devhonorio.acesso_API.adapter.dtos.MoradorDto;
import io.github.devhonorio.acesso_API.domain.Morador;
import io.github.devhonorio.acesso_API.domain.Pessoa;

@Component
public class MoradorConverter {

    public Morador toDomain(MoradorDto moradorDto) {
        return new Morador(
                moradorDto.getId(),
                moradorDto.getCPF(),
                moradorDto.getEndereco(),
                moradorDto.getCelular(),
                new Pessoa(null, moradorDto.getNome())
        );
    }

    public MoradorDto toDto(Morador morador) {
        return new MoradorDto(
                morador.getId(),
                morador.getCPF(),
                morador.getEndereco(),
                morador.getCelular(),
                morador.getPessoa().getNome()
        );
}
        
}
