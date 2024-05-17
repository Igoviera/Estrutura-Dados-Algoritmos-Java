import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("igo", "camila","maria","joana");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<String> palavrasMenores = palavras.stream().filter(p -> p.length() < 4).collect(Collectors.toList());

//        for (String p : palavrasMenores){
//            System.out.println(p);
//        }
//
        List<Integer> numeros2 = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        for (Integer n : numeros2){
            System.out.println(n);
        }
    }
}