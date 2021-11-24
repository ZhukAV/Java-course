package lab2.model;

import java.util.List;
import java.util.Objects;

public class Faculty extends EducationalUnit {
    private List<Chair> listOfChairs;

    public List<Chair> getListOfChairs() {
        return listOfChairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(listOfChairs, faculty.listOfChairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfChairs);
    }

    public void setListOfChairs(List<Chair> listOfChairs) {
        this.listOfChairs = listOfChairs;
    }

    @Override
    public String toString() {
        return "Факультет: " + name + '\n' +
                "Декан факультету: " + '\n' + manager + '\n' +
                "Перелік кафедр: " + listOfChairs;
    }
}
