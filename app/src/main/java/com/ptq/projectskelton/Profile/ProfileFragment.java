package com.ptq.projectskelton.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ptq.projectskelton.R;
import com.ptq.projectskelton.login.LoginActivity;

public class ProfileFragment extends Fragment {
    private static final String TAG = "ProfileFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Button btnKaydol;
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        btnKaydol = view.findViewById(R.id.register_button);

        btnKaydol.setOnClickListener(v -> startActivity(new Intent(getContext(), LoginActivity.class)));

        return view;
    }
}
