package com.baiiu.tttttt;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.FrameMetrics;
import android.view.Window;

/**
 * author: zhuzhe
 * time: 2018/6/27
 * description:
 */
public class SecondAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        layoutmeasureDuration();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_sample);
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
