package com.example.program4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void onImplicitButtonClicked(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }

    public void onExplicitButtonClicked(View view) {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }
}
