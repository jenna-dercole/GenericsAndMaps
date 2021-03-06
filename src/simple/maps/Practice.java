
package simple.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jenna
 */
public class Practice {
    public static void main(String[] args) {
        Map<String,List<String>> map1 = new HashMap<>(); //not generified so I can put any object I want in here.
        
        List<String> chevyList = new ArrayList<>();
        chevyList.add("Corvette");
        chevyList.add("Camaro");
        
        List<String> fordList = new ArrayList<>();
        fordList.add("Ford GT");
        fordList.add("Mustang");
        
        map1.put("Chevy", chevyList);
        map1.put("Ford", fordList);
        
        List<String> favoriteList = map1.get("Ford");
        System.out.println(favoriteList);
        
        //Looping over keys
        System.out.println("\nOutputting keys...");
        Set<String> keys = map1.keySet(); //returns a set of keys
        for (String key : keys) {
            System.out.println(key);
        }
        
        //Looping over values
        System.out.println("\nOutputting values...");
        Collection<List<String>> values = map1.values(); //returns a collection of values
        for (List<String> value : values) {
            System.out.println(value);
        }
        
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", "1");
        record1.put("LastName", "Smith");
        record1.put("Age", new Integer(22));
        
        List<Map<String,Object>> records = new ArrayList<>();
        records.add(record1);
        
    }
    
}
