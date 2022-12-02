package pr4.Computer;

public class Computer {
    private int price;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    Computer(int price, String speed, String memory, String size) {
        this.price = price;
        this.memory = new Memory(memory);
        this.monitor = new Monitor(size);
        this.processor = new Processor(speed);
    }

    public int getPrice() {
        return price;
    }

    public String getMemory() {
        return memory.getMemory();
    }

    public String getSize() {
        return monitor.getSize();
    }

    public String getSpeed() {
        return processor.getSpeed();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                '}';
    }
}
