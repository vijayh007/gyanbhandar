
package tests;

public class VehicleFactory {
    public Vehicle getInstance(String type){
        Vehicle vehicle = null;
        if(type == "light"){
            vehicle = new Mahindra();
        }if(type == "heavy"){
            vehicle =new Ashok();
        }
        return vehicle;
    }
}
