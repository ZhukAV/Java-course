package lab2.model;

import java.util.Objects;

public abstract class EducationalUnit {
    protected String name;
    protected Human manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getManager() {
        return manager;
    }

    public void setManager(Human manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EducationalUnit)) return false;
        EducationalUnit that = (EducationalUnit) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manager);
    }
}
