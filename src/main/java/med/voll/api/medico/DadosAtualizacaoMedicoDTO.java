package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEnderecoDTO;

public record DadosAtualizacaoMedicoDTO(
        @NotNull Long id,
        String nome,
        String telefone,
        @Valid DadosEnderecoDTO endereco) {
}
