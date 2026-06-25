package io.github.devhonorio.acesso_API.core.ports;

import io.github.devhonorio.acesso_API.domain.Morador;

public interface MoradorRepositoryPort {

    public Morador create(Morador morador);

    public Morador obtainByCPF(String cpf);

}
