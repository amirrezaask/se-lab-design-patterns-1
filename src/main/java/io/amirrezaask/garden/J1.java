package io.amirrezaask.garden;

public class J1 implements AbstractTree{
    @Override
    public Prototype getClone() {
        return new J1();
    }

    @Override
    public String getName() {
        return "J1";
    }
}
