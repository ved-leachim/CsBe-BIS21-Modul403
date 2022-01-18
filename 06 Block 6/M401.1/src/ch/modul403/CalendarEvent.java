package ch.modul403;




import java.text.SimpleDateFormat;

public class CalendarEvent {


    private String title;
    private String date;
    private String start;
    private String duration;

    //getter und setter funktionen

    //Setter Methode

    public void settitle(String newtitle) {

        this.title = newtitle;
    }

    public void setdate(String newdate) {

        String Date = new SimpleDateFormat("yyyy-MM-dd").format(date);

        this.date = newdate;

    }

    public void setStart(String newstart) {

        this.start = newstart;
    }

    public void setduration(String newduration) {

        this.duration = newduration;
    }

    //Getter Methode

    public String gettitle() {

        return this.title;
    }

    public String getdate() {


        return this.date;
    }

    public String getstart() {

        return this.start;
    }

    public String getduration() {

        return this.duration;
    }

    //Konstruktor

    public CalendarEvent(String title, String date, String start, String duration) {

        this.title = title;
        this.date = date;
        this.start = start;
        this.duration = duration;


    }

    @Override
    public String toString() {


        return title + ", " + date + ", " + start + ", " + duration + ", ";

    }

}











