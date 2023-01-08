
public class Computer {
 private String operatingSystem;   
 private int ram;
 private int storage;    

    Computer (int ram, int storage){
        this.ram=ram;
        this.storage=storage;
    }
    Computer (String operatingSystem){
        this.operatingSystem=operatingSystem;
    }

    public int getRam (){
        return ram;
    }

    public int getStorage (){
        return storage;
    }

    public String getOperatingSystem (){
        return operatingSystem;
    }

    public void setRam(int ram){
        this.ram=ram;
    }

    public void setStorage(int storage){
        this.storage=storage;
    }
    public void setOperatingSystem(String OperatingSystem){
        this.operatingSystem=operatingSystem;
    }

    public void installProgram(String program, int requiredStorage){
        if (storage - requiredStorage < 0 ) {
            System.out.print("Not enough storage to install program!");
        }
        else{
            storage -= requiredStorage;
            System.out.print("Installing" + program + "...");
        }
    }
    public int getAvailablestorage (){
        return storage;
    }
}

public class Test {
    public static void main(String[]args){
    Computer computer = new Computer("Linux", ram:8, storage:1024);
    Computer.installProgram("Firefox",100);
    int availableStorage=Computer.installProgram();
    System.out.println("Available Storage:" + availableStorage + "GB");    
}
}