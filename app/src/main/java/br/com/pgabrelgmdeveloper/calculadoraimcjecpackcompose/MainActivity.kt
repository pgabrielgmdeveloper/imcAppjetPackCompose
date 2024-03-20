package br.com.pgabrelgmdeveloper.calculadoraimcjecpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pgabrelgmdeveloper.calculadoraimcjecpackcompose.ui.theme.CalculadoraIMCJecpackComposeTheme
import br.com.pgabrelgmdeveloper.calculadoraimcjecpackcompose.ui.theme.DARK_BLUE
import br.com.pgabrelgmdeveloper.calculadoraimcjecpackcompose.ui.theme.LIGHT_BLUE

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCJecpackComposeTheme {
              CalculadoraIMC()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculadoraIMC(){
    var peso by remember {
        mutableStateOf("")
    }
    var altura by remember {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            TopAppBar(

                modifier = Modifier
                    .fillMaxWidth(),

                title = { Text(text = "Calculadora IMC") },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = LIGHT_BLUE, titleContentColor = Color.White)
            )
        },
        floatingActionButton = {
            Text(text = "teste")
        }
    ){ it ->
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = "Calculadora de IMC", modifier = Modifier.padding(50.dp), fontWeight = FontWeight.Bold, fontSize = 18.sp, color = LIGHT_BLUE)
            OutlinedTextField(
                value = peso,
                onValueChange = {
                    peso = it
                },
                label = {
                    Text(text = "Peso")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 0.dp, 20.dp, 0.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    cursorColor = LIGHT_BLUE,
                    focusedBorderColor = LIGHT_BLUE,
                    focusedLabelColor = DARK_BLUE
                ),
                textStyle = TextStyle(color = DARK_BLUE),
                maxLines = 1,
                singleLine = true
            )
            OutlinedTextField(
                value = altura,
                onValueChange = {
                    altura = it
                },
                label = {
                    Text(text = "Altura")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 20.dp, 0.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    cursorColor = LIGHT_BLUE,
                    focusedBorderColor = LIGHT_BLUE,
                    focusedLabelColor = DARK_BLUE
                ),
                textStyle = TextStyle(color = DARK_BLUE),
                maxLines = 1,
                singleLine = true
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = LIGHT_BLUE)
            ) {
                Text(text = "Calcular", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
            Text(text = "Resultado", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = DARK_BLUE )
        }
    }

}

@Preview
@Composable
fun t () {
    CalculadoraIMC()
}
