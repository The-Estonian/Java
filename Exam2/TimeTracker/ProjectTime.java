import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        calcTime();
    }

    public void calcTime() {
        SimpleDateFormat template = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date start = template.parse(this.startTime);
            Date end = template.parse(this.endTime);
            long diff = end.getTime() - start.getTime();
            if (diff < 0) {
                this.hoursLogged = -1;
            }
            this.hoursLogged = (float) (diff / (1000.0 * 60 * 60));
        } catch (ParseException e) {
            this.hoursLogged = -1;
        }
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;

    }

    public void setEndTime(String end) {
        this.endTime = end;
        calcTime();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getHoursLogged() {
        System.out.println(this.hoursLogged);
        if (hoursLogged < 0) {
            return "-1";
        }
        if (hoursLogged < 2) {
            return (int) (hoursLogged * 60) + " m";
        } else if (hoursLogged < 120) {
            return (int) (hoursLogged) + " h";
        } else if (hoursLogged < 2880) {
            return (int) (hoursLogged / 24) + " d";
        } else {
            return (int) (hoursLogged / 720) + " mo";
        }
    }
}