package ch.rot.json;

public class JsonNumberValue extends JsonValue {
    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    private Double val;

    public String getValueString() {
        // is val an integer value?
        if (val == val.longValue()) {
            return String.valueOf(val.longValue());
        } else {
            return String.valueOf(val);
        }
    }

    public JsonNumberValue(Long l) {
        this.val = l.doubleValue();
    }

    public JsonNumberValue(Integer i) {
        this.val = i.doubleValue();
    }

    public JsonNumberValue(Double d) {
        this.val = d;
    }

    public JsonNumberValue() {
        this.val = 0.0d;
    }
}
