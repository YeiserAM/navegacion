package com.example.navegacion.ui.nube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navegacion.databinding.FragmentNubeBinding;

public class NubeFragment extends Fragment {

    private FragmentNubeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NubeViewModel nubeViewModel =
                new ViewModelProvider(this).get(NubeViewModel.class);

        binding = FragmentNubeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNube;
        nubeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}