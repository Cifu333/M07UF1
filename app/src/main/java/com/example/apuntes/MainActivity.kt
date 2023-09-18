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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apuntes.ui.theme.ApuntesTheme

class MainActivity : ComponentActivity() {

    enum class Colors(val text:String, val number:Int, val color:Color){

        Red("Rojo", 0, Color.Red),
        Brown("Marron", 1, Color.Brown),
        Yellow("Amarillo", 2, Color.Yellow);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApuntesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Column() {

                    }
                }
            }
        }
    }
}

@Composable

fun PrintOnScreen(name: String, color:MainActivity.Colors, modifier: Modifier = Modifier) {


        Text(
            text = "Hello ${name.uppercase()}",
            color= color.WithAlpha(0.1f)

            }

        )

}



