public class Person {
    private String name ;
    private int age;
    private String email;
    private int yearOfBirth;
    public Person(String name , int age){
        this.name = name ;
        this.age = age;
    }
    public Person(String name , int age ,String email, int yearOfBirth){
        this(name,age);
        this.email = email;
        this.yearOfBirth=yearOfBirth;

    }
    public static int calNumb(int x , int y){
        return x+y;
    }
    public void getData(){
        System.out.println("Your Name :" +this.name);
        System.out.println("Your age :" +this.age);
    }

}
