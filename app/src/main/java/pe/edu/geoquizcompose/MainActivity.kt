package pe.edu.geoquizcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.geoquizcompose.ui.theme.GeoquizComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeoquizComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GeoQuiz()
                }
            }
        }
    }
}


@Composable
fun GeoQuiz() {

    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Is Lima the capital of Ecuador?")

        Row (horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()){
            Button(onClick = {
                Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
            }) {
                Text("Yes")
            }
            Button(onClick = {
                Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
            }) {
                Text("No")
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GeoQuizPreview() {
    GeoquizComposeTheme {
        GeoQuiz()
    }
}