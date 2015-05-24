package ch.rot.json;

public class JsonStringValue extends JsonValue {
    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    private String val;

    public String getValueString() {
        return val;
    }

    JsonStringValue() {
        this.val = "";
    }

    public JsonStringValue(String s) {
        this.val = s;
    }
}
