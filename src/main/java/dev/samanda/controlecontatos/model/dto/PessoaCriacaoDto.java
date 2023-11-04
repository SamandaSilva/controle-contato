package dev.samanda.controlecontatos.model.dto;

public record PessoaCriacaoDto(
    String nome,
    String endereco,
    String cep,
    String cidade,
    String uf
) {
}
