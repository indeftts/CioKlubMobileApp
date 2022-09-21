package com.example.cioklub.Activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cioklub.R;


public class PersonalTabFragment extends Fragment {





    @Override
    public void onViewCreated(@NonNull View view , @Nullable Bundle savedInstanceState) {



        Button btnfragmentpersonal= view.findViewById(R.id.btnfragmentpersonal);

        btnfragmentpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragview=inflater.inflate(R.layout.fragment_personal_tab, container, false);
        return fragview;
    }



}