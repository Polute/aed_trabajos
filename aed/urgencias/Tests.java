package aed.urgencias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

  @Test
  public void testAdmitir() throws PacienteExisteException
  {
    Urgencias u = new UrgenciasAED();
    u.admitirPaciente("111", 5, 1);
    Paciente p = u.atenderPaciente(10);

    // Check expected DNI ("111") == observed DNI (p.getDNI())
    assertEquals("111", p.getDNI());
  }
  /*
	 * Comprueba que tras haber admitido a un paciente P1 y despues a un paciente
	 * P2, ambos con la misma prioridad, una llamada a atenderPaciente() devuelve el
	 * paciente P1
	 */
	@Test
	public void test1() throws PacienteExisteException {
		Urgencias u = new UrgenciasAED();
		u.admitirPaciente("111", 5, 1);
		u.admitirPaciente("112", 5, 1);
		Paciente p = u.atenderPaciente(10);

		assertEquals("111", p.getDNI());
	}

	/*
	 * Comprueba que tras haber admitido a un paciente P1 y despues a otro P2, ambos
	 * con la misma prioridad, una llamada al metodo atenderPaciente() devuelve el
	 * paciente P1 primero y una segunda llamada devuelve el paciente P2
	 */
	@Test
	public void test2() throws PacienteExisteException {
		Urgencias u = new UrgenciasAED();
		u.admitirPaciente("111", 5, 1);
		u.admitirPaciente("112", 5, 1);
		Paciente p1 = u.atenderPaciente(10);
		Paciente p2 = u.atenderPaciente(10);

		assertEquals("111", p1.getDNI());
		assertEquals("112", p2.getDNI());
	}

	/*
	 * Comprueba que despues de haber admitido a un paciente P1 con prioridad 5, y
	 * despues a un paciente P2 con prioridad 1, una llamada a atenderPaciente()
	 * devuelve el paciente P2
	 * 
	 */
	@Test
	public void test3() throws PacienteExisteException {
		Urgencias u = new UrgenciasAED();
		u.admitirPaciente("111", 5, 1);
		u.admitirPaciente("112", 1, 1);
		Paciente p = u.atenderPaciente(10);

		assertEquals("112", p.getDNI());
	}

	/*
	 * Comprueba que despues de admitir a un paciente P1 y otro P2, ambos con la
	 * misma prioridad, tas una llamada a salirPaciente() con el DNI del paciente P1
	 * como argumento, llamar al metodo atenderPaciente() devuelve el paciente P2
	 */
	@Test
	public void test4() throws PacienteExisteException, PacienteNoExisteException {
		Urgencias u = new UrgenciasAED();
		u.admitirPaciente("111", 5, 1);
		u.admitirPaciente("112", 5, 1);
		u.salirPaciente("111", 10);
		Paciente p = u.atenderPaciente(10);

		assertEquals("112", p.getDNI());
	}

	/*
	 * Comprueba que tas admitir a un paciente P1 y despues a un paciente P2, ambos
	 * con prioridad 5, y despues haber llamado al metodo cambiarPrioridad() con el
	 * DNI de P2 y la nueva prioridad a 1, una llamada al metodo atenderPaciente()
	 * devuelve el paciente P2
	 * 
	 */
	@Test
	public void test5() throws PacienteExisteException, PacienteNoExisteException {
		Urgencias u = new UrgenciasAED();
		u.admitirPaciente("111", 5, 1);
		u.admitirPaciente("112", 5, 1);
		u.cambiarPrioridad("112", 1, 10);
		Paciente p=u.atenderPaciente(10);
		
		assertEquals("112", p.getDNI());
	}
//Los siguientes test son para comprobaciones no obligatorias	
  /*@Test
  public void testAdmitir6() throws PacienteExisteException, PacienteNoExisteException{
	  Urgencias u = new UrgenciasAED();
	  
	  u.admitirPaciente("61969645T",6,1);
	  u.admitirPaciente("82772887P",6,10);
	  u.admitirPaciente("74939234Y",1,20);
	  Paciente p=u.atenderPaciente(30);// ==> "74939234Y";
	  Paciente q=u.atenderPaciente(40); //==> "61969645T" (llegada mas pronto)
	  u.admitirPaciente("31825348F",9,50);
	  u.salirPaciente("82772887P",55);
	  Paciente r=u.atenderPaciente(60); // ==> "31825348F" (anterior salio)
	  u.admitirPaciente("61569231M",9,61);
	  u.admitirPaciente("91862887R",2,62);
	  u.cambiarPrioridad("61569231M",0,63);
	  Paciente s=u.atenderPaciente(70);// ==> "61569231M"
	  
	  assertEquals("74939234Y", p.getDNI());
	  assertEquals("61969645T", q.getDNI());
	  assertEquals("31825348F", r.getDNI());
	  assertEquals("61569231M", s.getDNI());
  }
	  
  @Test
  public void testComparePaciente() throws PacienteExisteException
  {
    Paciente u = new Paciente("A", 5, 31, 40);
    Paciente v = new Paciente("B", 5, 82, 82);
    
    int value=u.compareTo(v);

    // Check expected value ("0") == observed value (value)
    assertEquals(-1, value);
  }
  @Test
  public void compareAdmitir() throws PacienteExisteException, PacienteNoExisteException{
	  Urgencias u = new UrgenciasAED();
	  Paciente p=u.admitirPaciente("111",2,0);
	  u.admitirPaciente("222", 5, 1);
	  Paciente r=u.atenderPaciente(5);
	  assertEquals(2,p.getPrioridad());
	  assertEquals(0,p.getTiempoAdmision());
	  assertEquals(0,p.getTiempoAdmisionEnPrioridad());
	  assertEquals(p,r);  
  }*/
  
}

