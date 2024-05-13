package ArrayListLinkedList;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(400);
        set.add(300);
        set.add(445);
        set.add(20);
        set.add(null);
        set.add(10);            //will not print duplicate
        System.out.println(set);

    }
}
