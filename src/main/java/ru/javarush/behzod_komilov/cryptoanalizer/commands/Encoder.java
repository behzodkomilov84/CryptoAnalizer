package ru.javarush.behzod_komilov.cryptoanalizer.commands;

import ru.javarush.behzod_komilov.cryptoanalizer.entity.Result;
import ru.javarush.behzod_komilov.cryptoanalizer.entity.ResultCode;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        // TODO something do
        return new Result("encode all right", ResultCode.OK);
    }
}
