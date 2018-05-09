package com.example.l.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Sub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        final EditText editTextSub2=(EditText)findViewById(R.id.editTextSub2);
        Button buttonSub2=(Button)findViewById(R.id.buttonSub2);
        Button buttonSub2_1=(Button)findViewById(R.id.buttonSub2_1);

        buttonSub2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent=new Intent("king");
                intent.putExtra("message",editTextSub2.getText().toString());
                sendBroadcast(intent);

            }
        });
        buttonSub2_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent=new Intent("StartCalculator");
                sendBroadcast(intent);

            }
        });
    }
}
