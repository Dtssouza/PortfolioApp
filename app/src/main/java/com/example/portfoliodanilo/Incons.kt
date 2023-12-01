package com.example.portfoliodanilo

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.portfoliodanilo.ui.theme.CinzaClaro
import com.example.portfoliodanilo.ui.theme.Pink80

@Composable
fun abrirLink(link: String) {
    // Adicione a lógica para abrir o link aqui
    // Por exemplo, usando a classe Intent para abrir um link em um navegador
}

@Composable
fun IconWithLink(icon: ImageVector, link: String, text: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(CinzaClaro, shape = CircleShape)
                .clip(CircleShape)
                .clickable {

                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Pink80
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = text)
    }
}

@Composable
fun IconesComLinks() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        // Instagram
        IconWithLink(
            icon = Icons.Outlined.AccountBox,
            link = "https://www.instagram.com/dtssouza00/",
            text = "dtssouza00"
        )

        // Ligação
        IconWithLink(
            icon = Icons.Filled.Call,
            link = "tel:+55 81 9456789", // Substitua pelo seu número de telefone real
            text = "123456789"
        )

        // GitHub
        IconWithLink(
            icon = Icons.Outlined.Person,
            link = "https://github.com/dashboard",
            text = "dtssouza"
        )
    }
}





@Preview
@Composable
fun IconesComLinksPreview() {
    IconesComLinks()
}