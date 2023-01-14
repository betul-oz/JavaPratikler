package maasHesaplama;

    public class Employee {
        String name;
        double salary;
        int workHours;
        int hireYear;
    
        Employee(String name, int salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
    
        }
    
        double tax() {
            double taxValue = 0.0;
            if (salary < 0) {
                System.out.println("salary should be greater than zero");
            } else if (salary > 0 && salary < 1000) {
                taxValue = 0.0;
            } else {
                taxValue = salary * 0.03;
            }
          
            return taxValue;
        }
    
        double bonus() {
            double bonusValue = 0.0;
            if (workHours > 40) {
                bonusValue = (workHours - 40) * 30;
            }
           
            return bonusValue;
        }
    
        double raiseSalary() {
            int year = 2021;
            double raiseValue;
    
            if ((year - hireYear) < 10) {
                raiseValue = salary * 0.05;
            } else if ((year - hireYear) > 9 && (year - hireYear) < 20) {
                raiseValue = salary * 0.1;
            } else {
                raiseValue = salary * 0.15;
            }
            
            return raiseValue;
        }
    
        void toStringEmployee() {
            System.out.println("Name : " + name);
            System.out.println("Salary : " + salary);
            System.out.println("Work Hours :" + workHours);
            System.out.println("Hire Year :" + hireYear);
            System.out.println("Tax :" + tax());
            System.out.println("Bonus :" + bonus());
            System.out.println("Salary raise : " + raiseSalary());
            double salaryWithBonusAndTax=(salary + bonus()) - tax();
            System.out.println("Salary with tax and bonus : " + salaryWithBonusAndTax);
            System.out.println("Total salary : " +(salaryWithBonusAndTax+bonus()));
            System.out.println("=========");
    
        }
    
    }
    
