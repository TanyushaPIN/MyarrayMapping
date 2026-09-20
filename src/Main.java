import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static <T> T[] arrayMapping(T[] input, Function<T, T> function){
        T[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]); // Перезаписали
        }
        return result;
    }
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Integer [] result = arrayMapping(numbers, x -> x * 3);
        System.out.println(Arrays.toString(result));

        String[] numbersS = {"1", "2", "3"};
        String [] resultS = arrayMapping(numbersS, x -> x + "3");
        System.out.println(Arrays.toString(resultS));

        Double[] numbersD = {1.5, 2.3, 3.0};
        Double [] resultD = arrayMapping(numbersD, x -> x * 1.5);
        System.out.println(Arrays.toString(resultD));
    }
}