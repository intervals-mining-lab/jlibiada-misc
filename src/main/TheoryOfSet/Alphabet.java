package TheoryOfSet;

import Root.BaseObject;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 11.12.2010
 * Time: 1:49:09
 */
public class Alphabet {
    protected ArrayList<BaseObject> vault = new ArrayList<BaseObject>();

    public int getPower() {
        return vault.size();
    }

    public int add(BaseObject value) throws Exception {
        if (vault.contains((value)))
        {
            throw new Exception("????????? ?????????? ??????? ? ???????");
        }
        if (value == null)
        {
            throw new Exception("??????? ???????? ??????? ?????? ? ???????");
        }
        BaseObject obj = value.clone();
        vault.add(obj);
        return vault.indexOf(obj);
    }

    public boolean isContains(BaseObject obj)
    {
        return vault.contains(obj);
    }

    public int indexOf(BaseObject value) {
        int index = -1;
        for (int i = 0; i < vault.size(); i++)
        {
            if (value.equals(vault.get(i)))
                index = i;
        }
        return index;
    }

    public void remove(int index) {
        vault.remove(index);
    }

    public BaseObject get(int index) {
        return vault.get(index);
    }
}
