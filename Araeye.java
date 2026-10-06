public class Araeye {

    public static void main(String[] args) {
        Main M=new Main(5);
        M.Append(10);
        M.Append(20);
        M.Append(30);
        
        M.Travarse();
        M.Insert(1, 15);
        System.out.println("after inserting");
        M.Append(60);
        M.Travarse();
        System.out.println("after Append");
        M.Insert(2, 90);
        M.Travarse();
       if( M.Search(90)) {
        System.out.println("FOUND");
       } else
        System.out.println("not found");
M.Delate(3);
System.out.println("after Delate");
M.Travarse();
    }
} 