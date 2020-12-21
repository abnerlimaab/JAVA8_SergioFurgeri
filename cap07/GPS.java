package cap07;
public class GPS {
    private String idioma;
    private String rota;

    public GPS() {
    }

    public GPS(String rota) {
        this.idioma = "Português";
        this.rota = rota;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getRota() {
        return rota;
    }
    
    public void mostrar() {
        System.out.println("Idioma: " + getIdioma());
        System.out.println("Rota: " + getRota());
    }
    
}
