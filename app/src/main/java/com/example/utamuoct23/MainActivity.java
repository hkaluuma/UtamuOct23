package com.example.utamuoct23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity<gotSound> extends AppCompatActivity {
    //our Global variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*multiline comment */
        //instantiate
        Dog dogobj =  new Dog();
        String gotSound = dogobj.makeSound();
        System.out.println("Printed string: " + gotSound);
    }
}