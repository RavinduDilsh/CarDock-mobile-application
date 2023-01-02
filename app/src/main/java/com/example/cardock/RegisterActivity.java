package com.example.cardock;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.transition.ScaleProvider;

import java.util.ArrayList;

public class RegisterActivity extends LoginActivity {

    Button reg;
    EditText manu, model, year, mile, trans, fuel, cap, loc, price;
    private boolean validationError=false;
    private static final String TAG = "RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_register);

        reg = (Button) findViewById(R.id.reg_btn);
        manu= (EditText) findViewById(R.id.man_text);
        model= (EditText) findViewById(R.id.model_text);
        year= (EditText) findViewById(R.id.year_text);
        mile = (EditText) findViewById(R.id.mile_text);
        trans = (EditText) findViewById(R.id.transmission_text);
        fuel= (EditText) findViewById(R.id.fuel_text);
        cap= (EditText) findViewById(R.id.capacity_text);
        loc = (EditText) findViewById(R.id.location_text);
        price =(EditText) findViewById(R.id.price_text);

        ArrayList<car>Car_details = new ArrayList<>();

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valid();
                if (validationError){
                    validationError = false;
                }else{
                    Car_details.add(new car(manu.getText().toString(), model.getText().toString(),year.getText().toString(),mile.getText().toString(), trans.getText().toString(),
                            fuel.getText().toString(), cap.getText().toString(),loc.getText().toString(),price.getText().toString()));
                    Toast.makeText(getApplicationContext(),"Car registration successful", Toast.LENGTH_SHORT).show();

                    Car_details.get(0).Display();
                }


            }
        });

    }

    public void valid(){
        if(manu.getText().toString().isEmpty()){
            manu.setError("Manufacturer should not be empty");
            validationError=true;
        }else if(model.getText().toString().isEmpty()){
            model.setError("Car model should not be empty");
            validationError=true;
        }else if(year.getText().toString().isEmpty()){
            year.setError("Manufactured year should not be empty");
            validationError=true;
        }else if(mile.getText().toString().isEmpty()){
            mile.setError("Mileage should not be empty");
            validationError=true;
        }else if(trans.getText().toString().isEmpty()){
            trans.setError("Transmission type should not be empty");
            validationError=true;
        }else if(fuel.getText().toString().isEmpty()) {
            fuel.setError("Fuel type should not be empty");
            validationError=true;
        }else if(cap.getText().toString().isEmpty()) {
            cap.setError("Car capacity should not be empty");
            validationError=true;
        }else if(loc.getText().toString().isEmpty()) {
            loc.setError("Location should not be empty");
            validationError=true;
        }else if(price.getText().toString().isEmpty()) {
            price.setError("Price should not be empty");
            validationError=true;
        }
    }

}


