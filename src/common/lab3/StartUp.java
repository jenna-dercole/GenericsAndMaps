
package common.lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Jenna
 */
public class StartUp {
    
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(4,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1,"Mallay", "Fred", "222-22-2222");
    
    
        Map<String,Employee> empMap = new TreeMap<>();
        empMap.put("333-33-3333", e1);
        empMap.put("111-11-1111", e2);
        empMap.put("222-22-2222", e3);
        empMap.put("444-44-4444", e4);
        
        Set<String> keys = empMap.keySet();
        for(String key : keys) {
            Employee found = empMap.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("Sorted by default sort order...");
        Collection<Employee> values = empMap.values();
        List<Employee> sortedEmployees = new ArrayList<Employee>(values);
        Collections.sort(sortedEmployees);
        for(Employee emp : sortedEmployees) {
            System.out.println(emp);
        }
    }
    
    
    
}
