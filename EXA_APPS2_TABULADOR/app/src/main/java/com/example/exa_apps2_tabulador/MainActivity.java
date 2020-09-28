package com.example.exa_apps2_tabulador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void One (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        OneFragment oneFragment = new OneFragment();
        ft.replace(R.id.frmLytFrag, oneFragment);
        ft.commit();
    }

    public void Two (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        TwoFragment twoFragment = new TwoFragment();
        ft.replace(R.id.frmLytFrag, twoFragment);
        ft.commit();
    }

    public void Three (View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ThreeFragment threeFragment = new ThreeFragment();
        ft.replace(R.id.frmLytFrag, threeFragment);
        ft.commit();
    }

}
