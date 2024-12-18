package ru.javarush.behzod_komilov.cryptoanalizer;

import ru.javarush.behzod_komilov.cryptoanalizer.entity.Result;

import java.util.Arrays;

public class ConsoleRunner {
    public static void main(String[] args) {

        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);






    }
}

//        int key = 123; // из args
//        String text = "Privet Behzod"; // из args
//        String result = ""; // из args