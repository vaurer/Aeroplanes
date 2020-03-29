package va.CC;

public class CargoPlane extends Aeroplane {

    private double cargoWeight;

    public CargoPlane(String identification, double maximumWeight, double emptyWeight, double fuelCapacity, double cargoWeight) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.cargoWeight = cargoWeight;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void loadCargo(double newCargo) {
        double avaiableCargoWeight;
        avaiableCargoWeight = this.getMaximumWeight() - this.getCargoWeight() - this.getEmptyWeight() - this.getFuelCapacity();
        if (newCargo <= avaiableCargoWeight) {
            this.cargoWeight += newCargo;
            System.out.println(this.getIdentification() + " is now loaded! with " + cargoWeight + " KG\n");

        } else
            System.out.println("Not enough capacity on " + this.getIdentification() + " , you can load only KG: " + avaiableCargoWeight+"\n");
    }

    public void unloadCargo(double cargoToUnload) {
        if (cargoToUnload <= this.cargoWeight) {
            this.cargoWeight -= cargoToUnload;
            System.out.println(this.getIdentification() + " is successfully unloaded. The cargo on the plane weight " + cargoWeight+"\n");
        } else System.out.println(this.getIdentification() + " has not so much cargo on board\n");

    }

}
