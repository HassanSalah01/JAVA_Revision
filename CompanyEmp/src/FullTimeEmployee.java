public class FullTimeEmployee extends Employee{
    private char depGrade;
    private float salary;
    private float tax ;


    public FullTimeEmployee(String name, String department, char depGrade) {
        super(name, department);
        this.depGrade = depGrade;
    }

    @Override
    



    public char getDepGrade() {
        return this.depGrade;
    }

    public void setDepGrade(char depGrade) {
        this.depGrade = depGrade;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getTax() {
        return this.tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    
}
