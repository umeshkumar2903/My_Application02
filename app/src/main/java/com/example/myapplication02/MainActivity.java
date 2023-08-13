package com.example.myapplication02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spTo);
        b1 = findViewById(R.id.btn1);


        String[] from = {"USD","Srilankan Rupees","Pakistani Rupees" , "Rubel " , "Euro" , "Pound"};
        ArrayAdapter ad = new ArrayAdapter<String>(this ,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , from);
        sp1.setAdapter(ad);


        String[] to = {"Indian Rupees","Srilankan Rupees", "Pakistani Rupees" , "Rubel " , "Euro" , "Pound" ,"quwait " ,"USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this ,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt * 82.60;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Rubel")
                {
                    tot = amt * 97.42;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Pakistani Rupees")
                {
                    tot = amt * 287.60;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Srilankan Rupees")
                {
                    tot = amt * 179.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.91;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Pound")
                {
                    tot = amt * 0.78;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }


//                srilankan


                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt * 0.26;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt * 0.0031;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Rubel")
                {
                    tot = amt * 0.30;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Pakistani Rupees")
                {
                    tot = amt * 0.90;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.0028;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Srilankan Rupees" && sp2.getSelectedItem().toString() == "Pound")
                {
                    tot = amt * 0.0025;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

//                pakistani rupees

                else if(sp1.getSelectedItem().toString() == "Pakistani Rupees" && sp2.getSelectedItem().toString() == "Indian Rupees")
                {
                    tot = amt * 0.29;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString() == "Pakistani Rupees" && sp2.getSelectedItem().toString() == "USD")
                {
                    tot = amt * 0.0035;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Pakistani Rupees" && sp2.getSelectedItem().toString() == "Rubel")
                {
                    tot = amt * 0.34;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Pakistani Rupees" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.0032;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "Pakistani Rupees" && sp2.getSelectedItem().toString() == "Pound")
                {
                    tot = amt * 0.0027;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}