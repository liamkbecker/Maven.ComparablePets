package io.zipcoder;

import java.util.Comparator;

public class PetCompareByType implements Comparator<Pet> {
    public int compare(Pet o1, Pet o2) {
        String str1 = "";
        String str2 = "";

        if(o1 instanceof Dog){
            str1 = "dog";
        }
        else if(o1 instanceof Cat){
            str1 = "cat";
        }
        else if(o1 instanceof Hamster){
            str1 = "hamster";
        }

        if(o2 instanceof Dog){
            str2 = "dog";
        }
        else if(o2 instanceof Cat){
            str2 = "cat";
        }
        else if(o2 instanceof Hamster){
            str2 = "hamster";
        }

        return str1.compareTo(str2);

    }
}