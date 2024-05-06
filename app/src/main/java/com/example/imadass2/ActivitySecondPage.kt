package com.example.imadass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ActivitySecondPage<Button : View?> : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val petImageView = findViewById<ImageView>(R.id.petImageView2)

        val feedButton = findViewById<Button>(R.id.feedButton)

        val cleanButton = findViewById<Button>(R.id.cleanButton)

        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)

        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)

        val playTextView = findViewById<TextView>(R.id.playTextView)

        val feedMessage = intent.getStringExtra("FEED_MESSAGE")

        feedTextView.text = feedMessage

// Logic for the Feed button

        feedButton?.setOnClickListener {

                        // Change the pet's image to match feeding action icon

            petImageView.setImageResource(R.drawable.rottweilereating)

    // Update the pet's status values (e.g., health, hunger, cleanliness)

            feedTextView.text = getString(R.string.feed_thank_you)
            playTextView.text= getString(R.string.play_with_me)

    }

// Logic for the Clean button

        cleanButton?.setOnClickListener {

        petImageView.setImageResource(R.drawable.rottweilercleaned)

                cleanTextView.text = getString(R.string.cleaned_message)  // Update cleanTextView message



}

// Logic for the Play button

        playButton?.setOnClickListener {

    // Change the pet's image to match playing action icon

            petImageView.setImageResource(R.drawable.rottweilerplaying)//your picture name he

            cleanTextView.text = getString(R.string.clean_nice_and_clean)

            playTextView.text = getString(R.string.play_that_was_fun)
        }


    }
}
