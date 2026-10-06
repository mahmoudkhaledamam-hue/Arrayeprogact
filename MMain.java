   import java.util.Scanner;

 public class MMain{
public static void main(String[] args) {
    Scanner UserData=new Scanner(System.in);

managerStudent manager=new managerStudent(100);
    while(true){

   System.out.println("========== Student Management ==========");
            System.out.println("1- Add Student");
            System.out.println("2- Display Students");
            System.out.println("3- Search Student");
            System.out.println("4- Delete Student");
            System.out.println("5- Update Student");
            System.out.println("6- Exit");
            System.out.print("Choose: ");

int choice=UserData.nextInt();

switch(choice){
    case 1:
    System.out.println("Id");
     int Id=UserData.nextInt();

    UserData.nextLine();

                    System.out.print("Name: ");
                    String name = UserData.nextLine();

                    System.out.print("Age: ");
                    int age = UserData.nextInt();

                    System.out.print("GPA: ");
                    double gpa = UserData.nextDouble();
manager.addStudent(new Student(Id,name,age,gpa));



break;

case 2:
manager.DisblayStudent();
break;

                case 3:

                    System.out.print("Enter ID: ");
                    int searchId = UserData.nextInt();

                    Student s =  (Student) manager.SearchStudent(searchId);

                    if (s != null)
                        s.Disblay();
                    else
                        System.out.println("Student Not Found.");

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int deleteId = UserData.nextInt();

                    manager.DelateStudent(deleteId);

                    break;

                case 5:

                    System.out.print("ID: ");
                    int updateId = UserData.nextInt();

                    UserData.nextLine();

                    System.out.print("New Name: ");
                    String newName =UserData.nextLine();

                    System.out.print("New Age: ");
                    int newAge =UserData.nextInt();

                    System.out.print("New GPA: ");
                    double newGpa = UserData.nextDouble();

                    manager. UpdateStudent(updateId, newName, newAge, newGpa);

                    break;

                case 6:

                    System.out.println("Program Ended.");
                    return;

                default:

                    System.out.println("Invalid Choice.");

}

    }
}
    }