package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Freament2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"Fragment 2 loaded",Toast.LENGTH_SHORT).show();

        View view = inflater.inflate(R.layout.fragment2, container, false);
        TextView tv = view.findViewById(R.id.tvFrag);

        if (getArguments() != null) {
            String data = getArguments().getString("data");
            tv.setText(data);
        }
        return view;
    }
}
