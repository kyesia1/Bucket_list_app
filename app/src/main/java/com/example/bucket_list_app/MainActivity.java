package com.example.bucket_list_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<MainData>list;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        recyclerView=(RecyclerView)findViewById(R.id.RV);
        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        list=new ArrayList<>();

        mainAdapter=new MainAdapter(list);
        recyclerView.setAdapter(mainAdapter);


        Button btn_add=(Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainData mainData=new MainData(R.mipmap.ic_launcher,"Title"
                        ,"contnet","improtation","D-day");

                list.add(mainData);
                mainAdapter.notifyDataSetChanged();
            }
        });


    }
}
