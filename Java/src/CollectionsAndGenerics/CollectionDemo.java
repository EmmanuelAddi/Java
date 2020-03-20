package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(8);

        Iterator iterator = values.iterator();      //Iterator interface

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(values);     //Collection Interface
    }
}
