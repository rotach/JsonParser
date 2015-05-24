package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonStringValueTest {

    @Test
    public void stringTest1() {
        JsonStringValue v = new JsonStringValue();
        v.setVal("hello");
        assertEquals("hello", v.getValueString());
    }

    @Test
    public void stringTest2() {
        JsonStringValue v = new JsonStringValue();
        v.setVal("world");
        assertEquals("world", v.getValueString());
    }

    @Test
    public void blankStringTest() {
        JsonStringValue v = new JsonStringValue();
        v.setVal("");
        assertEquals("", v.getValueString());
    }
}
