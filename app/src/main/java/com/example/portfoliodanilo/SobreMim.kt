package com.example.portfoliodanilo

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.portfoliodanilo.ui.theme.CinzaClaro
import com.example.portfoliodanilo.ui.theme.Pink40
import com.example.portfoliodanilo.ui.theme.Preto
import com.example.portfoliodanilo.ui.theme.PurpleGrey40

@Composable
fun sobreMim(navController: NavController) {
    val imageModifier = Modifier
        .size(100.dp)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Box(
            modifier = Modifier
                .background(PurpleGrey40)
                .padding(24.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Imagem do lado esquerdo
                Image(
                    painter = painterResource(id = R.drawable.danilo),
                    contentDescription = null,
                    modifier = imageModifier
                )

                Card {
                    Text(
                        text = "Eu sou Danilo Souza e Web Disigner",
                        modifier = Modifier.padding(start = 16.dp)
                    )

                }

            }
        }

        // Texto no meio da tela
        Box(
            modifier = Modifier
                .background(PurpleGrey40)
                .padding(24.dp),
        ) {
            Text(
                text = "Como Web Designer, transformo ideias em experiências visuais memoráveis, utilizando código para criar designs inovadores e interfaces intuitivas. Colaboro com clientes e equipes de desenvolvimento para superar expectativas e entregar soluções personalizadas.",
                modifier = Modifier.fillMaxWidth()
            )
        }

        Card(
            modifier = Modifier
                .padding(25.dp)
                .background(PurpleGrey40)
        )
        {
            Text(text = "Habilidades")

        }

        Column(
            modifier = Modifier
                .background(color = androidx.compose.ui.graphics.Color.White)
                .padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Java", modifier = Modifier.weight(1f), textAlign = TextAlign.Start)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    LinearProgressIndicator(
                        progress = 0.8f,
                        modifier = Modifier.width(250.dp)
                    )
                    Text(text = "80%", modifier = Modifier.width(40.dp))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "HTML", modifier = Modifier.weight(1f), textAlign = TextAlign.Start)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    LinearProgressIndicator(
                        progress = 0.6f,
                        modifier = Modifier.width(250.dp)
                    )
                    Text(text = "60%", modifier = Modifier.width(40.dp))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "CSS", modifier = Modifier.weight(1f), textAlign = TextAlign.Left)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    LinearProgressIndicator(
                        progress = 0.7f,
                        modifier = Modifier.width(250.dp)
                    )
                    Text(text = "70%", modifier = Modifier.width(40.dp))
                }
            }
        }


    Box (modifier = Modifier
        .fillMaxSize()
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
fun prev2() {
    sobreMim(navController = rememberNavController())
}