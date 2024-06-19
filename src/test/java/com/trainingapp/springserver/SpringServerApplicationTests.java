package com.trainingapp.springserver;

import com.trainingapp.springserver.model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.trainingapp.springserver.Service.ClientService;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private ClientService ClientService;

	@Test
	void addClientsTest() {
		Client client = new Client();
		client.setFirst_name("Илья");
		client.setSecond_name("Шатохин");
		client.setPhone_number("+79992222211");
		client.setGoal("Набор массы");
		client.setAge(14);
		client.setNotes_about_client("На тренировки может ходить регулярно");
		ClientService.save(client);
	}

}
