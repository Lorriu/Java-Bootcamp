package CarObjectConstructor;

public class main {

    public static void main(String[] args) {
        
        //instantiating the Car class 
        car myCar = new car();

        System.out.println(myCar.make);

        //use a method with the new car
        myCar.drive();

        //use constructor to change the attributes of Car
        Truck truck = new Truck("Chevrolete", "Camaro", 2019, 23000);

        System.out.println(truck.model);


    }
    
}
