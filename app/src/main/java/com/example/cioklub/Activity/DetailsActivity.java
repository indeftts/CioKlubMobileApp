package com.example.cioklub.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.cioklub.R;
import com.google.android.material.navigation.NavigationBarView;

public class DetailsActivity extends AppCompatActivity {

    Button btnfragmentpersonal,btnfragmentsocial,btnfragmentpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        btnfragmentpersonal = findViewById(R.id.btnfragmentpersonal);
        btnfragmentsocial = findViewById(R.id.btnfragmentsocial);
        btnfragmentpreferences = findViewById(R.id.btnfragmentpreferences);

        btnfragmentpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                PersonalTabFragment fragment_personal_tab=new PersonalTabFragment();
                transaction.replace(R.id.fragmentContainerView,fragment_personal_tab);
                transaction.commit();

            }


        });

        btnfragmentsocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                OfficialTabFragment fragment_official_tab=new OfficialTabFragment();
                transaction.replace(R.id.fragmentContainerView,fragment_official_tab);
                transaction.commit();

            }
        });
        btnfragmentpreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                PreferencesTabFragment fragment_preferences_tab=new PreferencesTabFragment();
                transaction.replace(R.id.fragmentContainerView,fragment_preferences_tab);
                transaction.commit();

            }
        });




        //getSupportFragmentManager().beginTransaction().replace(R.id.details, new PersonalTabFragment());

    }
}