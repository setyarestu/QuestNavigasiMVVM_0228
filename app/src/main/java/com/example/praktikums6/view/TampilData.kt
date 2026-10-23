package com.example.praktikums6.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Fungsi utama TampilData dengan tombol kembali
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
) {
    // Data yang akan ditampilkan (label dan isi)
    val items = listOf(
        Pair("Nama Lengkap", "Contoh Nama"),
        Pair("Jenis Kelamin", "Lainnya"),
        Pair("Alamat", "Yogyakarta")
    )

    // Kerangka layar dengan TopAppBar berwarna Teal
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Tampil Data", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF018786)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Menampilkan setiap data dan garis pemisah cyan
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase(), fontSize = 16.sp) // Label
                        Text(
                            text = item.second, // Isi data
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 22.sp
                        )
                    }
                    HorizontalDivider(thickness = 1.dp, color = Color.Cyan) // Garis pemisah
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Tombol Kembali
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackBtnClick
                ) {
                    Text(text = "Back")
                }
            }
        }
    }
}