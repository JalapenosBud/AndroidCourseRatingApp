package com.example.courseapp;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import android.util.Log;

public class GMail {

	final String emailPort = "587";// gmail's smtp port
	final String smtpAuth = "true";
	final String starttls = "true";
	final String emailHost = "smtp.gmail.com";

	String fromEmail;
	String fromPassword;
	String emailSubject;
	String emailBody;

	Properties emailProperties;
	Session mailSession;
	MimeMessage emailMessage;

	public GMail() {

	}

	public GMail(String fromEmail, String fromPassword,
			String emailSubject, String emailBody) {
		this.fromEmail = fromEmail;
		this.fromPassword = fromPassword;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", smtpAuth);
		emailProperties.put("mail.smtp.starttls.enable", starttls);
	}

	public MimeMessage createEmailMessage() throws AddressException,
			MessagingException, UnsupportedEncodingException {

		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);

		emailMessage.setFrom(new InternetAddress(fromEmail, fromEmail));

		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");// for a html email
		emailMessage.setRecipients(Message.RecipientType.TO,"ajphlp90@gmail.com");
		// emailMessage.setText(emailBody);// for a text email
		return emailMessage;
	}

	public void sendEmail() throws AddressException, MessagingException {

		Transport transport = mailSession.getTransport("smtp");
		transport.connect(emailHost, fromEmail, fromPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
	}

}
