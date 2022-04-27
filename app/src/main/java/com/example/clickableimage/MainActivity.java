package com.example.clickableimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Blockclaindeveloper,Androiddeveloper,Fullstackdeveloper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Blockclaindeveloper=findViewById(R.id.blockchain);
        Androiddeveloper=findViewById(R.id.android);
        Fullstackdeveloper=findViewById(R.id.fullstack);

        Blockclaindeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Blockchain.class);
                startActivity(intent);


            }
        });
        Androiddeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,Android.class);
                    startActivity(intent);

            }
        });
        Fullstackdeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent intent=new Intent(MainActivity.this,Fullstack.class);
                        startActivity(intent);
            }
        });
    }
}