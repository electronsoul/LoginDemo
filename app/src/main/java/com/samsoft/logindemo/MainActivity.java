package com.samsoft.logindemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {
    public void parse_cred(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Log.i("info", username.getText().toString());
        Log.i("info", password.getText().toString());
    }
    public void img_change(View view){
        Log.i("info","Hi");
        ImageView img1 = (ImageView)findViewById(R.id.img1);
        ImageView img2 = (ImageView)findViewById(R.id.img2);
        float x = img1.getAlpha(), y = img2.getAlpha();
        String s1 = Float.toString(x);
        String s2 = Float.toString(y);
        Log.i("info1", s1);
        Log.i("info2", s2);

        if (x == 0 && y == 1.0f) {
            img1.setAlpha(1.0f);
            img2.setAlpha(0.0f);
        }
        if(x == 1.0f && y == 0) {
            img1.setAlpha(0.0f);
            img2.setAlpha(1.0f);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
