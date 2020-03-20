package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();        //Mutable
        values.add(465);
        values.add(675);
        values.add(246);
        values.add(248);

        /*
         Comparator<Integer> comparator = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer integer, Integer t1)
            {
                return integer%10>t1%10?1:-1;

            //    if (integer%10 > t1%10)
            //        return 1;
            //   else
            //        return -1;

    }
};
            */

        Collections.sort(values,( integer,  t1) -> integer%10>t1%10?1:-1);

        for (Integer o: values){
            System.out.println(o);
        }
    }
}
