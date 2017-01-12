package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.Key;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class KeyboardListViewHolder extends RecyclerView.ViewHolder {

    TextView availableKeyNameTV;

    public KeyboardListViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Key aKey) {
    }
}
