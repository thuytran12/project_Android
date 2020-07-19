package com.example.senka;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    List<Product> itemList1;

    public ItemAdapter(List<Product> itemList) {
        this.itemList1=itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {

        holder.itemImage.setImageResource(itemList1.get(position).getImage());
        holder.itemtxt1.setText(itemList1.get(position).getName());
        holder.itemtxt2.setText(itemList1.get(position).getDes());
        holder.itemtxt3.setText(itemList1.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemtxt1,itemtxt2,itemtxt3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage=itemView.findViewById(R.id.itemImage);
            itemtxt1=itemView.findViewById(R.id.item_txt1);
            itemtxt2=itemView.findViewById(R.id.item_txt2);
            itemtxt3=itemView.findViewById(R.id.item_txt3);
        }
    }
}
