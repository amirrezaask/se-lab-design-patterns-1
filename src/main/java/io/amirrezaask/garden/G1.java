package io.amirrezaask.garden;

public class G1 implements AbstractFlower {
    @Override
    public Prototype getClone() {
        return new G1();
    }

    @Override
    public String getName() {
        return "G1";
    }
}
