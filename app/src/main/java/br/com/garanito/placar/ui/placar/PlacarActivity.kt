package br.com.garanito.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.garanito.placar.R
import br.com.garanito.placar.utils.KEY_EXTRAS_TIME_A
import br.com.garanito.placar.utils.KEY_EXTRAS_TIME_B
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placarA = 0
    private var placarB = 0


    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_placar)

        if (savedInstanceState!=null){
            placarA = savedInstanceState.getInt("PLACAR_CASA")
            placarB = savedInstanceState.getInt("PLACAR_VISITANTE")
            placarTimeA.text = placarA.toString()
            placarTimeB.text = placarB.toString()
        }

        tvTimeA.text=intent.extras.getString(KEY_EXTRAS_TIME_A)
        tvTimeB.text=intent.extras.getString(KEY_EXTRAS_TIME_B)
/*
        bt3pontostimeA.setOnClickListener{adicionaPontoTimeA(3)}
        bt3pontostimeB.setOnClickListener{adicionaPontoTimeB(3)}

        bt2pontostimeA.setOnClickListener{adicionaPontoTimeA(2)}
        bt2pontostimeB.setOnClickListener{adicionaPontoTimeB(2)}

        bt1pontostimeA.setOnClickListener{adicionaPontoTimeA(1)}
        bt1pontostimeB.setOnClickListener{adicionaPontoTimeB(1)}

        btReiniciar.setOnClickListener{
            placarA=0
            placarB=0
            placarTimeA.text = placarA.toString()
            placarTimeB.text = placarB.toString()
        }*/
    }



    private fun adicionaPontoTimeA(ponto:Int){
        placarA+=ponto
        placarTimeA.text = placarA.toString()
    }

    private fun adicionaPontoTimeB(ponto:Int){
        placarB+=ponto
        placarTimeB.text = placarB.toString()
    }

    override fun onResume(){
        super.onResume()
        Log.i("TAG","ONRESUME")
    }

    override fun onStop(){
        super.onStop()
        Log.i("TAG","ONSTOP")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("PLACAR_CASA", placarA)
        outState?.putInt("PLACAR_VISITANTE", placarB)
    }
}
