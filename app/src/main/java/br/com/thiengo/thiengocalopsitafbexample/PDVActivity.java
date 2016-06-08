package br.com.thiengo.thiengocalopsitafbexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PDVActivity extends CommonActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdv);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initUser() {

    }

    public void onClickCheckIn(View view){

        //fazer check in

        super.showSnackbar("Check in feito com sucesso");
        Intent intent = new Intent(this,CheckInPDVActivity.class);
        startActivity(intent);
    }

    public void onClickCheckOut(View view){

        //fazer check out

        super.showToast("Check out feito com sucesso");
    }
}
//localizar no mapa