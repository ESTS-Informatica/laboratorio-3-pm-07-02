public class Van extends GroundTransportation
{

    private int packages;

    public Van(int packages, String licensePlate)
    {
        super(licensePlate);
        this.packages = packages;
    }
    
    // SELECTORS
    public int getPackages()
    {
        return this.packages;
    }

    // SETTERS
    public void setPackages(int packages)
    {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return super.toString() + "           Número de pacotes: " + this.packages + "\n";
    }
}
