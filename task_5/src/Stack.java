import java.util.ArrayList;
import java.util.List;

public class Stack
{
    private List<Object> objs;
    public Stack() {
        objs = new ArrayList<>();
    }
    public boolean empty() {
        return objs.isEmpty();
    }
    public Object push(Object o) {
        objs.add(o);
        return o;
    }
    public Object pop() {
        if(!empty()) {
            Object result = objs.get(objs.size() - 1);
            objs.remove(objs.size() - 1);
            return result;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Steck is empty.");
        }
    }
    public Object peek() {
        if(!empty()) {
            Object result = objs.get(objs.size() - 1);
            return result;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Steck is empty.");
        }
    }
}
