package com.example.exa_apps2_mostrar_imagen;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmLyHor1,  frmLyVert;
    SeekBar seekBarHor, seekBarVert;
    int tiempo, cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBarHor = findViewById(R.id.seekBarHor);
        seekBarVert = findViewById(R.id.seekBarVert);
        frmLyHor1 = findViewById(R.id.frmLyHor1);
        frmLyVert = findViewById(R.id.frmLyVert);

        if (seekBarVert != null) {
            seekBarVert.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    tiempo = (progress * 100);
                    mostrar(tiempo);
                    cont++;
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
            if (seekBarHor != null) {
                seekBarHor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        tiempo = (progress * 100);
                        mostrar(tiempo);
                        cont++;
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
            }


    }
    public void mostrar(final int tiempo2) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    for(int i = 0 ; i <= 9 ; i++) {
                        if(i == 9) {
                            i = 0;
                        } else {
                            if (cont != 0) {
                                if(tiempo != tiempo2) {
                                    mostrar(tiempo2);
                                    break;
                                } else {
                                    Thread.sleep(tiempo2);
                                    if(frmLyVert != null) {
                                        transaccionVert(i);
                                    } else if (frmLyHor1 != null) {
                                        transaccionHor(i);
                                    }
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }

    public void transaccionHor(int i) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        HorFragment1 horFragment1 = HorFragment1.newInstance(Integer.toString(i));
           HorFragment2 horFragment2 = HorFragment2.newInstance(Integer.toString(i));
              HorFragment3 horFragment3 = HorFragment3.newInstance(Integer.toString(i));
        ft.replace(R.id.frmLyHor1, horFragment1);
              ft.replace(R.id.frmLyHor2, horFragment2);
            ft.replace(R.id.frmLyHor3, horFragment3);
        ft.commitAllowingStateLoss();
    }


    public void transaccionVert(int i) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        VertFragment vertFragment = VertFragment.newInstance(Integer.toString(i));
        ft.replace(R.id.frmLyVert, vertFragment);
        ft.commitAllowingStateLoss();
    }

}