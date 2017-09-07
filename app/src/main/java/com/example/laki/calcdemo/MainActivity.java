package com.example.laki.calcdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


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

    //operations
    boolean plusOn=false;
    boolean dividOn=false;
    boolean multiOn=false;
    boolean subOn=false;

    //variables
    private double value1,value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.display);
        //clear button
        val02="";
        val01="";
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
            if(!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(TWO);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(TWO);
                display.setText(val02);
            }
        });

        //button 3
        Button three=(Button)findViewById(R.id.three);
        three.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(THREE);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(THREE);
                display.setText(val02);
            }
        });

        //button 4
        Button four=(Button)findViewById(R.id.four);
        four.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(FOUR);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(FOUR);
                display.setText(val02);
            }
        });

        //button 5
        Button five=(Button)findViewById(R.id.five);
        five.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(FIVE);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(FIVE);
                display.setText(val02);
            }
        });

        //button 6
        Button six=(Button)findViewById(R.id.six);
        six.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(SIX);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(SIX);
                display.setText(val02);
            }
        });

        //button 7
        Button seven=(Button)findViewById(R.id.seven);
        seven.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(SEVEN);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(SEVEN);
                display.setText(val02);
            }
        });

        //button 8
        Button eight=(Button)findViewById(R.id.eight);
        eight.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(EIGHT);
                display.setText(val01);
            }else {
                display.setText("");
                val02 += Integer.toString(EIGHT);
                display.setText(val02);
            }
        });

        //button 9
        Button nine=(Button)findViewById(R.id.nine);
        nine.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(NINE);
                display.setText(val01);
            }else {
                display.setText("");
                val02+= Integer.toString(NINE);
                display.setText(val02);
            }
        });

        //button 0
        Button zero=(Button)findViewById(R.id.zero);
        zero.setOnClickListener(e-> {
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += Integer.toString(ZERO);
                display.setText(val01);
            }else {
                display.setText("");
                val02+=Integer.toString(ZERO);
                display.setText(val02);
            }
        });

        //fractional
        Button dot=(Button)findViewById(R.id.dot);
        dot.setOnClickListener(e->{
            if (!dividOn & !multiOn & !plusOn & !subOn) {
                val01 += ".";
                display.setText(val01);
            }else {
                display.setText("");
                val02+=".";
                display.setText(val02);
            }

        });

        Button clearall=(Button)findViewById(R.id.allclear);
        clearall.setOnClickListener(e->{
            val01="";
            val02="";
            value1=Double.valueOf("0");
            value2=Double.valueOf("0");
            multiOn=false;
            plusOn=false;
            subOn=false;
            dividOn=false;
            display.setText("");
        });

        //addition
        Button add=(Button)findViewById(R.id.plus);
        add.setOnClickListener(e->{
            plusOn=true;
            try {
                value1=extractval(val01);
                display.setText("");
            }catch (NumberFormatException ex){
                display.setText("Number format Error");
            }

        });
        //multiplication
        Button multiply=(Button)findViewById(R.id.multi);
        multiply.setOnClickListener(e->{
            multiOn=true;
            try {
                value1=extractval(val01);
                display.setText("");
            }catch (NumberFormatException ex){
                display.setText("Number format Error");
            }
        });

        //subtraction
        Button sub=(Button)findViewById(R.id.minus);
        sub.setOnClickListener(e->{
           subOn =true;
            try {
                value1=extractval(val01);
                display.setText("");
            }catch (NumberFormatException ex){
                display.setText("Number format Error");
            }
        });

        //division

        Button div=(Button)findViewById(R.id.divition);
        div.setOnClickListener(e->{
            dividOn=true;
            try {
                value1=extractval(val01);
                display.setText("");
            }catch (NumberFormatException ex){
                display.setText("Number format Error");
            }
        });

        Button equal=(Button)findViewById(R.id.equal);
        equal.setOnClickListener(e->{
            actionOn(multiOn,subOn,dividOn,plusOn,display);

        });


    }

    private void actionOn(boolean multiOn, boolean subOn, boolean dividOn, boolean plusOn, TextView display) {
        try {
            double temp;
            value2=extractval(display.getText().toString());
            if(multiOn){
                 temp=value1*value2;
                String sTemp= extractIfNoFraction(temp);
                display.setText(sTemp);
            }else if(subOn){
                temp=value1-value2;
                String sTemp= extractIfNoFraction(temp);
                display.setText(sTemp);
            }else if(dividOn){
                if(value2==Double.valueOf("0")){
                    display.setText("Inf");
                }
                temp=value1/value2;
                String sTemp= extractIfNoFraction(temp);
                display.setText(sTemp);
            }else if(plusOn){
                temp=value1+value2;
                String sTemp= extractIfNoFraction(temp);
                display.setText(sTemp);
            }else {
                display.setText("");
            }

        }catch (NumberFormatException excp){
            display.setText("Err");
        }


    }

    private String extractIfNoFraction(double temp) {
        if(temp%1==0){
            return String.valueOf (new Double(temp).longValue());

        }else return Double.toString(temp);
    }


    private double extractval(String text) throws NumberFormatException {
        if(text==null){
            return extractval("0");
        }else {
            return Double.parseDouble(text);
        }
    }

    public void clicked_one(View view) {
        display= (TextView)findViewById(R.id.display);
        if(!plusOn & !dividOn & !multiOn & !subOn) {
            //display = (TextView) findViewById(R.id.display);
            val01 += Integer.toString(ONE);
            display.setText(val01);
        }else {
            val02 += Integer.toString(ONE);
            display.setText(val02);
        }
    }
}
