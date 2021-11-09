package io.amirrezaask.garden;

public class Chenar implements AbstractTree {
    @Override
    public Prototype getClone() {
        return new Chenar();
    }

    @Override
    public String getName() {
        return "Chenar";
    }
}
