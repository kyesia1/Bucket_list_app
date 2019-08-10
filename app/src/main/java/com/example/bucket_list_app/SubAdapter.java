package com.example.bucket_list_app;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubAdapter extends RecyclerView.Adapter<SubAdapter.CustomViewHolder> {


    private EditText sub_Edit;
    private Button sub_Btn;

    private ArrayList<MainData> list;

    public SubAdapter(ArrayList<MainData> list) {
        this.list = list;
    }



    @NonNull
    @Override
    public SubAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        SubAdapter.CustomViewHolder holder= new SubAdapter.CustomViewHolder(view);

        return holder;
    }


    public void onBindViewHolder(@NonNull final SubAdapter.CustomViewHolder holder, int position) {
        holder.CV_image.setImageResource(list.get(position).getCV_image());
        holder.Cv_TextView_title.setText(list.get(position).getCv_TextView_content());
        holder.Cv_TextView_importation.setText(list.get(position).getCv_TextView_importation());
        holder.Cv_TextView_Dday.setText(list.get(position).getCv_TextView_Dday());
        holder.Cv_TextView_content.setText(list.get(position).getCv_TextView_content());



    }

    @Override
    public int getItemCount() {
        return (null!=list ? list.size():0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView CV_image;
        protected TextView Cv_TextView_title;
        protected TextView Cv_TextView_content;
        protected TextView Cv_TextView_importation;
        protected TextView Cv_TextView_Dday;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.CV_image=(ImageView)itemView.findViewById(R.id.CV_image);
            this.Cv_TextView_content=(TextView)itemView.findViewById(R.id.Cv_TextView_content);
            this.Cv_TextView_Dday=(TextView)itemView.findViewById(R.id.Cv_TextView_Dday);
            this.Cv_TextView_importation=(TextView)itemView.findViewById(R.id.Cv_TextView_importation);
            this.Cv_TextView_title=(TextView)itemView.findViewById(R.id.Cv_TextView_title);

        }
    }
}

