package app;
public class Tarefa{
    private long id;
    private String descricao;
    private boolean isConcluido;

    public void setId(long id){
        this.id = id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public long getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean IsConcluido(){
        return isConcluido;
    }

    public void setConcluido(boolean isConcluido){
        this.isConcluido = isConcluido;
    }

    public Tarefa(long id, String descricao, boolean isConcluido){
        this.setId(id);
        this.setDescricao(descricao);
        this.setConcluido(isConcluido);
    }
}