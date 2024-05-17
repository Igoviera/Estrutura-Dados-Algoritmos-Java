package vetor;

public class Aula03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {
            vetor.adicionar("Elemento 1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
