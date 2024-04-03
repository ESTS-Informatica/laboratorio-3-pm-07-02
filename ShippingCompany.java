import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        inService = new ArrayList<>();
    }

    public String toString() {
        String result = "Companhia: " + this.name + "\n";
        for (Transport transport : this) {
            result += transport.toString();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }

    public Transport getTransportation(String id) {
        for (Transport transport : this) {
            if (transport.getId().equals(id)) {
                return transport;
            }
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInService(Transport transport) {
        this.inService.add(transport);
    }

    public void removeInService(Transport transport) {
        this.inService.remove(transport);
    }
}
