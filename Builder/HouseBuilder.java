
public class HouseBuilder implements HousingBuilder {
    int size;
    int price;
    int rooms;
    String name;

    public HouseBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public HouseBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Housing build() {
        Housing newHouse = new House();
        newHouse.setSize(this.size);
        newHouse.setPrice(this.price);
        newHouse.setRooms(this.rooms);
        newHouse.setName(this.name);
        return newHouse;
    }
}
