package br.com.fiap.applocaweb.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {

    var lembrar by remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier.fillMaxSize()) {


        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp)
        ) {
            Column(
                modifier = Modifier
                    .background(Color(0xFFD8E1F1))
                    .fillMaxSize()
            ) {


                Spacer(modifier = Modifier.padding(52.dp))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        color = Color(0xFF280674),
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        text = "Bem-vindo"
                    )
                }
                Spacer(modifier = Modifier.padding(28.dp))
                Text(
                    modifier = Modifier.offset(y = 82.dp, x = 36.dp),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF280674),
                    text = "Email"
                )

                TextField(
                    modifier = Modifier
                        .padding(32.dp)
                        .fillMaxWidth()

                        .offset(y = 62.dp),
                    value = "", onValueChange = {},
                    shape = RoundedCornerShape(22.dp),
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color.Blue)
                )
                Text(
                    modifier = Modifier.offset(y = 56.dp, x = 36.dp),
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF280674),
                    text = "Senha"
                )

                TextField(
                    modifier = Modifier
                        .padding(32.dp)
                        .fillMaxWidth()
                        .offset(y = 32.dp),

                    value = "", onValueChange = {},
                    shape = RoundedCornerShape(22.dp),
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color.Blue)
                )
                Row(modifier = Modifier.fillMaxWidth()) {

                    OutlinedButton(
                        border = BorderStroke(0.dp, Color.Transparent),
                        onClick = { /*TODO*/ }) {
                        Text(
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF280674),
                            modifier = Modifier.padding(horizontal = 16.dp),
                            text = "Esqueci minha senha"
                        )

                    }


                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 25.dp)
                        .offset(), verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = lembrar,
                        onCheckedChange = {
                            lembrar = it
                        }
                    )
                    Text(
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier.offset(x = (-5).dp),
                        text = "Lembrar"
                    )

                }
                Spacer(modifier = Modifier.padding(42.dp))

                Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                    OutlinedButton(
                        border = BorderStroke(0.dp, Color.Transparent),
                        onClick = { navController.navigate("caixaentrada") }) {
                        Text(
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF280674),
                            text = "ENTRAR"
                        )
                    }
                }


            }
        }
    }
}


//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun LoginScreenPreview() {
 //   LoginScreen(navController = NavController())
//}
