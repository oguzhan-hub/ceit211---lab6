package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // Declare variables
        int station; // The user's channel choice
        // Declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        // Turn the power on
        bigScreen.power(true);
        // Display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + " inch " + bigScreen.getManufacturer() + " has been turned on.");
        // Prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        // Change the channel on the television
        bigScreen.setChannel(station);
        // Increase the volume of the television
        bigScreen.increaseVolume();
        // Display the the current channel and
        // volume of the television

        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println("Too loud! Lowering the volume.");
        // Decrease the volume of the television

        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        // Display the the current channel and
        // volume of the television

        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
        System.out.println("---------------------------------------"); // For a blank line
        // HERE IS WHERE YOU DO TASK #5

        Television Sharp = new Television("Sharp",19);
        Sharp.power(true);
        System.out.println("A " + Sharp.getScreenSize() + " inch " + Sharp.getManufacturer() + " has been turned on.");
        station = keyboard.nextInt();
        Sharp.setChannel(station);
        Sharp.decreaseVolume();
        Sharp.decreaseVolume();
        System.out.println("Channel: "+Sharp.getChannel()+" Volume: "+Sharp.getVolume());
    }
}
