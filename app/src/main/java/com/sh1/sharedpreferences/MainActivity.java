package com.sh1.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView ;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        preferences = getSharedPreferences("name",MODE_PRIVATE);
        editor = preferences.edit();
        textView.setText(preferences.getString("name",""));
    }
    public void prueba(View view){
        editor.putString("name",textView.getText().toString());
        editor.commit();
    }

}