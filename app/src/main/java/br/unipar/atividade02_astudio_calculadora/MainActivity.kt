package br.unipar.atividade02_astudio_calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val resultado = findViewById<TextView>(R.id.txtResultado)
        val inputNumber1 = findViewById<EditText>(R.id.editTextNumber)
        val inputNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val btnlimparvalores = findViewById<Button>(R.id.btnLimparValores)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        val btnSomar = findViewById<Button>(R.id.btnSomar)

        btnSubtrair
            .setOnClickListener {
                val numeroInformado = inputNumber1.text.toString();
                val numero2Informado = inputNumber2.text.toString();
                    if (numeroInformado.isNotEmpty() && numero2Informado.isNotEmpty() )


        }


    }
}