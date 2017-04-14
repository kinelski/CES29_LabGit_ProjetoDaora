package test;

import src.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RepositorioProcTest {
	
	private Processo processo1;
	private Processo processo2;
	
        private RepositorioProcessos rep;
        private ServiceMail service;
        private ValidadorProcessos validador;
        private ControladorSIAPJ controlador;
        
	@Before
	public void setUp(){
                processo1 = new Processo();
                processo2 = new Processo();
                
                rep = mock(RepositorioProcessos.class);
                service = mock(ServiceMail.class);
                validador = mock(ValidadorProcessos.class);
                
                when(validador.validateProcess(processo1)).thenReturn(true);
                when(validador.validateProcess(processo2)).thenReturn(false);
                when(rep.addProcesso(processo1)).thenReturn(true);
                
                controlador = new ControladorSIAPJ(service, validador, rep);
	}
	
	@Test
	public void validProcess() {
            assertTrue(controlador.initProcesso(processo1));
	}
        
        @Test
	public void invalidProcess() {
            assertFalse(controlador.initProcesso(processo2));
	}

}
