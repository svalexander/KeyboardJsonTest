package nyc.c4q.shannonalexander_navarro.keyboardjsontest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class KeyResponse {

    private boolean success;
    private List<Key> availableKeys = new ArrayList<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Key> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<Key> availableKeys) {
        this.availableKeys = availableKeys;
    }
}
