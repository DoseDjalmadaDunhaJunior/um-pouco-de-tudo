public class Rico extends Carro {
    public Rico() {

    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public double getConsumo() {
        return consumo;
    }

    private String pais;
    private double consumo;

}
