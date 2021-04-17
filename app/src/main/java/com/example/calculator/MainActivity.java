package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,
            btn_9, btn_add, btn_sub, btn_mul, btn_div,
            btn_result, btn_dot, btn_clear;
    EditText txt;
    float num1, num2;

    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn0);
        btn_1 = (Button) findViewById(R.id.btn1);
        btn_2 = (Button) findViewById(R.id.btn2);
        btn_3 = (Button) findViewById(R.id.btn3);
        btn_4 = (Button) findViewById(R.id.btn4);
        btn_5 = (Button) findViewById(R.id.btn5);
        btn_6 = (Button) findViewById(R.id.btn6);
        btn_7 = (Button) findViewById(R.id.btn7);
        btn_8 = (Button) findViewById(R.id.btn8);
        btn_9 = (Button) findViewById(R.id.btn9);
        btn_clear = (Button) findViewById(R.id.c);
        btn_add = (Button) findViewById(R.id.sum);
        btn_sub = (Button) findViewById(R.id.sub);
        btn_mul = (Button) findViewById(R.id.mul);
        btn_div = (Button) findViewById(R.id.div);
        btn_dot = (Button) findViewById(R.id.dot);
        btn_result = (Button) findViewById(R.id.result);
        txt = (EditText) findViewById(R.id.textD);







        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+".");
            }
        });


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt == null){
                    txt.setText("");
                }else {
                    num1 = Float.parseFloat(txt.getText() + "");
                    mAddition = true;
                    txt.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(txt.getText() + "");
                mSubtract = true ;
                txt.setText(null);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(txt.getText() + "");
                mMultiplication = true ;
                txt.setText(null);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(txt.getText()+"");
                mDivision = true ;
                txt.setText(null);
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(txt.getText() + "");

                if (mAddition == true){

                    txt.setText(num1 + num2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    txt.setText(num1 - num2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    txt.setText(num1 * num2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    txt.setText(num1 / num2+"");
                    mDivision=false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
            }
        });

    }
}