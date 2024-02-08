package generic_collection_practice;

import java.util.Objects;

public class Vegetable extends Farm {
    private String name;

    public Vegetable(String kind, String name) {
        super(kind);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
