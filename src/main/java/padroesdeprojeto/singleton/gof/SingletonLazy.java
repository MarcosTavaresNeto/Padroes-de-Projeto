package padroesdeprojeto.singleton.gof;

/*Singleton preguiçoso
*
*@author Marcos Tavares
*
*/

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
