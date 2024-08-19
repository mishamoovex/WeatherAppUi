package androidlead.weatherappui.ui.screen.util

import androidlead.weatherappui.R
import androidx.annotation.DrawableRes

data class ForecastItem(
    @DrawableRes val image: Int,
    val dayOfWeek: String,
    val date: String,
    val temperature: String,
    val airQuality: String,
    val airQualityIndicatorColorHex: String,
    val isSelected: Boolean = false
)

val ForecastData = listOf(
    ForecastItem(
        image = R.drawable.img_cloudy,
        dayOfWeek = "Mon",
        date = "13 Feb",
        temperature = "26°",
        airQuality = "194",
        airQualityIndicatorColorHex = "#ff7676"
    ),
    ForecastItem(
        image = R.drawable.img_moon_stars,
        dayOfWeek = "Tue",
        date = "14 Feb",
        temperature = "18°",
        airQuality = "160",
        airQualityIndicatorColorHex = "#ff7676",
        isSelected = true
    ),
    ForecastItem(
        image = R.drawable.img_thunder,
        dayOfWeek = "Wed",
        date = "15 Feb",
        temperature = "16°",
        airQuality = "40",
        airQualityIndicatorColorHex = "#2dbe8d"
    ),
    ForecastItem(
        image = R.drawable.img_clouds,
        dayOfWeek = "Thu",
        date = "16 Feb",
        temperature = "20°",
        airQuality = "58",
        airQualityIndicatorColorHex = "#f9cf5f"
    ),
    ForecastItem(
        image = R.drawable.img_sun,
        dayOfWeek = "Fri",
        date = "17 Feb",
        temperature = "34°",
        airQuality = "121",
        airQualityIndicatorColorHex = "#ff7676"
    ),
    ForecastItem(
        image = R.drawable.img_rain,
        dayOfWeek = "Sat",
        date = "18 Feb",
        temperature = "28°",
        airQuality = "73",
        airQualityIndicatorColorHex = "#f9cf5f"
    ),
    ForecastItem(
        image = R.drawable.img_thunder,
        dayOfWeek = "Sun",
        date = "19 Feb",
        temperature = "24°",
        airQuality = "15",
        airQualityIndicatorColorHex = "#2dbe8d"
    )
)