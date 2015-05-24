package ch.rot.json;

public class JsonBooleanValue extends JsonValue {
    public Boolean getVal() {
        return val;
    }

    public void setVal(Boolean val) {
        this.val = val;
    }

    private Boolean val;

    public String getValueString() {
        if (val) {
            return "true";
        } else {
            return "false";
        }
    }

    public JsonBooleanValue() {
        this.val = true;
    }

    public JsonBooleanValue(Boolean b) {
        this.val = b;
    }
}
