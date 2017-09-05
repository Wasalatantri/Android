package com.example.laki.calcdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String first_val;
    private final int ONE=1;
    private final int TWO=2;
    private final int THREE=3;
    private final int FOUR=4;
    private final int FIVE=5;
    private final int SIX=6;
    private final int SEVEN=7;
    private final int EIGHT=8;
    private final int NINE=9;
    private final int ZERO=0;

    private TextView display;
    private String val01 ="";
    private String val02 ="";
    boolean plusOn=false;
    boolean dividOn=false;
    boolean multiOn=false;
    boolean minusOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.display);
        //clear button
        Button clear=(Button)findViewById(R.id.clear);
        clear.setOnClickListener(e->{
           // display=(TextView)findViewById(R.id.display);
            display.setText("");
            val01 ="";
            val02 ="";
        });

        //button 2
        Button two=(Button)findViewById(R.id.two);
        two.setOnClickListener(e->{
            if(!dividOn | !multiOn |!plusOn) {
                val01 += Integer.toString(TWO);
                display.setText(val01);
            }
        });

        //button 3
        Button three=(Button)findViewById(R.id.three);
        three.setOnClickListener(e-> {
            if (!dividOn | !multiOn | !plusOn) {
                val01 += Integer.toString(THREE);
                display.setText(val01);
            }
        });

        //button 4
        Button four=(Button)findViewById(R.id.four);
        four.setOnClickListener(e-> {
            if (!dividOn | !multiOn | !plusOn) {
                val01 += Integer.toString(FOUR);
                display.setText(val01);
            }
        });

        //button 5
        Button five=(Button)findViewById(R.id.five);
        five.setOnClickListener(e-> {
            if (!dividOn | !multiOn | !plusOn) {
                val01 += Integer.toString(FIVE);
                display.setText(val01);
            }
        });

        //button 6
        Button six=(Button)findViewById(R.id.six);
        six.setOnClickListener(e-> {
            if (!dividOn | !multiOn | !plusOn) {
                val01 += Integer.toString(SIX);
                display.setText(val01);
            }
        });

        //button 7
        Button seven=(Button)findViewById(R.id.seven);
        seven.setOnClickListener(e-> {
            if (!dividOn |!multiOn |!plusOn) {
                val01 += Integer.toString(SEVEN);
                display.setText(val01);
            }
        });

        //button 8
        Button eight=(Button)findViewById(R.id.eight);
        eight.setOnClickListener(e-> {
            if (!dividOn|!multiOn|!plusOn) {
                val01 += Integer.toString(EIGHT);
                display.setText(val01);
            }
        });

        //button 9
        Button nine=(Button)findViewById(R.id.nine);
        nine.setOnClickListener(e-> {
            if (!dividOn |!multiOn |!plusOn) {
                val01 += Integer.toString(NINE);
                display.setText(val01);
            }
        });

        //button 0
        Button zero=(Button)findViewById(R.id.zero);
        zero.setOnClickListener(e-> {
            if (!dividOn |!multiOn |!plusOn) {
                val01 += Integer.toString(ZERO);
                display.setText(val01);
            }
        });

        Button clearall=(Button)findViewById(R.id.allclear);
        clearall.setOnClickListener(e->{
            val01="";
            val02="";
            display.setText("");
        });


    }

    public void clicked_one(View view) {
        //display= (TextView) view.findViewById(R.id.display);
        if(!plusOn |!dividOn |!multiOn |!minusOn) {
            display = (TextView) findViewById(R.id.display);
            val01 += Integer.toString(ONE);
            display.setText(val01);
        }
    }
}
