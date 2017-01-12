package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.content.Context;
import android.content.Intent;
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
    private final Context context;

    public KeyboardListViewHolder(View itemView) {
        super(itemView);

        context = itemView.getContext();
        availableKeyNameTV = (TextView) itemView.findViewById(R.id.available_key_name_tv);
    }

    public void bind(Key aKey) {
        availableKeyNameTV.setText(aKey.getName());
        availableKeyNameTV.setTextColor(Color.parseColor(aKey.getTextColor()));

        availableKeyNameTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, KeyboardActivity.class);
                context.startActivity(intent);
            }
        });

    }

}
