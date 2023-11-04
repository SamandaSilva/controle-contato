package dev.samanda.controlecontatos.model.dto;

public record ContatoCriacaoDto(
        Integer tipoContato,
        String contato,
        Long idPessoa
) {
}
