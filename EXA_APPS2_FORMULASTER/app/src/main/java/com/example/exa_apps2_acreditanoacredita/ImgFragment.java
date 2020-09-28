package com.example.exa_apps2_acreditanoacredita;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImgFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImgFragment extends Fragment {

    ImageView imgVw;
    //ID: Rect 1, Triang 2, Rombo 3, Cil 4, Romboide 5, Cono 6
    //ID: Circ 7, Cuad 8, esf 9
    int[] imagenes = {R.drawable.rectangulo, R.drawable.triangulo, R.drawable.rombo, R.drawable.cilindro,
    R.drawable.romboide, R.drawable.cono, R.drawable.circulo, R.drawable.cuadrado, R.drawable.esfera};


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ImgFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ImgFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ImgFragment newInstance(String param1) {
        ImgFragment fragment = new ImgFragment();
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
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_img, container, false);
        imgVw = frameLayout.findViewById(R.id.imgVw);
        if(mParam1 == null) {} else {
            imgVw.setImageResource(imagenes[Integer.parseInt(mParam1)-1]);
        }
        return frameLayout;
    }
}