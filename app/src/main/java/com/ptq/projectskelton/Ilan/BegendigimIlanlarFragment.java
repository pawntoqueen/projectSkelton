package com.ptq.projectskelton.Ilan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.ptq.projectskelton.R;
import com.ptq.projectskelton.login.LoginActivity;

public class BegendigimIlanlarFragment extends Fragment {
    private static final String TAG = "BegendigimIlanlarFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Button btnKaydol;
        View view = inflater.inflate(R.layout.fragment_begendigim_ilanlar, container, false);
        btnKaydol = view.findViewById(R.id.register_button);
        btnKaydol.setOnClickListener(v -> startActivity(new Intent(getContext(), LoginActivity.class)));
        return view;
    }
}
