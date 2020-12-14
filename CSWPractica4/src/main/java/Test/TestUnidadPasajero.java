package Test;


import org.junit.*;
import Aeropuerto.Pasajero;
import static org.junit.Assert.*;
public class TestUnidadPasajero {
	
	Pasajero pasajero = new Pasajero("Miguel Angel","Espa�ola","242423Q");
	@Test
	public void testAssertEqualsgetNombre() {
		String nombre = "Miguel Angel";
		assertEquals(pasajero.getNombre(), nombre);
	}
	@Test
	public void testAssertTrueGetNacionalidad() {
		assertTrue(pasajero.getNacionalidad().equals("Espa�ola"));
	}
	
	@Test
	public void testAssertNotNull() {
		pasajero.setNombre(null);
		assertNotNull(pasajero.getNombre());
	}

}
