package Root.SimpleTypes;

import Root.BaseObject;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 30.11.2010
 * Time: 10:11:33
 */
public class ValueInt extends BaseObject {
    private long value;

    public ValueInt(long i) {
        value = i;
    }

    @Override
    public String toString() {
        return ((Long)value).toString();
    }

    public BaseObject clone() {
        return new ValueInt(value);
    }

    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        return value == ((ValueInt)obj).getValue();
    }

    public long getValue() {
        return value;
    }

    @Override
    public int compareTo(BaseObject obj) {
        if (obj.getClass() != getClass())
            return 2;
        else if (((ValueInt)obj).value == value)
            return 0;
        else if (((ValueInt)obj).value < value)
            return 1;
        else
            return -1;
    }
}
