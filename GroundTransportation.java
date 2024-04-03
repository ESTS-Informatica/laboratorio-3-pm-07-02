public class GroundTransportation extends Transport {
    private String licensePlate;
    private final static double FEES = 3.00;

    public GroundTransportation(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {

        this.licensePlate = licensePlate;
    }
}
