package lab2.controller;

import lab2.model.Faculty;
import lab2.model.Human;
import lab2.model.University;

import java.util.ArrayList;
import java.util.Random;

public class UniversityCreator {
    public static final int MIN_UNIVERSITY_SIZE = 2;
    public static final int MAX_UNIVERSITY_SIZE = 6;
    public static final int MIN_HEAD_YEAR = 1998;

    public University createUniversityRandomly() {
        Random random = new Random();
        FacultyCreator facultyCreator = new FacultyCreator();
        HumanCreator humanCreator = new HumanCreator();
        int diff = MAX_UNIVERSITY_SIZE - MIN_UNIVERSITY_SIZE;
        int numberOfFaculties = random.nextInt(diff) + MIN_UNIVERSITY_SIZE;
        University university = new University();
        Human head = humanCreator.createHumanRandomly();
        while (Integer.parseInt(head.getDateOfBirth().substring(head.getDateOfBirth().lastIndexOf("-") + 1)) > MIN_HEAD_YEAR) {
            head = humanCreator.createHumanRandomly();
        }
        university.setManager(head);
        university.setName("Національний технічний університет \"Дніпровська Політехніка\" ");
        ArrayList<Faculty> structure = new ArrayList();
        for (int i = 0; i < numberOfFaculties - 1; i++) {
            structure.add(facultyCreator.createFacultyRandomly());
        }
        university.setListOfFaculty(structure);
        return university;
    }
}

