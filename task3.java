// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее 
// из этого списка. Формат сдачи: файл с расширением java или ссылка на гит 
// с подписанными ФИ и номером группы.
import java.util.ArrayList;
import java.util.Random;
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> my_rand_list = new ArrayList<>();
        Random rand = new Random();
        int min,max;
        float sum;

        my_rand_list.add(rand.nextInt(0,100));  
        min = my_rand_list.get(0);
        max = my_rand_list.get(0);
        sum = my_rand_list.get(0);         

        System.out.print("\nИсходный (случайный) список : [ "+my_rand_list.get(0));
        for (int i = 1; i < 10; i++) {
            my_rand_list.add(rand.nextInt(0,100));            
            System.out.print(", "+my_rand_list.get(i));
            if (min>my_rand_list.get(i)) min = my_rand_list.get(i);
            if (max<my_rand_list.get(i)) max = my_rand_list.get(i);
            sum+=my_rand_list.get(i);}
        System.out.print(" ].\n");

        System.out.println("min = "+min+"; max = "+max+"; middle = "+sum/my_rand_list.size());        
    }
}
