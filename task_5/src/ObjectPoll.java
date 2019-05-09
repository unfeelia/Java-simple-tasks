import javax.annotation.Resource;

public class ObjectPoll<T extends Resource> {
    Stack stack;
    private int size;
    public ObjectPoll(int size) {
        this.size = size;
        stack = new Stack();
        for(int i = 0; i < size; ++i){
            T temp = (T) (T).newInstance();
            stack.push();
        }
    }

}
