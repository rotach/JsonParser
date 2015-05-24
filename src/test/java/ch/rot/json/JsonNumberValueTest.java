package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonNumberValueTest {

    @Test
    public void integerNumberTest() {
        JsonNumberValue v = new JsonNumberValue();
        v.setVal(100d);
        assertEquals("100", v.getValueString());
    }

    @Test
    public void doubleNumberTest() {
        JsonNumberValue v = new JsonNumberValue();
        v.setVal(10.05);
        assertEquals("10.05", v.getValueString());
    }

    @Test
    public void negativeIntegerNumberTest() {
        JsonNumberValue v = new JsonNumberValue();
        v.setVal(-100d);
        assertEquals("-100", v.getValueString());
    }

    @Test
    public void negativeDoubleNumberTest() {
        JsonNumberValue v = new JsonNumberValue();
        v.setVal(-10.05);
        assertEquals("-10.05", v.getValueString());
    }

}
