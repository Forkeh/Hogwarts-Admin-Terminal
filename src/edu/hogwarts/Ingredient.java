package edu.hogwarts;

public class Ingredient extends TeachingMaterials {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String name1, double amount, String unit) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name1;
        this.amount = amount;
        this.unit = unit;
    }


}
