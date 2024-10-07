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
    @Override
    public void push(T element) throws FullStackException {
        if(this.size >= this.elements.length) throw new FullStackException();

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
        throw new UnsupportedOperationException("This method is not implemented yet.");
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
     * @throws UnsupportedOperationException se o método não estiver implementado
     */
    @Override
    public boolean isEmpty() {

        throw new UnsupportedOperationException("This method is not implemented yet.");

    }

    /**
     * Remove todos os elementos da pilha, tornando-a vazia.
     *
     * @throws UnsupportedOperationException se o método não estiver implementado
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

}
