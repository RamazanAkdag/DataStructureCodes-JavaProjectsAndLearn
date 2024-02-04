package Deneme;

import java.util.Scanner;

public class Car {

    private String model;
    private int speed;
    private int speedAmount;

    public Car(String model, int speedAmount) {
        this.model = model;
        this.speedAmount = speedAmount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedAmount() {
        return speedAmount;
    }

    public void setSpeedAmount(int speedAmount) {
        this.speedAmount = speedAmount;
    }

    public void openTurbo() {
        System.out.println("Turbo activated...");
        this.setSpeedAmount(this.getSpeedAmount() * 2);
    }

    public void openClima() {
        System.out.println("clima activated...");
        this.setSpeedAmount(this.getSpeedAmount() - this.getSpeedAmount() * 10 / 100);
    }

    public void startCar() {
        System.out.println(this.getModel() + " Started...");
        System.out.println();
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                String val;
                boolean isClimaOpen = false;
                boolean isTurboOpen = false;
                while (true) {
                    val = scanner.nextLine();
                    if (isClimaOpen && isTurboOpen) {
                        return;
                    }
                    switch (val) {
                        case "t":
                            openTurbo();
                            isTurboOpen = true;
                            break;

                        case "c":
                            openClima();
                            isClimaOpen = true;
                            break;
                        case "tc":

                        case "ct":
                            openClima();
                            openTurbo();

                            return;

                        default:
                            break;
                    }
                }

            }

        });
        thread.start();
        while (true) {
            System.out.println(this.getModel() + "'s speed is " + this.getSpeed() + " and speed amount is "
                    + this.getSpeedAmount());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            this.setSpeed(this.getSpeed() + this.getSpeedAmount());

        }
    }

}