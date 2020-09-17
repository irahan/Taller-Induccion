package mx.tecnm.misantla.iscapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            val nombre = editTextTextPersonName.text.toString()
            val apellido = editTextTextPersonName2.text.toString()

            val nombrecompleto = "$nombre $apellido"

            textView2.text = nombrecompleto
        }




    }
}