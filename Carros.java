public class Carros {
    private String fabricante;
    private String modelo;
    private String cor;

    public Carros() {

    }

    public Carros(String modelo) {
        this.modelo = modelo;
    }
    public Carros(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carros(String modelo, String cor, String fabricante) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
