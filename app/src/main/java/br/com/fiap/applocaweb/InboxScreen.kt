package br.com.fiap.applocaweb

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InboxScreen() {
    Column(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF0339A2))
        ) {
            TextField(
                modifier = Modifier
                    .padding(22.dp)
                    .fillMaxWidth(),
                value = "Pesquisar", onValueChange = {},
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "search")
                }
            )

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color(0xFFFD5151))
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFD5151)
                    )
                ) {
                    //Icon(imageVector = Icons.Default.Email , contentDescription = "Email")
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_all_inbox_24),
                        contentDescription = "Inbox"
                    )

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFD5151)
                    )
                ) {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "Email")

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFD5151)
                    )
                ) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Email")

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFD5151)
                    )
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_archive_24),
                        contentDescription = "Inbox"
                    )

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFD5151)
                    )
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_send_24),
                        contentDescription = "Inbox"
                    )

                }

            }
        }


        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )

        }


        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .border(border = BorderStroke(1.dp, Color.Gray))
        ) {

            Text(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = "REPRESENTAÇÃO DE UM EMAIL"
            )
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFD5151))) {
            Row(horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFFD5151))){
                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFD5151)
                )
                    , onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        imageVector = Icons.Default.Email, contentDescription = "Email")
                }

                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0339A2)),
                    modifier = Modifier
                        .size(90.dp)
                        .offset(y = (-5).dp),
                    onClick = { /*TODO*/ }) {
                    Icon(modifier = Modifier.size(50.dp),
                        imageVector = Icons.Default.Add,
                        contentDescription = "EnviarEmail")

                }
                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFD5151)
                )
                    , onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        imageVector = Icons.Default.DateRange, contentDescription = "Email")
                }


            }


        }

    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InboxScreenPreview() {
    InboxScreen()

}