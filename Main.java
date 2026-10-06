public class Main{
    public int items[];
    public int cont;// ده بيعرفني كام عنصر موجود في arr
    public Main(int size){
        items=new int[size];
cont=0;
    }
    public boolean isfull(){
         
         
            return (cont==items.length);
        
    }
    public void Append( int item){ //دي ميثود  اضافه
        if (isfull()) {
            System.out.println("::Arraey is full::");
           
        }
        else{
            items[cont++]=item;

        }
    }
    public void Travarse(){ //دي مسثود بتعدي كله arق 
        for(int i=0;i<cont;i++){
        System.out.println(items[i]);
    }
    }
    public   boolean Search(int item){ //دي مسثود ابتبحث علي الرقم الي اني عاوزو
for(int i=0;i<cont;i++){
if (items[i]==item) {// هنا بقولو لو الرقم الي اني عاوز موجود في array  ابعت صح لو العكس ابعت غلط
    return true;
}
}

    return false;
    
}
public void Insert(int pos,int newitem){
//هنا لو عاوز اضيف رقم مكان رقم فا اني هنا نقصت iلان iهتبقا اكبر من المكان الي عاوز اضيفو 
    if (isfull()) {
            System.out.println("::Arraey is full::");
           return;
        }
for (int i = cont; i >pos; i--) {
    items[i]=items[i-1];
    
}
items[pos]=newitem;
    cont++;

}
public void Delate( int pos){

    for(int i=pos;i>cont-1;i++){
        items[i]=items[i+1];
        cont--;
    }
} 

}
