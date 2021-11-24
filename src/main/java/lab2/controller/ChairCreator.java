package lab2.controller;

import lab2.model.Chair;
import lab2.model.Group;
import lab2.model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChairCreator {
    public static final int MIN_CHAIR_SIZE = 3;
    public static final int MAX_CHAIR_SIZE = 10;
    public static final List<String> DICTIONARY_CHAIRS = Arrays.asList("Системного аналізу і управління", "Іноземних мов", "Фізики", "Менеджменту", "Перекладу", "Нафтогазовоїінженерії та буріння", "Електроенергетики", "Геодезії", "Будівництва, геотехніки і геомеханіки", "Автомобілів та автомобільного господарства");

    public Chair createChairRandomly() {
        Random random = new Random();
        GroupCreator groupCreator = new GroupCreator();
        HumanCreator humanCreator = new HumanCreator();
        int diff = MAX_CHAIR_SIZE - MIN_CHAIR_SIZE;
        int numberOfGroups = random.nextInt(diff) + MIN_CHAIR_SIZE;
        Chair chair = new Chair();
        chair.setName(DICTIONARY_CHAIRS.get(random.nextInt(DICTIONARY_CHAIRS.size() - 1)));
        Human head = humanCreator.createHumanRandomly();
        while (Integer.parseInt(head.getDateOfBirth().substring(head.getDateOfBirth().lastIndexOf("-") + 1)) > UniversityCreator.MIN_HEAD_YEAR) {
            head = humanCreator.createHumanRandomly();
        }
        chair.setManager(head);
        ArrayList<Group> people = new ArrayList();
        for (int i = 0; i < numberOfGroups; i++) {
            people.add(groupCreator.createGroupRandomly());
        }
        chair.setListOfGroup(people);
        return chair;
    }
}
