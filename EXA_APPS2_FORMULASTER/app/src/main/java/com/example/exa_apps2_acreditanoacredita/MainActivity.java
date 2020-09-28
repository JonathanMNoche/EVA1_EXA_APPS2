package com.example.exa_apps2_acreditanoacredita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generarFrags();
    }

    public void actualizarForm(String figura) {
        switch (figura) {
            case "Rectangulo":
                actFigura("Base", "Altura", 1);
                break;
            case "Triangulo":
                actFigura("Base", "Altura", 2);
                break;
            case "Rombo":
                actFigura("Diag. May.", "Diag. Men", 3);
                break;
            case "Cilindro":
                actFigura("Radio", "Altura", 4);
                break;
            case "Romboide":
                actFigura("Base", "Altura", 5);
                break;
            case "Cono":
                actFigura("Radio", "Altura", 6);
                break;
            case "Circulo":
                actFigura("Radio", "hola", 7);
                break;
            case "Cuadrado":
                actFigura("Lado", "Altura", 8);
                break;
            case "Esfera":
                actFigura("Radio", "Altura", 9);
                break;
            default:

        }
    }

    public void actFigura (String param1, String param2, int id) {
        //ID: Rect 1, Triang 2, Rombo 3, Cil 4, Romboide 5, Cono 6
        //ID: Circ 7, Cuad 8, esf 9
        Log.wtf("Hola, " , Integer.toString(id));
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if(id < 7) {
            ImgFragment imgFragment = ImgFragment.newInstance(Integer.toString(id));
            ft.replace(R.id.frmLyImg, imgFragment);
            RectFragment rectFragment = RectFragment.newInstance(param1, param2, Integer.toString(id));
            ft.replace(R.id.frmLyFormula, rectFragment);
            ft.commit();
        } else if(id >= 7) {
            ImgFragment imgFragment = ImgFragment.newInstance(Integer.toString(id));
            ft.replace(R.id.frmLyImg, imgFragment);
            CirculoFragment circuloFragment = CirculoFragment.newInstance(param1, Integer.toString(id));
            ft.replace(R.id.frmLyFormula, circuloFragment);
            ft.commit();
        }

    }


    public void generarFrags () {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ListFragment listFragment = new ListFragment();
        ft.replace(R.id.frmLyLista, listFragment);
        ft.commit();

    }


}