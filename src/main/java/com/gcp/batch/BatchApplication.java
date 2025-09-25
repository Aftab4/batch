package com.gcp.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime; // CHANGE: Import LocalDateTime for capturing current time
import java.time.format.DateTimeFormatter; // CHANGE: Import DateTimeFormatter for formatting the date and time

@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		System.out.println("Starting batch Application");

		// CHANGE: Capture the current date and time
		LocalDateTime startTime = LocalDateTime.now();

		// CHANGE: Format the date and time for logging
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedStartTime = startTime.format(formatter);

		// CHANGE: Define the region
		String region = "us-central1"; // CHANGE: Set your region here

		// CHANGE: Log the start time and region
		System.out.println("Batch Application started at: " + formattedStartTime + " in region: " + region);

		SpringApplication.run(BatchApplication.class, args);
	}
}
