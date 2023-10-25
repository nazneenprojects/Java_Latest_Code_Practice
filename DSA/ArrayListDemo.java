import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


        list.add(1,40);
        System.out.println( list.get(1));

        list.set(2, 50);
          System.out.println(list);

          list.remove(3);

        System.out.println(list);

        System.out.println(list.size());
       
        
    }
}
