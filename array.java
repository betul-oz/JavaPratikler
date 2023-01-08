
public class array {
    public static void main(String[] args){
      
       int[] numbers= {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length ; i++){

            System.out.println(numbers[i]);
        }
        String[] carModels = {"Toyota", "Honda", "Ford", "Chevrolet", "BMV"};
        int [] carYears = {2020, 2019, 2018, 2017, 2016};
        double[] carPrices = {30000.0, 25000.0, 20000.0, 15000.0, 10000.0};

        for(int i=0; i< carModels.length; i++) {
            System.out.println(carModels[i] + " (" + carYears[i] + ") - $" + carPrices[i]);
        }
}
}