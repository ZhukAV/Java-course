package lab2.view;

import lab2.controller.UniversityCreator;
import lab2.model.University;

public class Runner {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        System.out.println(university);
    }
}
