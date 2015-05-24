package ch.rot.json;

import java.util.ArrayList;

public class JsonObjectValue extends JsonValue {

    private ArrayList<JsonKeyValue> array;

    public void addJsonKeyValue(JsonKeyValue kv) {
        array.add(kv);
    }

    public JsonKeyValue removeJsonKeyValue() {
        return array.remove(array.size()-1);
    }

    public String getValueString() {
        //TODO: string builder
        String s = "{";
        for (JsonKeyValue kv : array) {
            s += kv.getKeyValueString() + ",";
        }
        // trim off the final comma
        s.substring(0,s.length()-1);
        s += "}";
        return s;
    }
}
