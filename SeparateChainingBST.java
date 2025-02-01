public class SeparateChainingBST<Key, Value> {
    private RedBlackBST<Key, Value>[] table;
    private int M;  // Número de buckets
    private int N;  // Número de chaves inseridas

    // Construtor
    public SeparateChainingBST(int M) {
        this.M = M;
        table = new RedBlackBST[M];
        for (int i = 0; i < M; i++) {
            table[i] = new RedBlackBST<>();
        }
    }

    // Função hash
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    // Inserção
    public void put(Key key, Value value) {
        int i = hash(key);
        table[i].put(key, value);
        N++;
    }

    // Busca
    public Value get(Key key) {
        int i = hash(key);
        return table[i].get(key);
    }

    // Deleção
    public void delete(Key key) {
        int i = hash(key);
        table[i].delete(key);
        N--;
    }

    // Verifica se a tabela está vazia
    public boolean isEmpty() {
        return N == 0;
    }

    // Tamanho da tabela
    public int size() {
        return N;
    }
}
