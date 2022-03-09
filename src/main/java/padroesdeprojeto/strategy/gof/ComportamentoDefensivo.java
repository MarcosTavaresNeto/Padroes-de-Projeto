package padroesdeprojeto.strategy.gof;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Robô se move defensivamente");
    }
}
