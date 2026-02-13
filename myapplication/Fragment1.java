package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);
        Button btnsend = (Button) view.findViewById(R.id.frag1_click);
        EditText et = view.findViewById(R.id.frag_text);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Freament2 frag2 = new Freament2();
                Bundle bundle = new Bundle();
                bundle.putString("data",et.getText().toString() );

                frag2.setArguments(bundle);

                requireActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frag_layout, frag2)
                        .addToBackStack(null)
                        .commit();
            }
        });
        Toast.makeText(getActivity(), "Fragment 1 Loaded", Toast.LENGTH_SHORT).show();
        return view;
    }
}
