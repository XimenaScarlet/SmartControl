
package com.smartcontrol.ui

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.smartcontrol.controllers.*
import com.smartcontrol.tv.TVStatus
import kotlinx.coroutines.*

@Composable
fun AppRoot(){
 val context = LocalContext.current
 val cast = CastController(context)
 val samsung = SamsungController("AUTO")
 val dlna = DLNAController("AUTO")
 val autodetectType = remember { mutableStateOf("Detectando...") }

 Column(Modifier.fillMaxSize().padding(10.dp)) {
   Text("SmartControl PRO FINAL REAL", color = MaterialTheme.colorScheme.primary)

   TVStatusScreen(
        TVStatus("Detectando","-",0,true,"-")
   )
 }
}
