package com.example.exa_apps2_acreditanoacredita;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RectFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RectFragment extends Fragment {

    TextView txtVwResul2, lblBase, lblAltura;
    EditText txtBase, txtAltura;
    int base, altura;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    public RectFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CuadFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RectFragment newInstance(String param1, String param2, String param3) {
        RectFragment fragment = new RectFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       LinearLayout frameLayout = (LinearLayout) inflater.inflate(R.layout.fragment_rect, container, false);
        Button btnCalcular2 = frameLayout.findViewById(R.id.btnCalcular2);
        lblBase = frameLayout.findViewById(R.id.lblBase);
        lblAltura = frameLayout.findViewById(R.id.lblAltura);
       txtBase = frameLayout.findViewById(R.id.txtBase);
       txtAltura = frameLayout.findViewById(R.id.txtAltura);
       txtVwResul2 = frameLayout.findViewById(R.id.txtVwResul2);
        Log.wtf("Param3", mParam3);
       switch (Integer.parseInt(mParam3)) {

           case 1:
               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                       int res = ((base*altura));
                       txtVwResul2.setText("Resultado: " + res);
                   }
               });
                break;
           case 2:
               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                    int res = ((base*altura)/2);
                    txtVwResul2.setText("Resultado: " + res);
                   }
               });
               break;
           case 3:
               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                       int res = ((base*altura)/2);
                       txtVwResul2.setText("Resultado: " + res);
                   }
               });
               break;
           case 4:

               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                       double res = (Math.PI*(base*base)*altura);
                       txtVwResul2.setText("Resultado: " + res);
                   }
               });
               break;
           case 5:
               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                       int res = ((base*altura));
                       txtVwResul2.setText("Resultado: " + res);
                   }
               });
               break;
           case 6:
               lblBase.setText(mParam1);
               lblAltura.setText(mParam2);

               btnCalcular2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       base = Integer.parseInt(txtBase.getText().toString());
                       altura = Integer.parseInt(txtAltura.getText().toString());
                       double res = ((Math.PI*(base*base)*altura)/3);
                       txtVwResul2.setText("Resultado: " + res);
                   }
               });
               break;
       }
        return frameLayout;
    }
}