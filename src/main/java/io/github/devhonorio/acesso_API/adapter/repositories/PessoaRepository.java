package io.github.devhonorio.acesso_API.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.devhonorio.acesso_API.adapter.entities.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

}
