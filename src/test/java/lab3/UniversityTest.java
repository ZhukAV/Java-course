package lab3;

import lab2.controller.ChairCreator;
import lab2.controller.GroupCreator;
import lab2.controller.UniversityCreator;
import lab2.model.Chair;
import lab2.model.Group;
import lab2.model.University;
import org.junit.Assert;
import org.junit.Test;

public class UniversityTest {
    @Test
    public void testDateOfBirthUniversityManager() {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        Assert.assertTrue(Integer.parseInt(university.getManager().getDateOfBirth().substring(university.getManager().getDateOfBirth().lastIndexOf("-") + 1)) < 1997);
    }

    @Test
    public void testGroupStudentsExists() {
        ChairCreator chairCreator = new ChairCreator();
        GroupCreator groupCreator = new GroupCreator();
        for (int i = 0; i < 10; i++) {
            Chair chair = chairCreator.createChairRandomly();
            Assert.assertFalse(chair.getListOfGroup().isEmpty());
            Group group = groupCreator.createGroupRandomly();
            Assert.assertFalse(group.getListOfStudents().isEmpty());
        }
    }
}
