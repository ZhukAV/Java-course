package lab4.view;

import lab2.controller.UniversityCreator;
import lab2.model.University;
import lab4.controller.JSONReadWrite;

public class Runner {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        JSONReadWrite readWrite = new JSONReadWrite();
        System.out.println(readWrite.universityReadWrite(university));
    }
}
