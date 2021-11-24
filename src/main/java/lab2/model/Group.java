package lab2.model;

import java.util.List;
import java.util.Objects;

public class Group extends EducationalUnit {
    private List<Human> listOfStudents;

    public List<Human> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Human> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(listOfStudents, group.listOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfStudents);
    }

    @Override
    public String toString() {
        return "Група: " + name + '\n' +
                "Староста: " + manager + '\n' +
                "Студенти: " + listOfStudents;
    }
}
