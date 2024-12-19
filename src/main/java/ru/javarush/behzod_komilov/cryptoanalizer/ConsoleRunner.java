package ru.javarush.behzod_komilov.cryptoanalizer;

import ru.javarush.behzod_komilov.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        // encode data.txt encrypted.txt 12
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);






    }
}

//        int key = 123; // из args
//        String text = "Privet Behzod"; // из args
//        String result = ""; // из args