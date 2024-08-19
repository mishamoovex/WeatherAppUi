package androidlead.weatherappui.ui.screen

import androidlead.weatherappui.ui.screen.components.ActionBar
import androidlead.weatherappui.ui.screen.components.AirQuality
import androidlead.weatherappui.ui.screen.components.DailyForecast
import androidlead.weatherappui.ui.screen.components.WeeklyForecast
import androidlead.weatherappui.ui.theme.ColorBackground
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { paddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddings)
                .padding(horizontal = 24.dp, vertical = 10.dp)
        ) {
            ActionBar()
            Spacer(
                modifier = Modifier.height(12.dp)
            )
            DailyForecast()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            AirQuality()
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            WeeklyForecast()
        }
    }
}