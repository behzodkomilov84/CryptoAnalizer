package ru.javarush.behzod_komilov.cryptoanalizer.commands;

import ru.javarush.behzod_komilov.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
