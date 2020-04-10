package org.senac.gabrielkraetzer.bomvoyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var usuario : EditText
    private lateinit var senha : EditText
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        this.usuario = findViewById(R.id.edUsuario)
        this.senha = findViewById(R.id.edSenha)
        this.button = findViewById(R.id.btEntrar)
        button.setOnClickListener {
            if ((usuario.text.toString().equals("gabriel", true)) &&
                (senha.text.toString().equals("123456", true)))
                Toast.makeText(this, "${getString(R.string.bem_vindo)} ${usuario.text}", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "${getString(R.string.login_invalido)}", Toast.LENGTH_LONG).show()
        }
    }
}
