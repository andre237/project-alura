package desing_patterns_1.decorator.project_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Account {

    private final double value;
    private LocalDate creationDate;
    private final String id;

    public Account(double value, String id, String creationDate) {
        this.value = value;
        this.id = id;
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(creationDate);
            this.creationDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public double getValue() {
        return value;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Account: " + this.id;
    }
}
