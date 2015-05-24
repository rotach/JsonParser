package ch.rot.json;

public class JsonKeyValue {
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(Boolean v) {
        value = new JsonBooleanValue(v);
    }

    public void setValue(Integer i) {
        value = new JsonNumberValue(i);
    }

    public void setValue(Long l) {
        value = new JsonNumberValue(l);
    }

    public void setValue(Double d) {
        value = new JsonNumberValue(d);
    }

    public void setValue(String s) {
        value = new JsonStringValue(s);
    }

    public void setValue(JsonObjectValue ov) { value = ov; }

    private String key;
    private JsonValue value;

    public String getKeyValueString() {
        String s = "";
        if (value.getClass() == JsonStringValue.class) {
            s +=  "\"" + key + "\":\"" + value.getValueString() + "\"";
        } else if (value.getClass() == JsonBooleanValue.class) {
            s +=  "\"" + key + "\":" + value.getValueString();
        } else if (value.getClass() == JsonNumberValue.class) {
            s +=  "\"" + key + "\":" + value.getValueString();
        } else if (value.getClass() == JsonObjectValue.class) {
            s +=  "\"" + key + "\":" + value.getValueString();
        }
        return s;
    }
}
