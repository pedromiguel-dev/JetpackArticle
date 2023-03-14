package com.example.jetpackarticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackarticle.ui.theme.JetpackArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        HeaderImageArticle()
                        Column(modifier = Modifier.padding(16.dp)) {
                            TitleArticle()
                            FirstParagraphArticle()
                            SecondParagraphArticle()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun HeaderImageArticle(){
    val image = painterResource(R.drawable.jetpak_compose_header)
    Image(painter = image, contentDescription = stringResource(id = R.string.jetpack_header_desc))
}
@Composable
fun TitleArticle(){
    Text(text = stringResource(R.string.title_article), fontSize = 24.sp,
        modifier = Modifier.padding(bottom = 16.dp))
}
@Composable
fun FirstParagraphArticle(){
    Text(text = stringResource(R.string.first_paragraph), fontSize = 16.sp,  textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp))
}
@Composable
fun SecondParagraphArticle(){
    Text(text = stringResource(R.string.second_paragraph), fontSize = 16.sp,  textAlign = TextAlign.Justify,
        modifier = Modifier.padding(bottom = 16.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackArticleTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            HeaderImageArticle()
            Column(modifier = Modifier.padding(16.dp)) {
                TitleArticle()
                FirstParagraphArticle()
                SecondParagraphArticle()
            }
        }
    }
}