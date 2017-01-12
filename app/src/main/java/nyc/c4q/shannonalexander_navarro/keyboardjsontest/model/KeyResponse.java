package nyc.c4q.shannonalexander_navarro.keyboardjsontest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class KeyResponse {

     boolean success;
    @SerializedName("available keys")
     List<Key> keys = new ArrayList<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }
}
