package com.example.primeiraaula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primeiraaula.ui.theme.Ku
import com.example.primeiraaula.ui.theme.PrimeiraAulaTheme
import com.example.primeiraaula.ui.theme.Shi
import com.example.primeiraaula.ui.theme.Zu

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiraAulaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    ProdutoItem()
                }
            }
        }
    }
}


@Composable
fun ProdutoItem() {
    Column(
        Modifier
            .fillMaxSize()

    ){
        Box(
            Modifier
                .background(brush = Brush.horizontalGradient(listOf(Shi, Zu, Ku)))
                .height(150.dp)
                .fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(id = R.drawable.shizuku_icon),
                contentDescription = "Shizuku",
                Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.height(100.dp))

        Column(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
        {
            var text by remember { mutableStateOf("") }

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = colorResource(R.color.purple_700),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .background(Color.White),
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Nome:") }
            )

            Spacer(modifier = Modifier.height(40.dp))

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        shape = RoundedCornerShape(5.dp),
                        color = colorResource(R.color.purple_700)
                    )
                    .background(Color.White),
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Telefone:") }
            )
            Spacer(modifier = Modifier.height(40.dp))

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = colorResource(R.color.purple_700),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .background(Color.White),
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Curso:") }
            )
            Spacer(modifier = Modifier.height(40.dp))

           TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = colorResource(R.color.purple_700),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .background(Color.White),
                value = text,
                onValueChange = { newText ->
                    text = newText
                },
                label = { Text("Série:") }
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = { /*TODO*/ },
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(20.dp)
            ){
                Text(
                    text = "Enviar",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White,
                    fontSize = 17.sp
                )

            }
        }
    }
}
