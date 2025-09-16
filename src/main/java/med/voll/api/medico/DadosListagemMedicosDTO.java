package med.voll.api.medico;

public record DadosListagemMedicosDTO (String nome, String email, String crm, Especialidade especialidade){
    public  DadosListagemMedicosDTO (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
