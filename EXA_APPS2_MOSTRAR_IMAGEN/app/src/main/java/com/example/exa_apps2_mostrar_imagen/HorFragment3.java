package com.example.exa_apps2_mostrar_imagen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HorFragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HorFragment3 extends Fragment {

    ImageView imgVwFH3;

    int [] imagenes = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
            R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HorFragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment HorFragment3.
**/
    // TODO: Rename and change types and number of parameters
    public static HorFragment3 newInstance(String param1) {
        HorFragment3 fragment = new HorFragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_hor3, container, false);
        imgVwFH3 = frameLayout.findViewById(R.id.imgVwFH3);

        if (mParam1 == null) {} else {
            int param = Integer.parseInt(mParam1);
            Log.wtf("Param 3: ", mParam1);
            if (param == 7) {
                imgVwFH3.setImageResource(imagenes[0]);
            } else if (param == 8){
                imgVwFH3.setImageResource(imagenes[1]);
            } else {
                imgVwFH3.setImageResource(imagenes[param + 2]);
            }
        }
        return frameLayout;
    }
}