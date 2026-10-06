public class Student {
    private int Id;
    private String name;
    private int age;
    private double gba;

    public Student(int Id, String nane, int  age, double gba) {
        this.Id = Id;
        this.name = nane;
        this.age = age;
        this.gba= gba;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }
public void Disblay(){
System.out.println("Id="+Id);
System.out.println("Age="+age);
System.out.println("name="+name);
    System.out.println("gba="+gba);
}
}
