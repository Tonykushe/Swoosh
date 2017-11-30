package ke.co.tonymugendi.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_LEAGUE
import ke.co.tonymugendi.swoosh.R
import ke.co.tonymugendi.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""
    var selectedskill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

    }

    fun onBeginnerClicked(view: View) {
        selectedskill = "beginner"
        ballerBtn.isChecked = false
    }

    fun onBallerClicked(view: View) {
        selectedskill = "baller"
        beginnerBtn.isChecked = false
    }

    fun onFinishClicked(view: View) {
        if (selectedskill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedskill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }

    }
}
