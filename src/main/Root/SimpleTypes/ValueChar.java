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
        String result = "";
        result += value;
        return result;
    }

    public IBaseObject clone() {
        return new ValueChar(value);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        return EqualsAsChar((ValueChar)obj);
    }

    private boolean EqualsAsChar(ValueChar c) {
        if (null == c)
        {
            return false;
        }
        return c.value == value;
    }

    public IBin GetBin() {
        return null;  //TODO: "????????? ?????"
    }
}
