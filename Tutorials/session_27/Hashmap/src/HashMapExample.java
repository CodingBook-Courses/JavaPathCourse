//import java.util.HashMap;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        //Hashmap is a list of key and value pairs
        String apple = "Red";
        String grape = "Green";
        String strawberry = "Pink";

        HashMap<String, String> fruitColors = new HashMap<String, String>();
        fruitColors.put("apple", "Red");
        fruitColors.put("grape", "Green");
        fruitColors.put("strawberry", "Pink");
        //First variable -> key
        //Second variable -> value
        System.out.println(fruitColors);
        //The keys are unique
        //The key value pairs are not in order

        //Getting the value given the key
        System.out.println(fruitColors.get("apple"));

        System.out.println(fruitColors.remove("apple"));
        System.out.println(fruitColors);

//        fruitColors.clear();
//        System.out.println(fruitColors);

        fruitColors.replace("grape", "Yellow");
        System.out.println(fruitColors);

        for(String i:fruitColors.values()){
            System.out.println(i);
        }
        for(String i:fruitColors.keySet()){
            System.out.println(i);
        }

        //Getting key given the value

        Object key = null;
        for(Map.Entry entry: fruitColors.entrySet()){
            if(entry.getValue().equals("Pink")){
                key = entry.getKey();
                break;
            }
        }
        //strawberry=pink
        //apple=pink
        System.out.println(key);
        //instead of int, use Integer ->> HashMap<String, Integer>

        HashMap<String, Double> height = new HashMap<String, Double>();
        //Key -> String (Names), Value -> Double(Heights)
        height.put("Nihan", 170.0);
        height.put("Lebron", 206.0);
        height.put("Ronaldo", 187.0);
        height.put("James", 170.0);
        height.put("Emma", 170.0);

        ArrayList<String> names = new ArrayList<String>();
        for(Map.Entry entry: height.entrySet()){
            if(entry.getValue().equals(170.0)){
                names.add((String)entry.getKey());
            }
        }

        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println(names.size());
        System.out.println(height.size());












    }
}
