package com.algoworks.toasterlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LibActivity extends AppCompatActivity {


    EditText edt1,edt2;
    Button btn1;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);

    }


    public void buttonClick(Button btn1, final EditText edt1, final EditText edt2)
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().toString().equalsIgnoreCase(""))
                {
                    Toast.makeText(LibActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a=Integer.parseInt(edt1.getText().toString());

                    if (edt1.getText().toString().equalsIgnoreCase(""))
                    {
                        Toast.makeText(LibActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        b=Integer.parseInt(edt2.getText().toString());

                        c=a+b;
                        Toast.makeText(LibActivity.this, "Sum : "+c, Toast.LENGTH_SHORT).show();
                    }

                }



            }
        });

    }

}
