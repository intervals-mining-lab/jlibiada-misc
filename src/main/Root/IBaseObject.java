package main.Root;

/**
 * Created by IntelliJ IDEA.
 * User: InquisitioN
 * Date: 19.11.2010
 * Time: 17:10:33
 * To change this template use File | Settings | File Templates.
 */
public interface IBaseObject {
        IBaseObject clone();
        boolean equals(Object obj);

        IBin GetBin();
}
