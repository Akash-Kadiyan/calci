package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum,sub,mul,div;
    EditText num2,num1;
    TextView txt1;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum=(Button)findViewById(R.id.sum);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        txt1=(TextView) findViewById(R.id.txt1);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString().trim());
                b=Integer.parseInt(num2.getText().toString().trim());
                int c;
                c=a+b;
                txt1.setText(Integer.toString(c));
            }

        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString().trim());
                b=Integer.parseInt(num2.getText().toString().trim());
                int c;
                c=a/b;
                txt1.setText(Integer.toString(c));
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString().trim());
                b=Integer.parseInt(num2.getText().toString().trim());
                int c;
                c=a-b;
                txt1.setText(Integer.toString(c));
            }

        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString().trim());
                b=Integer.parseInt(num2.getText().toString().trim());
                int c;
                c=a*b;
                txt1.setText(Integer.toString(c));
            }

        });
    }
}