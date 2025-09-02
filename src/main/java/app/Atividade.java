package app;

public class Atividade{
     private long id;
     private String descricao;

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
}