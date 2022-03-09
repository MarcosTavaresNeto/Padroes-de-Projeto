package padroesdeprojeto.singleton.gof;


/*Singleton Lazy Holder
 *
 *@author Marcos Tavares
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencer</a>
 *
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
