package ru.ngs.suvorov.app

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.*
import ru.ngs.suvorov.app.ui.theme.AppTheme
import ru.ngs.suvorov.feature.character.data.network.CharacterApi
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var character: CharacterApi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        GlobalScope.launch(Dispatchers.Main){

            val gg = withContext(Dispatchers.IO) {character.getCharacter(1)}
            Log.d("dfvdfvazdv",gg.toString() )
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme {
        Greeting("Android")
    }
}