package io.amirrezaask.garden;

public class JapaneseGardenCreator implements AbstractGardenCreator{
    private AbstractTree tree;
    private AbstractFlower flower;

    @Override
    public AbstractFlower getFlower() {
        return this.flower;
    }

    @Override
    public AbstractTree getTree() {
        return this.tree;
    }

    @Override
    public void createTree() {
        this.tree = new J1();
    }

    @Override
    public void createFlower() {
        this.flower = new G1();
    }

    @Override
    public Prototype getClone() {
        var igc = new JapaneseGardenCreator();
        igc.flower = (AbstractFlower) this.flower.getClone();
        igc.tree = (AbstractTree) this.tree.getClone();
        return igc;
    }
}
