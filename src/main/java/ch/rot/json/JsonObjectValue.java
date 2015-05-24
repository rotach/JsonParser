package ch.rot.json;

import java.util.ArrayList;

public class JsonObjectValue extends JsonValue {

    private ArrayList<JsonKeyValue> keyValueArray;

    public JsonObjectValue() {
        keyValueArray = new ArrayList<JsonKeyValue>();
    }

    public void addJsonKeyValue(JsonKeyValue kv) {
        keyValueArray.add(kv);
    }

    public JsonKeyValue removeJsonKeyValue() {
        return keyValueArray.remove(keyValueArray.size()-1);
    }

    public String getValueString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (JsonKeyValue kv : keyValueArray) {
            sb.append(kv.getKeyValueString());
            sb.append(",");
        }
        // trim off the final comma
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");

        return sb.toString();
    }
}
