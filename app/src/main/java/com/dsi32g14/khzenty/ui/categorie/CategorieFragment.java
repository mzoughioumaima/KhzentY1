package com.dsi32g14.khzenty.ui.categorie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dsi32g14.khzenty.R;
import com.dsi32g14.khzenty.ui.gallery.GalleryViewModel;
import com.dsi32g14.khzenty.ui.home.HomeViewModel;

public class CategorieFragment  extends Fragment {
    private CategorieViewModel categorieViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categorieViewModel = ViewModelProviders.of(this).get(CategorieViewModel.class);
        View root = inflater.inflate(R.layout.activity_categorie, container, false);
        categorieViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}
