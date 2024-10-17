
public class House implements Housing {
    int size;
    int price;
    int rooms;
    String name;

    public House setSize(int size) {
        this.size = size;
        return this;
    }

    public House setPrice(int price) {
        this.price = price;
        return this;
    }

    public House setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public House setName(String name) {
        this.name = name;
        return this;
    }

    public String toString() {
        return String.format("House{size=%d, price=%d, rooms=%d, name=%s}", this.size, this.price, this.rooms,
                this.name);
    }
}
