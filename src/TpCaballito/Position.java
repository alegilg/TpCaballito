package TpCaballito;

public class Position<T> implements Stack<T> {

    int top;
    Object[] data;
    int capacity;


    public Position(int x) {
        top = -1;
        capacity = x;
        data = new Object[capacity];

    }
    @Override
    public void push(T t) {
        if(top+1==data.length){
            grow();
        }
        top++;
        data[top]= t;

    }

    @Override
    public void pop() {
            top--;
    }

    @Override
    public T peek() {
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;

    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public void empty() {
        top = -1;
        Object[] data2 = new Object[0];
        data = data2;


    }

    private void grow(){
        Object[] data2 = new Object[2*capacity];
        for (int i =0; i<capacity;i++){
            data2[i] = data[i];
        }
        data = data2;
    }
}
