package examplewtest.midopc.ezzappdepartments;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
import examplewtest.midopc.ezzappdepartments.POJO.Models.Model;

/**
 * Created by Mido PC on 4/4/2016.
 */
public class MainAdb extends RecyclerView.Adapter<MainAdb.VH> {

    public MainAdb(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    private List<Model>models;
    Context context;
    final String URL="http://mobileapp.ezzmedicalcare.com/";


    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false));
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        Picasso.with(holder.itemView.getContext()).load(URL+models.get(position).getImg()).into(holder.imageView);
        holder.imageView.setBorderWidth(4);
        holder.imageView.setBorderColor(holder.itemView.getResources().getColor(R.color.colorAccent));
        holder.textView.setText(models.get(position).getNameArabic());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }











    public static class VH extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView textView;

        public VH(View itemView) {
            super(itemView);
            imageView=(CircleImageView)itemView.findViewById(R.id.pic);
            textView=(TextView)itemView.findViewById(R.id.txt);
        }


    }







}
