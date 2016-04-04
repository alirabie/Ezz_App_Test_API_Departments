package examplewtest.midopc.ezzappdepartments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import examplewtest.midopc.ezzappdepartments.API.GetApi;
import examplewtest.midopc.ezzappdepartments.POJO.Models.Contact_D;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Contacts extends AppCompatActivity {
     private TextView adress,phone,email,info;
     private ImageView header;
     final String URL="http://mobileapp.ezzmedicalcare.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        adress=(TextView)findViewById(R.id.adresstxt);
        phone=(TextView)findViewById(R.id.phonetxt);
        email=(TextView)findViewById(R.id.emailtxt);
        info=(TextView)findViewById(R.id.infotxt);
        header=(ImageView)findViewById(R.id.img_header);


        Retrofit retrofit=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        GetApi getApi=retrofit.create(GetApi.class);
        Call<List<Contact_D>>connection=getApi.getcontacts();
        connection.enqueue(new Callback<List<Contact_D>>() {
            @Override
            public void onResponse(Call<List<Contact_D>> call, Response<List<Contact_D>> response) {
                if(response.isSuccessful())
                  adress.setText("العنوان : "+response.body().get(0).getAddressArabic());
                  phone.setText("الهاتف : "+response.body().get(0).getPhone());
                  email.setText("الايميل : "+response.body().get(0).getEmail());
                  info.setText(response.body().get(0).getContentAr());

                Picasso.with(getApplicationContext()).load(URL+response.body().get(0).getImg()).into(header);
            }

            @Override
            public void onFailure(Call<List<Contact_D>> call, Throwable t) {

            }
        });


    }
}
