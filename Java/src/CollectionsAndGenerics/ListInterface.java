package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add(4);  //Integer i = new Integer(4)
        values.add(6);
        values.add(2,2);
        values.add("8");

       /*
       for (int i = 0;i<=values.size();i++){
           System.out.println(values.get(i));
       }
        */

       for (Object o: values){
           System.out.println(o);
       }
    }
}
