package com.techlab.service;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

import com.techlab.model.EmailDetail;

public class EmailService {
	private static EmailService es = null;

	private EmailService() {

	}

	public static EmailService getInstance() {
		if (es == null)
			es = new EmailService();
		return es;
	}

	public int send(String to, String body) {
		String from = "mutuzkhil@gmail.com";
		String password = "murtaza123";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Registration Sucessfull");
			message.setText(body);
			Transport.send(message);
			return 1;
		} catch (MessagingException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
