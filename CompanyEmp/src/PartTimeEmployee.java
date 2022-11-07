public class PartTimeEmployee extends Employee {
    private int numberOfHours;
    private int hourCost;

    public PartTimeEmployee(String name , String department){
        super(name,department);
    }
    @Override
    public String printEmployeeData(){
        return super.printEmployeeData()+"Number Of Hours : "+this.numberOfHours+"\n"+"Hourly Cost : "+this.hourCost;
    }
    @Override
    public float calculateSalary(){
        return this.numberOfHours*this.hourCost;
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
