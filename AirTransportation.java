public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double FEES = 4.00;

    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName()
    {
        return this.name;
    }

    public int getNumberOfContainers()
    {
        return this.numberOfContainers;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
}
