package Root.SimpleTypes;

import Root.BaseObject;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 16.05.11
 * Time: 19:00
 */
public class ValueString extends BaseObject {
    private String value = "";

    public ValueString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int compareTo(BaseObject object) {
        String first = toString();
        String second = object.toString();
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            if (first.charAt(i) > second.charAt(i))
                return 1;
            else if (first.charAt(i) < second.charAt(i))
                return -1;
        }
        return 0;
    }

    @Override
    public BaseObject clone() {
        return new ValueString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        return value.equalsIgnoreCase(obj.toString());
    }
}
