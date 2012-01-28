package main.Root.SimpleTypes;

import main.Root.IBin;
import main.Root.IBaseObject;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 11.12.2010
 * Time: 2:04:45
 */
public class ValueChar implements IBaseObject {
    public char value = '_';

    public ValueChar(char sym) {
        value = sym;
    }

    @Override
    public String toString() {
        return Character.toString(value);
    }

    public IBaseObject clone() {
        return new ValueChar(value);
    }

    public boolean equals(Object obj) {
        if (null == obj)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        return ((ValueChar)obj).value==value;
    }

    public IBin GetBin() {
        return null;  //TODO: "Fill method"
    }
}
