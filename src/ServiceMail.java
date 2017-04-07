
public interface ServiceMail {
	boolean sendEmail(String address);
	String defineSubject(String subject);
	String defineContent(String content);
	String defineSender(String sender);
	String definePassword(String password);
}
