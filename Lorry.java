public class Lorry extends GroundTransportation
{

    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    // SELECTORS
    public int getNumberOfPallets()
    {
        return this.numberOfPallets;
    }

    public int getTrailers()
    {
        return this.trailers;
    }

    // SETTERS
    public void setNumberOfPallets(int numberOfPallets)
    {
        this.numberOfPallets = numberOfPallets;
    }

    public void setTrailers(int trailers)
    {
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        return super.toString() + "           Número de paletes: " + this.numberOfPallets + "\n" + "           Número de atrelados: " + this.trailers + "\n";
    }
}
