package com.example.aakas.basiccal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= findViewById(R.id.edittext1);
        e2= findViewById(R.id.edittext2);
        tv= findViewById(R.id.textview);
    }

    public void calculate(View view)
    {
      double a = Double.parseDouble(e1.getText().toString());
      double b = Double.parseDouble(e2.getText().toString());
      double c;
      int id= view.getId();
      if(id == R.id.addbutton)
      {
          c= a+b;
          tv.setText(c+"");
      }
      else if(id == R.id.subtractbutton)
      {
          c= a-b;
          tv.setText(c+"");
      }
      else if(id == R.id.multiplybutton)
      {
         c = a*b;
         tv.setText(c+"");
      }
      else if(id == R.id.divbutton)
      {
          c = a/b;
          tv.setText(c+"");
      }
    }
}
