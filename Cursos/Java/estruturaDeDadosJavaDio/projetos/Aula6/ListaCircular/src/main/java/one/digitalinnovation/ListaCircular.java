package one.digitalinnovation;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (tamanhoLista == 0) {
            cabeca = novoNo;
            cauda = cabeca;
            cabeca.setProximoNo(this.cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            cabeca.setProximoNo(novoNo);
            cauda = novoNo;
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            cauda = cauda.getProximoNo();
            cabeca.setProximoNo(cauda);            
        } else if (index == 1) {
            cauda.setProximoNo(cauda.getProximoNo().getProximoNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        tamanhoLista--;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        
        if (index == 0)
            return cauda;

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    private boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
