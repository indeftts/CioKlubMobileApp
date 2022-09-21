package com.example.cioklub.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.cioklub.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=findViewById(R.id.bottom_navigationview);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_home,new HomeFragment());


        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment=null;
                switch(item.getItemId()){
                    case R.id.nav_home:

                        fragment=new HomeFragment();
                        break;
                    case R.id.nav_membership:
                        fragment=new MembershipFragment();
                        break;
                    case R.id.nav_event:
                        fragment=new EventFragment();
                        break;
                    case R.id.nav_mynetwork:
                        fragment=new MyNetworkFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_home,fragment).commit();



                return true;
            }
        });



    }
}