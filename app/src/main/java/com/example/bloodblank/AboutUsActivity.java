package com.example.bloodblank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    View developerChanpreetCard;
    View developerAyushCard;
    View developerAryanCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().hide();


        developerChanpreetCard = findViewById(R.id.developerChanpreetCard  );
        developerAyushCard = findViewById(R.id.developerAyushCard);
        developerAryanCard = findViewById(R.id.developerAryanCard);

        ((TextView) developerChanpreetCard.findViewById(R.id.developerNameTextView)).setText("Nishant Ruhil");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerEmailTextView)).setText("nishant9053ruhil@gmail.com");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9813770950");
        ((TextView) developerChanpreetCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("");

        ((TextView) developerAyushCard.findViewById(R.id.developerNameTextView)).setText("Harsh Rahar");
        ((TextView) developerAyushCard.findViewById(R.id.developerEmailTextView)).setText("harshrahar.hr14@outlook.com");
        ((TextView) developerAyushCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9896762489");
        ((TextView) developerAyushCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("");

        ((TextView) developerAryanCard.findViewById(R.id.developerNameTextView)).setText("Pawan Ruhil");
        ((TextView) developerAryanCard.findViewById(R.id.developerEmailTextView)).setText("pawanruhil2004@gmail.com");
        ((TextView) developerAryanCard.findViewById(R.id.developerPhoneNumberEmailTextView)).setText("+91 9896129308");
        ((TextView) developerAryanCard.findViewById(R.id.developerRollNumberEmailTextView)).setText("");


    }



}


