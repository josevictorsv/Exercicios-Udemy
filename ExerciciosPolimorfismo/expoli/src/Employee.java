public class Employee {

    private String name;
    private Integer hours;
    private double valuePerHour;

    public String getName() {
        return name;
    }

    public Employee(){

    }

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return valuePerHour*hours;
    }

    @Override
    public String toString() {
        return getName() + " - $" + String.format("%.2f", payment());
    }
}
