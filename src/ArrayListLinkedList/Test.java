package ArrayListLinkedList;

//import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> list2 = new LinkedList<>();
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);

        list1.addAll(list2);
        System.out.println(list1);

        int i= list1.indexOf(10);
        System.out.println("Index of 10 is:" +i);

        list1.remove( 3);
        System.out.println(list1);

        boolean containsTen = list1.contains(10);
        System.out.println("Does list1 contain 10? " + containsTen);

        list1.remove(Integer.valueOf(30));
        System.out.println(list1);
    }
}