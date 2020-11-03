package com.ptq.projectskelton.Ilan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.ptq.projectskelton.R;

public class IlanlarimFragment extends Fragment {
    private static final String TAG = "IlanlarimFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ilanlarim, container, false);

        return view;
    }
}
