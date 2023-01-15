import  java.lang.String;
public class Main {

    class Account {

        private String accountName;
        private long accountID;
        private double balance;
    
        Account (String name, long ID, double balance) {
    
        accountName = name;
        accountID = ID;
        this.balance = balance;
    
        }
    
        public String getName(){
            return accountName;
        }
    
        public void setName(String accountName){
            this.accountName = accountName;
        }
    
        public double getBalance(){
            return balance;
        }
    
        public void setBalance(double balance){
            this.balance = balance;
        }
    
        public double getID(){
            return accountID;
        }
    
        public void setID(long accountID){
            this.accountID = accountID;
        }
    
        public void deposit(double deposit){
        if (deposit > 0){
            balance = balance + deposit;
        }else {
            System.out.println("warning!");
        }
        }
    
        public void withdraw(Double withdraw){
        if (withdraw < balance){
            balance = balance - withdraw;
        }
        else{
            System.out.println("warning!");
        }
        }
    }

    public static void main(String[]args){
        Account accounts[] = new Account[25];
    
    for (int i=0; i<25; i++){
        accounts[i].setBalance(i+100);
        accounts[i].setID(i);
        accounts[i].setName("name");
        // System.out.println();
    }
    
    for (int i=0; i<25; i++){
        System.out.println(accounts[i].getID());
        System.out.println(accounts[i].getName());
        System.out.println(accounts[i].getBalance());
    }
     }
}


