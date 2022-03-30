package com.example.tutorialjetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
    
    @Composable
    private fun MainContent(){
        Scaffold(
            topBar={MainTopBar()},
            floatingActionButton={MainFab()},
        ) {
            
        }
    }

    @Composable
    private fun MainTopBar() {
        TopAppBar(
            title = { Text(text = stringResource(id = R.string.app_name))},
            backgroundColor = colorResource(id = R.color.purple_500),
            contentColor = Color.White)
    }

    @Composable
    private fun MainFab() {
        FloatingActionButton(onClick = { showAddForm()}){
            Icon(imageVector = Icons.Filled.Add, contentDescription = "text")
        }
    }

    private fun showAddForm() {
        startActivity(Intent(this, FormActivity::class.java))
    }

    @Composable
    @Preview
    private fun DefaultPreview(){
        MainContent()
    }
}
