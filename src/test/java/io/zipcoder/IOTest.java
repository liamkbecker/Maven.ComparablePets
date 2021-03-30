package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class IOTest {

    @Test
    public void testGetLength(){
        Pet pet1 = new Cat("Hazel");
        Pet pet2 = new Dog("Artoria");
        Pet pet3 = new Hamster("Azalea");

        Pet[] pets1 = new Pet[3];
        pets1[0] = pet1;
        pets1[1] = pet2;
        pets1[2] = pet3;

        IO io = new IO();
        io.setPets(pets1);

        Assert.assertEquals(io.getLength(), 3);
    }

}
