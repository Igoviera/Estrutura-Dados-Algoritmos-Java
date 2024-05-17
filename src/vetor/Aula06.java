package vetor;

public class Aula06 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("Elemento 1");
            vetor.adicionar("Elemento 2");
            vetor.adicionar("Elemento 3");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.busca("Elemento 5"));
    }
}
