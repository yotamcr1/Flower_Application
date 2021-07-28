package com.flower_rec_pack.tflite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Welcom_page_activity extends AppCompatActivity {

    private Executor executor = Executors.newSingleThreadExecutor();
    private TextView textViewResult;
    private Button btnDetectObject;
    private ImageButton btn_about;
    private Button flower_list_button;
    private ImageView imageViewResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        btnDetectObject = findViewById(R.id.button2);
        btnDetectObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_main = new Intent(Welcom_page_activity.this, MainActivity.class);
                startActivity(intent_main);
            }
        });
        btn_about = findViewById(R.id.about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_about = new Intent(Welcom_page_activity.this, AboutActivity.class);
                startActivity(intent_about);
            }
        });
        flower_list_button = findViewById((R.id.flower_list_button));
        flower_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flower_list_intent = new Intent(Welcom_page_activity.this, flower_list_activity.class);
                startActivity(flower_list_intent);
            }
        });
    }
}

