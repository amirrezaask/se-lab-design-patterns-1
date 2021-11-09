package io.amirrezaask.garden;

public class Khatmi implements AbstractFlower{
    @Override
    public Prototype getClone() {
        return new Khatmi();
    }

    @Override
    public String getName() {
        return "Khatmi";
    }
}
