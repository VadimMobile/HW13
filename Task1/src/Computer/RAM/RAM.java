package Computer.RAM;

public class RAM {
    private Type type;
    private int volume;
    private int weight;

    public RAM(Type type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                " \nТип: " + type + ";" +
                " Объём: " + volume + ";" +
                " Вес: " + weight + "гр. \n";
    }
}
