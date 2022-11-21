import java.util.Arrays;
import java.util.Random;

public class ExamplesRunner {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(42) + 1;
        }
        System.out.println("Получившийся рандомный массив: "+Arrays.toString(array));
        int maximum = array[0];
        for (int i=0; i < array.length;i++)
        {
            if(array[i] > maximum)
            {
                maximum = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве: "+maximum);
//        Сломал голову в попытках дифференцировать что же есть такое "стандартные средства сортировки массивов"
//        И относятся ли к ним такие топорные примитивные подходы))
//        В угоду себе решил, что нет, такие - не относятся :D
    }
}
