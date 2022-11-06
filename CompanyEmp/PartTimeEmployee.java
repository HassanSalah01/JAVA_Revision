public class PartTimeEmployee extends Employee {
    private int numberOfHours;
    private int hourCost;

    public PartTimeEmployee(String name , String department){
        super(name,department);
    }

    public int getNumberOfHours() {
        return this.numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getHourCost() {
        return this.hourCost;
    }

    public void setHourCost(int hourCost) {
        this.hourCost = hourCost;
    }

    
}
