package va.CC;

public class Airliner extends Aeroplane {
    private int amountOfPassengers;
    private int maximumPassengers;

    public Airliner(String identification, double maximumWeight, double emptyWeight, double fuelCapacity, int amountOfPassengers, int maximumPassengers) {
        super(identification, maximumWeight, emptyWeight, fuelCapacity);
        this.amountOfPassengers = amountOfPassengers;
        this.maximumPassengers = maximumPassengers;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers;
    }

    public void boarding(int newPassengers) {
        if (this.amountOfPassengers + newPassengers <= this.maximumPassengers) {
            this.amountOfPassengers += newPassengers;
            System.out.println(this.getAmountOfPassengers() + " successfully boarded on the " + this.getIdentification() + "\n");
        } else System.out.println("Not enough free seats on " + this.getIdentification() + "\n");
    }

    public void disembarkation(int leavingPassengers) {
        if (this.amountOfPassengers - leavingPassengers >= 0) {
            this.amountOfPassengers -= leavingPassengers;
            System.out.println(leavingPassengers + " successfully left the " + this.getIdentification() + "\n");
        } else System.out.println("There is not that many passengers on " + this.getIdentification() + "\n");
    }

}
