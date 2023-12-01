package com.example.portfoliodanilo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.portfoliodanilo.ui.theme.PortfolioDaniloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioDaniloTheme {
                // A surface container using the 'background' color from the theme
               AppNavigation()
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun Preview() {

    AppNavigation()

}