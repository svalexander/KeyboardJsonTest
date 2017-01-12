package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.graphics.Color;
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

        availableKeyNameTV = (TextView) itemView.findViewById(R.id.available_key_name_tv);
    }

    public void bind(Key aKey) {
        availableKeyNameTV.setText(aKey.getName());
        availableKeyNameTV.setTextColor(Color.parseColor(aKey.getTextColor()));


    }
}
