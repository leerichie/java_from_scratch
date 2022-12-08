package org.example.computer;

import java.util.Arrays;

public class Computer {

    // obowiązkowe pola
    private String motherboard;     // płyta główna
    //    private String processor;       // "i5", "i7", "intel", "amd"
//    private int cores;              // liczba rdzeni
//    private int ram;                // ilość ramu
    private Processor processor;
    private Ram[] ramSlots;

    // dodatkowe pola
    private int hd;                 // wielkość dysku w GB
    private String monitor;         // nazwa preducenta
    private String printer;         // nazwa drukarki

    public Computer() {
    }

    public Computer(String motherboard, Processor processor, Ram[] ramSlots, int hd, String monitor, String printer) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramSlots = ramSlots;
        this.hd = hd;
        this.monitor = monitor;
        this.printer = printer;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram[] getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(Ram[] ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor=" + processor +
                ", ramSlots=" + Arrays.toString(ramSlots) +
                ", hd=" + hd +
                ", monitor='" + monitor + '\'' +
                ", printer='" + printer + '\'' +
                '}';
    }
}