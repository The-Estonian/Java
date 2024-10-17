
public class ApartmentBuilder implements HousingBuilder {
    int size;
    int price;
    int rooms;
    String name;
    Apartment apart;

    public ApartmentBuilder() {
        this.apart = new Apartment();
    }

    public ApartmentBuilder setSize(int size) {
        this.apart.size = size;
        return this;
    }

    public ApartmentBuilder setPrice(int price) {
        this.apart.price = price;
        return this;
    }

    public ApartmentBuilder setRooms(int rooms) {
        this.apart.rooms = rooms;
        return this;
    }

    public ApartmentBuilder setName(String name) {
        this.apart.name = name;
        return this;
    }

    public Housing build() {
        return this.apart;
    }
}
