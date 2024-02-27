import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroTest {
	String W = "WARRIOR";
	String R = "ROBOT";
	String M = "MAGE";
	String E = "ELF";
	String A = "ARCHER";
	String D = "DWARF";
	String BAD = "PodidiyScoop";
	String OkJobs[] = {W, A, M};
	String OkRaces[] = {E, D, R};	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCreateHero() {
		HeroInterface bender = HeroFactory.createHero(R, W);
		assertEquals(R, bender.getRaceName());
		assertEquals(W, bender.getJobName());
		//boolean ans1 = false;
	    //for (int i = 0; i < 3; i++) {
	    	//if (Okraces[i] == )
	    //}
//		assertTrue(bender.getRaceName() == R);
//		assertTrue(bender.getJobName() == W);
	}
	@Test
	void testGetRobotStats() {
		HeroInterface bender = HeroFactory.createHero(R, M);
		assertTrue(bender.getSTR() == 20);
		assertTrue(bender.getDEX() == 20);
		assertTrue(bender.getINT() == 25);
		assertEquals(M, bender.getJobName());
	}
	@Test
	void testGetElfStats() {
		HeroInterface bender = HeroFactory.createHero(E, A);
		assertTrue(bender.getSTR() == 20);
		assertTrue(bender.getDEX() == 25);
		assertTrue(bender.getINT() == 20);
		assertEquals(A, bender.getJobName());
	}
	@Test
	void testGetDwarfStats() {
		HeroInterface bender = HeroFactory.createHero(D, W);
		assertTrue(bender.getSTR() == 25);
		assertTrue(bender.getDEX() == 20);
		assertTrue(bender.getINT() == 20);
		assertEquals(W, bender.getJobName());
		HeroInterface Dwarffella = HeroFactory.createHero(D, M);
		HeroInterface Dwarfguy = HeroFactory.createHero(D, A);
		HeroInterface Robit = HeroFactory.createHero(R, W);
		HeroInterface Elfguy = HeroFactory.createHero(E, W);
		assertEquals(W, Robit.getJobName());
		assertEquals(M, Dwarffella.getJobName());
		assertEquals(W, Elfguy.getJobName());
		assertEquals(A, Dwarfguy.getJobName());
		HeroInterface Gun = HeroFactory.createHero(R, A);
		HeroInterface Wilsemman = HeroFactory.createHero(E, M);
		assertEquals(A, Gun.getJobName());
		assertEquals(M, Wilsemman.getJobName());
	}
	@Test
	void testGetAttack() {
		HeroInterface bender = HeroFactory.createHero(R, M);
		assertTrue(bender.attack(1) == (bender.getINT() + bender.getDEX()));
		HeroInterface Legolas = HeroFactory.createHero(E, A);
		assertTrue(Legolas.attack(1) == (Legolas.getDEX()*3) / 2);
		HeroInterface Tyrion = HeroFactory.createHero(D, W);
		assertTrue(Tyrion.attack(1) == (Tyrion.getSTR() + Tyrion.getDEX()));
	}
	
	@Test
	void testHumanErr() {
		HeroInterface bender = HeroFactory.createHero(R, BAD);
		assertNull(bender);
	}
	@Test
	void testHumanErr2() {
		HeroInterface bender = HeroFactory.createHero(BAD, W);
		assertNull(bender);
	}
	@Test
	void finalTest() {
		HeroInterface Legolas = HeroFactory.createHero(E, A);
		assertEquals(112, Legolas.attack(3));
	}
}
