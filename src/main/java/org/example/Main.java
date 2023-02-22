package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        whenReadWithBufferedReader_thenCorrect();
    }
    public static void  whenReadWithBufferedReader_thenCorrect()
            {
        String expected_value = "Hello, world!";
        String file ="src/main/resources/myFile2.xlsx";
try{        BufferedReader reader = new BufferedReader(new FileReader(file));
    String currentLine = reader.readLine();
    String separator = ",";
    ArrayList<CSVReader>  list = new ArrayList<>();

    while ((currentLine = reader.readLine()) != null) {
//        currentLine = reader.readLine();
        String[] product = currentLine.split(separator);
//        CSVReader csvReader = new CSVReader(product[0],product[1],product[2],product[3],product[4],product[5],product[6],product[7]);
//        list.add(csvReader);
////        System.out.println(product[0]);
//    }
//    for (CSVReader csv: list
//         ) {
//        System.out.println(csv.toString());
//    }


    System.out.println(Arrays.toString(product));

    }
}catch(IOException ex) {

}


    }
}

