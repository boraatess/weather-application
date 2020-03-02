package com.example.weatherapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity
{
    EditText editText;

    TextView textView,textView1,textView2,textView3,textView4;

    private Object InputMethodManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);
        textView3 = findViewById(R.id.textView4);
        textView4 = findViewById(R.id.textView7);

    }

    public void SearchCity(View view)
    {
        InputMethodManager input = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        input.hideSoftInputFromWindow(getCurrentFocus().getRootView().getWindowToken(),0);

        apikey();


    }

    private void apikey()
    {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22&units=metric")
                .get()
                .build();


    }
}
