package padroesdeprojeto.strategy.gof;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Robô se move normalmente");
    }
}
