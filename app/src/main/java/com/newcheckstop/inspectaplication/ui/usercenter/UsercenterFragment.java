package com.newcheckstop.inspectaplication.ui.usercenter;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newcheckstop.inspectaplication.R;

public class UsercenterFragment extends Fragment {

    private UsercenterViewModel mViewModel;

    public static UsercenterFragment newInstance() {
        return new UsercenterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_usercenter, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(UsercenterViewModel.class);
        // TODO: Use the ViewModel
    }

}