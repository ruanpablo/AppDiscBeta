package br.com.example.appdiscbetatcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class influencia_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencia);
    }

    public void Cancelar(View view) {
        finish();
    }
}
