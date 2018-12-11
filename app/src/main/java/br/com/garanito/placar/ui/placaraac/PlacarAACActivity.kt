package br.com.garanito.placar.ui.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.garanito.placar.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)
            placarAACViewModel = ViewModelProviders.of(this).get(PlacarAACViewModel::class.java)

        registraObservers()

        bt3pontostimeA.setOnClickListener{placarAACViewModel.adicionaPontoTimeA(3)}
        bt3pontostimeB.setOnClickListener{placarAACViewModel.adicionaPontoTimeB(3)}
        bt2pontostimeA.setOnClickListener{placarAACViewModel.adicionaPontoTimeA(2)}
        bt2pontostimeB.setOnClickListener{placarAACViewModel.adicionaPontoTimeB(2)}
        bt1pontostimeA.setOnClickListener{placarAACViewModel.adicionaPontoTimeA(1)}
        bt1pontostimeB.setOnClickListener{placarAACViewModel.adicionaPontoTimeB(1)}
    }

    private fun registraObservers() {

        placarAACViewModel.placarA.observe(this, Observer{
            placarTimeA.text=it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer{
            placarTimeB.text=it.toString()
        })
    }
}
