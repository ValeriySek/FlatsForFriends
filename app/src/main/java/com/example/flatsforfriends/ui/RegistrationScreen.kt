package com.example.flatsforfriends.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.TextFieldValue
import com.example.flatsforfriends.ui.theme.gradientGreen

@Composable
fun RegistrationBody() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Column(
//            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                modifier = Modifier.padding(16.dp),
                text = "Регистрация",
                style = TextStyle(fontSize = 34.sp, fontWeight = FontWeight.W700)
            )

            BaseTextField()

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .defaultMinSize(minHeight = 50.dp)
                        .padding(16.dp, 0.dp, 16.dp, 50.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp)),
                ) {
                    Row(
                        modifier = Modifier
                            .background(gradientGreen)
                            .fillMaxWidth()
                            .height(50.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Далее",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BaseTextField() {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),){

        Text(
//            modifier = Modifier.padding(16.dp),
            text = "Введите номер телефона",
            style = TextStyle(
                fontWeight = FontWeight.W400,
                color = Color(0xFFAFB9C5),
                fontSize = 15.sp
            )
        )
        Card(
            modifier = Modifier
//                .padding(16.dp)
                .fillMaxWidth(),
            elevation = 8.dp,
            backgroundColor = Color.White
        ) {

            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                label = { Text("") },
                onValueChange = { text = it }
            )
        }
    }

}