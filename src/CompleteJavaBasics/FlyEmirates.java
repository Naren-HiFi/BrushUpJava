package CompleteJavaBasics;

public class FlyEmirates extends ParentAircraft{
    public static void main(String[] args) {

        FlyEmirates flyEmirates = new FlyEmirates();
        flyEmirates.aircraftEngine();
        flyEmirates.safetyGuidelines();
        flyEmirates.bodyColor();

        // CompleteJavaBasics.ParentAircraft parentAircraft = new CompleteJavaBasics.ParentAircraft(); You can't instantiate abstract classes

    }

    @Override
    public void bodyColor() {
        System.out.println("The body color of fly emirates aircraft is red");
    }


}
