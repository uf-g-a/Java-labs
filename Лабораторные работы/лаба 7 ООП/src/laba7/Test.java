package laba7;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] arg){
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("France", 640000));
        countries.add(new Country("Italy", 301000));
        countries.add(new Country("Germany", 321000));
        for(int i = 0; i < countries.size(); i++){
            countries.get(i).getInfo();
        }
        Comparator<Country> countryComparator = new Comparator<Country>() {
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        countries.sort(countryComparator);

        for(int i = 0; i < countries.size(); i++){
            countries.get(i).getInfo();
        }
    }
}
