package cap07;
public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    public Brinquedo() {
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public Brinquedo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        try {
            if (faixaEtaria == "0 a 2" || faixaEtaria == "3 a 5" || faixaEtaria == "6 a 10" || faixaEtaria == "acima de 10")
            this.faixaEtaria = faixaEtaria;
            else throw new Exception("Entrada de dados não padronizada.");
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void mostrar() {
        System.out.println(getNome());
        System.out.println(getFaixaEtaria());
        System.out.println(getPreco());
    }
    
}
