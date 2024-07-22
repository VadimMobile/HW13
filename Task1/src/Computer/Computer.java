package Computer;

import Computer.Display.Display;
import Computer.Keyboard.Keyboard;
import Computer.Memory.Memory;
import Computer.Processor.Processor;
import Computer.RAM.RAM;

public class Computer {
    private Processor processor;
    private Memory memory;
    private RAM ram;
    private Display display;
    private Keyboard keyboard;
private final String vendor;
private final String name;

    public Computer(Processor processor, Memory memory, RAM ram, Display display,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.memory = memory;
        this.ram = ram;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int getCalculateWeight(){
    return processor.getWeight() + ram.getWeight()
            + memory.getWeight() + display.getWeight()
            + keyboard.getWeight();
}

    @Override
    public String toString() {
        return "Компьютер:\n " +
                "Процессор: " + processor +
                " Постоянная память: " + memory +
                " Оперативная память: " + ram +
                " Монитор: " + display +
                " Клаиватура: " + keyboard +
                " Производитель: " + vendor + " \n Название: " + name;
    }
}
