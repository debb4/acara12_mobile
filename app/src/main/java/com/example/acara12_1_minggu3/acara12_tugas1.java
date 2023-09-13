package com.example.acara12_1_minggu3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class acara12_tugas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara12_tugas1);
        Button button1 = findViewById(R.id.buttonlinear1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearlayout = new Intent(acara12_tugas1.this, Linear_Layout.class);
                startActivity(linearlayout);
            }
        });
        Button button2 = findViewById(R.id.buttonRelative);
        button2.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent relativelayout = new Intent(acara12_tugas1.this, Relative_Layout.class);
                startActivity(relativelayout);
            }
        });
        Button button3 =findViewById(R.id.buttonConstraint);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent constraintlayout = new Intent(acara12_tugas1.this,Constraint_Layout.class);
                startActivity(constraintlayout);
            }
        });
        Button button4 = findViewById(R.id.buttonTable);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tablelayout = new Intent(acara12_tugas1.this,Table_Layout.class);
                startActivity(tablelayout);
            }
        });
        Button button5 = findViewById(R.id.buttonMaterial);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent materialdesign = new Intent(acara12_tugas1.this, material_design.class);
                startActivity(materialdesign);
            }
        });
        Button button6 = findViewById(R.id.buttonMaterial1);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scrollview = new Intent(acara12_tugas1.this, Scroll_View.class);
                startActivity(scrollview);
            }
        });
        Button button7 = findViewById(R.id.buttonMaterial2);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scrollview2 = new Intent(acara12_tugas1.this, Scroll_View2.class);
                startActivity(scrollview2);
            }
        });
        Button button8 = findViewById(R.id.buttonFrame);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent framelayout = new Intent(acara12_tugas1.this, Frame_Layout.class);
                startActivity(framelayout);
            }
        });
    }
}