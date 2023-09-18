package com.example.apuntes

import android.os.Bundle
import android.util.Log
import android.util.Printer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apuntes.ui.theme.ApuntesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApuntesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Column() {

                        for (i in 1..5) {

                        PrintOnScreen("Hola")
                    }
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    val name = listOf("Pepe", "juan", "Maria")

                    for (name in names) {
                        PrintOnScreen(name =)
                    }
                    for (i in names.indices) {
                        PrintOnScreen("index" + 1, i.toString())
                    }

                    names.forEach { name ->
                    PrintOnScreen(name)
                }
                    names.forEachIndexed{ index, name ->}
                    PrintOnScreen(name + " " + index.toString())

                }
            }
        }
    }
}

@Composable

fun PrintOnScreen(name: String?,name2: String?, modifier: Modifier = Modifier) {


        Text(
            text = "Hello ${name.uppercase()} ${name2.uppercase()}",
            modifier = modifier

        )

}



