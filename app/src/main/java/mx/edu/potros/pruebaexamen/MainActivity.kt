package mx.edu.potros.pruebaexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC:EditText = findViewById(R.id.etC)
        val etF:EditText = findViewById(R.id.etF)
        val btnC: Button = findViewById(R.id.btnC)
        val btnF: Button = findViewById(R.id.btnF)


        btnC.setOnClickListener {
            var gF:Double = 0.0
            var gC:Double = 0.0
            try {
                gF = etF.text.toString().toDouble()

            } catch (e: java.lang.Exception){
                print(e)
            }

            gC =  convertidorFaC(gF)
            val resultFormatted =  "%.2f".format(gC)
            etC.setText(resultFormatted)
        }

        btnF.setOnClickListener {
            var gF:Double = 0.0
            var gC:Double = 0.0

            try {
                gC = etC.text.toString().toDouble()

            } catch (e: java.lang.Exception){
                print(e)
            }

            gF = convertidorCaF(gC)
            val resultFormatted =  "%.2f".format(gF)
            etF.setText(resultFormatted)

        }
    }

    fun convertidorFaC(gF:Double):Double{
        return (gF-32)/1.8
    }

    fun convertidorCaF(gC:Double):Double{
        return (gC*1.8)+32
    }
}