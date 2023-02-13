/*
* File: MainConsole.java
* Author: Berkovics Gellért
* Copyright: 2023, Berkovics Gellért
* Group: Szoft I/1/N
* Date: 2023-02-13
* Github: https://github.com/berkovics/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {
    public MainConsole(){
        this.about();
        System.out.println("Feladat 0301");
        String radiusStr = input("Sugár: ");
        String heightStr = input("Magasság: ");
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Cone cone = new Cone();
        System.out.println(cone.calcVolume(radius, height));
    }
    public String input(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + " ");
        String text = scanner.nextLine();
        return text;
    }
    public void about() {
        System.out.println("--------------------");
        System.out.println(" Berkovics Gellért ");
        System.out.println(" Szoft I/1/N ");
        System.out.println(" 2023.02.13 ");
        System.out.println("--------------------");
    }
}
