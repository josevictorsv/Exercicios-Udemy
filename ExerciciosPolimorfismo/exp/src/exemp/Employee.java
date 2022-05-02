package exemp;
public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public String getName() {
        return name;
    }

    public Employee(){

    }


    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return name + " - $"+ payment();
    }
}
