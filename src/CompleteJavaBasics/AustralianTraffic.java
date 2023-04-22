package CompleteJavaBasics;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
    public static void main(String[] args) {

        CentralTraffic centralTraffic = new AustralianTraffic();
        centralTraffic.flashYellow();
        centralTraffic.greenGo();
        centralTraffic.redStop();

        AustralianTraffic australianTraffic = new AustralianTraffic();
        australianTraffic.walkOnSignal();

        ContinentalTraffic continentalTraffic = new AustralianTraffic();
        continentalTraffic.trainSymbol();



    }

    public void walkOnSignal(){
        System.out.println("Walk on the road as the yellow signal gets flagged");
    }

    @Override
    public void greenGo() {
        System.out.println("Green - Move your vehicle");
    }

    @Override
    public void redStop() {
        System.out.println("Red - You should stop the vehicle");

    }

    @Override
    public void flashYellow() {
        System.out.println("Flashing yellow - Wait until the traffic signal turns green");

    }

    @Override
    public void trainSymbol() {
        System.out.println("Train is approaching");
    }
}
