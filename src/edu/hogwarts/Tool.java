package edu.hogwarts;

public class Tool extends TeachingMaterials {
    private String name;
    private String description;

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String name1, String description) {
        super(name, onShoppingList, required, provided, notes);
        this.name = name1;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Tool{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
