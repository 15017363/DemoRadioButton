package com.example.a15017363.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
//
//    Button btn;
//    RadioButton RadiobtnDo;
//    RadioButton RadiobtnRe;
//    RadioButton RadiobtnMi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn =(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the RadioGroup object
                RadioGroup rg = (RadioGroup)findViewById(R.id.radiogroup);

                //Get the id of the selected radio button in the RadioGroup
                int selectedButtonid = rg.getCheckedRadioButtonId();

                //Get the radio button object from the Id we have gotten above
                RadioButton rb = (RadioButton)findViewById(selectedButtonid);

                //Show a toast that display the text on the selected radio button
                Toast.makeText(getBaseContext(), rb.getText(),
                        Toast.LENGTH_LONG).show();


            }
        });


    }
}
