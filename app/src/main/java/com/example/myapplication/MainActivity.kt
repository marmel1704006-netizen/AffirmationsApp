package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFF0F2F5)) {
                UnscrambleScreen()
            }
        }
    }
}

@Composable
fun UnscrambleScreen() {
    var userWord by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Unscramble",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 40.dp)
        )


        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                    Surface(color = Color(0xFFE8EAF6), shape = RoundedCornerShape(4.dp)) {
                        Text("0/10", modifier = Modifier.padding(4.dp), fontSize = 12.sp)
                    }
                }


                Text(
                    text = "scrambleun",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Unscramble the word using all the letters.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )


                OutlinedTextField(
                    value = userWord,
                    onValueChange = { userWord = it },
                    label = { Text("Enter your word") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp)
                )
            }
        }


        Button(
            onClick = { /* Дія */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F51B5))
        ) {
            Text("Submit", color = Color.White)
        }


        OutlinedButton(
            onClick = { /* Дія */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Skip")
        }

        Spacer(modifier = Modifier.weight(1f))


        Surface(
            color = Color(0xFFE0E0E0),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                "Score: 0",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                fontWeight = FontWeight.Bold
            )
        }
    }
}