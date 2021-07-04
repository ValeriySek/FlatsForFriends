package com.example.flatsforfriends

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.flatsforfriends.ui.LaunchScreen
import com.example.flatsforfriends.ui.RegistrationBody
import com.example.flatsforfriends.ui.theme.FlatsForFriendsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlatsForFriendsTheme {
                val navController = rememberNavController()
                FFFNavHost(navController = navController)
            }
        }
    }
}

@Composable
fun FFFNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "Launch"
    ) {
        composable("Launch"){
            LaunchScreen(onClick = { navController.navigate("Register") })
        }
        composable("Register"){
            RegistrationBody()
        }
    }
}