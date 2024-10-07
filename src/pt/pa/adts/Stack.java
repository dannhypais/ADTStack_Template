package pt.pa.adts;

/**
 * Uma interface que representa uma estrutura de pilha generica (LIFO - Ultimo a Entrar, Primeiro a Sair).
 * Ela fornece metodos para operacoes comuns de pilha, como empilhar (push), desempilhar (pop), consultar
 * o topo (peek), verificar o tamanho (size) e limpar a pilha (clear).
 *
 * @param <T> o tipo de elementos nesta pilha
 */
public interface Stack<T> {

    /**
     * Empilha um elemento no topo da pilha.
     *
     * @param element o elemento a ser empilhado na pilha
     * @throws FullStackException se a pilha estiver cheia e nao puderem ser adicionados mais elementos
     */
    public void push(T element) throws FullStackException;

    /**
     * Remove o elemento do topo da pilha e o retorna.
     *
     * @return o elemento que estava no topo da pilha
     * @throws EmptyStackException se a pilha estiver vazia e não houver elementos para remover
     */
    public T pop() throws EmptyStackException;

    /**
     * Retorna o elemento no topo da pilha sem remove-lo.
     *
     * @return o elemento que esta no topo da pilha
     * @throws EmptyStackException se a pilha estiver vazia
     */
    public T peek() throws EmptyStackException;

    /**
     * Retorna o numero de elementos atualmente presentes na pilha.
     *
     * @return o tamanho da pilha
     */
    public int size();

    /**
     * Verifica se a pilha esta vazia.
     *
     * @return {@code true} se a pilha estiver vazia; {@code false} caso contrario
     */


    public boolean isEmpty();

    /**
     * Remove todos os elementos da pilha, esvaziando-a.
     */
    public void clear();
}
