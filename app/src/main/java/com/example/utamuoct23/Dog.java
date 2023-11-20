package com.example.utamuoct23;
public class Dog {
    //adding attributes
   public String name, breed, sound, size;
   private int walked_distance;
   int calculatedMovement = 34;
   protected Boolean feed = true;
    public String makeSound(){
        String madeSound = "woof woof ....";
        return madeSound;
    }
    private Integer calculateMovement(){
       walked_distance = 10 + calculatedMovement;
       return walked_distance;
    }
    protected void moveDog(){
        String dogmove = "Dog is moving";
    }
}
