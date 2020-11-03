package com.ptq.projectskelton.Message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ptq.projectskelton.R;

public class NotificationFragment extends Fragment {
    private static final String TAG = "NotificationFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bildirim, container, false);

        return view;
    }
}
