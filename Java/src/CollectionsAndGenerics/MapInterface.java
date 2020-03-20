package CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Myname", "Addi");
        map.put("School", "Kabianga");
        map.put("Country", "Kenya");
        map.put("Country", "Rwanda");

       // System.out.println(map);

        Set<String> keys = map.keySet();

        for (String key : keys){
            System.out.println(key + "  " + map.get(key));
        }
    }
}
