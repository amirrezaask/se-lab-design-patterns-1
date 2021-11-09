package garden;

import io.amirrezaask.garden.AbstractGardenCreator;
import io.amirrezaask.garden.IranianGardenCreator;
import io.amirrezaask.garden.JapaneseGardenCreator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenTest {
    @Test
    public void TestIranianGarden() {
        var builder = new IranianGardenCreator();
        builder.createFlower();
        builder.createTree();
        assertEquals("Khatmi", builder.getFlower().getName());
        assertEquals("Chenar", builder.getTree().getName());
    }

    @Test
    public void TestJapeneseGarden() {
        var builder = new JapaneseGardenCreator();
        builder.createFlower();
        builder.createTree();
        assertEquals("G1", builder.getFlower().getName());
        assertEquals("J1", builder.getTree().getName());
    }

    @Test
    public void TestJapanesePrototype() {
        var builder = new JapaneseGardenCreator();
        builder.createTree();
        builder.createFlower();
        var builderClone = (AbstractGardenCreator) builder.getClone();
        assertEquals(builder.getFlower().getName(), builderClone.getFlower().getName());
        assertEquals(builder.getTree().getName(), builderClone.getTree().getName());

    }

    @Test
    public void TestIranianPrototype() {
        var builder = new IranianGardenCreator();
        builder.createTree();
        builder.createFlower();
        var builderClone = (AbstractGardenCreator) builder.getClone();
        assertEquals(builder.getFlower().getName(), builderClone.getFlower().getName());
        assertEquals(builder.getTree().getName(), builderClone.getTree().getName());
    }
}
