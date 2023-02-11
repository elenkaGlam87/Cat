package myfirstobject.device;

public class Computer extends Device {
    private String processorModel;

    public Computer(int power, String processorModel) {
        super(power);
        this.processorModel = processorModel;
    }

    @Override
    public void turnOn() {
        System.out.println("Компьютер включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер выключен");
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String toString() {
        return "Компьютер мощностью " + getPower() + ", модель процессора: " + processorModel;
    }
}
