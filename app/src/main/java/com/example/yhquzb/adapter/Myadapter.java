package com.example.yhquzb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yhquzb.OhirActivity;
import com.example.yhquzb.R;
import com.example.yhquzb.interfaces.MyListener;
import com.example.yhquzb.model.ListData;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {
    private LayoutInflater inflater;

    private List<ListData> listData;
    private MyListener listener;
  private  Context context;
    public Myadapter(Context context, List<ListData> listData ) {
        this.inflater=LayoutInflater.from(context);
        this.listData = listData;
      if (context instanceof MyListener)
            listener= (MyListener) context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_cos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData item = listData.get(position);
        holder.name.setText(item.getName());
        holder.image.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        ImageView image;
        ViewHolder(View itemview) {
            super(itemview);
            itemview.setOnClickListener(this);

            name = itemView.findViewById(R.id.imageview);

            image = itemview.findViewById(R.id.rasm);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            ListData data = listData.get(position);
            // todo adapter ichidan hech qachon boshqa Activityni ochma
            listener.nextActivity(position);


        }

    }

}
