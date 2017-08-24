package com.example.robirb.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ROBI RB on 8/17/2017.
 */

public class SecondActivity extends AppCompatActivity {
    private Button button;

    private TextView tvName,tvEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = (TextView) findViewById(R.id.tv_name);
        tvEmail = (TextView) findViewById(R.id.tv_email);

        Intent intent = getIntent();

        String name = intent.getStringExtra("A");
        String email = intent.getStringExtra("B");

        tvName.setText(name);
        tvEmail.setText(email);

        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
