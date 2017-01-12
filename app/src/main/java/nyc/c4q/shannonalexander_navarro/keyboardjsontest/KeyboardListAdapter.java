package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.Key;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class KeyboardListAdapter  extends RecyclerView.Adapter{

    List<Key> availableKeys = new ArrayList<>();

    public KeyboardListAdapter(List<Key> availableKeys) {
        this.availableKeys = availableKeys;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.key_frag_item, parent, false);
        return new KeyboardListViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        KeyboardListViewHolder keyViewHolder = (KeyboardListViewHolder) holder;

        Key aKey = availableKeys.get(position);
        keyViewHolder.bind(aKey);
    }

    @Override
    public int getItemCount() {
        return availableKeys.size();
    }
}
