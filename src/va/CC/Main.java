package va.CC;

public class Main {

    public static void main(String[] args) {
CargoPlane cargoPlane1 = new CargoPlane("Beluga A300-600 ST", 155000, 86500, 23860, 20000, 19,15.9);

Airliner airliner1 = new Airliner("Airbus A380-800", 575000, 277000, 253983, 25000,31.74, 0,519);
cargoPlane1.loadCargo(50000);
cargoPlane1.loadCargo(42000);
cargoPlane1.loadCargo(5000);
cargoPlane1.flight(10000);
cargoPlane1.flight(500);
cargoPlane1.unloadCargo(27300);
cargoPlane1.unloadCargo(50000);
airliner1.boarding(600);
airliner1.boarding(500);
airliner1.flight(3000);
airliner1.flight(700);
airliner1.disembarkation(650);
airliner1.disembarkation(450);
    }
}
