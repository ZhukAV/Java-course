package lab2.controller;

import lab2.model.Group;
import lab2.model.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GroupCreator {
    public static final int MIN_GROUP_SIZE = 5;
    public static final int MAX_GROUP_SIZE = 20;
    public static final List<String> DICTIONARY_GROUPS = Arrays.asList("124-18-1", "076-18-2", "281-19-3", "141-19-1", "144-20-3", "121-17-2", "124-17-1", "291-21-1", "272-20-1", "124-21-3", "123-19-2", "084-18-1", "115-19-2", "189-18-3");

    public Group createGroupRandomly() {
        Random random = new Random();
        HumanCreator humanCreator = new HumanCreator();
        int diff = MAX_GROUP_SIZE - MIN_GROUP_SIZE;
        int numberOfStudents = random.nextInt(diff) + MIN_GROUP_SIZE;
        Group group = new Group();
        group.setName(DICTIONARY_GROUPS.get(random.nextInt(DICTIONARY_GROUPS.size() - 1)));
        group.setManager(humanCreator.createHumanRandomly());
        ArrayList<Human> people = new ArrayList();
        people.add(group.getManager());
        for (int i = 0; i < (numberOfStudents - 1); i++) {
            people.add(humanCreator.createHumanRandomly());
        }
        group.setListOfStudents(people);
        return group;
    }
}
