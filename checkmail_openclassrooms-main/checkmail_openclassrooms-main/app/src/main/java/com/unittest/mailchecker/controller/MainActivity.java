package com.unittest.mailchecker.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.unittest.mailchecker.R;
import com.unittest.mailchecker.databinding.ActivityMainBinding;

import static com.unittest.mailchecker.utils.MailUtils.checkMail;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;


    private void initUI() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initButton();
    }

    private void updateUI() {
        boolean valid = checkMail(binding.mailInput.getEditText().getText().toString());
        if (valid) {
            validUpdateForUI();
        } else {
            wrongUpdateForUI();
        }
    }

    private void validUpdateForUI(){
        binding.textValidation.setText(getResources().getText(R.string.valid_mail));
        binding.textValidation.setTextColor(getResources().getColor(android.R.color.holo_green_light));
    }

    private void wrongUpdateForUI(){
        binding.textValidation.setText(getResources().getText(R.string.wrong_mail));
        binding.textValidation.setTextColor(getResources().getColor(android.R.color.holo_red_light));
    }

    private void initButton() {
        binding.validButton.setOnClickListener(view -> {
            updateUI();
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }
}