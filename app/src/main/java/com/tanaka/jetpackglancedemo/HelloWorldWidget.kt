package com.tanaka.jetpackglancedemo

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class HelloWorldWidget: GlanceAppWidget() {
    @Composable
    override fun Content() {
        Text(
            "Hello Tanaka"
        )
    }

}

class HelloWorldWidgetReceiver() : GlanceAppWidgetReceiver(){
    override val glanceAppWidget = HelloWorldWidget()
}