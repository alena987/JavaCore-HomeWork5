package lesson5;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        //File tempFile = new File ("./example.cvs");
        //tempFile.createNewFile();

        data.writeToCSV("new_example.csv");

    }

}

