import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsPractice {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");


        System.out.println(al);

        Iterator<String> iter = al.iterator();

        al.add("E");

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("*******************");

        Iterator<String> iter2 = al.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}
