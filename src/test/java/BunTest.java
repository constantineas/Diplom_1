import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    private final String nameOfBun = "NameBun";
    private final float priceOfBun = 250.00f;
    private Bun bun;

    @Before
    public void createBun() {
        bun = new Bun(nameOfBun, priceOfBun);
    }

    // Проверка метода для названия булочки
    @Test
    public void getNameTest() {
        String expected = "NameBun";
        String actual = bun.getName();
        Assert.assertEquals(expected, actual);
    }

    // Проверка метода для назначения цены булочки
    @Test
    public void getPriceTest() {
        float expected = 250.00f;
        float actual = bun.getPrice();
        float delta = 0.00f;
        Assert.assertEquals(expected, actual, delta);
    }

}
