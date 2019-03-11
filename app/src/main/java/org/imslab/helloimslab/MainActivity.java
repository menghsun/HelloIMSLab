package org.imslab.helloimslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAD","NCKU is best.");
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "IMS Lab is the best.", Toast.LENGTH_LONG);
        toast.show();
    }
}
