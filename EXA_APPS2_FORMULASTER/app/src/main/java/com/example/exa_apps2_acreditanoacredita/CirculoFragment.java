package com.example.exa_apps2_acreditanoacredita;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CirculoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CirculoFragment extends Fragment {

    TextView lblRadio, txtVwResul;
    EditText txtRadio;
    int radio;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CirculoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FormulaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CirculoFragment newInstance(String param1, String param2) {
        CirculoFragment fragment = new CirculoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout frameLayout = (LinearLayout) inflater.inflate(R.layout.fragment_circulo, container, false);
        Button btnCalcular = frameLayout.findViewById(R.id.btnCalcular);
        txtRadio = frameLayout.findViewById(R.id.txtRadio);
        txtVwResul = frameLayout.findViewById(R.id.txtVwResul);
        lblRadio = frameLayout.findViewById(R.id.lblRadio);
        switch (Integer.parseInt(mParam2)) {
            case 7:
                btnCalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        radio = Integer.parseInt(txtRadio.getText().toString());
                        double res = (Math.PI*(radio*radio));
                        txtVwResul.setText("Resultado: " + res);
                    }
                });
                break;
            case 8:
                btnCalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        lblRadio.setText(mParam1);
                        int lado = Integer.parseInt(txtRadio.getText().toString());
                        int res = (lado*lado);
                        txtVwResul.setText("Resultado: " + res);
                    }
                });
                break;
            case 9:
                btnCalcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        radio = Integer.parseInt(txtRadio.getText().toString());
                        double res = ((4/3)*Math.PI*(radio*radio*radio));
                        txtVwResul.setText("Resultado: " + res);
                    }
                });
                break;
        }


        return frameLayout;
    }
}