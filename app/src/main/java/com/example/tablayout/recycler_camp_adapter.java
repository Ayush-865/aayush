package com.example.camps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycler_camp_adapter extends RecyclerView.Adapter<recycler_camp_adapter.ViewHolder> {

    Context context;
    ArrayList<camp_str> arrcamps;
    recycler_camp_adapter(Context context, ArrayList<camp_str> arrcamps){
        this.context=context;
        this.arrcamps=arrcamps;
    }

    @NonNull
    @Override
    public recycler_camp_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.camps_card,parent,false);
        ViewHolder viewHolder= new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycler_camp_adapter.ViewHolder holder, int position) {
        holder.img.setImageResource(arrcamps.get(position).img);
        holder.name.setText(arrcamps.get(position).name);
        holder.loc.setText(arrcamps.get(position).loc);
        holder.num.setText(arrcamps.get(position).img);
        holder.regi.setText(arrcamps.get(position).regi);
        //ye vaale is file ke ha                // ye vaale camps_str ke hai
    }

    @Override
    public int getItemCount() {
        return arrcamps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,loc,num,regi;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            loc=itemView.findViewById(R.id.loc);
            num=itemView.findViewById(R.id.num);
            regi=itemView.findViewById(R.id.regi);
            img=itemView.findViewById(R.id.img);
        }
    }
}
