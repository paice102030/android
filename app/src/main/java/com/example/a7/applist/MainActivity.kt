package com.example.a7.applist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a7.remotelist.model.LP_Adapter
import com.example.a7.remotelist.model.LP_data
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.indeterminateProgressDialog
import org.jetbrains.anko.uiThread
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    var test = 0;
    var delay = 2000;
    var adapter: LP_Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        getMovies(this)
        test++;
    }

    private fun getMovies(context: MainActivity) {
        var displayMessage = indeterminateProgressDialog("Aguarde")
        displayMessage.show()

        if(test > 0){
            delay = 0;
        }

        Timer().schedule(delay.toLong()){
            doAsync {
                var soccerTeamData = LP_data()
                var soccerTeamArray = soccerTeamData.getLP_web()

                uiThread {
                    val soccerTeamResult = soccerTeamArray!!
                    adapter = LP_Adapter(context, soccerTeamResult)
                    gvSoccerTeam.adapter = adapter
                }

                displayMessage.dismiss()
            }
        }
    }
}
