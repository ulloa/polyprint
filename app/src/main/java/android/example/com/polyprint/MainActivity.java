package android.example.com.polyprint;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.main);
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_account);

                ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.account);
                rlayout.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.activity_neworder);

                        ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.neworder);
                        rlayout.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.activity_customorder);

                                ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.customorder);
                                rlayout.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.activity_addedorder);

                                        ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.addedorder);
                                        rlayout.setOnClickListener(new View.OnClickListener() {

                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.activity_receipt);

                                                ConstraintLayout rlayout = (ConstraintLayout) findViewById(R.id.receipt);
                                                rlayout.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {
                                                        setContentView(R.layout.activity_account);
                                                    }

                                                });
                                            }

                                        });
                                    }

                                });
                            }

                        });
                    }

                });
            }

        });
    }
}
