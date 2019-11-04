package com.example.zenae.Screens;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zenae.R;

public class SplashFragment extends Fragment {

    private SplashViewModel mViewModel;

    public static SplashFragment newInstance() {
        return new SplashFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.splash_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SplashViewModel.class);
        // TODO: Use the ViewModel
    }

}

/*
* @BindView(R.id.splashVersion)
    TextView versionLabel;

    private SplashViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate(R.layout.fragment_splash, container);

        versionLabel.setText(BuildConfig.VERSION_NAME);

        viewModel = new ViewModelProvider
                .NewInstanceFactory()
                .create(SplashViewModel.class);

        viewModel.getState().observe(this, b -> {
            startActivity(new Intent(getContext(), WelcomeActivity.class));
            getActivity().finish();
        });

        root.setOnClickListener(v -> toast("Hello world"));

        return root;*/
