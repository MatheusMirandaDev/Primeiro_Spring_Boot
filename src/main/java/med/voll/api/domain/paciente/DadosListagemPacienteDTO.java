package med.voll.api.domain.paciente;

public record DadosListagemPacienteDTO (Long Id, String nome, String email, String cpf) {
    public DadosListagemPacienteDTO (Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
