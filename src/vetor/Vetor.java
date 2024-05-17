package vetor;

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
}
