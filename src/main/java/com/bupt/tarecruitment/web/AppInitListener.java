package com.bupt.tarecruitment.web;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebListener
public class AppInitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Path dataDir = Paths.get("data");
        try {
            Files.createDirectories(dataDir);
        } catch (Exception e) {
            sce.getServletContext().log("Failed to create data directory", e);
        }
    }
}
