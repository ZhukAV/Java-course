package lab5.view;

import lab5.controller.DatabaseOutput;

public class Runner {
    public static void main(String[] args) {
        DatabaseOutput databaseOutput = new DatabaseOutput();
        databaseOutput.getTable("Human");
    }
}
