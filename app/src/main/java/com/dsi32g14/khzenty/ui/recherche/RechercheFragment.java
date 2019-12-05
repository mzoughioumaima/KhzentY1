package com.dsi32g14.khzenty.ui.recherche;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dsi32g14.khzenty.R;

public class RechercheFragment extends Fragment {
    private RechercheViewModel rechercheViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rechercheViewModel = ViewModelProviders.of(this).get(RechercheViewModel.class);
        View root = inflater.inflate(R.layout.activity_recherche, container, false);
        rechercheViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}



