class aeroplane{
    aeroplane(){
        System.out.println("construstor");
    }
    void fly(){
        System.out.println("Aeroplane is flying");
    }
    void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
}
class CargoPlane extends aeroplane{

}
class PassengerPlane extends aeroplane{

}


// Jab tum ye likhte ho:
// PassengerPlane pp = new PassengerPlane();
// To internally Java ye karta hai:
// PassengerPlane() {
//     super();   // Java automatically add karta hai
// }
public class inheritance {
    public static void main(String[] args) {
        aeroplane a=new aeroplane();
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        pp.fly();
    }
    
}
