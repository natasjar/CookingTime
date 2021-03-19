package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String str = "";
    int int1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-name").build();

        //UserDao userDao = db.userDao();

        ArrayList<User> users = new ArrayList<>();

        TextView textView = (TextView)findViewById(R.id.textView2);

        EditText username = (EditText)findViewById(R.id.editTextUsername);
        EditText bio = (EditText)findViewById(R.id.editTextBio);

        int1 = 0;

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String userString = username.getText().toString();
                String bioString = bio.getText().toString();
                String msg = "" ;
                User u = new User(int1, userString, bioString);
                users.add(u);
                int1 ++;

                textView.setText("added " + u.getName());
            }
        });

        Button buttonUpdate = findViewById(R.id.button2);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = "" ;
                for (User u: users){
                    msg += (u.getName() + " " + u.getBio() + "\n");
                }
                textView.setText(msg);
            }
        });





        //userDao.insertUsers(user);
        //List<User> users = userDao.getAllNames();



    }
}