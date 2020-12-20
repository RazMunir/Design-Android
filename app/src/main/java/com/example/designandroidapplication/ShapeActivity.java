package com.example.designandroidapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ShapeActivity extends AppCompatActivity {

    LinearLayout containerLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        containerLinearLayout = findViewById(R.id.activity_shape_container_ll);
    }

    public void changeShapeAttributes(View view) {
        LayerDrawable shape = (LayerDrawable) ContextCompat.getDrawable(this, R.drawable.shape_round_stroke_shape);
        GradientDrawable gradientDrawable = (GradientDrawable) shape.findDrawableByLayerId(R.id.shape);

        //if you want to change radius of a shape
        gradientDrawable.setCornerRadius(100f);

        // if you want to change the color of background of textview dynamically
        gradientDrawable.setColor(ContextCompat.getColor(this, R.color.purple_700));

        // This is mangage the storke width and it's color by this shape.setStroke(strokeWidth,color);
        gradientDrawable.setStroke(5, ContextCompat.getColor(this, R.color.white));

        containerLinearLayout.setBackground(shape);
    }

    public void undoChangeShapeAttributes(View view) {
        LayerDrawable shape = (LayerDrawable) ContextCompat.getDrawable(this, R.drawable.shape_round_stroke_shape);
        GradientDrawable gradientDrawable = (GradientDrawable) shape.findDrawableByLayerId(R.id.shape);

        //if you want to change radius of a shape
        gradientDrawable.setCornerRadius(10f);

        // if you want to change the color of background of textview dynamically
        gradientDrawable.setColor(ContextCompat.getColor(this, R.color.white));

        // This is mangage the storke width and it's color by this shape.setStroke(strokeWidth,color);
        gradientDrawable.setStroke(5, ContextCompat.getColor(this, R.color.btn_color));

        containerLinearLayout.setBackground(shape);
    }
}