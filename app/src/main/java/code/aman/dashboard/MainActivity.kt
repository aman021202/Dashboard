package code.aman.dashboard

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backB = findViewById<ImageButton>(R.id.backB)
        val logoutB = findViewById<ImageButton>(R.id.logoutB)
        val profileB = findViewById<ImageButton>(R.id.profileB)
        val todoB = findViewById<MaterialButton>(R.id.todoB)
       val editProfileB = findViewById<MaterialButton>(R.id.editProfileB)
        val contributeCard: CardView = findViewById(R.id.contributeCard)
        val practiceCard: CardView = findViewById(R.id.practiceCard)
        val learnCard: CardView = findViewById(R.id.learnCard)
        val  interestsCard: CardView = findViewById(R.id.interestsCard)
        val helpCard: CardView = findViewById(R.id.helpCard)
        val settingsCard: CardView = findViewById(R.id.settingsCard)

        backB.setOnClickListener {
            Toast.makeText(this, "Back Button", Toast.LENGTH_SHORT).show()
        }
        logoutB.setOnClickListener {
            Toast.makeText(this, "Logout Button", Toast.LENGTH_SHORT).show()
        }
        profileB.setOnClickListener {
            Toast.makeText(this, "Profile Image", Toast.LENGTH_SHORT).show()
        }
        todoB.setOnClickListener {
            Toast.makeText(this, "TODO list", Toast.LENGTH_SHORT).show()
        }
        editProfileB.setOnClickListener {
            Toast.makeText(this, "Editing Profile", Toast.LENGTH_SHORT).show()
        }
        contributeCard.setOnClickListener {
            Toast.makeText(this, "Contribute", Toast.LENGTH_SHORT).show()
        }
        practiceCard.setOnClickListener {
            Toast.makeText(this,"Practice", Toast.LENGTH_SHORT).show()
        }
        learnCard.setOnClickListener {
            Toast.makeText(this, "Learned", Toast.LENGTH_SHORT).show()
        }
        interestsCard.setOnClickListener {
            Toast.makeText(this, "Filter", Toast.LENGTH_SHORT).show()
        }
        helpCard.setOnClickListener {
            Toast.makeText(this,"Help", Toast.LENGTH_SHORT).show()
        }
        settingsCard.setOnClickListener {
            Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
        }
    }
}