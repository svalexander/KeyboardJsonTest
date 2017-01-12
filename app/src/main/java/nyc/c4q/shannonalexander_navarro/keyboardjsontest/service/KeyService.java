package nyc.c4q.shannonalexander_navarro.keyboardjsontest.service;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.KeyResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shannonalexander-navarro on 1/11/17.
 */

public interface KeyService {

    @GET("cgi-bin/1_11_2017_exam.pl")
    Call<KeyResponse> getAllKeys();
}
