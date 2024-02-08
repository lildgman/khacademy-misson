package generic_collection_practice;

import java.util.Objects;

public class Farm {

    private String kind;

    public Farm() {

    }

    public Farm(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "kind='" + kind + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farm farm = (Farm) o;
        return Objects.equals(kind, farm.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind);
    }
}
