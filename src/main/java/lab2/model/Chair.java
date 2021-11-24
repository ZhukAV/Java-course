package lab2.model;

import java.util.List;
import java.util.Objects;

public class Chair extends EducationalUnit {
    private List<Group> listOfGroups;

    public List<Group> getListOfGroup() {
        return listOfGroups;
    }

    public void setListOfGroup(List<Group> listOfGroup) {
        this.listOfGroups = listOfGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair)) return false;
        Chair chair = (Chair) o;
        return Objects.equals(listOfGroups, chair.listOfGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfGroups);
    }

    @Override
    public String toString() {
        return "Кафедра: " + name + '\n' +
                "Завідувач кафедри: " + '\n' + manager + '\n' +
                "Перелік груп: " + listOfGroups;
    }
}

