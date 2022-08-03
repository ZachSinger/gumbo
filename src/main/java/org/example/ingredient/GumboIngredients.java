package org.example.ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GumboIngredients {
    private List<iIngredient> ingredients = new ArrayList<>();
    private static GumboIngredients instance;

    private GumboIngredients(){}

    public static GumboIngredients getInstance(){
        if(instance == null){
            instance = new GumboIngredients();
        }

        return instance;
    }

    public List<iIngredient> getIngredients(){
        return ingredients;
    }

    public void addIngredient(iIngredient ingredient){
        ingredients.add(ingredient);
    }

    public void printAllInstructions(){
        ingredients.stream()
                .forEach(ingredient -> {
                    System.out.println(ingredient.getIngredientInformation());
                    System.out.println(ingredient.getInstructionPrintout());
                    System.out.println();
                });
    }
}
