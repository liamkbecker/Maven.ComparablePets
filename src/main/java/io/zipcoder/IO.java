package io.zipcoder;

public class IO {

    Pet[] pets;

    public int getLength(){
        return pets.length;
    }

    public void setPets(Pet[] pets){
        this.pets = pets;
    }



    public void takeInitialInput(){
        int size = Console.getIntegerInput("How many cats, dogs, and hamsters do you have?");
        pets = new Pet[size];
    }

    public boolean loopedInput(int i){
        int petType = Console.getIntegerInput("Enter 1 for cat, 2 for dog, 3 for hamster.");
        if(petType == 1){
            String name = takeName("cat");
            pets[i] = new Cat(name);
            return true;
        }
        else if(petType == 2){
            String name = takeName("dog");
            pets[i] = new Dog(name);
            return true;
        }
        else if(petType == 3){
            String name = takeName("hamster");
            pets[i] = new Hamster(name);
            return true;
        }
        return false;
    }

    public String takeName(String animal){
        return Console.getStringInput("What's your " + animal + "'s name?");
    }

    public void output(){
        for(int i = 0; i < pets.length; i++){
            System.out.println("Pet #" + (i + 1) + " is named " + pets[i].getName() + " and goes " + pets[i].speak());
        }
    }

}