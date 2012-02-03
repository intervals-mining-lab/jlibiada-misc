package Root;

/**
 * Created by IntelliJ IDEA.
 * User: InquisitioN
 * Date: 19.11.2010
 * Time: 17:10:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseObject implements Comparable<BaseObject> {
    @Override
    public abstract BaseObject clone();
    @Override
    public abstract boolean equals(Object obj);

    public abstract String toString();

    @Override
    public abstract int compareTo(BaseObject object);
}
