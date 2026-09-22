import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static <T> T[] arrayMapping(T[] input, Function<T, T> function){
        T[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < input.length; i++) {
            result[i] = function.apply(input[i]); // Перезаписали
        }
        return result;
    }
//--------------------------------------------------------------------------------------------------------
    public static Map<Integer, Integer> createMap(Integer[] arr){
        Map<Integer,Integer> myMap = new HashMap<>();
        for (Integer x : arr) {
            if (myMap.containsKey(x)) {
                int tmp = myMap.get(x) + 1;
                myMap.put(x,tmp);
            }
            else {
                myMap.put(x,1);
            }
        }
        return myMap;
    }
    public static void main(String[] args) {
        //Напишите метод arrayMapping(), который принимает на вход массив любого типа, вторым арументом метод должен принимать класс,
        // реализующий интерфейс Function, в котором один параметризованный метод - T apply(T o).
        //
        //Метод должен быть реализован так чтобы возвращать новый массив, к каждому элементу которого была применена функция apply
        Integer[] numbers = {1, 2, 3};
        Integer [] result = arrayMapping(numbers, x -> x * 3);
        System.out.println(Arrays.toString(result));

        String[] numbersS = {"1", "2", "3"};
        String [] resultS = arrayMapping(numbersS, x -> x + "3");
        System.out.println(Arrays.toString(resultS));

        Double[] numbersD = {1.5, 2.3, 3.0};
        Double [] resultD = arrayMapping(numbersD, x -> x * 1.5);
        System.out.println(Arrays.toString(resultD));
        //---------------------------------------------------------------------------
        //Напишите метод, который получает на вход массив элементов и возвращает Map ключи в котором - элементы,
        // а значения - сколько раз встретился этот элемент
        Integer[] arr = {1,2,1,1,4,7,7,4};
        System.out.println(createMap(arr));
    }
}