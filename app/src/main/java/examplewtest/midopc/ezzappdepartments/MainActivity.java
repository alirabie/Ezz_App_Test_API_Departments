package examplewtest.midopc.ezzappdepartments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import examplewtest.midopc.ezzappdepartments.API.GetApi;
import examplewtest.midopc.ezzappdepartments.POJO.Models.Model;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);













        //Get Data from Service
        final String URL="http://mobileapp.ezzmedicalcare.com/";
        Retrofit retrofit=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        GetApi getApi=retrofit.create(GetApi.class);
        Call<List<Model>> connection=getApi.getdepartments();
        connection.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {






                if (response.isSuccessful()) {


                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                    MainAdb mainAdb = new MainAdb(response.body(), getApplicationContext());
                    recyclerView.setAdapter(mainAdb);
                    // Log.d("lllxlxllxlxlx", models.get(1).getNameArabic());


                }

            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.d("kkkkkkkkkkkkkkkkkkkkk", "nnnnnnnnnnnnnnnnnnnnnnn");
            }
        });
























    }
}
