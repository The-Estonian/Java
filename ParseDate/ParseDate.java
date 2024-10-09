import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return LocalDateTime.parse(stringDate, formatter);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        String modified = stringDate.replace(" et ", " et, ");
        String[] parts = modified.split(",");
        int hours = Integer.parseInt(parts[0].split(" ")[0]);
        if (parts[0].contains("du soir")) {
            hours += 12;
        }
        int minutes = 0, seconds = 0;
        if (parts.length > 1) {
            minutes = Integer.parseInt(parts[1].trim().split(" ")[0]);
        }
        if (parts.length > 2) {
            seconds = Integer.parseInt(parts[2].trim().split(" ")[0]);
        }
        return LocalTime.of(hours, minutes, seconds);
    }
}