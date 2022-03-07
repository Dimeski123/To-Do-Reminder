package com.ndimeski.searchquery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnOnClick(View view){
        LinearLayout linearLayout = findViewById(R.id.layoutView);
        EditText edtTxtNewTask = findViewById(R.id.edtTxtNewTask);
        TextView txtView = new TextView(this);
        txtView.setText(edtTxtNewTask.getText().toString());
        txtView.setTextSize(20);
        txtView.setPadding(20, 50, 20, 50);
        txtView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        linearLayout.addView(txtView);
        Button btnDelete = new Button(this);
        btnDelete.setText("Delete");
        linearLayout.addView(btnDelete);
        edtTxtNewTask.setText("");
        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                linearLayout.removeView(txtView);
                linearLayout.removeView(btnDelete);
            }
        });


    }
}