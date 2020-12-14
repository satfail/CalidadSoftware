package Test;


import org.junit.*;
import Aeropuerto.Pasajero;
import static org.junit.Assert.*;
public class TestUnidadPasajero {
	
	Pasajero pasajero = new Pasajero("Miguel Angel","Española","242423Q");
	@Test
	public void testAssertEqualsgetNombre() {
		String nombre = "Miguel Angel";
		assertEquals(pasajero.getNombre(), nombre);
	}
	@Test
	public void testAssertTrueGetNacionalidad() {
		assertTrue(pasajero.getNacionalidad().equals("Española"));
	}
	
	@Test
	public void testAssertNotNull() {
		pasajero.setNombre(null);
		assertNotNull(pasajero.getNombre());
	}

}
