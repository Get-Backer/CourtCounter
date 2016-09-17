package com.example.ganesh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//check comments
public class MainActivity extends AppCompatActivity {

    int countA = 0;
    int countB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateCount(View view){
        String s;
        if(view.getId() == R.id.team_A_2){
            countA = countA + 2;
            s = "A";
            updateDisplay(countA, s);
        }else if(view.getId() == R.id.team_A_3){
            countA = countA + 3;
            s = "A";
            updateDisplay(countA, s);
        }else if(view.getId() == R.id.team_A_free){
            countA = countA + 1;
            s = "A";
            updateDisplay(countA, s);
        }else if(view.getId() == R.id.team_B_2){
            countB = countB + 2;
            s = "B";
            updateDisplay(countB, s);
        }else if(view.getId() == R.id.team_B_3){
            countB = countB + 3;
            s = "B";
            updateDisplay(countB, s);
        }else if(view.getId() == R.id.team_B_free){
            countB = countB + 1;
            s = "B";
            updateDisplay(countB, s);
        }else{
            countA = 0;
            countB = 0;
            updateDisplay(0, "R");
        }
    }

    public void updateDisplay(int num, String s){
        if(s == "A"){
            TextView disp = (TextView) findViewById(R.id.team_A_score);
            disp.setText(String.valueOf(num));
        }else if(s == "B"){
            TextView disp = (TextView) findViewById(R.id.team_B_score);
            disp.setText(String.valueOf(num));
        }else{
            TextView dispA = (TextView) findViewById(R.id.team_A_score);
            TextView dispB = (TextView) findViewById(R.id.team_B_score);
            dispA.setText(String.valueOf(num));
            dispB.setText(String.valueOf(num));
        }

    }
}
