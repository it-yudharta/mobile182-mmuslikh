package id.codemerindu.amalankuu;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("pasuruan.json")
    Call<ModelJadwal> getJadwal();

}