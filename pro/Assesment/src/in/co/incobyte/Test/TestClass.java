package in.co.incobyte.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.co.incobyte.Exam.MyException;
import in.co.incobyte.Exam.StringCls;

public class TestClass {

	
@Test
public void testAdd() throws Exception
{
	 assertNotNull(StringCls.add(""));
	 assertEquals(3,StringCls.add("1,2"));

	
}

	}


