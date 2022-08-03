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
    public String getInstructionPrintout() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < instructions.size(); i++){
            sb.append(i + 1)
                    .append(": ")
                    .append(instructions.get(i))
                    .append("\n");
        }

        return sb.toString();
    }
}
