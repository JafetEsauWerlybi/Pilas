package pipipilas;

public interface IPilas <T>{
    boolean empty();
    T peek();
    T pop();
    T push(T dato);
    void clear();
    boolean search(T dato);
}
