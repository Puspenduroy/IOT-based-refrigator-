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
public class MainActivity2 extends AppCompatActivity {
    private TextView titleTextView,titleTextView1,titleTextView2,titleTextView3;
    private EditText emailEditText, passwordEditText;
    private ImageView logoImageView,logoImageView1;
    private Button loginButton;
    private String email, password,myLatidude;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        titleTextView = findViewById(R.id.email_textview);
        titleTextView1 = findViewById(R.id.phone_textview);
        titleTextView2 = findViewById(R.id.video_textview);
        titleTextView3 = findViewById(R.id.facebook_textview);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Forcesensor12");
        DatabaseReference myRef2= database.getReference("Forcesensor22");
        DatabaseReference myRef3 = database.getReference("Forcesensor33");
        DatabaseReference myRef4 = database.getReference("Forcesensor43");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Integer myLatidude = Integer.parseInt(dataSnapshot.getValue(String.class));
                //Log.d(TAG, "Value is: " + value);
                if(myLatidude>1){
                    titleTextView.setText("Spoil");
                }
                //titleTextView.setText();
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
                Integer myLatidude = Integer.parseInt(dataSnapshot.getValue(String.class));
                //Log.d(TAG, "Value is: " + value);
                if(myLatidude>1){
                    titleTextView1.setText("Spoil");
                }
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
                Integer myLatidude = Integer.parseInt(dataSnapshot.getValue(String.class));
                //Log.d(TAG, "Value is: " + value);
                if(myLatidude>1){
                    titleTextView2.setText("Spoil");
                }
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
                Integer myLatidude = Integer.parseInt(dataSnapshot.getValue(String.class));
                //Log.d(TAG, "Value is: " + value);
                if(myLatidude>1){
                    titleTextView3.setText("Spoil");
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                //Log.w(TAG, "Failed to read value.", error.toException());
            }
        });





    }

}