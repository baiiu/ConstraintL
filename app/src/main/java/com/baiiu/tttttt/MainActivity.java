package com.baiiu.tttttt;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutmeasureDuration();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_sample);

        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondAct.class));
            }
        });
    }


    @TargetApi(Build.VERSION_CODES.N)
    private void layoutmeasureDuration() {
        getWindow().addOnFrameMetricsAvailableListener(new Window.OnFrameMetricsAvailableListener() {
            @Override
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
                FrameMetrics frameMetricsCopy = new FrameMetrics(frameMetrics);
                long layoutMeasureDurationNs = frameMetricsCopy.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION);
                android.util.Log.d("nLogU", "layoutMeasureDurationNs: " + layoutMeasureDurationNs);

            }
        }, new Handler());
    }
}
