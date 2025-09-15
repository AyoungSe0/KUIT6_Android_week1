package com.example.kuit6_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kuit6_week1.ui.theme.InfoText
import com.example.kuit6_week1.ui.theme.Kuit6_week1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kuit6_week1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardAssignment(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CardAssignment(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(all = 45.dp)
            .size(width = 240.dp, height = 140.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(size = 10.dp)
            )
            .padding(all = 10.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "쿠잇 로고 이미지",
                    modifier = Modifier
                        .size(size = 40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
            }

            Column(
                modifier = Modifier
                    .padding(top = 6.dp, bottom = 8.dp)
            ) {
                HorizontalDivider(
                    thickness = 1.dp,
                    color = Color.Black
                )
            }

            Column(
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    text = "이름 : 서아영",
                    fontSize = 10.sp, // sp: Scale-Independent Pixels, 레이아웃을 정의할 때 텍스트의 크기를 지정하기 위해 사용
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .height(12.dp)
                )
                InfoText("학번 : 202411302")
                InfoText("학과 : 컴퓨터공학부")
                InfoText("생년월일 : 2005/10/09")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardPreview() {
    Box (
        modifier = Modifier.fillMaxSize()
    ) {
        CardAssignment()
    }
}