package com.example.exa_apps2_mostrar_imagen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HorFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HorFragment2 extends Fragment {

    ImageView imgVwFH2;

    int [] imagenes = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
            R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HorFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HorFragment2.
**/
    // TODO: Rename and change types and number of parameters
    public static HorFragment2 newInstance(String param1) {
        HorFragment2 fragment = new HorFragment2();
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
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_hor2, container, false);
        imgVwFH2 = frameLayout.findViewById(R.id.imgVwFH2);
        if (mParam1 == null) {} else {
            int param = Integer.parseInt(mParam1);
            if (param == 8) {
                imgVwFH2.setImageResource(imagenes[0]);
            } else {
                imgVwFH2.setImageResource(imagenes[param + 1]);
            }
        }
        return frameLayout;
    }
}