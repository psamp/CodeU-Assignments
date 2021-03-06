
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.psamp.bucketlist.BucketList;
import com.psamp.bucketlist.BucketListException;

public class BucketListTest {
	
	BucketList bl;

	@Before
	public void setUp() throws Exception {
		
		bl = new BucketList("build api", "write another novel", "learn to drive", "build ficlist");
		bl.setBucketList("get better at swimming");
	}
	
	@Rule
	public ExpectedException excp = ExpectedException.none();

	@Test
	public final void testSeeGoals() throws BucketListException {
			
		excp.expect(BucketListException.class);
		excp.expectMessage("Bucket list too large! BucketList length is: 5");
		
		bl.seeGoals();
		
	}

}
