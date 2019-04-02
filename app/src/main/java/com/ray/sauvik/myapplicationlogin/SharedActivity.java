package com.ray.sauvik.myapplicationlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SharedActivity extends AppCompatActivity {
    private final String TAG = SharedActivity.class.getCanonicalName();
    private EditText edtName;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        edtName = findViewById(R.id.edtNameId);

        sharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE);

        sharedPreferences = getPreferences(MODE_PRIVATE);

       String name =  sharedPreferences.getString("name", null);
       if(name !=null){
           Log.d(TAG, name);
           Log.w(TAG, name);
           Log.i(TAG, name);
           Log.e(TAG, name);
           Log.v(TAG, name);
       }
    }
    public void btnSave (View view)
    {


        if (edtName.getText().length() !=0);
        {
            String name = edtName.getText().toString();
            SharedPreferences.Editor mEditor = sharedPreferences.edit();

            mEditor.putString("name", name);
           // mEditor.remove("name");
            mEditor.apply();
            //mEditor.commit();
        }

        Intent i = new Intent(SharedActivity.this, Shared2Activity.class);
        startActivity(i);
    }
}
