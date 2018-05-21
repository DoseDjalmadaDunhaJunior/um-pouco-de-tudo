public class Carro {
//
    public void setMarca(String bmw){
        marca = bmw;
    }

    public void setValor(Double mil){
        valor = mil;
    }

    public void setLugares(int banco){
        lugares = banco;
    }

    public String getMarca(){
        return marca;
    }

    public double getValor() {
        return valor;
    }

    public int getLugares() {
        return lugares;
    }

    private String marca;
    private double valor;
    private int lugares;
}
