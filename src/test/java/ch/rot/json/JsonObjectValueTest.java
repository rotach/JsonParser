package ch.rot.json;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class JsonObjectValueTest {

    @Test
    public void objectValueOneStringTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("stringkey");
        kv.setValue("stringvalue");
        ov.addJsonKeyValue(kv);
        assertEquals("{\"stringkey\":\"stringvalue\"}", ov.getValueString());
    }

    @Test
    public void objectValueTwoStringTest() {
        JsonObjectValue ov = new JsonObjectValue();

        JsonKeyValue kv1 = new JsonKeyValue();
        kv1.setKey("stringkey1");
        kv1.setValue("stringvalue1");
        ov.addJsonKeyValue(kv1);

        JsonKeyValue kv2 = new JsonKeyValue();
        kv2.setKey("stringkey2");
        kv2.setValue("stringvalue2");
        ov.addJsonKeyValue(kv2);

        assertEquals("{\"stringkey1\":\"stringvalue1\",\"stringkey2\":\"stringvalue2\"}", ov.getValueString());
    }

    @Test
    public void objectValueTenStringTest() {
        JsonObjectValue ov = new JsonObjectValue();

        for(Integer i=0; i<10; i++) {
            JsonKeyValue kv = new JsonKeyValue();
            kv.setKey("stringkey" + i);
            kv.setValue("stringvalue" + i);
            ov.addJsonKeyValue(kv);
        }

        StringBuilder expectedStringSB = new StringBuilder();
        expectedStringSB.append("{");

        for(Integer i=0; i<10; i++) {
            expectedStringSB.append("\"stringkey");
            expectedStringSB.append(i);
            expectedStringSB.append("\":\"stringvalue");
            expectedStringSB.append(i);
            expectedStringSB.append("\"");
            expectedStringSB.append(",");
        }
        expectedStringSB.deleteCharAt(expectedStringSB.length()-1);
        expectedStringSB.append("}");

        assertEquals(expectedStringSB.toString(), ov.getValueString());
    }

    @Test
    public void objectValueOneIntegerTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("intkey");
        kv.setValue(10);
        ov.addJsonKeyValue(kv);
        assertEquals("{\"intkey\":10}", ov.getValueString());
    }

    @Test
    public void objectValueOneDoubleTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("doublekey");
        kv.setValue(10.05);
        ov.addJsonKeyValue(kv);
        assertEquals("{\"doublekey\":10.05}", ov.getValueString());
    }

    @Test
    public void objectValueOneIntegerOneDoubleTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue ikv = new JsonKeyValue();
        ikv.setKey("intkey");
        ikv.setValue(10);
        ov.addJsonKeyValue(ikv);
        JsonKeyValue dkv = new JsonKeyValue();
        dkv.setKey("doublekey");
        dkv.setValue(10.05);
        ov.addJsonKeyValue(dkv);
        assertEquals("{\"intkey\":10,\"doublekey\":10.05}", ov.getValueString());
    }

    @Test
    public void objectValueOneBooleanTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue kv = new JsonKeyValue();
        kv.setKey("booleankey");
        kv.setValue(true);
        ov.addJsonKeyValue(kv);
        assertEquals("{\"booleankey\":true}", ov.getValueString());
    }

    @Test
    public void objectValueTwoBooleanTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue tkv = new JsonKeyValue();
        tkv.setKey("truekey");
        tkv.setValue(true);
        ov.addJsonKeyValue(tkv);
        JsonKeyValue fkv = new JsonKeyValue();
        fkv.setKey("falsekey");
        fkv.setValue(false);
        ov.addJsonKeyValue(fkv);
        assertEquals("{\"truekey\":true,\"falsekey\":false}", ov.getValueString());
    }

    @Test
    public void objectValueStringNumberBooleanTest() {
        JsonObjectValue ov = new JsonObjectValue();
        JsonKeyValue bkv = new JsonKeyValue();
        bkv.setKey("truekey");
        bkv.setValue(true);
        ov.addJsonKeyValue(bkv);
        JsonKeyValue ikv = new JsonKeyValue();
        ikv.setKey("intkey");
        ikv.setValue(10);
        ov.addJsonKeyValue(ikv);
        JsonKeyValue sv1 = new JsonKeyValue();
        sv1.setKey("stringkey");
        sv1.setValue("stringvalue");
        ov.addJsonKeyValue(sv1);
        assertEquals("{\"truekey\":true,\"intkey\":10,\"stringkey\":\"stringvalue\"}", ov.getValueString());
    }

}
