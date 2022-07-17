//package com.example.cinemafinder;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class LoginActivity extends AppCompatActivity {
//
//    EditText etloginemail;
//    EditText etloginpassword;
//    Button login;
//    TextView etregister;
//    FirebaseAuth firebaseAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        etloginemail = findViewById(R.id.loginemail);
//        etloginpassword = findViewById(R.id.loginpassword);
//        login = findViewById(R.id.login);
//        etregister = findViewById(R.id.txtregister);
//
//        firebaseAuth = FirebaseAuth.getInstance();
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().hide();
//        }
//        login.setOnClickListener(view -> {
//            Loginuser();
//        });
//
//        etregister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
//            }
//        });
//
//
//    }
//    private void Loginuser(){
//        String email = etloginemail.getText().toString();
//        String password = etloginpassword.getText().toString();
//
//        if(TextUtils.isEmpty(email)){
//            etloginemail.setError("Email can not be empty");
//            etloginemail.requestFocus();
//        }
//        else if (TextUtils.isEmpty(password)){
//            etloginpassword.setError("Password can not be empty");
//            etloginpassword.requestFocus();
//        }
//
//        else{
//            firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()) {
//                        Toast.makeText(LoginActivity.this, "User Loggedin successfully", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(LoginActivity.this,MainActivity.class));
//                    }
//                    else{
//                        Toast.makeText(LoginActivity.this, "Login Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
//    }
//}