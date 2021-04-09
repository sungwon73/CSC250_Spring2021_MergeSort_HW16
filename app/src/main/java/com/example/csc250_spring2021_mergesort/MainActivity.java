package com.example.csc250_spring2021_mergesort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);

        class DoFactorial{
            public static long makeFact(int n){
                long result = 0;
                if(n == 1){
                    result = 1;
                }else{
                    result = n * makeFact(n-1);
                }
                return result;
            }
            public static void main(String[] args){
                long result = makeFact(5);
                System.out.println(result);
            }
        }

    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        this.answerTV.setText(currValue);


    }


}