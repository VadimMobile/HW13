import Computer.Computer;
import Computer.Display.Display;
import Computer.Display.DisplayType;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.KeyboardType;
import Computer.Keyboard.Lightnin;
import Computer.Memory.Memory;
import Computer.Memory.MemoryType;
import Computer.Processor.Core;
import Computer.Processor.Frequency;
import Computer.Processor.Manufacturer;
import Computer.Processor.Processor;
import Computer.RAM.RAM;
import Computer.RAM.Type;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.FOUR_THOUSAND, Core.SIXTEEN, Manufacturer.INTEL, 78);
        RAM ram = new RAM(Type.DDR4, 16, 100);
        Memory memory = new Memory(MemoryType.M2, 1000, 146);
        Display display = new Display(DisplayType.VA, 27, 2456);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, Lightnin.YES_LIGHTNIN, 256);

        Computer computer = new Computer(processor, memory, ram, display, keyboard,"Китай", "ПК");
        System.out.println(computer);
        System.out.println("Общий вес: " + computer.getCalculateWeight() + "гр.");
    }
}