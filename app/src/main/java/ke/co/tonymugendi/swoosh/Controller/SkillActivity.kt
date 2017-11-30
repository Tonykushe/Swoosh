package ke.co.tonymugendi.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ke.co.tonymugendi.swoosh.Model.Player
import ke.co.tonymugendi.swoosh.R
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    lateinit var player : Player


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBeginnerClicked(view: View) {
        player.skill = "beginner"
        ballerBtn.isChecked = false
    }

    fun onBallerClicked(view: View) {
        player.skill = "baller"
        beginnerBtn.isChecked = false
    }

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }

    }
}
