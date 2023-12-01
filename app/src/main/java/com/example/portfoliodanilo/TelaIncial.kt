package com.example.portfoliodanilo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.portfoliodanilo.ui.theme.CinzaClaro
import com.example.portfoliodanilo.ui.theme.PurpleGrey40

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object SobreMim : Screen("sobreMim")
    object Contato : Screen("contato")
}


@Composable
fun telaInical(navController: NavController) {

    val imageModifier = Modifier
        .size(150.dp)


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier
            .padding(vertical = 100.dp)
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .background(PurpleGrey40)
        )
        {
            Text(text = "Oi, Eu sou Danilo Souza")

        }



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(PurpleGrey40),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.weight(1f)
            ) {
                Row {
                    Text(text = "Eu Sou um Web Designer, Transformando ideias em experiências visuais memoráveis, uma linha de código de cada vez.")
                }

                // Adicione um Spacer para empurrar o texto para baixo
                Spacer(
                    modifier = Modifier

                        .height(16.dp)
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.danilo),
                    contentDescription = null,
                    modifier = imageModifier
                )
            }

        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
        ) {

            ElevatedButton(
                onClick = { navController.navigate(Screen.SobreMim.route) },
                modifier = Modifier
                    .padding(8.dp),
                shape = MaterialTheme.shapes.medium
            ) {
                Text(text = "Sobre Mim")
            }
            ElevatedButton(
                onClick = { navController.navigate(Screen.Contato.route) },
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = MaterialTheme.shapes.medium
            ) {
                Text(text = "Contato")
            }
        }

        Row {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(PurpleGrey40)
            )
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { telaInical(navController) }
        composable(Screen.SobreMim.route) { sobreMim(navController) }
        composable(Screen.Contato.route) { contato(navController) }
    }
}

@Preview
@Composable
fun prev() {
    telaInical(navController = rememberNavController())
}