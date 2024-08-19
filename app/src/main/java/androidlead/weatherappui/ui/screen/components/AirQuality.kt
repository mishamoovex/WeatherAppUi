package androidlead.weatherappui.ui.screen.components

import androidlead.weatherappui.R
import androidlead.weatherappui.ui.screen.util.AirQualityData
import androidlead.weatherappui.ui.screen.util.AirQualityItem
import androidlead.weatherappui.ui.theme.ColorAirQualityIconTitle
import androidlead.weatherappui.ui.theme.ColorSurface
import androidlead.weatherappui.ui.theme.ColorTextPrimary
import androidlead.weatherappui.ui.theme.ColorTextPrimaryVariant
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AirQuality(
    modifier: Modifier = Modifier,
    data: List<AirQualityItem> = AirQualityData
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(32.dp),
        color = ColorSurface
    ) {
        Column(
            modifier = Modifier.padding(
                vertical = 18.dp,
                horizontal = 24.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AirQualityHeader()

            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                maxItemsInEachRow = 3,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                data.onEach { item ->
                    AirQualityInfo(
                        data = item,
                        modifier = Modifier.weight(weight = 1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun AirQualityHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_air_quality_header),
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                tint = ColorAirQualityIconTitle
            )
            Text(
                text = "Air Quality",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 18.sp
                )
            )
        }
        RefreshButton()
    }
}

@Composable
private fun RefreshButton(
    modifier: Modifier = Modifier
) {
    Surface(
        color = ColorSurface,
        shape = CircleShape,
        modifier = modifier
            .size(32.dp)
            .customShadow(
                color = Color.Black,
                alpha = 0.15f,
                shadowRadius = 16.dp,
                borderRadius = 32.dp,
                offsetY = 4.dp
            ),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_refresh),
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

@Composable
private fun AirQualityInfo(
    modifier: Modifier = Modifier,
    data: AirQualityItem
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Icon(
            painter = painterResource(data.icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = ColorAirQualityIconTitle
        )
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = data.title,
                style = MaterialTheme.typography.labelSmall,
                color = ColorTextPrimaryVariant
            )
            Text(
                text = data.value,
                style = MaterialTheme.typography.labelSmall,
                color = ColorTextPrimary
            )
        }
    }
}