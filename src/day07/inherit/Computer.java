package day07.inherit;

public class Computer extends Calculator {

    @Override
    public Double calcAreaCircle(int r) {
        return r * r * Math.PI;
    }
}
