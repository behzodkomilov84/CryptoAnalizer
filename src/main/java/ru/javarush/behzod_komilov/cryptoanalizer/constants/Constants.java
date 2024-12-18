package ru.javarush.behzod_komilov.cryptoanalizer.constants;

import java.io.File;
import java.lang.reflect.Field;

public class Constants {
    private static final String RUS = "йцукенгшўзхъфқвапролджэячсмитьбю";
    private static final String ENG = "abcdefghijklmnopqrstuvwxyz";
    private static final String SPECIAL_SYMBOLS = ".,-:;!";

    public static final String ALPHABETS_AND_SYMBOLS = RUS + RUS.toUpperCase() + ENG + ENG.toUpperCase() + SPECIAL_SYMBOLS;

    public static final String TXT_FOLDER = System.getProperty("user.dir") + File.separator + "text" + File.separator;

}
