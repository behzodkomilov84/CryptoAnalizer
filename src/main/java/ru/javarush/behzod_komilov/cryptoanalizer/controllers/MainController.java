package ru.javarush.behzod_komilov.cryptoanalizer.controllers;

import ru.javarush.behzod_komilov.cryptoanalizer.commands.Action;
import ru.javarush.behzod_komilov.cryptoanalizer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parameters){
        // actionName == encode
        // parameters == [data.txt,encrypted.txt,12]
        Action action = Actions.find(actionName); // появиться экземпляр класса encoder/decoder
        Result result = action.execute(parameters);

        return result;
    }
}
