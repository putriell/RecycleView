package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private final ArrayList<Berita> listBerita;
    private Context context;

    public ListAdapter(ArrayList<Berita> list) {
        this.listBerita = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Berita berita = listBerita.get(position);
        Glide.with(holder.itemView.getContext())
                .load(berita.getImage())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.image);
        holder.title.setText(berita.getTittle());
        holder.Desc.setText(berita.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                Bundle bundle = new Bundle();

                bundle.putString("tittle", berita.getTittle());
                bundle.putString("desc", berita.getDesc());
                bundle.putInt("image", berita.getImage());
                intent.putExtras(bundle);
                context.startActivity(intent);

                Toast.makeText(holder.itemView.getContext(), "" + listBerita.get(holder.getAdapterPosition()).getTittle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title, Desc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            image = itemView.findViewById(R.id.image2);
            title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.description);
        }
    }
}
