import java.util.Scanner;

public class object {
    
   private String Name;
   public  int Age;
   private long studentID;

   public object(String name, int age, long ID){
     
    Name = name;
    Age = age;
    studentID = ID;
   }
    public String getName() {
        return Name;

   }

   public void setName(String Name) {
    this.Name = Name;
   }

   public Long getStudentID() {
    return studentID;

}

public void setStudentID(Long StudentID) {
this.studentID = StudentID;
}
    public static void main(String[]args){
        object veri = new object("Betul",  20, 2111021020);
        System.out.println(veri);

    veri.setName("Betul"); 
    System.out.println(veri.getName());

    System.out.println(veri.Age);

    veri.setStudentID(211102102L); 
    System.out.println(veri.getStudentID());


    }
}
