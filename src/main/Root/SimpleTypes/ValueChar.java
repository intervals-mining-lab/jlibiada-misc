package main.Root.SimpleTypes;

import main.Root.BaseObject;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 11.12.2010
 * Time: 2:04:45
 */
public class ValueChar extends BaseObject {
    public char value = '_';

    public ValueChar(char sym) {
        value = sym;
    }

    @Override
    public String toString() {
        return Character.toString(value);
    }

    @Override
    public int compareTo(BaseObject object) {
        if (getClass() != object.getClass())
            return 2;
        else if (((ValueChar)object).value == value)
            return 0;
        else if (((ValueChar)object).value < value)
            return 1;
        else
            return -1;
    }

    public BaseObject clone() {
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
}
