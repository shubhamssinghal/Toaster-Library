package com.algoworks.toasterlibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LibActivity extends AppCompatActivity {


    EditText edt1,edt2,edt3;
    Button btn1;
    String a,b,c;
    int d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(LibActivity.this,edt1,edt2,edt3);
            }
        });

    }

    public void buttonClick(Context context, final EditText edt1, final EditText edt2,final EditText edt3)
    {
        a=edt1.getText().toString();
        b=edt2.getText().toString();
        c=edt3.getText().toString();
            if (a.equalsIgnoreCase(""))
            {
                Toast.makeText(context, "Enter first number", Toast.LENGTH_SHORT).show();
                edt1.requestFocus();
            }
            else
            {
                if (b.equalsIgnoreCase(""))
                {
                    Toast.makeText(context, "Enter second number", Toast.LENGTH_SHORT).show();
                    edt2.requestFocus();
                }
                else
                {
                    if (c.equalsIgnoreCase(""))
                    {
                        Toast.makeText(context, "Enter third number", Toast.LENGTH_SHORT).show();
                        edt3.requestFocus();
                    }
                    else
                    {
                        d=Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c);
                        Toast.makeText(context, "Sum : "+d, Toast.LENGTH_SHORT).show();
                    }

                }
            }
    }

}
