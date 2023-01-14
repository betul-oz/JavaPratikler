package maasHesaplama;

public class main {
    
    public static void main(String[] args) {
        Employee em1 =new Employee("A",2000,45,2020);
        Employee em2 =new Employee("B", 1000, 50, 2015);


        em1.toStringEmployee();
        em2.toStringEmployee();
    }
}