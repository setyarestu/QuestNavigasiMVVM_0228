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
    )