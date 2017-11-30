package ke.co.tonymugendi.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ke.co.tonymugendi.swoosh.Model.Player
import ke.co.tonymugendi.swoosh.R
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var player = Player("", "")
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View) {
        player.league = "mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onWomensClicked(view: View) {
        player.league = "womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onCoedClicked(view: View) {
        player.league = "coed"

        mensBtn.isChecked = false
        womensBtn.isChecked = false

    }

    fun leagueClicked(view: View){
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }


    }
}
