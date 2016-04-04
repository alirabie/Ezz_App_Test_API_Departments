package examplewtest.midopc.ezzappdepartments.API;

import java.util.List;

import examplewtest.midopc.ezzappdepartments.POJO.Models.Contact_D;
import examplewtest.midopc.ezzappdepartments.POJO.Models.Model;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Mido PC on 4/4/2016.
 */
public interface GetApi {

@GET("providers/departments")
Call<List<Model>>getdepartments();

 @GET("providers/contacts")
 Call<List<Contact_D>>getcontacts();

}
