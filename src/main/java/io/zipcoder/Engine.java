package io.zipcoder;

public class Engine {

    IO io = new IO();

    public void run(){
        io.takeInitialInput();
        for(int i = 0; i < io.getLength(); i++){
            System.out.println("Let's talk about pet #" + (i + 1) + ".");
            boolean validInput = io.loopedInput(i);
            if(!validInput){
                i--;
                continue;
            }
        }
        io.output();
    }

}