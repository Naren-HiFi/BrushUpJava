package CompleteJavaBasics;

public class InheritanceChildNewGenerationVehicle extends InheritanceParentTraditionalVehicle{

    public String getVehicleColor(){
        System.out.println("The color of the vehicle: " + colorOfVehicle);
        return colorOfVehicle;
    }

    public void vehicleAudioSystem(){
        System.out.println("Child Audio system code is implemented");
    }


    public static void main(String[] args) {

        InheritanceChildNewGenerationVehicle newGenerationVehicle = new InheritanceChildNewGenerationVehicle();
        newGenerationVehicle.vehicleBreak();
        newGenerationVehicle.vehicleGear();
        newGenerationVehicle.vehicleAudioSystem(); // Function or Method Overriding => Method has the same name and same signature
        System.out.println("Getting the color of the vehicle by creating an object: " + newGenerationVehicle.colorOfVehicle);

    }
}
