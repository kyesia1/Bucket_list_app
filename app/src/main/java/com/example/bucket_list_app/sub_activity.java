package com.example.bucket_list_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sub_activity extends AppCompatActivity {


    private EditText sub_Edit;
    private Button sub_Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_activity);


        Button sub_Btn=findViewById(R.id.sub_Btn);
        sub_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s
            }
        });



    }

}
