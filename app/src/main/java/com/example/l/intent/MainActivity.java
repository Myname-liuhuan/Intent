package com.example.l.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int SUBACTIVITY1=1;
    private static final int SUBACTIVITY2=2;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView)findViewById(R.id.textView01);
        Button button1=(Button)findViewById(R.id.button01);
        Button button2=(Button)findViewById(R.id.button02);
        Button button3=(Button)findViewById(R.id.button03);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =new Intent(MainActivity.this,Otheractivity.class);
                startActivityForResult(intent,SUBACTIVITY1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =new Intent(MainActivity.this,SubActivity.class);
                startActivityForResult(intent,SUBACTIVITY2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =new Intent(MainActivity.this,Sub2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        switch(requestCode){
            case SUBACTIVITY1:
                if(resultCode==RESULT_OK){
                    Uri uriData=data.getData();
                    textView1.setText(uriData.toString());
                }
                break;
            case SUBACTIVITY2:
                if(resultCode==RESULT_OK){
                    Uri uriData=data.getData();
                    textView1.setText(uriData.toString());
                }
                break;
        }
    }

}