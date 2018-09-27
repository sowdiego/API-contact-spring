package momo.learn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import momo.learn.dao.ContactRepositorie;
import momo.learn.entities.Contact;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {
	@Autowired
	private ContactRepositorie contactRepositorie ;

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		contactRepositorie.save(new Contact("sow","Mamadou","diego@gmail.com","777854545",df.parse("30/11/1992"),"momo.jpeg"));
		contactRepositorie.save(new Contact("sen","Mara","diego@gmail.com","777854545",df.parse("30/11/1992"),"momo.jpeg"));
		contactRepositorie.save(new Contact("konate","Sogui","diego@gmail.com","777854545",df.parse("30/11/1992"),"momo.jpeg"));
		contactRepositorie.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		
	}
}
