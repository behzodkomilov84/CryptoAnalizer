package ru.javarush.behzod_komilov.cryptoanalizer.controllers;

import ru.javarush.behzod_komilov.cryptoanalizer.commands.Action;
import ru.javarush.behzod_komilov.cryptoanalizer.commands.Decoder;
import ru.javarush.behzod_komilov.cryptoanalizer.commands.Encoder;
import ru.javarush.behzod_komilov.cryptoanalizer.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;


    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException();
        }

    }
}
