import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinnearList implements java.util.List
{
    private Object[] objs;
    public LinnearList(){
        objs = new Object[0];
    }
    @Override
    public int size() {
        return objs.length;
    }

    @Override
    public boolean isEmpty() {
        return (objs.length == 0);
    }

    @Override
    public boolean contains(Object o) {
        for(Object item : objs)
            if(item.equals(o))
                return true;
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[objs.length];
        for(int i = 0; i < objs.length; ++i)
            arr[i] = objs[i];
        return arr;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Object[] newArray = new Object[objs.length + 1];
        for(int i = 0; i < objs.length; ++i)
            newArray[i] = objs[i];
        newArray[objs.length] = o;
        this.objs = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object get(int index) {
        if(index < objs.length) {
            return objs[index];
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if(index <= objs.length) {
            Object[] newArray = new Object[objs.length + 1];

            for (int i = 0; i < index; ++i)
                newArray[i] = objs[i];

            newArray[index] = element;

            for (int i = index + 1; i < objs.length; ++i)
                newArray[i + 1] = objs[i];

            this.objs = newArray;

            return;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    @Override
    public Object remove(int index) {
        if(index < objs.length) {
            Object obj = objs[index];

            Object[] newArray = new Object[objs.length - 1];

            for (int i = 0; i < index; ++i) {
                newArray[i] = objs[i];
            }
            for (int i = index + 1; i < objs.length; ++i) {
                newArray[i - 1] = objs[i];
            }

            this.objs = newArray;

            return obj;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}