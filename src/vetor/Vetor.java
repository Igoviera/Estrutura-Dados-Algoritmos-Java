package vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

//    public void adicionar(String elemento){
//        for( int i = 0; i < this.elementos.length; i++){
//            if (elementos[i] == null){
//                elementos[i] = elemento;
//                break;
//            }
//        }
//    }

    public void adicionar(String elemento) throws Exception{
        if (tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor já está cheio");
        }
    }

    public String busca(int posicao) throws Exception{
        if (! (posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicão inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanhoDoArray(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        return Arrays.toString(elementos);
    }
}
