package com.example.myapplication.myapplication8;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.myapplication8.MonSecondFragement;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity  implements MonFragement.OnFragmentInteractionListener {
    private static final String TAG = "ACOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnFragmentInteraction(Intent intent) {
        Log.i(TAG, "L'activité receptionne bien le clic du fragment");
        MonSecondFragement msf = (MonSecondFragement) getSupportFragmentManager().findFragmentById(R.id.fragment_deux);
        msf.misAjourTextView(intent.getStringExtra("phrase"));

    }
}