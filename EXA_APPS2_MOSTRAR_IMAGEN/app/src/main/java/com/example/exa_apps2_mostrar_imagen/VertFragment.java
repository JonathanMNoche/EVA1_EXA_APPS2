package com.example.exa_apps2_mostrar_imagen;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;


public class VertFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VertFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment VertFragment.
**/
    // TODO: Rename and change types and number of parameters
    public static VertFragment newInstance(String param1) {
        VertFragment fragment = new VertFragment();
        Bundle args = new Bundle();
       args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

MainActivity main;
ImageView imgVwFV;

int [] imagenes = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
        R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       main = (MainActivity)getActivity();
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_vert, container, false);
        imgVwFV = frameLayout.findViewById(R.id.imgVwFV);
        if (mParam1 == null) {} else {
            imgVwFV.setImageResource(imagenes[Integer.parseInt(mParam1)]);
        }
           return frameLayout;
    }


}