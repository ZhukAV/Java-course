package lab2.model;

import java.util.Objects;

public class Human {
    public String firstName;
    public String patronymic;
    public String lastName;
    public String dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(patronymic, human.patronymic) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(dateOfBirth, human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, patronymic, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Прізвище:" + lastName + '\n' +
                "Ім'я:" + firstName + '\n' +
                "По батькові:" + patronymic + '\n' +
                "Дата народження:" + dateOfBirth;
    }
}