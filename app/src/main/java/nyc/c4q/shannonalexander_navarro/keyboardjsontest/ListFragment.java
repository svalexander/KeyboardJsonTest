package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.Key;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class ListFragment extends Fragment {

    RecyclerView keyListRV;
    LinearLayout fragLayout;
    KeyboardListAdapter keyListAdapter;
    List<Key> availableKeys = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.list_fragment, container, false);

        fragLayout = (LinearLayout) root.findViewById(R.id.key_frag_layout);

        keyListRV = (RecyclerView) root.findViewById(R.id.key_rv);
        keyListRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        keyListAdapter = new KeyboardListAdapter(availableKeys);
        keyListRV.setAdapter(keyListAdapter);

        return root;
    }
}
