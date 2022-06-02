package bo.edu.ucb.ingsoft.bot.dto;

public class SubsidiaryDtoApi {
    private int id;
    private String name;
    private String location;
    private String timetable;
    private int number;

    public SubsidiaryDtoApi(int id, String name, String location, String timetable, int number) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.timetable = timetable;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
