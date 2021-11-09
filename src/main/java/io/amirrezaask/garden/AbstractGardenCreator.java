package io.amirrezaask.garden;

public interface AbstractGardenCreator extends Prototype {
    AbstractFlower getFlower();
    AbstractTree getTree();
    void createTree();
    void createFlower();
}
