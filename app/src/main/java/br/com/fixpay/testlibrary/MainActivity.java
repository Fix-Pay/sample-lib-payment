package br.com.fixpay.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.UUID;

import br.com.fixpay.fixpaysales.InputTransaction;
import br.com.fixpay.fixpaysales.transaction.MakeTransaction;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView txtHello = findViewById(R.id.txt_hello);
    txtHello.setOnClickListener(v -> {
      InputTransaction input = new InputTransaction();
      input.setIdentification(UUID.randomUUID().toString());
      input.setOperation(1); // VENDA
      input.setCardType(1); // CREDITO
      input.setInstallments(1); // A VISTA
      input.setAmount(1.00);

      MakeTransaction makeTransaction = new MakeTransaction(getApplicationContext(), this);
      makeTransaction.makeTransaction(input);

    });
  }
}