package com.example.acara12_1_minggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Relative_Layout extends AppCompatActivity {
    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView tvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        tvw=(TextView)findViewById(R.id.textView1);
        eText=(EditText)findViewById(R.id.editText1);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar tgl = Calendar.getInstance();
                int day = tgl.get(Calendar.DAY_OF_MONTH);
                int month = tgl.get(Calendar.MONDAY);
                int year = tgl.get(Calendar.YEAR);
                //date picker dialog
                picker = new DatePickerDialog(Relative_Layout.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYears, int dayOfMonth) {
                        eText.setText(dayOfMonth+ "/" +(monthOfYears + 1)+ "/" + +year);
                    }
                }, year, month, day);
                picker.show();
                {
                }
            }
        });
        btnGet = (Button) findViewById(R.id.button1);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvw.setText("Selected Date :"+eText.getText());
            }
        });
    }
}