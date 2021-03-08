package com.example.app2higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int RandomNum=0;
public void guessButtonFunc(View view){
    EditText EnteredAmountString=(EditText) findViewById(R.id.enteredText);
    int num = Integer.parseInt(EnteredAmountString.getText().toString());
//  Log.i("Info","yoyo hello"+RandomNum);

    if(num==RandomNum){
        Toast.makeText(this,"You guessed it right , now try again",Toast.LENGTH_LONG).show();
        Random randAgain = new Random();
        RandomNum = randAgain.nextInt(20)+1;
    }
    else if(num>RandomNum){

        Toast.makeText(this,"Guess little lower",Toast.LENGTH_LONG).show();
    }else{
        Toast.makeText(this,"Guess little higher",Toast.LENGTH_LONG).show();
    }


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        RandomNum = rand.nextInt(20)+1;
    }
}