package com.rku_18fotca11036.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.rku_18fotca11036.fragments.Fragments.FirstFragments;
import com.rku_18fotca11036.fragments.Fragments.SecondFragments;

public class MainActivity extends AppCompatActivity {

    Button btnRed,btnGreen;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGreen = findViewById(R.id.btnGreen);
        btnRed = findViewById(R.id.btnRed);
        linearLayout = findViewById(R.id.linearLayout);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragments firstFragments = new FirstFragments();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragments);
                transaction.commit();
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragments secondFragments = new SecondFragments();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,secondFragments);
                transaction.commit();
            }
        });
  
    }
}