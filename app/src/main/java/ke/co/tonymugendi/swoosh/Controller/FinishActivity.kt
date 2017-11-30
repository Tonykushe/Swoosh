package ke.co.tonymugendi.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ke.co.tonymugendi.swoosh.Model.Player
import ke.co.tonymugendi.swoosh.R
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchText.text = "Looking for ${player.league} ${player.skill} league near you"
    }
}
