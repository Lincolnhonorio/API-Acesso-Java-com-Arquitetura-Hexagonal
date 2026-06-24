package io.github.devhonorio.acesso_API.adapter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.devhonorio.acesso_API.adapter.converters.UsuarioConverter;
import io.github.devhonorio.acesso_API.adapter.dtos.UsuarioDto;
import io.github.devhonorio.acesso_API.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    
    
    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {
        return usuarioConverter.toDto(usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDto)));
    }
}
