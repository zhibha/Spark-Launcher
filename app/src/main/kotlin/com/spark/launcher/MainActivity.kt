package com.spark.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Greeting("World") }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello, " + name + "!")
}

// Press the Preview button in the editor toolbar to render these through the Compose interpreter.
@Preview
@Composable
fun GreetingPreview() {
    Greeting("Compose")
}

@Preview
@Composable
fun CardPreview() {
    Column {
        Text("Title")
        Text("Body")
    }
}
