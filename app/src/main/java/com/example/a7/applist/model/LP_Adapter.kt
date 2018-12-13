package com.example.a7.remotelist.model

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.a7.applist.R
import kotlinx.android.synthetic.main.activity_list_view.view.*
import com.bumptech.glide.Glide
import com.example.a7.applist.Details
import com.example.a7.applist.model.LP_web

class LP_Adapter : BaseAdapter {

    var soccerTeamList: List<LP_web>
    var context: Context? = null

    constructor(context: Context, soccerTeamList: List<LP_web>) : super() {
        this.context = context
        this.soccerTeamList = soccerTeamList
    }

    override fun getCount(): Int {
        return soccerTeamList.size
    }

    override fun getItem(position: Int): Any {
        return soccerTeamList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val soccerTeam = this.soccerTeamList[position]

        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var soccerTeamView = inflator.inflate(R.layout.activity_list_view, null)

        soccerTeamView.logo.setOnClickListener {
            val intent = Intent(context, Details::class.java)
            intent.putExtra("detail", soccerTeam.Description!!)
            intent.putExtra("name", soccerTeam.Name!!)
            context!!.startActivity(intent)
        }

        Glide.with(soccerTeamView).load(soccerTeam.Logo!!).into(soccerTeamView.logo)
        soccerTeamView.name.text = soccerTeam.Name!!
        soccerTeamView.year.text = soccerTeam.Year!!

        return soccerTeamView
    }
}
