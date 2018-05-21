import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carro> bibi = new ArrayList<>();
        bibi.add(new Rico());
        bibi.add(new Pobre());

        bibi.get(0).setMarca("Mercedes");
        bibi.get(0).setLugares(5);
        bibi.get(0).setValor(100000.00);
        bibi.get(1).setValor(10000.00);
        bibi.get(1).setMarca("GM");
        bibi.get(1).setLugares(5);
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Carro: " + bibi.get(i).getMarca() + "\n" +
                        bibi.get(i).getLugares() + "\n" + bibi.get(i).getValor() + "\n");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("esta tentando entrar numa posicao tensa man\n");
        } finally {
            Rico x1 = new Rico();
            Pobre gol = new Pobre();
            x1.setConsumo(1);
            x1.setPais("alemanha");
            x1.setLugares(7);
            x1.setMarca("bmw");
            x1.setValor(100000.00);
            gol.setnDonosAnteriores(3);
            gol.setnParcelas(15);
            gol.setZero(false);
            gol.setLugares(4);
            gol.setMarca("volks");
            gol.setValor(15000.0);

            System.out.println("Rico: " + x1.getMarca() + "\n" +
                    +x1.getLugares() + "\n" + x1.getValor() + "\n" + x1.getConsumo() + "\n" + x1.getPais() + "\n" +
                    "Pobre: " + gol.getMarca() + "\n" +
                    +gol.getLugares() + "\n" + gol.getValor() + "\n" + gol.getnDonosAnteriores() + "\n"
                    + gol.getZero() + "\n" + gol.getnParcelas() + "\n");
        }
    }
}