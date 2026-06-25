package io.github.devhonorio.acesso_API.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.devhonorio.acesso_API.adapter.entities.MoradorEntity;
import io.github.devhonorio.acesso_API.core.ports.MoradorRepositoryPort;
import io.github.devhonorio.acesso_API.domain.Morador;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MoradorRepositoryAdapter implements MoradorRepositoryPort{


    private final MoradorRepository moradorRepository;
    private final ModelMapper modelMapper;

    @Override
    public Morador create(Morador morador) {
        
        MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class); // 1. O ModelMapper converte o Morador E a Pessoa interna automaticamente para Entity
        
        
        MoradorEntity novoMorador = moradorRepository.save(entity); // 2. Graças ao cascade = CascadeType.PERSIST na MoradorEntity, 
        // o save() vai salvar a pessoa primeiro e depois o morador sozinho!
        
        return modelMapper.map(novoMorador, Morador.class); // 3. Converte de volta para o domínio e retorna
    }
    @Override
    public Morador obtainByCPF(String cpf) {
        return null;
    }

}