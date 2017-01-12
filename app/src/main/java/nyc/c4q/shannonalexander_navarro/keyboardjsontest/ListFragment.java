package nyc.c4q.shannonalexander_navarro.keyboardjsontest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.Key;
import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.KeyResponse;
import nyc.c4q.shannonalexander_navarro.keyboardjsontest.service.KeyService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public class ListFragment extends Fragment {

    RecyclerView keyListRV;
    LinearLayout fragLayout;
    KeyboardListAdapter keyListAdapter;
    List<Key> availableKeys = new ArrayList<>();
    private static final String KEY_URL = " http://jsjrobotics.nyc/";
    private static final String TAG = "success";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.list_fragment, container, false);

        fragLayout = (LinearLayout) root.findViewById(R.id.key_frag_layout);

        keyListRV = (RecyclerView) root.findViewById(R.id.key_rv);
        keyListRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

//        availableKeyNameTV.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), KeyboardActivity.class);
//                startActivity(intent);
//            }
//        });
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        getKeyJson();
    }

    private void getKeyJson() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(KEY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        KeyService service = retrofit.create(KeyService.class);

        Call<KeyResponse> call = service.getAllKeys();

        call.enqueue(new Callback<KeyResponse>() {
            @Override
            public void onResponse(Call<KeyResponse> call, Response<KeyResponse> response) {


                KeyResponse keyResponse = response.body();

                List<Key> returnedKeys = response.body().getKeys();
                availableKeys = returnedKeys;

                keyListAdapter = new KeyboardListAdapter(availableKeys);
                keyListRV.setAdapter(keyListAdapter);

                if (response.isSuccessful()) {

                    Log.d(TAG, "Success: " + keyResponse.getKeys().get(0).getName());
                } else {
                    try {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<KeyResponse> call, Throwable t) {
                Log.e("FAILURE", "GOT NOTHING" + t);

            }

        });
    }
}
