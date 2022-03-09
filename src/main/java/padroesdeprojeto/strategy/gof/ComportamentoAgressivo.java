package padroesdeprojeto.strategy.gof;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Robô se move agressivamente");
    }
}
