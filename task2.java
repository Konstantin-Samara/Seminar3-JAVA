import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа.
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> my_rand_list = new ArrayList<>();
        ArrayList<Integer> my_res_list = new ArrayList<>();
        Random rand = new Random();

        System.out.print("\nИсходный (случайный) список : [ ");
        for (int i = 0; i < 10; i++) {
            my_rand_list.add(rand.nextInt(0,100));
            if (i>0) System.out.print(", "+my_rand_list.get(i));
            else System.out.print(my_rand_list.get(i));
            if (my_rand_list.get(i)%2!=0) my_res_list.add(my_rand_list.get(i));}
        System.out.print(" ].");

        System.out.print("\nОбработанный список (без четных чисел): [ ");
        for (int i = 0; i < my_res_list.size(); i++) {
            if (i>0) System.out.print(", "+my_res_list.get(i));
            else System.out.print(my_res_list.get(i));}
        System.out.print(" ].\n");
    }
}
