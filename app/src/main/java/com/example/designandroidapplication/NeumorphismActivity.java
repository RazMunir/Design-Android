package com.example.designandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.github.sshadkany.CircleButton;
import com.github.sshadkany.PolygonButton;
import com.github.sshadkany.RectButton;

public class NeumorphismActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neumorphism);

        CircleButton circle_button = findViewById(R.id.circle_image_button);
        circle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NeumorphismActivity.this, "Circular Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        CircleButton circle_txt_button = findViewById(R.id.circle_text_button);
        circle_txt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NeumorphismActivity.this, "Circular Text Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        RectButton rect_txt_button = findViewById(R.id.rec_text_button);
        rect_txt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NeumorphismActivity.this, "Rectangular Text Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        RectButton rec_image_button = findViewById(R.id.rec_image_button);
        rec_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NeumorphismActivity.this, "Rectangular Image Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        PolygonButton polygon_button = findViewById(R.id.polygon_button);
        polygon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NeumorphismActivity.this, "Polygon Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}