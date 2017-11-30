package ke.co.tonymugendi.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_LEAGUE
import ke.co.tonymugendi.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var selectedleague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        selectedleague = "mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onWomensClicked(view: View) {
        selectedleague = "womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false

    }

    fun onCoedClicked(view: View) {
        selectedleague = "coed"

        mensBtn.isChecked = false
        womensBtn.isChecked = false

    }

    fun leagueClicked(view: View){
        if (selectedleague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedleague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }


    }
}
