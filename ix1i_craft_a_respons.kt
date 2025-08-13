/**
 * Project: Craft a Responsive Mobile App Notifier
 * File: ix1i_craft_a_respons.kt
 * Language: Kotlin
 * Description: A mobile app notifier that sends push notifications to users based on their preferences.
 * Features:
 *  - User profile creation and management
 *  - Customizable notification settings
 *  - Real-time push notifications
 *  - Responsive UI for various mobile devices
 */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var notificationManager: NotificationManagerCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationManager = NotificationManagerCompat.from(this)

        // Initialize user profile and notification settings
        initUserProfile()

        // Set up notification listener
        notificationListener()

        // Send test notification
        sendNotification("Welcome to Craft Notify!")
    }

    private fun initUserProfile() {
        // TO DO: Implement user profile creation and management
    }

    private fun notificationListener() {
        // TO DO: Implement notification listener to receive updates from backend
    }

    private fun sendNotification(message: String) {
        val notification = NotificationCompat.Builder(this, "CraftNotifyChannel")
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Craft Notify")
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .build()

        notificationManager.notify(1, notification)
    }
}