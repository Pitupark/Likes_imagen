package com.example.user.likes_imagen;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ImageButton imgbtn, imgbtn1;
private TextView et2,et4,et6;
    int contador = 0;
    int contador2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn = (ImageButton)findViewById(R.id.imgbtn);
        imgbtn1 = (ImageButton)findViewById(R.id.imgbtn1);
        et2 = (TextView)findViewById(R.id.et2);
        et4 = (TextView)findViewById(R.id.et4);
        et6 = (TextView)findViewById(R.id.et6);

        imgbtn.setOnClickListener(this);
        imgbtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==imgbtn){

            contador++;

            et2.setText(" " + contador);

            et6.setText(" "+ (contador-contador2));
        }

        if(v==imgbtn1){

            contador2++;

            et4.setText(" "+ contador2);

            et6.setText(" "+ (contador-contador2));
        }
    }
}
