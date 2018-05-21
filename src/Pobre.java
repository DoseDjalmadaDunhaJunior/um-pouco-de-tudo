public class Pobre extends Carro{

    public Pobre(){

    }

    public void setnDonosAnteriores(int nDonosAnteriores) {
        this.nDonosAnteriores = nDonosAnteriores;
    }

    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }

    public void setZero(boolean zero) {
        this.zero = zero;
    }

    public int getnDonosAnteriores() {
        return nDonosAnteriores;
    }

    public int getnParcelas() {
        return nParcelas;
    }

    public boolean getZero() {
        return zero;
    }

    private int nParcelas;
    private int nDonosAnteriores;
    private boolean zero;
}
