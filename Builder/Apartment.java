
public class Apartment implements Housing {
    int size;
    int price;
    int rooms;
    String name;

    public Apartment setSize(int size) {
        this.size = size;
        return this;
    }

    public Apartment setPrice(int price) {
        this.price = price;
        return this;
    }

    public Apartment setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public Apartment setName(String name) {
        this.name = name;
        return this;
    }

    public String toString() {
        return String.format("Apartment{size=%d, price=%d, rooms=%d, name=%s}", this.size, this.price, this.rooms,
                this.name);
    }
}
