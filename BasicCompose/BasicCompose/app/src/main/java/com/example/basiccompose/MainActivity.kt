package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
    // Se crea el espacio de Columna, que agrupa los elementos de manera vertical
        Column(modifier = Modifier.padding(20.dp)) {
    // Cada elemento Text, serán distintas filas en la columna
            Text(text = "Hello")
            Text(text = name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }
}

@Composable
private fun MyApp(modifier: Modifier = Modifier,
                  names: List<String> = listOf("Mundo","Compose")
){
    Column {
        for (name in names) {
            Greeting(name =  name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
        MyApp()
    }
}

// Continuar con botones