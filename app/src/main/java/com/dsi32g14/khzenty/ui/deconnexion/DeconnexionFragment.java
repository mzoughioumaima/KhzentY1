package com.dsi32g14.khzenty.ui.deconnexion;

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
import com.dsi32g14.khzenty.ui.categorie.CategorieViewModel;

public class DeconnexionFragment extends Fragment {
    private DeconnexionViewModel deconnexionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        deconnexionViewModel = ViewModelProviders.of(this).get(DeconnexionViewModel.class);
        View root = inflater.inflate(R.layout.activity_login, container, false);
        deconnexionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}


