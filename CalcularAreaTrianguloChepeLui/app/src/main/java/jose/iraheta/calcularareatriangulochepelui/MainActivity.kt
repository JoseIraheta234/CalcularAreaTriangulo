package jose.iraheta.calcularareatriangulochepelui

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
       val txtnum1 = findViewById<EditText>(R.id.txtBase)
        val txtnum2 = findViewById<EditText>(R.id.txtAltura)
       val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)


        val objCacular = CalcularArea()

        btnCalcular.setOnClickListener {

          val resul = objCacular.Calcular(txtnum1.text.toString().toDouble(),txtnum2.text.toString().toDouble())

            txtResultado.text = "El area del siguente triangulo es $resul "

        }
    }
}