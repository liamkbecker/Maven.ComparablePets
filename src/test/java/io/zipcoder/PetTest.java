package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void catTest(){
        Pet kitty = new Cat("Artoria");

        Assert.assertEquals(kitty.getName(), "Artoria");
        Assert.assertEquals(kitty.speak(), "Meow!");
    }

    @Test
    public void dogTest(){
        Dog puppy = new Dog("Artoria");

        Assert.assertEquals(puppy.getName(), "Artoria");
        Assert.assertEquals(puppy.speak(), "Woof!");
    }

    @Test
    public void hamsterTest(){
        Hamster hammy = new Hamster("Artoria");

        Assert.assertEquals(hammy.getName(), "Artoria");
        Assert.assertEquals(hammy.speak(), "Squeak!");
    }

}
