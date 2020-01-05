package ru.job4j.poly;

public class Bus implements Transport {
    private int pNumbers;
    private int fLitres;
    double price;

    public Bus() {
        pNumbers = 0;
        fLitres = 0;
        price = 1.0;
    }

    public int getpNumbers() {
        return pNumbers;
    }

    public void setpNumbers(int pNumbers) {
        this.pNumbers = pNumbers;
    }

    public int getfLitres() {
        return fLitres;
    }

    public void setfLitres(int fLitres) {
        this.fLitres = fLitres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double refuel(int fLitres) {
        setfLitres(fLitres);
        return price * fLitres;
    }

    @Override
    public void keepPassengers(int pNumbers) {
        setpNumbers(pNumbers);
        System.out.println(pNumbers + "passengers boarded the bus.");
    }

    @Override
    public void run() {
        System.out.println("The bus is running.");
    }
}
