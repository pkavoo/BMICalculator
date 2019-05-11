package com.sendy.bmiapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    String value1, value2;
    Double val1, val2, BMI;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        tvResult=findViewById(R.id.textView);

    }

    public void calculateBMI(View view)
    {
        value1 = ed1.getText().toString();
        value2 = ed2.getText().toString();

        //Convert the string to double
        val1 = Double.parseDouble(value1);
        val2 = Double.parseDouble(value2);
        BMI=(val1/(val2*val2));
        if(BMI<15)
        {
            Toast.makeText(getApplicationContext(),"Very severly under weight", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is very severly underweight");
        }else if(BMI>=15 && BMI <=16)
        {
            Toast.makeText(getApplicationContext(),"Severly under weight", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is severly underweight");
        }
        else if(BMI>=16 && BMI <=18.5)
        {
            Toast.makeText(getApplicationContext(),"Under weight", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is underweight");
        }
        else if(BMI>=18.5 && BMI <=25)
        {
            Toast.makeText(getApplicationContext(),"Normal (Healthy weight)", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is Healthy weight");
        }
        else if(BMI>=25 && BMI <=30)
        {
            Toast.makeText(getApplicationContext(),"Overweight", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is overweight");
        }
        else if(BMI>=30 && BMI <=35)
        {
            Toast.makeText(getApplicationContext(),"Moderately obese", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is Moderately obese");
        }
        else if(BMI>=35 && BMI <=40)
        {
            Toast.makeText(getApplicationContext(),"Severly obese", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is Severly obese");
        }
        else if(BMI>40)
        {
            Toast.makeText(getApplicationContext(),"Very severly obese", Toast.LENGTH_SHORT).show();
            String finalresult = String.valueOf(BMI);
            tvResult.setText("Your BMI is "+finalresult+" and your health is Very severly obese");
        }
    }
}
