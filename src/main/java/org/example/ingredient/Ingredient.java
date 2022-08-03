package org.example.ingredient;

public abstract class Ingredient <T extends Number> implements iIngredient{
    String name;
    Measurement measurementType;
    T quantity;

    public Ingredient(String name, Measurement measurementType, T quantity) {
        this.name = name;
        this.measurementType = measurementType;
        this.quantity = quantity;
        GumboIngredients.getInstance().addIngredient(this);
    }

    public String getName() {
        return name;
    }

    public Measurement getMeasurementType() {
        return measurementType;
    }

    public T getQuantity() {
        return quantity;
    }
}
