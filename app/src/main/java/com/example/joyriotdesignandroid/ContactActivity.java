package com.example.joyriotdesignandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {
    private Button buttonFacebook, buttonInstagram, buttonGithub, buttonWhatsapp, buttonLocation, buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        buttonBack = (Button) findViewById(R.id.buttonPrevious);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactActivity.this, MainActivity.class));
            }
        });

        buttonInstagram = (Button) findViewById(R.id.buttonInstagram);
        buttonInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/joyrantepasang/"));
                startActivity(intent);
            }
        });

        buttonFacebook = (Button) findViewById(R.id.buttonFacebook);
        buttonFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/WHATSUPDUCK33/"));
                startActivity(intent);
            }
        });

        buttonGithub = (Button) findViewById(R.id.buttonGithub);
        buttonGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JoyAbrian"));
                startActivity(intent);
            }
        });

        buttonWhatsapp = (Button) findViewById(R.id.buttonWhatsapp);
        buttonWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.whatsapp");
                intent.setData(Uri.parse("https://wa.me/081356621029"));
                intent.putExtra(Intent.EXTRA_TEXT, "Haloo... what is candice?");
                startActivity(intent);
            }
        });

        buttonLocation = (Button) findViewById(R.id.buttonLocation);
        buttonLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JoyAbrian"));
                startActivity(intent);
            }
        });

    }
}