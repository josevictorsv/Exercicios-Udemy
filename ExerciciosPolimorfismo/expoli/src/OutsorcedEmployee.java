public class OutsorcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsorcedEmployee() {
        super();
    }

    public OutsorcedEmployee(String name, Integer hours, double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    public String toString() {
        return getName() + " - $" + String.format("%.2f", payment());
    }
}
