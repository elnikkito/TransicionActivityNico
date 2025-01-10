package com.example.palette;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImagePalette extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_palette);

        // Obtén la imagen seleccionada del Intent
        int selectedImage = getIntent().getIntExtra("image_resource", 0);

        // Configura la imagen en el ImageView
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(selectedImage);

        overridePendingTransition(R.anim.fade_in, R.anim.slide_out);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.slide_out);
    }
}
