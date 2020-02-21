package tjava.time;

import java.time.Instant;


public class Tinstant {

	public static void main(String[] args) {

		System.out.println(Instant.EPOCH);
		System.out.println(Instant.MAX);
		System.out.println(Instant.MIN);
		
	}

//	@Test
	public void now() {
		Instant instant = Instant.now();
		System.out.println(instant);
	}

//	@Test
	public void run() {
	}

}
