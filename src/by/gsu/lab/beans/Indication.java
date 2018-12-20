package by.gsu.lab.beans;

public class Indication {
    private int id;
    private String name;
    private int value;
    private String day;

    public Indication(int id, String name, int value, String day) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.day = day;
    }

    public Indication() {
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String
    toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", day='" + day + '\n';
    }
}
