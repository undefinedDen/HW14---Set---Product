package app.view;

import java.util.Scanner;

public class AppView {
    public <T> void displayInfo(T output) {
        System.out.print(output);
    }
    public int getInputIndex(){
        Scanner scanner = new Scanner(System.in);
        displayInfo("Input index and i found product for you: ");
        return scanner.nextInt();
    }
}

