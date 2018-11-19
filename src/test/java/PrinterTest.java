import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(20,50);
    }

    @Test
    public void print(){
        printer.print(20);
        assertEquals(0,printer.getPaper());
        assertEquals(30,printer.getToner());
    }

    @Test
    public void noPrint(){
        printer.print(21);
        assertEquals(20,printer.getPaper());
        assertEquals(50,printer.getToner());
    }

    @Test
    public void addPaper(){
        printer.addPaper(10);
        assertEquals(30,printer.getPaper());
    }

    @Test
    public void printThenAddPaper(){
        printer.print(15);
        printer.addPaper(10);
        assertEquals(15,printer.getPaper());
        assertEquals(35,printer.getToner());
    }




}
