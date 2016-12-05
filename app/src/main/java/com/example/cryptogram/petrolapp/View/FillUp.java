package com.example.cryptogram.petrolapp.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cryptogram.petrolapp.R;

import java.util.Date;

public class FillUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_up);

    }

    public void onClick(View view){

        EditText date = (EditText) findViewById(R.id.date);
        EditText odometer = (EditText) findViewById(R.id.odometer);
        EditText amount = (EditText) findViewById(R.id.amount);
        EditText price = (EditText) findViewById(R.id.price);
        CheckBox fillup = (CheckBox) findViewById(R.id.fillupcheckbox);

        switch(view.getId()){

            case R.id.submit:
                if(date.getText().toString().isEmpty() ){
                    Toast.makeText(this, "Please fill in the Data", Toast.LENGTH_SHORT).show();
                }else if(odometer.getText().toString().isEmpty()){
                    Toast.makeText(this, "Please fill in the Odometer", Toast.LENGTH_SHORT).show();
                }else if(amount.getText().toString().isEmpty()){
                    Toast.makeText(this, "Please fill in the amount", Toast.LENGTH_SHORT).show();
                }else if(price.getText().toString().isEmpty()){
                    Toast.makeText(this, "Please fill in the price", Toast.LENGTH_SHORT).show();
                }else{

                    //all is filled in...
                        //vailedate data


                }
                break;
            case R.id.cancel:
                date.setText(null);
                odometer.setText(null);
                amount.setText(null);
                price.setText(null);
                fillup.setChecked(false);
                Toast.makeText(this, "Fill Up canceled", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
