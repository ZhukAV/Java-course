package lab2.controller;

import lab2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    public static HumanCreator humanCreator;
    public static final List<String> DICTIONARY_NAMES = Arrays.asList("Іван", "Володимир", "Кирил", "Георгій", "Марія", "Вікторія", "Людмила", "Борис", "Марфа");
    public static final List<String> DICTIONARY_SURNAMES = Arrays.asList("Мельник", "Шевченко", "Коваленко", "Бондаренко", "Бойко", "Ткаченко", "Олійник", "Дем'яненко", "Левченко", "Руденко", "Марченко");
    public static final List<String> DICTIONARY_PATRONYMIC = Arrays.asList("Богданович", "Афанасійович", "Андрійович", "Михайлович", "Микитович", "Петрович", "Маркіянович", "Маркіянівна", "Юріївна", "Юхимівна", "Віталіївна", "Борисівна", "Валентинівна");
    public static final List<String> DICTIONARY_DATE_OF_BIRTH = Arrays.asList("10-29-1985", "11-06-1970", "09-25-1972", "06-18-2000", "12-08-2001", "07-02-2003", "06-14-1996", "01-10-2002", "02-25-2000", "06-23-2001", "01-20-2001", "01-15-1982", "04-13-1999", "07-10-1974");

    public Human createHumanRandomly() {
        Human human = new Human();
        Random random = new Random();
        int keyWord = 1;
        while (keyWord == 1) {
            human.setFirstName(DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size() - 1)));
            human.setLastName(DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size() - 1)));
            human.setPatronymic(DICTIONARY_PATRONYMIC.get(random.nextInt(DICTIONARY_PATRONYMIC.size() - 1)));
            human.setDateOfBirth(DICTIONARY_DATE_OF_BIRTH.get(random.nextInt(DICTIONARY_DATE_OF_BIRTH.size() - 1)));
            if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'я' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'а') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'а' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'а') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'н' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'ч') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'р' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'ч') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'л' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'ч') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'й' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'ч') {
                keyWord = 0;
            } else if (human.getFirstName().charAt(human.getFirstName().length() - 1) == 'с' & human.getPatronymic().charAt(human.getPatronymic().length() - 1) == 'ч') {
                keyWord = 0;
            } else {
                continue;
            }
        }
        return human;
    }
}
