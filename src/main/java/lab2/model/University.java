package lab2.model;

import java.util.List;
import java.util.Objects;

public class University extends EducationalUnit {

    public List<Faculty> listOfFaculty;

    @Override
    public String toString() {
        return "Університет: " + name + '\'' +
                "Ректор: " + '\n' + manager + '\'' +
                "Перелік факультетів: " + listOfFaculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(listOfFaculty, that.listOfFaculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfFaculty);
    }

    public List<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(List<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }
}