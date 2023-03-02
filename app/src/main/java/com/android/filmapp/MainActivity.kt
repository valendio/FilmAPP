package com.android.filmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.myrecyclerviewfilm.CardViewFilmAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvFilms: RecyclerView
    private var list: ArrayList<Film> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFilms = findViewById(R.id.rv_film)
        rvFilms.setHasFixedSize(true)

        list.addAll(FilmData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvFilms.layoutManager = LinearLayoutManager(this)
        val listFilmAdapter = ListFilmAdapter(list)
        rvFilms.adapter = listFilmAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                showRecyclerCardView()
            }
        }
    }

    private fun showRecyclerGrid() {
        rvFilms.layoutManager = GridLayoutManager(this, 2)
        val gridFilmAdapter = GridFilmAdapter(list)
        rvFilms.adapter = gridFilmAdapter
    }

    private fun showRecyclerCardView() {
        rvFilms.layoutManager = LinearLayoutManager(this)
        val cardViewFilmAdapter = CardViewFilmAdapter(list)
        rvFilms.adapter = cardViewFilmAdapter
    }


}