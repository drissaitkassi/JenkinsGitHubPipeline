package com.ea.patientintake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ea.patientintake.model.ClinicMain;

//Comment for poll
@SpringBootApplication
public class PatientIntakeApplication {
	public static void main(String[] args) {
		SpringApplication.run(PatientIntakeApplication.class, args);
		try {
			System.out.println("i made a change here jupdate !!!");
			ClinicMain.startConsole();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
}
