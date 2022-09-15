package com.example.navegacion.ui.carta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navegacion.R;
import com.example.navegacion.databinding.FragmentCartaBinding;

public class CartaFragment extends Fragment {

    private FragmentCartaBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CartaViewModel cartaViewModel =
                new ViewModelProvider(this).get(CartaViewModel.class);

        binding = FragmentCartaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCarta;
        cartaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}