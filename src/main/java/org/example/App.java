package org.example;


import org.example.ingredient.*;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        GumboIngredient<Integer> buffaloChicken = new GumboIngredient<>("Buffalo Chicken", Measurement.POUND, 2);
        buffaloChicken.addInstruction("Mince up the meat");
        buffaloChicken.addInstruction("Add more buffalo sauce");

        List<iIngredient> gumboIngredients = GumboIngredients.getInstance().getIngredients();
        System.out.println(gumboIngredients.get(0).getInstructionPrintout());
    }
}
