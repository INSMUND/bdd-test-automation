package Utils;

import java.io.IOException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import dataProviders.ConfigFileReader;

public class EmailOperator {

	public String FindEmailConfirmationContent(String IMAP_AUTH_EMAIL, String IMAP_AUTH_PWD, String IMAP_Server,
			String IMAP_Port) {

		Properties properties = new Properties();
		properties.put("mail.debug", "false");
		properties.put("mail.store.protocol", "imaps");
		properties.put("mail.imap.ssl.enable", "true");
		properties.put("mail.imap.port", IMAP_Port);

		Authenticator auth = new EmailAuthenticator(IMAP_AUTH_EMAIL, IMAP_AUTH_PWD);
		Session session = Session.getDefaultInstance(properties, auth);
		session.setDebug(false);

		Message[] messages = null;
		try {
			Store store = session.getStore();
			store.connect(IMAP_Server, IMAP_AUTH_EMAIL, IMAP_AUTH_PWD);
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);
			messages = inbox.getMessages();
		} catch (NoSuchProviderException e) {
			System.err.println(e.getMessage());
		} catch (MessagingException e) {
			System.err.println(e.getMessage());
		}
		String content = null;
		String letterConfirmationSubjectContains = "activarea contului";
		String emailRecipient = IMAP_AUTH_EMAIL;
		String emailFrom = new ConfigFileReader().getConfirmationEmailFrom();
		boolean letterConfirmationNotSelected = true;
		int i = messages.length - 1;
		try {
			while (letterConfirmationNotSelected) {
				String subject = messages[i].getSubject().toString().toLowerCase().trim();
				Address[] recipients = messages[i].getAllRecipients();
				String recipient = recipients[0].toString();
				Address[] froms = messages[i].getFrom();
				String from = froms[0].toString();
				if (subject.contains(letterConfirmationSubjectContains)
						& (recipient.equals(emailRecipient))
						& from.equals(emailFrom)) {
					letterConfirmationNotSelected = false;
					Object contentMessage = messages[i].getContent();
					content = contentMessage.toString();
				}
				i--;
				if (i == -1) {
					return null;
				}
			}
		} catch (NoSuchProviderException e) {
			System.err.println(e.getMessage());
		} catch (MessagingException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}

}
