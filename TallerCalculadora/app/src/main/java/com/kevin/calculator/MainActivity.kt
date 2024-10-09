package com.kevin.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kevin.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                CalculatorApp()
            }
        }
    }
}

@Composable
fun CalculatorApp() {
    var cadena by remember { mutableStateOf("") }
    var operand1 by remember { mutableStateOf("") }
    var operand2 by remember { mutableStateOf("") }
    var operator by remember { mutableStateOf<Char?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = cadena,
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(24.dp),
            fontSize = 36.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { cadena += "1"; if (operator == null) operand1 += "1" else operand2 += "1" }) {
                    Text(text = "1")
                }
                Button(onClick = { cadena += "2"; if (operator == null) operand1 += "2" else operand2 += "2" }) {
                    Text(text = "2")
                }
                Button(onClick = { cadena += "3"; if (operator == null) operand1 += "3" else operand2 += "3" }) {
                    Text(text = "3")
                }
                Button(onClick = { cadena += "+"; operator = '+' }) {
                    Text(text = "+")
                }
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { cadena += "4"; if (operator == null) operand1 += "4" else operand2 += "4" }) {
                    Text(text = "4")
                }
                Button(onClick = { cadena += "5"; if (operator == null) operand1 += "5" else operand2 += "5" }) {
                    Text(text = "5")
                }
                Button(onClick = { cadena += "6"; if (operator == null) operand1 += "6" else operand2 += "6" }) {
                    Text(text = "6")
                }
                Button(onClick = { cadena += "-"; operator = '-' }) {
                    Text(text = "-")
                }
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { cadena += "7"; if (operator == null) operand1 += "7" else operand2 += "7" }) {
                    Text(text = "7")
                }
                Button(onClick = { cadena += "8"; if (operator == null) operand1 += "8" else operand2 += "8" }) {
                    Text(text = "8")
                }
                Button(onClick = { cadena += "9"; if (operator == null) operand1 += "9" else operand2 += "9" }) {
                    Text(text = "9")
                }
                Button(onClick = { cadena += "*"; operator = '*' }) {
                    Text(text = "*")
                }
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { cadena = ""; operand1 = ""; operand2 = ""; operator = null }) {
                    Text(text = "C")
                }
                Button(onClick = { cadena += "0"; if (operator == null) operand1 += "0" else operand2 += "0" }) {
                    Text(text = "0")
                }
                Button(onClick = { if (operand1.isNotEmpty() && operand2.isNotEmpty() && operator != null) {
                    val result = when (operator) {
                        '+' -> operand1.toInt() + operand2.toInt()
                        '-' -> operand1.toInt() - operand2.toInt()
                        '*' -> operand1.toInt() * operand2.toInt()
                        else -> 0
                    }
                    cadena = result.toString()
                    operand1 = result.toString()
                    operand2 = ""
                    operator = null
                }}) {
                    Text(text = "=")
                }
                Button(onClick = { cadena += "/"; operator = '/' }) {
                    Text(text = "/")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        CalculatorApp()
    }
}