package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonKeyValueTest {

    @Test
    public void stringValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("stringkey");
        kv.setValue("stringvalue");
        assertEquals("\"stringkey\":\"stringvalue\"", kv.getKeyValueString());
    }

    @Test
    public void doubleNumberValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("doublekey");
        kv.setValue(10.05);
        assertEquals("\"doublekey\":" + 10.05, kv.getKeyValueString());
    }

    @Test
    public void longNumberValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("longkey");
        kv.setValue(100001l);
        assertEquals("\"longkey\":" + 100001, kv.getKeyValueString());
    }

    @Test
    public void integerNumberValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("intkey");
        kv.setValue(100);
        assertEquals("\"intkey\":" + 100, kv.getKeyValueString());
    }

    @Test
    public void booleanTrueValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("booleankey");
        kv.setValue(true);
        assertEquals("\"booleankey\":" + true, kv.getKeyValueString());
    }

    @Test
    public void booleanFalseValueTest() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("booleankey");
        kv.setValue(false);
        assertEquals("\"booleankey\":" + false, kv.getKeyValueString());
    }
}
