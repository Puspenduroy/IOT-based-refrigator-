package org.techgeorge.hosapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.techgeorge.hosapp.R;
public class MainActivity1 extends AppCompatActivity {
    private TextView titleTextView,titleTextView1,titleTextView2,titleTextView3;
    private EditText emailEditText, passwordEditText;
    private ImageView logoImageView,logoImageView1;
    private Button loginButton;
    private String email, password,myLatidude;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);
        titleTextView = findViewById(R.id.email_textview);
        titleTextView1 = findViewById(R.id.phone_textview);
        titleTextView2 = findViewById(R.id.video_textview);
        titleTextView3 = findViewById(R.id.facebook_textview);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Forcesensor1");
        DatabaseReference myRef2= database.getReference("Forcesensor2");
        DatabaseReference myRef3 = database.getReference("Forcesensor3");
        DatabaseReference myRef4 = database.getReference("Forcesensor4");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                myLatidude = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
                titleTextView.setText(myLatidude);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                myLatidude = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
                titleTextView1.setText(myLatidude);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                myLatidude = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
                titleTextView2.setText(myLatidude);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                myLatidude = dataSnapshot.getValue(String.class);
                //Log.d(TAG, "Value is: " + value);
                titleTextView3.setText(myLatidude);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });





    }

}