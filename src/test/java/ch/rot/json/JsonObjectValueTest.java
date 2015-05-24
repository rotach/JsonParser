package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonObjectValueTest {

    @Test
    public void objectValueTest1() {
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("stringkey");
        kv.setValue("stringvalue");
        JsonObjectValue ov = new JsonObjectValue();
        ov.addJsonKeyValue(kv);
        assertEquals("{\"stringkey\":\"stringvalue\"}", ov.getValueString());
    }
}
