public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.00;

    public AirTransportation(String name, int numberOfContainers) {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        if (numberOfContainers >= 0) {
            this.numberOfContainers = numberOfContainers;
        }
    }

    public double getPriceWithFees() {
        return super.getPrice() + (super.getPrice() * FEES / 100);
    }

    public String getTransportType() {
        return "Transporte Aereo";
    }

    public double getFees() {
        return FEES;
    }

    @Override
    public String toString() {
        return super.toString() + "           Nome: " + this.name + "\n" +
                "  NºContentores: " + this.numberOfContainers + "\n";
    }
}
