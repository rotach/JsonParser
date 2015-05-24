package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonBooleanValueTest {

    @Test
    public void trueTest() {
        JsonBooleanValue v = new JsonBooleanValue();
        v.setVal(true);
        assertEquals("true", v.getValueString());
    }

    @Test
    public void falseTest() {
        JsonBooleanValue v = new JsonBooleanValue();
        v.setVal(false);
        assertEquals("false", v.getValueString());
    }

}
