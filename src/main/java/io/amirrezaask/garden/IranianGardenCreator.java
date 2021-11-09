package io.amirrezaask.garden;

public class IranianGardenCreator implements AbstractGardenCreator {
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
        this.tree = new Chenar();
    }

    @Override
    public void createFlower() {
        this.flower = new Khatmi();
    }

    @Override
    public Prototype getClone() {
        var builder = new IranianGardenCreator();
        builder.flower = (AbstractFlower) this.flower.getClone();
        builder.tree = (AbstractTree) this.tree.getClone();
        return builder;
    }
}
