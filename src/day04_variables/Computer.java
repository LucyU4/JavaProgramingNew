package day04_variables;

import org.w3c.dom.ls.LSOutput;

import javax.annotation.processing.Processor;

public class Computer {

    //create a class Computer
    //create a main method 
    //
    //    declare and assign these variables with the most appropriate datatypes:
    //
    //        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth 
    //
    //        create a summary of the information and print it. Be creative

    public static void main(String[] args) {


        String brand = "Dell";
        String processor = "Intel";
        int ramMemory = 16;
        int storageMemory = 256;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        double price = 1800.98;
        byte numberOfUsbSlots = 16;
        boolean HasBluetooth = true;


        System.out.println(" The computer brand: \t" + brand + "\n  The Processor  \t;" + processor  + " \n The Ram Memory"
          + ramMemory + "\n The Storage Memory: \t" + storageMemory + "\n Monitor: \t" + hasMonitor + "\n Wifi Card: \t" + hasWifiCard + " \n The Price: \t" + price + "\n USB slots: \t" + numberOfUsbSlots + " \n Bluetooth " + HasBluetooth );



    }
}
