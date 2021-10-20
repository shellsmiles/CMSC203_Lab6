import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	// task #3
	private double randN11;
	private double randN12;
	private double randN21;
	private double randN22;
	GradeBook s1;
	GradeBook s2;
	int size=5;
	
	
	// task #2
	Random randNum= new Random ();
	
	@BeforeEach
	void setUp() throws Exception {
	//Task #3   
		s1= new GradeBook(size);
		s2= new GradeBook(size);
		randN11= randNum.nextDouble ( )* 100;
		randN12= randNum.nextDouble ( )* 100;
		randN21= randNum.nextDouble ( )* 100;
		randN22= randNum.nextDouble ( )* 100;
		
		
		s1.addScore(randN11);
		s1.addScore(randN12);
		s2.addScore(randN21);
		s2.addScore(randN22);
	}

	@AfterEach
	void tearDown() throws Exception {
		// task #3
		s1=null;
		s2=null;
	}

	
	
	@Test
	void testAddScore() {
		// task #4-1
		String a= "The scores are: "+ randN11+ " " + randN12+ " " + "0.0 0.0 0.0 ";
		String b= "The scores are: "+ randN21+ " " + randN22+ " " + "0.0 0.0 0.0 ";
		
		assertTrue(s1.toString().equals( a));
		assertTrue(s2.toString().equals( b));
	}

	@Test
	void testSum() {
		// task #4-2
		assertEquals(randN11+randN12, s1.sum(), .0001);
		assertEquals(randN21+randN22, s2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		// task #4-3
		if (randN11 < randN12)
			assertEquals( randN11, s1.minimum(), .001);
		else if (randN11 > randN12)
			assertEquals( randN12, s1.minimum(), .001);
		
		if (randN21 < randN22)
			assertEquals( randN21, s2.minimum(), .001);
		else if (randN21 > randN22)
			assertEquals( randN22, s2.minimum(), .001);
		
	}

	@Test
	void testFinalScore() {
		// task #4-4
		
	    if (size > 1)
	    {
	    	if (randN11 < randN12)
	    		assertEquals ( randN12, s1.finalScore(), .0001);
	    	else if ( randN11 > randN12 )  
	    		assertEquals ( randN11, s1.finalScore(), .0001);
	    } 
	  		  
	    
	    if (size > 1)
	    {
	    	if (randN21 < randN22)
	    		assertEquals ( randN22, s2.finalScore(), .0001);
	    	else if ( randN21 > randN22 )  
	    		assertEquals ( randN21, s2.finalScore(), .0001);
	    } 
		
	}

	@Test
	void testGetScoreSize() {
		// task #4-1
		assertEquals ( size, s1.getScoreSize() );
		assertEquals ( size, s2.getScoreSize() );
	}

	@Test
	void testToString() {
	}

}
