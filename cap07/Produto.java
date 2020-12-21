package cap07;

import java.io.Serializable;

public class Produto implements Serializable, DAO, Estoque {
    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void inserir() {
    }

    public void excluir() {
    }

    public void localizar() {
    }

    public void baixar() {
    }
    
}
