package utils;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    public static String toString(Date date, DatePatterns format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format.getDatePattern());
        return dateFormat.format(date);
    }

    public static String toString(LocalDate date, DatePatterns format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format.getDatePattern());
        return date.format(formatter);
    }

    public static String toString(LocalDateTime date, DatePatterns format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format.getDatePattern());
        return date.format(formatter);
    }

    public static LocalDateTime stringToLocalDateTime(String date, DatePatterns datePattern) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern.getDatePattern());
            return LocalDateTime.parse(date, formatter);
        }
        return null;
    }

    public static LocalDateTime stringToLocalDateTimeWithOffset(String date, DatePatterns datePattern, ZoneOffset offset) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern.getDatePattern());
            OffsetDateTime dateTime = LocalDateTime.parse(date, formatter).atOffset(offset);
            return dateTime.toLocalDateTime();
        }
        return null;
    }

    public static Date stringToDate(String date, DatePatterns datePatterns) {
        if (date != null) {
            LocalDateTime localDateTime = stringToLocalDateTime(date, datePatterns);
            return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        }
        return null;
    }

    public static LocalDate stringToLocalDate(String date, DatePatterns datePattern) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern.getDatePattern());
            return LocalDate.parse(date, formatter);
        }
        return null;
    }

    public static String getDatePlusDays(DatePatterns datePatterns, int amountOfDaysToAdd) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePatterns.getDatePattern());
        return LocalDateTime.now().plusDays(amountOfDaysToAdd).format(formatter);
    }

    public static String getDatePlusMonths(DatePatterns datePatterns, int amountOfMonthsToAdd) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePatterns.getDatePattern());
        return LocalDateTime.now().plusMonths(amountOfMonthsToAdd).format(formatter);
    }

    public static String getDatePlusYears(DatePatterns datePatterns, int amountOfYearsToAdd) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePatterns.getDatePattern());
        return LocalDateTime.now().plusYears(amountOfYearsToAdd).format(formatter);
    }

    public static LocalDateTime convertDateToZone(LocalDateTime date, String initialZone, String targetZone) {
        return date.atZone(TimeZone.getTimeZone(initialZone).toZoneId()).withZoneSameInstant(TimeZone.getTimeZone(targetZone).toZoneId()).toLocalDateTime();
    }
}
