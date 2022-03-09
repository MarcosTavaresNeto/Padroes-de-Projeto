package padroesdeprojeto;
/*Teste do padrão de projeto Singleton
*
*
* */


import padroesdeprojeto.facade.gof.Facade;
import padroesdeprojeto.singleton.gof.SingletonEagler;
import padroesdeprojeto.singleton.gof.SingletonLazy;
import padroesdeprojeto.singleton.gof.SingletonLazyHolder;
import padroesdeprojeto.strategy.gof.*;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEagler eagler = SingletonEagler.getInstancia();
        System.out.println(eagler);
        eagler = SingletonEagler.getInstancia();
        System.out.println(eagler);

        SingletonLazyHolder holder =  SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder =  SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy Testes do padrão de projeto

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo  = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // facade - Testes do padrão de projeto
        Facade facade = new Facade();
        facade.migrarCliente("Marcos Tavares", "33123023");



    }
}
