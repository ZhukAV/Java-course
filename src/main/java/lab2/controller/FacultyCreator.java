package lab2.controller;

import lab2.model.Chair;
import lab2.model.Faculty;
import lab2.model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FacultyCreator {
    public static final int MIN_FACULTY_SIZE = 2;
    public static final int MAX_FACULTY_SIZE = 7;
    public static final List<String> DICTIONARY_FACULTIES = Arrays.asList("ФІТ", "ФЕФ", "ЕТФ", "ММФ", "Будівництва", "Менеджменту");

    public Faculty createFacultyRandomly() {
        Random random = new Random();
        ChairCreator chairCreator = new ChairCreator();
        HumanCreator humanCreator = new HumanCreator();
        int diff = MAX_FACULTY_SIZE - MIN_FACULTY_SIZE;
        int numberOfChair = random.nextInt(diff) + MIN_FACULTY_SIZE;
        Faculty faculty = new Faculty();
        faculty.setName(DICTIONARY_FACULTIES.get(random.nextInt(DICTIONARY_FACULTIES.size() - 1)));
        Human head = humanCreator.createHumanRandomly();
        while (Integer.parseInt(head.getDateOfBirth().substring(head.getDateOfBirth().lastIndexOf("-") + 1)) > UniversityCreator.MIN_HEAD_YEAR) {
            head = humanCreator.createHumanRandomly();
        }
        faculty.setManager(head);
        ArrayList<Chair> structure = new ArrayList();
        for (int i = 0; i < numberOfChair; i++) {
            structure.add(chairCreator.createChairRandomly());
        }
        faculty.setListOfChairs(structure);
        return faculty;
    }
}