package com.ptq.projectskelton.utils;



import android.content.Context;
import android.content.Intent;

import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.ptq.projectskelton.Home.HomeActivity;
import com.ptq.projectskelton.Ilan.IlanActivity;
import com.ptq.projectskelton.Message.MessageActivity;
import com.ptq.projectskelton.Profile.ProfileActivity;
import com.ptq.projectskelton.R;
import com.ptq.projectskelton.Share.ShareActivity;


/**
 * Created by User on 5/28/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");

    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.komsularim:
                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ilanlarim:
                        Intent intent2  = new Intent(context, IlanActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        Toast.makeText(context, "ilanlarım", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.add_adv:
                        Intent intent3 = new Intent(context, ShareActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        Toast.makeText(context, "ekle", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.mesajlar:
                        Intent intent4 = new Intent(context, MessageActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        Toast.makeText(context, "mesajlar", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.profile:
                        Intent intent5 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
                        Toast.makeText(context, "profil", Toast.LENGTH_SHORT).show();

                        break;
                }


                return false;
            }
        });
    }
}