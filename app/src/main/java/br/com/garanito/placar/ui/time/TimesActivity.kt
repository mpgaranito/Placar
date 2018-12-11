
package br.com.garanito.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.garanito.placar.ui.placar.PlacarActivity
import br.com.garanito.placar.R
import br.com.garanito.placar.ui.placaraac.PlacarAACActivity
import br.com.garanito.placar.ui.placaraac.PlacarAACViewModel
import br.com.garanito.placar.utils.KEY_EXTRAS_TIME_A
import br.com.garanito.placar.utils.KEY_EXTRAS_TIME_B
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)
        btIniciarJogo.setOnClickListener{
        val intent = Intent(this, PlacarAACActivity::class.java)
        intent.putExtra(KEY_EXTRAS_TIME_A,inputTimeA.text.toString())
            intent.putExtra(KEY_EXTRAS_TIME_B,inputTimeB.text.toString())
            startActivity(intent)

        }
        btFinalizarJogo.setOnClickListener{

        }
    }
}
