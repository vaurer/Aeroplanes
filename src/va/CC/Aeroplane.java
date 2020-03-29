package va.CC;

public class Aeroplane {
    private String identification;
    private double maximumWeight;
    private double emptyWeight;
    private double fuelCapacity;
    private double fuel;
    double fuelUsage;

    public Aeroplane(String identification, double maximumWeight, double emptyWeight, double fuelCapacity, double fuel, double fuelUsage) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(double emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void flight(double mile) {
        double remainingRange = this.fuel / this.fuelUsage;
        if (remainingRange >= mile) {
            this.fuel = this.fuel - (mile * this.fuelUsage);
            System.out.println("You reached the destination after " + mile + " miles. Fuel remain: " + this.fuel);
        } else System.out.println("Not enough fuel");
    }
}
