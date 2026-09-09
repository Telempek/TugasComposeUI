package com.example.modul2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modul2.ui.theme.Modul2Theme

@Composable
fun HalamanProfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer)
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Foto Profil",
                modifier = Modifier.size(80.dp),
                tint = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Muhammad Abdurrahman",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Android Developer Enthusiast",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                ItemKontak(icon = Icons.Default.Email, info = "abdurrahman@example.com")
                Spacer(modifier = Modifier.height(12.dp))
                ItemKontak(icon = Icons.Default.Phone, info = "+62 812 3456 7890")
                Spacer(modifier = Modifier.height(12.dp))
                ItemKontak(icon = Icons.Default.LocationOn, info = "Malang, Indonesia")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Edit Profil")
        }
    }
}

@Composable
fun InfoStatistik(label: String, nilai: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = nilai, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = label, fontSize = 14.sp, color = Color.Gray)
    }
}

@Composable
fun ItemKontak(icon: ImageVector, info: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = info, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHalamanProfil() {
    Modul2Theme {
        HalamanProfil()
    }
}
