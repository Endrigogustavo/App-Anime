package com.example.animes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animes.ui.theme.AnimesTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimesTheme {
            PinnedTopAppBar()
                scroll()

            }
        }
    }
}
@Preview
@Composable
fun final(){
    AnimesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = with (Modifier){
                    fillMaxSize()

                })
            {
                // Add more views here!
                PinnedTopAppBar()
                scroll()

            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun PinnedTopAppBar() {

    Scaffold(

        modifier = Modifier

            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Color(0xFF151F42), Color(0xFF252F4F), Color(0xFF151F42))
                )
            ),
        topBar ={
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF070D24)
                ),
                title = {
                    Column() {
                        Text(text = "AnimeList", fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            color = Color.White,)
                    }
                },
                navigationIcon = {

                    IconButton(
                        onClick = { /* doSomething() */ }) {
                        Icon(

                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    // RowScope here, so these icons will be placed horizontally
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Localized description",tint = Color.White
                        )
                    }

                },

            )
},
content = { innerPadding ->
    LazyColumn(

        modifier = with (Modifier){
            fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF070D24), Color.Transparent,Color(0xFF070D24))
                    )
                )

        },
        contentPadding = innerPadding,
        verticalArrangement = Arrangement.spacedBy(8.dp),

        ) {

        item(

        ){
            Image(
                painter = painterResource(id = R.drawable.img1),
                contentDescription = stringResource(id = R.string.app_name),
                modifier = Modifier
                    .fillMaxSize()



            )
        }
    }
}
)
}




@Composable
fun scroll(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .padding(top = 62.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color(0xFF070D24)
                        )
                    )
        )
        )
        {

            Column {
                Spacer(Modifier.height(300.dp))
                
                Text(text = "AnimeList",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(15.dp))

                Text(text = "Melhor app sobre animes de todos os tempos," +
                        "falamos sobre animes antigos e da atualidade e suas atualizaçoes",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(25.dp))
            }

        }
        Box(
            modifier = modifier.background(Color(0xFF070D24))
        )
        {
            Text(text = "Recomendados",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp))

        }
        Row(

            modifier = modifier
                .background(Color(0xFF070D24))
                .horizontalScroll(rememberScrollState())
        )
        {
            Image(
                painter = painterResource(R.drawable.demon),
                contentDescription = "Contact profile picture",
                modifier = Modifier

                    // Set image size to 40 dp
                    .size(200.dp)


            )

            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(200.dp)



            )


            Image(
                painter = painterResource(R.drawable.tok),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(200.dp)



            )


            Image(
                painter = painterResource(R.drawable.cav),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(200.dp)



            )
            Image(
                painter = painterResource(R.drawable.dress),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(200.dp)
                    
            )

        }


        Row(

            modifier = modifier
                .background(Color(0xFF070D24))
                .horizontalScroll(rememberScrollState())
        )
        {
            Image(
                painter = painterResource(R.drawable.a1),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(400.dp)
                    .padding(20.dp)
                    // Set image size to 40 dp

            )
            Image(
                painter = painterResource(R.drawable.a2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(400.dp)
                    .padding(20.dp)
                // Set image size to 40 dp


            )
            Image(
                painter = painterResource(R.drawable.a3),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(400.dp)
                    .padding(20.dp)
                // Set image size to 40 dp


            )

        }




        val items = listOf(
            BottomNavItem.Home,
            BottomNavItem.List,
            BottomNavItem.Analytics,
            BottomNavItem.Profile
        )

        NavigationBar(
        ) {
            items.forEach { item ->
                AddItem(
                    screen = item
                )
            }  }}

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun nav(){
    Scaffold(
        bottomBar = {
            BottomNavigation()
        },
    ) {}
}



