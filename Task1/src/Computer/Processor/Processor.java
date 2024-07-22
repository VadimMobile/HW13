package Computer.Processor;

public class Processor {
    private Frequency frequency;
    private Core core;
    private Manufacturer manufacturer;
    private int weight;

    public Processor(Frequency frequency, Core core, Manufacturer manufacturer, int weight) {
        this.frequency = frequency;
        this.core = core;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Core getCore() {
        return core;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
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
                "\nЧастота: " + frequency + ";" +
                " Количество ядер: " + core + ";" +
                " Производитель: " + manufacturer + ";" +
                " Вес: " + weight + "гр. \n";
    }
}
