package lab4;

import lab2.controller.UniversityCreator;
import lab2.model.University;
import lab4.controller.JSONReadWrite;
import org.junit.Assert;
import org.junit.Test;

public class ReaderWriterTest {

    @Test
    public void testJSONReaderWriter() {
        UniversityCreator universityCreator = new UniversityCreator();
        JSONReadWrite readWrite = new JSONReadWrite();
        University university = universityCreator.createUniversityRandomly();
        University universityFromFile = readWrite.universityReadWrite(university);
        Assert.assertEquals(university, universityFromFile);
    }
}
