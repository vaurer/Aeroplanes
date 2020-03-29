package va.CC;

public class Aeroplane {
    private String identification;
    private double maximumWeight;
    private double emptyWeight;
    private double fuelCapacity;

    public Aeroplane(String identification, double maximumWeight, double emptyWeight, double fuelCapacity) {
        this.identification = identification;
        this.maximumWeight = maximumWeight;
        this.emptyWeight = emptyWeight;
        this.fuelCapacity = fuelCapacity;
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
}
