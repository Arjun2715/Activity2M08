package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {
    private Button reading;
    private Button library;
    private Button audio_Books;
    private Button shop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        library = (Button) findViewById(R.id.Libarary);
        reading = (Button) findViewById(R.id.Reading_Now);
        audio_Books = (Button) findViewById(R.id.Audio_Books);
        shop = (Button) findViewById(R.id.Book_Store);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading();
            }
        });
        reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLibrary();
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShop();
            }
        });
        audio_Books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAudioBooks();
            }
        });

    }
    private void openLibrary(){
        Intent intent = new Intent(this,Activity3Library.class);
        startActivity(intent);
    }
    private void openReading(){
        Intent intent = new Intent(this,Activity3Library.class);
        startActivity(intent);
    }
    private void openShop(){
        Intent intent = new Intent(this,Activity3Library.class);
        startActivity(intent);
    }
    private void openAudioBooks(){
        Intent intent = new Intent(this,Activity3Library.class);
        startActivity(intent);
    }

    //.--------------------------

}