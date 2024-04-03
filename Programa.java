public class Programa {

    private ShippingCompany company;

    public Programa() {
        company = new ShippingCompany("RELIABLE-MOVING");
    }

    public void programa() {
        company.add(new GroundTransportation("AA-00-00"));

        company.add(new AirTransportation("AirTransport1", 0));
        company.add(new AirTransportation("AirTransport2", 0));

        company.add(new Lorry(10, 20, "AA-00-01"));
        company.add(new Van(10, "AA-00-02"));

        System.out.println(company);
    }

    public void makeTransportation(String transportID, String origin, String destination, double price) {
        Transport transport = company.getTransportation(transportID);

        if (transport != null && company.getTransportation(transportID).isAvailable()) {
            company.getTransportation(transportID).setOrigin(origin);
            company.getTransportation(transportID).setDestination(destination);
            company.getTransportation(transportID).setPrice(price);
            company.getTransportation(transportID).setAvailable(false);

            company.addInService(transport);
            company.remove(transport);

            System.out.println("Transporte realizado com sucesso!");
            return;
        }
        System.out.println("Transporte não existente ou não disponível!");
    }

/*public void finalizeTransportation(String transportID) {
        company.getTransportation(transportID).resetValues();
        company.removeInService(company.getTransportation(transportID));
    } */
    

}
