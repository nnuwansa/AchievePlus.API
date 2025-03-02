package com.sdgp.achieveplusapi.controller;

import com.sdgp.achieveplusapi.model.ChartData;
import com.sdgp.achieveplusapi.model.TaskMetrics;
import com.sdgp.achieveplusapi.service.AnalyticsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "http://localhost:5174") // Adjust this based on your frontend URL
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/metrics")
    public TaskMetrics getMetrics(@RequestParam String dateRange) {
        return analyticsService.getMetrics(dateRange);
    }

    @GetMapping("/chart-data")
    public ChartData getChartData(@RequestParam String dateRange) {
        return analyticsService.getChartData(dateRange);
    }
}
