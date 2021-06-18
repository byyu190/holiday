package com.example.holiday.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.holiday.R;

public class AddNoteActivity extends AppCompatActivity {
    public static final String EXTRA_TANGGAL =
            "com.example.holiday.EXTRA_TANGGAL";
    public static final String EXTRA_DESCRIPTION =
            "com.example.holiday.EXTRA_DESCRIPTION";

    private EditText editTextTanggal;
    private EditText editTextDescription;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_add_note);

        editTextTanggal = findViewById(R.id.et_tanggal);
        editTextDescription = findViewById(R.id.et_deskripsi);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.close);

        setTitle("Add Note");
    }

    private void saveNote(){
        String tanggal = editTextTanggal.getText().toString();
        String description = editTextDescription.getText().toString();

        if (tanggal.trim().isEmpty() || description.trim().isEmpty()) {
            Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
            return;
        }
           Intent data = new Intent();
           data.putExtra(EXTRA_TANGGAL, tanggal);
           data.putExtra(EXTRA_DESCRIPTION, description);

           setResult(RESULT_OK, data);
           finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_addnote, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_note:
                saveNote();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
