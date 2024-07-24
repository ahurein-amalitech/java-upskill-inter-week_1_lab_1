import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private List<T> objects = new LinkedList<>();

    public void push(T value){
        objects.addFirst(value);
    }

    public T pop(){
        this.checkIfEmpty();
        return objects.removeFirst();
    }

    public T peep(){
        this.checkIfEmpty();
        return objects.getFirst();
    }

    public void clear(){
        objects.clear();
    }

    public int size(){
        return objects.size();
    }

    private void checkIfEmpty(){
        if(objects.isEmpty()) throw new EmptyStackException();
    }
}
