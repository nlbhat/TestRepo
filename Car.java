public interface Engine {
  private String start ();
}


public class PetrolEngine Implements Engine  {

@Override
public String start () {

  return "Petrol Engine";

}
}

public class DieselEngine Implements Engine  {

@Override
public String start () {

  return "Diesel Engine";

}
}


public class Car {
private Engine engine;

public Car (Engine engine){
  this.engine = engine;
}

public void drive () {
   System.out.println("Driving a " + engine.start());
}

public statis void main(String[] args) {

   Engine pee = new PetrolEngine();
   Car myCar = new Car(pee);
   System.out.println(pee.drive());
  
   Engine ped = new DieselEngine();
   Car myCar = new Car(ped);
   System.out.println(ped.drive());

}

}
