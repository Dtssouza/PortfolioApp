package com.example.portfoliodanilo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.navigation.compose.rememberNavController
import com.example.portfoliodanilo.ui.theme.CinzaClaro
import com.example.portfoliodanilo.ui.theme.PurpleGrey40

@Composable

fun contato(navController: NavController) {

    val imageModifier = Modifier
        .size(100.dp)


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .background(PurpleGrey40),
            verticalAlignment = Alignment.CenterVertically
        ) {


            Box() {
                Image(

                    painter = painterResource(id = R.drawable.danilo),
                    contentDescription = null,
                    modifier = imageModifier
                )


            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp), // Ajuste o valor de padding conforme necessário
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Contate-me")

        }
        IconesComLinks()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(PurpleGrey40)
        ) {
            ElevatedButton(
                onClick = {navController.navigate(Screen.Home.route) },
                modifier = Modifier

                    .padding(8.dp),
                shape = MaterialTheme.shapes.medium // Escolha um valor apropriado
            ) {
                Text(text = "Home")
            }
        }
    }
}


@Preview
@Composable
fun prev3() {
    contato(navController = rememberNavController())
}