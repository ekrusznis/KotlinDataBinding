package uw.ek.kotlindatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import uw.ek.kotlindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)
        val user = User("Eric Krusznis", 33, "ekrusznis@gmail.com")
        binding.setVariable(BR.user, user)
        binding.executePendingBindings()
    }
}
