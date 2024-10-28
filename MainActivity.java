// MainActivity.java

package com.example.manishhello; // Replace with your package name

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private TextView textHello;

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

textHello = findViewById(R.id.text_hello);

}

// Method to handle button click (defined in XML)

public void sayHello(View view) {

textHello.setText("Hello, World!");

}

public void clearText(View view) {

textHello.setText("");

}

}