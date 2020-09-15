import java.util.*;
public class CountryInfo {
    public static void main(String[] args){
        //1)Create a hashmap
        HashMap<String, String> countryCapitals = new HashMap<String, String>();
        //2)add:
        //Germany Berlin
        //Canada Toronto
        //UK London
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Canada", "Toronto");
        countryCapitals.put("UK", "London");

        //3)Print hashmap
        System.out.println(countryCapitals);
        //4)Print all the key values
        for(String key:countryCapitals.keySet()){
            System.out.println(key);
        }
        //5)remove Germany and Berlin
        countryCapitals.remove("Germany");
        //6)change Toronto to Ottawa
        countryCapitals.replace("Canada", "Ottawa");
        //7)print the size
        System.out.println(countryCapitals.size());
        //8)the finished hashmap
        System.out.println(countryCapitals);
    }
}
