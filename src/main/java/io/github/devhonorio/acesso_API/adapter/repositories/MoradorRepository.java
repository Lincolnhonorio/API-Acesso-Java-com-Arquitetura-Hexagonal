package io.github.devhonorio.acesso_API.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.devhonorio.acesso_API.adapter.entities.MoradorEntity;
import io.github.devhonorio.acesso_API.adapter.entities.UsuarioEntity;

public interface MoradorRepository extends JpaRepository<MoradorEntity, Long> {
    UsuarioEntity findByCPF(String cpf);

}
