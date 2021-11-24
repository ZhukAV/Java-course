package lab4.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lab2.model.University;

import java.io.*;


public class JSONReadWrite {
    public static final String FILEPATH = "./src/main/resources//university.json";
    private University universityFromFile;

    public University universityReadWrite(University university) {
        try (Writer writer = new FileWriter(FILEPATH)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader(FILEPATH)) {
            Gson gson = new Gson();
            universityFromFile = gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return universityFromFile;
    }
}
