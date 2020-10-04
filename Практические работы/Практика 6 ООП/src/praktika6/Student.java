package praktika6;

public class Student{
    private String surname;
    private String name;
    public double GPA;
    public Student(String surname, String name, double GPA){
        this.GPA = GPA;
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        return (surname + " " + name + " GPA: " + GPA);
    }


}


