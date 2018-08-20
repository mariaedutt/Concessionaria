package com.yan_ana.appconcessionaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class AppConcessionaria extends AppCompatActivity {

    private EditText txtModelo;
    private Spinner spMarca;
    private CheckBox cbNovo;
    private RadioButton rbPassageiro, rbCarga;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_concessionaria);

        txtModelo = (EditText) findViewById(R.id.txtModelo);
        spMarca = (Spinner) findViewById(R.id.spMarca);
        cbNovo = (CheckBox) findViewById(R.id.cbNovo);
        rbPassageiro = (RadioButton) findViewById(R.id.rbPassageiro);
        rbCarga = (RadioButton) findViewById(R.id.rbCarga);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_limpar){
            limpar();
        }

        if(item.getItemId() == R.id.menu_sair){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void limpar(){
        txtModelo.setText("");
        cbNovo.setChecked(false);
        rbCarga.setChecked(false);
        rbPassageiro.setChecked(false);

        spMarca.setSelection(0);

    }
}
