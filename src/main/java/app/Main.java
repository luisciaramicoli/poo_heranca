package app;

public class Main {
    public static void main(String[] args){
        Tarefa[] tarefas = new Tarefa[5];
        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(4, "Novo Teste", false);

        Compromisso[] compromissos = new Compromisso[5];
        compromissos[2] = new Compromisso(0, "Compromisso", "hoje", "Amanhã");
        System.out.println(compromissos[2].getDescricao());
       
    }
}