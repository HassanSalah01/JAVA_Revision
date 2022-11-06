public class Employee {
    static int empId = 0;
    private String name ;
    private int id ;
    private String department;


    public Employee(String name , String department){
        Employee.empId++;
        this.id = Employee.empId;
        this.name = name ; 
        this.department = department;
    }
    public void printEmployeeData(){
        System.out.println("Employee Id : "+this.id);
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Department : "+this.department);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    
}
