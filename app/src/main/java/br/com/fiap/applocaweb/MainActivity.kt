package br.com.fiap.applocaweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.applocaweb.screens.GmailRowItem2
import br.com.fiap.applocaweb.screens.LoginScreen
import br.com.fiap.applocaweb.screens.ProfileScreen
import br.com.fiap.applocaweb.screens.SendEmailScreen
import br.com.fiap.applocaweb.ui.theme.AppLocawebTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppLocawebTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = Color.White
                    ) {                 val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login"){

                        composable(route = "login"){
                            LoginScreen(navController)
                        }
                        composable(route = "caixaentrada"){
                            GmailRowItem2(navController)
                        }
                        composable(route = "enviaremail"){
                            SendEmailScreen(navController)
                        }
                        composable(route = "telaperfil"){
                            ProfileScreen(navController)
                        }
                    }
                }
                }
            }
        }
    }

