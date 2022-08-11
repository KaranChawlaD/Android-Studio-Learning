package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        EditText edtTxtFirstName = findViewById(R.id.firName);

        TextView txtLastname = findViewById(R.id.txtLastName);
        EditText edtTxtLastName = findViewById(R.id.lasName);

        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText edtTxtEmail = findViewById(R.id.email);

        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastname.setText("Last Name: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }
}