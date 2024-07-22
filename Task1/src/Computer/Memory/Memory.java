package Computer.Memory;

public class Memory {
    private MemoryType type;
    private int volume;
    private int weight;

    public Memory(MemoryType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public void setType(MemoryType type) {
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
