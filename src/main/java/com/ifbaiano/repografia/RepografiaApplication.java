package com.ifbaiano.repografia;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepografiaApplication {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Estou rodando");
		SpringApplication.run(RepografiaApplication.class, args);
		
	}

}
