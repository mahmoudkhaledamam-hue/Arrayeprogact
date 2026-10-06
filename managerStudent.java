public class managerStudent {
    private Student[]students;
    private int count; //بيعرفني كام طالب موحود جوا
    public managerStudent(int Size ){
        students=new Student[Size];
        count=0;


    }
    public boolean ISFulll(){
        return (count==students.length);
    }
    public void addStudent(Student s){ //هنا بشوف لو مكتمله اطبع كذالو مش كتمله زود +1
if (ISFulll()) {
    System.out.println("Arraye is full$$##");
    return;
    
}
students[count++]=s;

    }
    public void DisblayStudent(){// هنا يعرض بيانات الطالب بشرط انو count 0وبعد كدا بعدي علي Arraye با ستخدام for
if (count==0) {
    System.out.println("not Student");
    return;
}
for(int i=0;i<count;i++){
    students[i].Disblay();

    }

}
public Student  SearchStudent(int id){
    for(int i=0;i<count;i++){
        if (students[i].getId()==id) {
            return students[i];
        }

    }
    
return null;


}
public void DelateStudent(int id){// لو الطالب الي اني عاوز احفه موجود وهو رقم 2 يبقا index2 لو مش موجود يبقا index-1
int index=-1;
for(int i=0;i<count;i++){
   if( students[i].getId()==id){
        index=1;
        break;
    }


}
if (index==-1) {
    System.out.println("Student not found");
    return;
}
for(int i=0;i<count;i++){
    students[i]=students[i+1];//يعني مثلا يا خدو مكان بعض زي احمد مكان ساره


}
students[count-1]=null;
count--;
System.out.println(":Delate Successfully:");


    
}
public void UpdateStudent(int Id,String name,int age,double gba){
Student s=SearchStudent(Id);
if(s==null){
System.out.println("Student Not Found");
    return;
}


s.setName(name);

s.setId(Id);
s.setAge(age);
System.out.println(" Update  Successfully");
}




}
