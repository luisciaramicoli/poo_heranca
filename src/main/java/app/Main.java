package app;
import java.time.LocalDate;
import java.time.Month;
public class Main {
    public static void main(String[] args){
        // Tarefa[] tarefas = new Tarefa[5];
        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo Teste", false);

        // Compromisso[] compromissos = new Compromisso[5];
        // compromissos[2] = new Compromisso(0, "Compromisso", "hoje", "Amanhã");
        // System.out.println(compromissos[2].getDescricao());

        PessoaFisica pf = new PessoaFisica("Luis", "Tupa", LocalDate.of(1980, Month.MARCH, 29), "1111122222" );
       
        System.out.println(pf.exibirInformacoes());

        PessoaJuridica pj = new PessoaJuridica("Luis", "Tupa", "Fatec", "1111122222" );
       
        System.out.println(pj.exibirInformacoes());

        Pessoa p1 = pf;
        System.out.println(p1.exibirInformacoes());

        p1 = pj;
        System.out.println(p1.exibirInformacoes());
     
    }
}