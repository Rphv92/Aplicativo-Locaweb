package br.com.fiap.applocaweb.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.applocaweb.R

@Composable
fun ProfileScreen(navController: NavController) {

        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFD8E1F1))
        ) {


                Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp)
                ) {

                        OutlinedButton(
                                border = BorderStroke(0.dp, Color.Transparent),
                                onClick = { /*TODO*/ }
                        ) {
                                Icon(
                                        tint = Color(0xFF5C77AC),
                                        imageVector = Icons.Default.Create,
                                        contentDescription = "editar perfil"
                                )

                        }


                }
                Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 22.dp)
                ) {
                        Image(
                                painter = painterResource(id = R.drawable.profilepictureblkank),
                                contentDescription = null,
                                modifier = Modifier
                                        .size(120.dp)
                                        .clip(CircleShape)
                                        .background(MaterialTheme.colorScheme.primary)
                        )

                }
                Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier
                                        .fillMaxWidth()
                        ) {

                                        Text(
                                                fontSize = 26.sp,
                                                color = Color(0xFF5C77AC),
                                                text = "Nome do usuário")

                        }


                }
                Spacer(modifier = Modifier.padding(1.dp))
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                ) {
                        Text(
                                fontSize = 17.sp, color = Color.Gray,
                                text = "email do usuario"
                        )

                }

                Spacer(modifier = Modifier.padding(vertical = 22.dp))
                Column {
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { navController.navigate("caixaentrada") }
                                ) {
                                        Icon(
                                                tint = Color(0xFF5C77AC),
                                                painter = painterResource(id = R.drawable.baseline_all_inbox_24),
                                                contentDescription = "Inbox"
                                        )
                                        Text(
                                                color = Color(0xFF5C77AC),
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Caixa de entrada",
                                        )

                                }
                                Spacer(modifier = Modifier.padding(vertical = 32.dp))
                        }
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { /*TODO*/ }
                                ) {
                                        Icon(
                                                tint = Color(0xFF5C77AC),
                                                painter = painterResource(id = R.drawable.baseline_calendar_month_24),
                                                contentDescription = "Íncone do calendário"
                                        )
                                        Text(
                                                color = Color(0xFF5C77AC),
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Calendário",
                                        )

                                }
                                Spacer(modifier = Modifier.padding(vertical = 32.dp))
                        }
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { /*TODO*/ }
                                ) {
                                        Icon(
                                                tint = Color(0xFF5C77AC),
                                                painter = painterResource(id = R.drawable.baseline_star_border_24),
                                                contentDescription = "Ícone de favoritos"
                                        )
                                        Text(
                                                color = Color(0xFF5C77AC),
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Favoritos",
                                        )

                                }
                                Spacer(modifier = Modifier.padding(vertical = 32.dp))
                        }
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { /*TODO*/ }
                                ) {
                                        Icon(
                                                tint = Color(0xFF5C77AC),
                                                painter = painterResource(id = R.drawable.baseline_credit_card_24),
                                                contentDescription = "Pagamentos"
                                        )
                                        Text(
                                                color = Color(0xFF5C77AC),
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Pagamentos",
                                        )

                                }
                                Spacer(modifier = Modifier.padding(vertical = 32.dp))
                        }
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { /*TODO*/ }
                                ) {
                                        Icon(
                                                tint = Color(0xFF5C77AC),
                                                painter = painterResource(id = R.drawable.baseline_support_agent_24),
                                                contentDescription = "Ícone de suporte"
                                        )
                                        Text(
                                                color = Color(0xFF5C77AC),
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Suporte"
                                        )

                                }
                                Spacer(modifier = Modifier.padding(vertical = 52.dp))
                        }
                        Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 32.dp)
                        ) {
                                OutlinedButton(
                                        border = BorderStroke(0.dp, Color.Transparent),
                                        onClick = { navController.navigate("login") }
                                ) {
                                        Icon(
                                                tint = Color.Red,
                                                painter = painterResource(id = R.drawable.baseline_logout_24),
                                                contentDescription = "Botão Sair"
                                        )
                                        Text(
                                                color = Color.Red,
                                                modifier = Modifier.padding(horizontal = 16.dp),
                                                text = "Sair"
                                        )

                                }
                        }


                }

        }

}




//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun ProfileScreenPreview() {
//ProfileScreen()
//}