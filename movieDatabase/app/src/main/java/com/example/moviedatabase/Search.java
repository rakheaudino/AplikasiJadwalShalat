package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Search extends AppCompatActivity {
    ListView listView;
    private List<MovieItem> movieItemList;
    private String query;
    private String KEY_QUERY = "JADWAL SHALAT";

    private JsonPlaceHolderApi jsonPlaceHolderApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView = findViewById(R.id.listView);
        movieItemList = new ArrayList<>();

        Bundle getData = getIntent().getExtras();
        query = getData.getString("KEY_QUERY");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rest.farzain.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        getPost();
//        getComment();
    }

    private void getPost() {

        Call<Post> call = jsonPlaceHolderApi.getPost("VDePMJfESle8tugwY1OnVRTD0",query);

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
//                if(!response.isSuccessful()) {
//                    textViewResult.setText("Code :" + response.code());
//                    return;
//                }

                Post post = response.body();
                Respon result = post.getRespon();

                    MovieItem movieItem = new MovieItem(
                            "Shubuh : " + result.getShubuh(),
                            "Zuhur : " + result.getDzuhur(),
                            "Ashar : " + result.getAshar(),
                            "Magrib : " + result.getMaghrib(),
                            "Isya : " + result.getIsya());

                    movieItemList.add(movieItem);


                ListViewAdapter adapter = new ListViewAdapter(movieItemList, getApplicationContext());
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
//                textViewResult.setText(t.getMessage());
            }
        });
    }
}