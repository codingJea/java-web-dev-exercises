package studios.lsn4and5restaurant;

import java.util.Objects;

public class MenuItem {
    public static int nextId = 1;
    private String name;
    private final int id;
    private String description;
    private String category;
    private double price;
    private boolean isNew;


    public MenuItem(String name, String description, String category, double price) {
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
