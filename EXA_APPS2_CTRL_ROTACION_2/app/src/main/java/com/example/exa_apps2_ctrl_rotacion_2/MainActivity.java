package com.example.exa_apps2_ctrl_rotacion_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmLy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarImg();
        mostrarTitulo();
        mostrarTexto();
    }

    public void mostrarImg() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ImgFragment imgFragment = new ImgFragment();
        ft.replace(R.id.frmLyImg, imgFragment);
        ft.commit();
    }

    public void mostrarTitulo() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        TitleFragment titleFragment = new TitleFragment();
        ft.replace(R.id.frmLyTitle, titleFragment);
        ft.commit();
    }

    public void mostrarTexto() {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            TextFragment textFragment = new TextFragment();
            ft.replace(R.id.frmLyText, textFragment);
            ft.commit();
    }

}