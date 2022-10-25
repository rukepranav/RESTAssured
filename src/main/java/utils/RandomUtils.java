package utils;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.*;

public class RandomUtils {
    private static Random random;

    static {
        random = new Random();
    }

    public static String generateSpecialCharacters(int count) {
        return RandomStringUtils.random(count, "'-.ŠšŽžŒœŸÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ");
    }

    public static String generateAlphaNumericString(int number) {
        return RandomStringUtils.randomAlphanumeric(number);
    }

    public static String generateAlphabeticalString(int number) {
        return RandomStringUtils.randomAlphabetic(number);
    }

    public static String generateAlphabeticalString(String start, int number) {
        return start + RandomStringUtils.randomAlphabetic(number);
    }

    public static String generateNumericString(String start, int number) {
        return start + RandomStringUtils.randomNumeric(number);
    }

    public static String generateNumericString(int min, int max) {
        return Integer.toString(generateRandomInteger(min, max));
    }

    public static String generateNumericString(int number) {
        return RandomStringUtils.randomNumeric(number);
    }

    public static String generateRandomEmail() {
        return "auto" + generateAlphabeticalString(7).toLowerCase() + "@mailinator.com";
    }

    public static String generateRandomEmail(int length) {
        return "auto" + generateAlphabeticalString(length).toLowerCase() + "@mailinator.com";
    }

    public static String generateRandomUrl() {
        return "www." + generateAlphabeticalString(5) + ".com";
    }

    public static Integer generateRandomInteger(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
