public class TransportFactory {
    public int getTransport(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car().getDistance();
        } else if (type.equalsIgnoreCase("plane")) {
            return new Plane().getDistance();
        }
        return 0;
    }
}