package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notificationapp.databinding.ActivityNotificationBinding;

public class Notification extends AppCompatActivity {
    ActivityNotificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String data = getIntent().getStringExtra("data");

        binding.tvReceiveNotification.setText(data);
    }
}