import java.util.ArrayList;

public class RemoveEvenNumArrayList {
    public static void main(String[] args) {
        
           ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(200);
        list.add(55);
        list.add(64);
        list.add(27);
        list.add(43);

        System.out.println(list);


        for (int i =list.size()-1 ; i>0; i--) {
            if((list.get(i) % 2)==0){
                list.remove(i);
            }   
        }
        System.out.println(list);

    }
}
