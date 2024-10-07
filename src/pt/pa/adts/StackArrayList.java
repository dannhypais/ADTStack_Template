package pt.pa.adts;


/**
 * Implementação de uma pilha (Stack) utilizando um array.
 *
 * @param <T> o tipo de elementos armazenados na pilha
 */
public class StackArrayList<T> implements Stack<T> {

    /** Capacidade padrão da pilha. */
    private static final int DEFAULT_CAPACITY = 40;

    /** Array que armazena os elementos da pilha. */
    private T[] elements;

    /** O tamanho atual da pilha (número de elementos). */
    private int size;

    /**
     * Construtor padrão que inicializa a pilha com a capacidade padrão e define o tamanho.
     */
    @SuppressWarnings("unchecked")
    public StackArrayList() {
        this.elements = (T[])new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param element o elemento a ser adicionado
     * @throws FullStackException se a pilha estiver cheia
     */
    @SuppressWarnings("unchecked")
    @Override
    public void push(T element) throws FullStackException {
        if(this.size >= this.elements.length){
            T[] newArray = (T[]) new Object[this.elements.length * 2];
            System.arraycopy(this.elements, 0, newArray, 0, this.size);
            this.elements = newArray;
        }
        this.elements[this.size++] = element;
    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return o elemento do topo da pilha
     * @throws EmptyStackException se a pilha estiver vazia
     */
    @Override
    public T pop() throws EmptyStackException {
        if(this.size == 0) throw new EmptyStackException();

        T elem = this.elements[this.size - 1];
        this.elements[this.size - 1] = null; //Q: Strictly necessary? Why is it a good idea?
        this.size--;

        return elem;
    }

    /**
     * Retorna, mas não remove, o elemento do topo da pilha.
     *
     * @return o elemento no topo da pilha
     * @throws EmptyStackException se a pilha estiver vazia
     */
    @Override
    public T peek() throws EmptyStackException {
        if(this.size == 0) throw new EmptyStackException();

        return this.elements[this.size - 1];
    }

    /**
     * Retorna o número de elementos na pilha.
     *
     * @return o tamanho atual da pilha
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return {@code true} se a pilha estiver vazia; {@code false} caso contrario
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Remove todos os elementos da pilha, tornando-a vazia.
     *
     */
    @Override
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.elements[i] = null;
        }
        this.size = 0;
    }
}
