package org.example.ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GumboIngredient<T extends Number> extends Ingredient<T>{
    List<String> instructions = new ArrayList<>();
    public GumboIngredient(String name, Measurement measurementType, T quantity) {
        super(name, measurementType, quantity);
    }

    @Override
    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }

    @Override
    public String getIngredientInformation() {
        return new StringBuilder()
                .append(quantity)
                .append(" ")
                .append(measurementType)
                .append(" ")
                .append(name)
                .toString();
    }

    @Override
    public String getInstructionPrintout() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < instructions.size(); i++){
            String prefix = i > 0 ? "\n- " : "- ";
            sb.append(prefix)
                .append(instructions.get(i));
        }

        return sb.toString();
    }
}
