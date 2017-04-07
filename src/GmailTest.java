import static org.junit.Assert.*;

import org.junit.Test;

public class GmailTest {

	@Test
	public void testdefineContent() {
		ServiceMail SM;
		SM = new EmailGmail();
		assertEquals("Teste", SM.defineContent("Teste"));
	}
	
	@Test
	public void testdefineSubject(){
		ServiceMail SM;
		SM = new EmailGmail();
		assertEquals("Teste", SM.defineSubject("Teste"));
	}

	@Test
	public void testdefineSender(){
		ServiceMail SM;
		SM = new EmailGmail();
		assertEquals("Teste", SM.defineSender("Teste"));
	}
	
	@Test
	public void testdefinePassword(){
		ServiceMail SM;
		SM = new EmailGmail();
		assertEquals("Teste", SM.definePassword("Teste"));
	}
}
