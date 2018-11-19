import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerTest {

    private Container container;

    @Before
    public void before(){
        container = new Container();
    }

    @Test
    public void drink(){
        container.drink();
        assertEquals(90, container.getVolume());
    }

    @Test
    public void fill(){
        container.drink();
        container.drink();
        container.fill();
        assertEquals(100,container.getVolume());
}

    @Test
    public void empty(){
        container.empty();
        assertEquals(0, container.getVolume());
    }

}
