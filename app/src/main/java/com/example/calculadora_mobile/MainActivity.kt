package com.example.calculadora_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import calculadora
import com.example.calculadora_mobile.ui.theme.Calculadora_mobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_mobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    CalculadoraScreen()

                }
            }
        }
    }
}


@Composable
fun CalculadoraScreen(){
    var value1 by remember { mutableStateOf("") }
    var value2 by remember { mutableStateOf("") }
    var operator by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Celumn(Modifier ,padding(16.dp)) {
        TextField(
            value = value2,
            onValueChange = { value2 = it },
            label= { Text("Value 2")},
            keyboardOptions=  keyboardOptions.Default.Copy(
                keyboardType =  keyboard.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = value3,
            onValueChange = {value3 = it },
            label = { Text("Value 3")},
            //keyboardOptions = keyboardOptions.Default.copy(
            //    keyboardType = keyboardType.Number
            //),
            modifier = Modifier.fillMaxWidth()
        )

    }
}


@Preview (showBackground = true)
@Composable
fun DefaultPreview(){
    CalculadoraScreen()
}