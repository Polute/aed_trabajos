
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2022/10/27 -- 13:25:52
// Seed: {1666,869951,533759}
//
//////////////////////////////////////////////////////////////////////



package aed.individual5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd5 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(125,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,9,0) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_001 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_001") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_001")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_001")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_002 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_002") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_002")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] {  })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_002")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_003 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_003") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_003")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_003")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_004 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_004") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_004")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_004")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_005 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_005") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_005")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_005")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_006 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_006") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_006")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_006")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_007 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_007") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_007")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_007")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_008 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_008") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_008")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_008")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_009 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_009") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_009")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_009")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_010 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_010") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_010")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_010")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_011 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_011") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_011")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_011")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_012 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_012") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_012")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_012")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_013 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_013") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_013")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(1),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_013")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_014 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_014") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_014")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_014")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_015 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_015") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_015")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_015")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_016 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_016") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_016")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(100231),new Integer(100231),new Integer(100231) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(100231) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_016")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_017 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_017") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_017")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null,new Integer(3),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null,new Integer(3),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_017")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_018 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_018") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_018")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(100231) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(100231) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_018")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_019 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_019") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_019")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(1),new Integer(2),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(1),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_019")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_020 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_020") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_020")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(3),null,new Integer(3),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_020")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_021 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_021") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_021")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(1),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(1),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_021")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_022 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_022") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_022")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(1),new Integer(1),null,null,new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(1),null,new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_022")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_023 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_023") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_023")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(3),null,new Integer(5),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(3),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_023")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_024 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_024") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_024")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(3),new Integer(4),new Integer(4),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_024")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_025 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_025") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_025")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(4),new Integer(1),new Integer(1),new Integer(2),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(4),new Integer(1),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_025")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_026 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_026") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_026")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(4),new Integer(4),new Integer(4),new Integer(2),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_026")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_027 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_027") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_027")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(2),null,new Integer(3),null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_027")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_028 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_028") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_028")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(4),new Integer(4),null,null,new Integer(2),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),null,new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_028")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_029 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_029") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_029")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,new Integer(5),null,new Integer(4),null,new Integer(1),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(4),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_029")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_030 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_030") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_030")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(1),null,new Integer(4),new Integer(2),null,null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),null,new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_030")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_031 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_031") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_031")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(2),new Integer(4),new Integer(3),new Integer(3),new Integer(1),null,new Integer(1),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(4),new Integer(3),new Integer(1),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_031")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_032 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_032") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_032")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(5),new Integer(3),new Integer(1),null,new Integer(5),null,new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(5),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_032")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_033 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_033") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_033")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,null,new Integer(5),new Integer(1),null,null,new Integer(4),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(1),new Integer(4),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_033")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_034 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_034") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_034")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(4),null,new Integer(2),null,null,new Integer(4),null,null,new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),null,new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_034")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_035 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_035") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_035")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(4),new Integer(3),new Integer(2),null,new Integer(1),new Integer(1),null,new Integer(5),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(4),new Integer(3),new Integer(2),null,new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_035")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_036 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_036") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_036")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(8),new Integer(1),new Integer(2),new Integer(0),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(2),new Integer(3),new Integer(8),new Integer(0) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_036")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_037 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_037") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_037")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),null,new Integer(5),new Integer(2),new Integer(4),new Integer(3),null,new Integer(2),null,new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),null,new Integer(5),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_037")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_038 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_038") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_038")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,new Integer(1),new Integer(3),null,new Integer(5),new Integer(3),new Integer(5),new Integer(4),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(1),new Integer(3),new Integer(5),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_038")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_039 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_039") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_039")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(0),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_039")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_040 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_040") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_040")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(5),null,null,new Integer(1),new Integer(4),null,null,new Integer(4),null,null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(5),null,new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_040")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_041 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_041") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_041")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(1),new Integer(5),new Integer(1),new Integer(1),new Integer(2),null,new Integer(1),new Integer(2),null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(1),new Integer(5),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_041")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_042 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_042") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_042")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,new Integer(1),new Integer(5),new Integer(3),null,new Integer(2),new Integer(4),new Integer(1),new Integer(1),new Integer(3),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(1),new Integer(5),new Integer(3),new Integer(2),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_042")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_043 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_043") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_043")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(0),new Integer(1),new Integer(7),new Integer(2),new Integer(3),new Integer(4),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(7),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_043")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_044 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_044") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_044")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(3),new Integer(1),new Integer(1),null,new Integer(2),new Integer(5),null,new Integer(1),null,new Integer(5),new Integer(1),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(3),null,new Integer(2),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_044")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_045 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_045") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_045")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(5),new Integer(3),new Integer(4),new Integer(5),new Integer(3),null,new Integer(2),new Integer(4),new Integer(4),new Integer(5),null,new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(5),new Integer(3),new Integer(4),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_045")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_046 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_046") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_046")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(2),new Integer(5),new Integer(3),null,new Integer(5),null,new Integer(4),new Integer(3),new Integer(3),new Integer(3),new Integer(1),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(2),new Integer(5),new Integer(3),null,new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_046")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_047 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_047") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_047")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(5),null,new Integer(5),new Integer(5),new Integer(1),new Integer(5),null,new Integer(3),new Integer(2),new Integer(3),new Integer(3),new Integer(3),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null,new Integer(1),new Integer(3),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_047")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_048 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_048") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_048")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(2),new Integer(3),null,new Integer(5),new Integer(2),null,new Integer(2),new Integer(2),new Integer(5),new Integer(4),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(2),new Integer(3),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_048")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_049 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_049") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_049")) ;
if (ok_sofar)
  ok_sofar = new DeleteRepeated(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(3),null,null,null,null,new Integer(5),null,new Integer(1),new Integer(2),new Integer(3),new Integer(5),null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),null,new Integer(5),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_049")) ;
    ResultsHandler.add_result(new String("deleteRepeated"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_050 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_050") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_050")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_050")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_051 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_051") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_051")) ;
if (ok_sofar)
  ok_sofar = new Compactar(null).doCall().checkResult(new IllegalArgumentException()) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_051")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_052 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_052") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_052")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] {  })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] {  })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_052")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_053 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_053") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_053")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_053")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_054 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_054") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_054")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_054")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_055 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_055") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_055")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_055")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_056 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_056") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_056")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_056")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_057 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_057") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_057")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0),new Integer(0) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(0) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_057")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_058 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_058") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_058")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_058")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_059 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_059") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_059")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_059")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_060 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_060") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_060")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_060")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_061 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_061") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_061")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(4),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(4),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_061")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_062 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_062") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_062")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_062")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_063 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_063") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_063")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_063")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_064 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_064") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_064")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_064")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_065 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_065") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_065")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_065")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_066 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_066") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_066")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_066")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_067 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_067") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_067")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(4),new Integer(3),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(4),new Integer(3),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_067")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_068 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_068") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_068")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(1),new Integer(5),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(1),new Integer(5),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_068")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_069 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_069") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_069")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(3),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),new Integer(3),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_069")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_070 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_070") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_070")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(5),new Integer(4),new Integer(1),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(4),new Integer(1),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_070")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_071 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_071") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_071")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(1),null,new Integer(1),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_071")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_072 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_072") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_072")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3),new Integer(3),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_072")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_073 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_073") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_073")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(2),new Integer(1),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(2),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_073")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_074 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_074") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_074")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(2),new Integer(3),new Integer(6),new Integer(6) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(2),new Integer(3),new Integer(6) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_074")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_075 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_075") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_075")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(1),null,new Integer(5),null,new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(1),null,new Integer(5),null,new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_075")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_076 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_076") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_076")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,new Integer(4),null,new Integer(4),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),null,new Integer(4),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_076")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_077 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_077") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_077")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(2),new Integer(1),new Integer(1),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(0),new Integer(2),new Integer(1),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_077")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_078 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_078") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_078")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(1),new Integer(5),new Integer(3),null,null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(1),new Integer(5),new Integer(3),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_078")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_079 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_079") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_079")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(2),new Integer(5),new Integer(5),new Integer(2),new Integer(3),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(2),new Integer(5),new Integer(2),new Integer(3),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_079")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_080 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_080") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_080")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),new Integer(3),null,new Integer(3),new Integer(2),null,null,new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(3),null,new Integer(3),new Integer(2),null,new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_080")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_081 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_081") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_081")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(5),new Integer(1),null,null,new Integer(4),new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(5),new Integer(1),null,new Integer(4),new Integer(5),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_081")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_082 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_082") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_082")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(3),new Integer(2),null,new Integer(4),new Integer(5),null,new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(3),new Integer(2),null,new Integer(4),new Integer(5),null,new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_082")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_083 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_083") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_083")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,new Integer(5),null,new Integer(5),new Integer(2),new Integer(3),new Integer(5),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(5),null,new Integer(5),new Integer(2),new Integer(3),new Integer(5),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_083")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_084 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_084") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_084")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,null,null,new Integer(4),null,null,new Integer(1),new Integer(5),new Integer(4),new Integer(2) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(4),null,new Integer(1),new Integer(5),new Integer(4),new Integer(2) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_084")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_085 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_085") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_085")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(4),new Integer(2),null,new Integer(5),new Integer(3),new Integer(5),null,new Integer(4),null,new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(2),null,new Integer(5),new Integer(3),new Integer(5),null,new Integer(4),null,new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_085")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_086 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_086") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_086")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(5),null,new Integer(4),null,new Integer(4),new Integer(5),new Integer(1),new Integer(3),new Integer(4),new Integer(2),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(5),null,new Integer(4),null,new Integer(4),new Integer(5),new Integer(1),new Integer(3),new Integer(4),new Integer(2),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_086")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_087 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_087") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_087")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(4),new Integer(4),null,null,new Integer(5),new Integer(3),null,new Integer(2),null,new Integer(5),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(4),null,new Integer(5),new Integer(3),null,new Integer(2),null,new Integer(5),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_087")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_088 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_088") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_088")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(4),new Integer(5),new Integer(4),new Integer(2),new Integer(1),new Integer(2),new Integer(5),new Integer(3),new Integer(2),new Integer(1),new Integer(4) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(4),new Integer(5),new Integer(4),new Integer(2),new Integer(1),new Integer(2),new Integer(5),new Integer(3),new Integer(2),new Integer(1),new Integer(4) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_088")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_089 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_089") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_089")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(1),new Integer(4),null,new Integer(5),null,null,new Integer(3),new Integer(2),new Integer(5),new Integer(1),new Integer(2),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),null,new Integer(5),null,new Integer(3),new Integer(2),new Integer(5),new Integer(1),new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_089")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_090 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_090") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_090")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(4),new Integer(3),new Integer(1),null,new Integer(4),new Integer(3),new Integer(2),null,new Integer(3),new Integer(4),new Integer(1),null })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),null,new Integer(4),new Integer(3),new Integer(1),null,new Integer(4),new Integer(3),new Integer(2),null,new Integer(3),new Integer(4),new Integer(1),null })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_090")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_091 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_091") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_091")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(4),new Integer(3),new Integer(3),new Integer(5),new Integer(4),new Integer(3),null,null,new Integer(2),null,new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(2),new Integer(3),new Integer(2),new Integer(4),new Integer(3),new Integer(5),new Integer(4),new Integer(3),null,new Integer(2),null,new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_091")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_092 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_092") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_092")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(5),new Integer(1),new Integer(2),new Integer(1),new Integer(5),new Integer(1),null,new Integer(2),null,new Integer(1),null,new Integer(2),new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),new Integer(1),new Integer(2),new Integer(1),new Integer(5),new Integer(1),null,new Integer(2),null,new Integer(1),null,new Integer(2),new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_092")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_093 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_093") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_093")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null,new Integer(1),new Integer(1),null,new Integer(4),null,new Integer(1),new Integer(4),null,new Integer(5),new Integer(5),null,new Integer(3) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(5),null,new Integer(1),null,new Integer(4),null,new Integer(1),new Integer(4),null,new Integer(5),null,new Integer(3) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_093")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_094 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_094") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_094")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(5),null,new Integer(2),null,null,new Integer(5),new Integer(3),new Integer(2),new Integer(2),null,new Integer(2),new Integer(3),new Integer(1) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { new Integer(1),new Integer(4),new Integer(5),null,new Integer(2),null,new Integer(5),new Integer(3),new Integer(2),null,new Integer(2),new Integer(3),new Integer(1) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_094")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_095 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_095") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_095")) ;
if (ok_sofar)
  ok_sofar = new Compactar(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(3),new Integer(5),new Integer(4),new Integer(4),new Integer(1),new Integer(4),null,new Integer(3),new Integer(4),new Integer(3),new Integer(5),new Integer(3),new Integer(3),new Integer(5) })).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<Integer>(new Integer[] { null,new Integer(3),new Integer(5),new Integer(4),new Integer(1),new Integer(4),null,new Integer(3),new Integer(4),new Integer(3),new Integer(5),new Integer(3),new Integer(5) })) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_095")) ;
    ResultsHandler.add_result(new String("compactar"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_096 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_096") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_096")) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_096")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_097 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_097") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_097")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] {  }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray())) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_097")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_098 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_098") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_098")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),114L,17),new TempData(new String("Sevilla"),114L,19),new TempData(new String("Soria"),114L,17),new TempData(new String("Ponferrada"),114L,25),new TempData(new String("Sevilla"),115L,25),new TempData(new String("Madrid"),115L,15) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(17))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_098")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_099 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_099") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_099")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),114L,15),new TempData(new String("La Linea"),114L,23),new TempData(new String("Madrid"),114L,20),new TempData(new String("Mostoles"),114L,15),new TempData(new String("Salamanca"),114L,10),new TempData(new String("Ponferrada"),114L,15) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(15))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_099")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_100 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_100") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_100")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Madrid"),115L,13),new TempData(new String("Mostoles"),115L,28),new TempData(new String("Mulhacen"),116L,21),new TempData(new String("Sevilla"),116L,26),new TempData(new String("Madrid"),116L,21),new TempData(new String("Puerto de Navacerrada"),116L,11),new TempData(new String("Salamanca"),116L,26),new TempData(new String("Soria"),116L,14) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(21))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_100")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_101 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_101") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_101")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),111L,15),new TempData(new String("La Linea"),111L,26),new TempData(new String("Mostoles"),111L,11),new TempData(new String("Puerto de Navacerrada"),111L,21),new TempData(new String("Salamanca"),111L,10),new TempData(new String("Soria"),111L,23),new TempData(new String("Mulhacen"),112L,21),new TempData(new String("Sevilla"),112L,14),new TempData(new String("Puerto de Navacerrada"),112L,25),new TempData(new String("Soria"),112L,25),new TempData(new String("Ponferrada"),112L,25) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(10)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(15))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_101")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_102 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_102") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_102")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("La Linea"),110L,28),new TempData(new String("Madrid"),110L,25),new TempData(new String("Mostoles"),110L,27),new TempData(new String("Soria"),110L,20),new TempData(new String("Sevilla"),111L,14),new TempData(new String("Mostoles"),111L,27),new TempData(new String("Puerto de Navacerrada"),111L,16),new TempData(new String("Salamanca"),111L,12),new TempData(new String("Ponferrada"),111L,17),new TempData(new String("Mulhacen"),112L,13),new TempData(new String("La Linea"),112L,22),new TempData(new String("Madrid"),112L,17),new TempData(new String("Puerto de Navacerrada"),112L,15),new TempData(new String("Ponferrada"),112L,13) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_102")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_103 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_103") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_103")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),109L,16),new TempData(new String("Sevilla"),109L,21),new TempData(new String("La Linea"),109L,30),new TempData(new String("Puerto de Navacerrada"),109L,12),new TempData(new String("Soria"),109L,12),new TempData(new String("Sevilla"),110L,29),new TempData(new String("Madrid"),110L,25),new TempData(new String("Salamanca"),110L,17),new TempData(new String("Soria"),110L,28),new TempData(new String("La Linea"),111L,16),new TempData(new String("Madrid"),111L,22),new TempData(new String("Soria"),111L,16),new TempData(new String("Mulhacen"),112L,23),new TempData(new String("La Linea"),112L,21),new TempData(new String("Salamanca"),112L,16),new TempData(new String("Soria"),112L,18),new TempData(new String("Ponferrada"),112L,16) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(23))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_103")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_104 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_104") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_104")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("La Linea"),113L,19),new TempData(new String("Madrid"),113L,19),new TempData(new String("Salamanca"),113L,13),new TempData(new String("Soria"),113L,13),new TempData(new String("Sevilla"),114L,23),new TempData(new String("Madrid"),114L,29),new TempData(new String("Mostoles"),114L,28),new TempData(new String("Salamanca"),114L,23),new TempData(new String("Mulhacen"),115L,11),new TempData(new String("Mostoles"),115L,25),new TempData(new String("Soria"),115L,17),new TempData(new String("Mulhacen"),116L,14),new TempData(new String("Sevilla"),116L,14),new TempData(new String("Madrid"),116L,29),new TempData(new String("Mostoles"),116L,14),new TempData(new String("Madrid"),117L,24),new TempData(new String("Mostoles"),117L,11),new TempData(new String("Soria"),117L,20) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(19))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_104")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_105 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_105") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_105")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),107L,26),new TempData(new String("La Linea"),107L,24),new TempData(new String("Madrid"),107L,21),new TempData(new String("Puerto de Navacerrada"),107L,16),new TempData(new String("Salamanca"),107L,26),new TempData(new String("Mulhacen"),108L,10),new TempData(new String("La Linea"),108L,17),new TempData(new String("Madrid"),108L,17),new TempData(new String("Puerto de Navacerrada"),108L,18),new TempData(new String("Soria"),108L,22),new TempData(new String("Ponferrada"),108L,25),new TempData(new String("Mulhacen"),109L,17),new TempData(new String("Puerto de Navacerrada"),109L,18),new TempData(new String("Salamanca"),109L,20),new TempData(new String("Ponferrada"),109L,28),new TempData(new String("Salamanca"),110L,24),new TempData(new String("Ponferrada"),110L,29),new TempData(new String("Madrid"),111L,24),new TempData(new String("Mostoles"),111L,13),new TempData(new String("Puerto de Navacerrada"),111L,12),new TempData(new String("Salamanca"),111L,21),new TempData(new String("Soria"),111L,26) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(13)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(26))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_105")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_106 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_106") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_106")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("La Linea"),112L,30),new TempData(new String("Puerto de Navacerrada"),112L,16),new TempData(new String("Ponferrada"),112L,30),new TempData(new String("La Linea"),113L,29),new TempData(new String("Salamanca"),113L,25),new TempData(new String("Soria"),113L,11),new TempData(new String("Mulhacen"),114L,19),new TempData(new String("Madrid"),114L,16),new TempData(new String("Puerto de Navacerrada"),114L,17),new TempData(new String("Ponferrada"),114L,23),new TempData(new String("Mulhacen"),115L,25),new TempData(new String("Madrid"),115L,19),new TempData(new String("Salamanca"),115L,10),new TempData(new String("Mulhacen"),116L,23),new TempData(new String("Puerto de Navacerrada"),116L,16),new TempData(new String("Salamanca"),116L,27),new TempData(new String("Soria"),116L,24),new TempData(new String("Ponferrada"),116L,12),new TempData(new String("La Linea"),117L,18),new TempData(new String("Madrid"),117L,26),new TempData(new String("Mostoles"),117L,15),new TempData(new String("Puerto de Navacerrada"),117L,10),new TempData(new String("Salamanca"),117L,27),new TempData(new String("Ponferrada"),117L,26) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(15)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_106")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_107 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_107") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_107")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),114L,13),new TempData(new String("Sevilla"),114L,24),new TempData(new String("Mostoles"),114L,15),new TempData(new String("Ponferrada"),114L,16),new TempData(new String("Sevilla"),115L,13),new TempData(new String("Madrid"),115L,18),new TempData(new String("Mostoles"),115L,21),new TempData(new String("Puerto de Navacerrada"),115L,25),new TempData(new String("Sevilla"),116L,22),new TempData(new String("La Linea"),116L,12),new TempData(new String("Mostoles"),116L,29),new TempData(new String("Salamanca"),116L,16),new TempData(new String("Soria"),116L,26),new TempData(new String("Mulhacen"),117L,14),new TempData(new String("La Linea"),117L,28),new TempData(new String("Madrid"),117L,16),new TempData(new String("Mostoles"),117L,14),new TempData(new String("Puerto de Navacerrada"),117L,29),new TempData(new String("Soria"),117L,15),new TempData(new String("Ponferrada"),117L,26),new TempData(new String("Mulhacen"),118L,25),new TempData(new String("Sevilla"),118L,22),new TempData(new String("Mostoles"),118L,16),new TempData(new String("Salamanca"),118L,17),new TempData(new String("Ponferrada"),118L,10) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_107")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_108 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_108") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_108")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),110L,15),new TempData(new String("Puerto de Navacerrada"),110L,12),new TempData(new String("Mulhacen"),111L,20),new TempData(new String("La Linea"),111L,14),new TempData(new String("Madrid"),111L,26),new TempData(new String("Mostoles"),111L,27),new TempData(new String("Salamanca"),111L,15),new TempData(new String("Soria"),111L,27),new TempData(new String("Ponferrada"),111L,18),new TempData(new String("Mulhacen"),112L,25),new TempData(new String("Madrid"),112L,29),new TempData(new String("Mostoles"),112L,25),new TempData(new String("Ponferrada"),112L,27),new TempData(new String("Mulhacen"),113L,28),new TempData(new String("Sevilla"),113L,24),new TempData(new String("La Linea"),113L,29),new TempData(new String("Mostoles"),113L,22),new TempData(new String("Salamanca"),113L,23),new TempData(new String("Ponferrada"),113L,21),new TempData(new String("Madrid"),114L,10),new TempData(new String("Soria"),114L,29),new TempData(new String("Mulhacen"),115L,20),new TempData(new String("Sevilla"),115L,22),new TempData(new String("La Linea"),115L,28),new TempData(new String("Salamanca"),115L,23),new TempData(new String("Ponferrada"),115L,30) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(12)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_108")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_109 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_109") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_109")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),113L,26),new TempData(new String("La Linea"),113L,30),new TempData(new String("Madrid"),113L,14),new TempData(new String("Mostoles"),113L,24),new TempData(new String("Soria"),113L,12),new TempData(new String("Ponferrada"),113L,28),new TempData(new String("Mulhacen"),114L,20),new TempData(new String("Sevilla"),114L,10),new TempData(new String("Ponferrada"),114L,17),new TempData(new String("Madrid"),115L,12),new TempData(new String("Puerto de Navacerrada"),115L,16),new TempData(new String("Soria"),115L,24),new TempData(new String("Mulhacen"),116L,16),new TempData(new String("Sevilla"),116L,11),new TempData(new String("Mulhacen"),117L,18),new TempData(new String("Sevilla"),117L,25),new TempData(new String("Mostoles"),117L,25),new TempData(new String("Salamanca"),117L,11),new TempData(new String("Soria"),117L,19),new TempData(new String("Ponferrada"),117L,19),new TempData(new String("Madrid"),118L,21),new TempData(new String("Mostoles"),118L,17),new TempData(new String("Ponferrada"),118L,20),new TempData(new String("Mulhacen"),119L,30),new TempData(new String("La Linea"),119L,11),new TempData(new String("Puerto de Navacerrada"),119L,17),new TempData(new String("Soria"),119L,20) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(11)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_109")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_110 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_110") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_110")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),108L,24),new TempData(new String("La Linea"),108L,18),new TempData(new String("Puerto de Navacerrada"),108L,29),new TempData(new String("Salamanca"),108L,14),new TempData(new String("Ponferrada"),108L,30),new TempData(new String("Sevilla"),109L,19),new TempData(new String("La Linea"),109L,14),new TempData(new String("Mostoles"),109L,27),new TempData(new String("Puerto de Navacerrada"),109L,21),new TempData(new String("Salamanca"),109L,25),new TempData(new String("Mulhacen"),110L,28),new TempData(new String("Mostoles"),110L,17),new TempData(new String("Soria"),110L,24),new TempData(new String("Ponferrada"),110L,29),new TempData(new String("Mulhacen"),111L,10),new TempData(new String("Mostoles"),111L,27),new TempData(new String("Soria"),111L,20),new TempData(new String("Ponferrada"),111L,17),new TempData(new String("Sevilla"),112L,20),new TempData(new String("Madrid"),112L,27),new TempData(new String("Puerto de Navacerrada"),112L,14),new TempData(new String("Salamanca"),112L,30),new TempData(new String("Soria"),112L,28),new TempData(new String("Madrid"),113L,30),new TempData(new String("Mostoles"),113L,18),new TempData(new String("Salamanca"),113L,17),new TempData(new String("Soria"),113L,23),new TempData(new String("Ponferrada"),113L,23) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(24))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_110")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_111 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_111") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_111")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),113L,23),new TempData(new String("La Linea"),113L,14),new TempData(new String("Madrid"),113L,20),new TempData(new String("Mostoles"),113L,12),new TempData(new String("Ponferrada"),113L,11),new TempData(new String("Sevilla"),114L,14),new TempData(new String("La Linea"),114L,30),new TempData(new String("Madrid"),114L,19),new TempData(new String("Mostoles"),114L,30),new TempData(new String("Puerto de Navacerrada"),114L,30),new TempData(new String("Mulhacen"),115L,12),new TempData(new String("Sevilla"),115L,30),new TempData(new String("La Linea"),115L,28),new TempData(new String("Mostoles"),115L,14),new TempData(new String("Soria"),115L,11),new TempData(new String("Ponferrada"),115L,25),new TempData(new String("Sevilla"),116L,20),new TempData(new String("Madrid"),116L,25),new TempData(new String("Mostoles"),116L,12),new TempData(new String("Salamanca"),116L,11),new TempData(new String("Soria"),116L,26),new TempData(new String("Ponferrada"),116L,26),new TempData(new String("Mulhacen"),117L,17),new TempData(new String("Sevilla"),117L,26),new TempData(new String("La Linea"),117L,24),new TempData(new String("Madrid"),117L,18),new TempData(new String("Mostoles"),117L,20),new TempData(new String("Salamanca"),117L,20),new TempData(new String("Soria"),117L,17) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(17)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_111")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_112 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_112") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_112")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),108L,29),new TempData(new String("La Linea"),108L,21),new TempData(new String("Mostoles"),108L,15),new TempData(new String("Puerto de Navacerrada"),108L,27),new TempData(new String("Salamanca"),108L,14),new TempData(new String("Soria"),108L,20),new TempData(new String("Madrid"),109L,25),new TempData(new String("Mostoles"),109L,16),new TempData(new String("Salamanca"),109L,26),new TempData(new String("Ponferrada"),109L,14),new TempData(new String("Mulhacen"),110L,23),new TempData(new String("Sevilla"),110L,28),new TempData(new String("Salamanca"),110L,11),new TempData(new String("Soria"),110L,21),new TempData(new String("Ponferrada"),110L,14),new TempData(new String("Sevilla"),111L,12),new TempData(new String("La Linea"),111L,11),new TempData(new String("Madrid"),111L,14),new TempData(new String("Mostoles"),111L,21),new TempData(new String("Soria"),111L,23),new TempData(new String("Sevilla"),112L,22),new TempData(new String("Puerto de Navacerrada"),112L,11),new TempData(new String("Salamanca"),112L,17),new TempData(new String("Soria"),112L,24),new TempData(new String("Mulhacen"),113L,23),new TempData(new String("Salamanca"),113L,29),new TempData(new String("Soria"),113L,12),new TempData(new String("Mostoles"),114L,17),new TempData(new String("Puerto de Navacerrada"),114L,16),new TempData(new String("Salamanca"),114L,22),new TempData(new String("Soria"),114L,25) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(29))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_112")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_113 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_113") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_113")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),106L,28),new TempData(new String("Sevilla"),106L,26),new TempData(new String("La Linea"),106L,19),new TempData(new String("Mostoles"),106L,12),new TempData(new String("Puerto de Navacerrada"),106L,28),new TempData(new String("Salamanca"),106L,19),new TempData(new String("Soria"),106L,12),new TempData(new String("Ponferrada"),106L,23),new TempData(new String("Puerto de Navacerrada"),107L,16),new TempData(new String("Salamanca"),107L,23),new TempData(new String("Soria"),107L,20),new TempData(new String("Mulhacen"),108L,12),new TempData(new String("La Linea"),108L,17),new TempData(new String("Madrid"),108L,25),new TempData(new String("Mostoles"),108L,18),new TempData(new String("Puerto de Navacerrada"),108L,13),new TempData(new String("Soria"),108L,29),new TempData(new String("Ponferrada"),108L,17),new TempData(new String("Mulhacen"),109L,18),new TempData(new String("Sevilla"),109L,11),new TempData(new String("Mostoles"),109L,28),new TempData(new String("Soria"),109L,29),new TempData(new String("Mulhacen"),110L,22),new TempData(new String("Sevilla"),110L,12),new TempData(new String("La Linea"),110L,16),new TempData(new String("Salamanca"),110L,20),new TempData(new String("Ponferrada"),110L,29),new TempData(new String("La Linea"),111L,20),new TempData(new String("Madrid"),111L,27),new TempData(new String("Mostoles"),111L,11),new TempData(new String("Ponferrada"),111L,25),new TempData(new String("La Linea"),112L,14),new TempData(new String("Mostoles"),112L,15),new TempData(new String("Salamanca"),112L,29),new TempData(new String("Soria"),112L,22) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_113")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_114 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_114") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_114")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),103L,27),new TempData(new String("La Linea"),103L,29),new TempData(new String("Madrid"),103L,17),new TempData(new String("Mostoles"),103L,21),new TempData(new String("Puerto de Navacerrada"),103L,20),new TempData(new String("Salamanca"),103L,23),new TempData(new String("Soria"),103L,21),new TempData(new String("Ponferrada"),103L,27),new TempData(new String("Mulhacen"),104L,14),new TempData(new String("Sevilla"),104L,24),new TempData(new String("La Linea"),104L,12),new TempData(new String("Puerto de Navacerrada"),104L,17),new TempData(new String("Soria"),104L,25),new TempData(new String("Ponferrada"),104L,12),new TempData(new String("Mulhacen"),105L,22),new TempData(new String("Sevilla"),105L,25),new TempData(new String("Madrid"),105L,21),new TempData(new String("Salamanca"),105L,28),new TempData(new String("Ponferrada"),105L,21),new TempData(new String("Sevilla"),106L,23),new TempData(new String("Madrid"),106L,13),new TempData(new String("Puerto de Navacerrada"),106L,14),new TempData(new String("Salamanca"),106L,10),new TempData(new String("Sevilla"),107L,17),new TempData(new String("La Linea"),107L,19),new TempData(new String("Madrid"),107L,29),new TempData(new String("Puerto de Navacerrada"),107L,21),new TempData(new String("Soria"),107L,15),new TempData(new String("Mostoles"),108L,22),new TempData(new String("Soria"),108L,12),new TempData(new String("Mulhacen"),109L,13),new TempData(new String("Sevilla"),109L,29),new TempData(new String("Madrid"),109L,13),new TempData(new String("Mostoles"),109L,22),new TempData(new String("Salamanca"),109L,11),new TempData(new String("Soria"),109L,21),new TempData(new String("Mostoles"),110L,20),new TempData(new String("Salamanca"),110L,24),new TempData(new String("Mulhacen"),111L,28),new TempData(new String("La Linea"),111L,21),new TempData(new String("Madrid"),111L,26),new TempData(new String("Puerto de Navacerrada"),111L,14),new TempData(new String("Salamanca"),111L,27) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_114")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_115 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_115") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_115")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Madrid"),112L,22),new TempData(new String("Salamanca"),112L,11),new TempData(new String("Soria"),112L,21),new TempData(new String("Sevilla"),113L,12),new TempData(new String("Madrid"),113L,24),new TempData(new String("Puerto de Navacerrada"),113L,28),new TempData(new String("Salamanca"),113L,10),new TempData(new String("Soria"),113L,15),new TempData(new String("Ponferrada"),113L,24),new TempData(new String("Sevilla"),114L,26),new TempData(new String("La Linea"),114L,10),new TempData(new String("Madrid"),114L,27),new TempData(new String("Mostoles"),114L,25),new TempData(new String("Salamanca"),114L,30),new TempData(new String("Ponferrada"),114L,24),new TempData(new String("Mulhacen"),115L,18),new TempData(new String("Mostoles"),115L,22),new TempData(new String("Puerto de Navacerrada"),115L,10),new TempData(new String("Sevilla"),116L,16),new TempData(new String("Mostoles"),116L,21),new TempData(new String("Puerto de Navacerrada"),116L,24),new TempData(new String("Salamanca"),116L,21),new TempData(new String("Ponferrada"),116L,26),new TempData(new String("La Linea"),117L,27),new TempData(new String("Madrid"),117L,20),new TempData(new String("Puerto de Navacerrada"),117L,21),new TempData(new String("Soria"),117L,13),new TempData(new String("Madrid"),118L,30),new TempData(new String("Mostoles"),118L,17),new TempData(new String("Soria"),118L,10),new TempData(new String("Soria"),119L,21),new TempData(new String("Mulhacen"),120L,17),new TempData(new String("Sevilla"),120L,28),new TempData(new String("Madrid"),120L,30),new TempData(new String("Soria"),120L,20),new TempData(new String("Sevilla"),121L,17),new TempData(new String("La Linea"),121L,15),new TempData(new String("Puerto de Navacerrada"),121L,10),new TempData(new String("Soria"),121L,15),new TempData(new String("Mulhacen"),122L,17),new TempData(new String("Sevilla"),122L,15),new TempData(new String("Madrid"),122L,17),new TempData(new String("Mostoles"),122L,11),new TempData(new String("Salamanca"),122L,20),new TempData(new String("Soria"),122L,11) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(18)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(21)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_115")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_116 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_116") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_116")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Madrid"),112L,29),new TempData(new String("Mostoles"),112L,16),new TempData(new String("Puerto de Navacerrada"),112L,27),new TempData(new String("Salamanca"),112L,26),new TempData(new String("Mulhacen"),113L,17),new TempData(new String("Madrid"),113L,26),new TempData(new String("Puerto de Navacerrada"),113L,11),new TempData(new String("Soria"),113L,12),new TempData(new String("Ponferrada"),113L,11),new TempData(new String("Mulhacen"),114L,23),new TempData(new String("Sevilla"),114L,22),new TempData(new String("La Linea"),114L,11),new TempData(new String("Madrid"),114L,20),new TempData(new String("Mostoles"),114L,11),new TempData(new String("Puerto de Navacerrada"),114L,23),new TempData(new String("Salamanca"),114L,30),new TempData(new String("Soria"),114L,10),new TempData(new String("Ponferrada"),114L,18),new TempData(new String("La Linea"),115L,18),new TempData(new String("Puerto de Navacerrada"),115L,18),new TempData(new String("Salamanca"),115L,27),new TempData(new String("Mulhacen"),116L,16),new TempData(new String("Sevilla"),116L,14),new TempData(new String("Mostoles"),116L,12),new TempData(new String("Puerto de Navacerrada"),116L,20),new TempData(new String("Mulhacen"),117L,24),new TempData(new String("Sevilla"),117L,19),new TempData(new String("La Linea"),117L,19),new TempData(new String("Madrid"),117L,17),new TempData(new String("Mostoles"),117L,19),new TempData(new String("Salamanca"),117L,19),new TempData(new String("Soria"),117L,19),new TempData(new String("Mulhacen"),118L,25),new TempData(new String("Sevilla"),118L,15),new TempData(new String("Mostoles"),118L,28),new TempData(new String("Puerto de Navacerrada"),118L,13),new TempData(new String("Salamanca"),118L,15),new TempData(new String("La Linea"),119L,11),new TempData(new String("Mostoles"),119L,16),new TempData(new String("Puerto de Navacerrada"),119L,10),new TempData(new String("Salamanca"),119L,14),new TempData(new String("Soria"),119L,17),new TempData(new String("Ponferrada"),119L,29),new TempData(new String("Madrid"),120L,13),new TempData(new String("Salamanca"),120L,11),new TempData(new String("Ponferrada"),120L,21) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(19)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(29))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_116")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_117 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_117") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_117")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),105L,10),new TempData(new String("Sevilla"),105L,17),new TempData(new String("La Linea"),105L,15),new TempData(new String("Madrid"),105L,13),new TempData(new String("Mostoles"),105L,23),new TempData(new String("Soria"),105L,16),new TempData(new String("Puerto de Navacerrada"),106L,19),new TempData(new String("Salamanca"),106L,28),new TempData(new String("Ponferrada"),106L,19),new TempData(new String("Sevilla"),107L,29),new TempData(new String("La Linea"),107L,25),new TempData(new String("Mostoles"),107L,18),new TempData(new String("Salamanca"),107L,19),new TempData(new String("Soria"),107L,22),new TempData(new String("Sevilla"),108L,20),new TempData(new String("Puerto de Navacerrada"),108L,10),new TempData(new String("Soria"),108L,12),new TempData(new String("Ponferrada"),108L,11),new TempData(new String("Mulhacen"),109L,21),new TempData(new String("Sevilla"),109L,16),new TempData(new String("La Linea"),109L,25),new TempData(new String("Madrid"),109L,25),new TempData(new String("Puerto de Navacerrada"),109L,11),new TempData(new String("Sevilla"),110L,22),new TempData(new String("La Linea"),110L,29),new TempData(new String("Mostoles"),110L,15),new TempData(new String("Salamanca"),110L,18),new TempData(new String("Ponferrada"),111L,20),new TempData(new String("Mulhacen"),112L,19),new TempData(new String("Madrid"),112L,14),new TempData(new String("Mostoles"),112L,19),new TempData(new String("Puerto de Navacerrada"),112L,26),new TempData(new String("Salamanca"),112L,29),new TempData(new String("Soria"),112L,12),new TempData(new String("La Linea"),113L,28),new TempData(new String("Madrid"),113L,20),new TempData(new String("Mostoles"),113L,15),new TempData(new String("Puerto de Navacerrada"),113L,26),new TempData(new String("Soria"),113L,10),new TempData(new String("Ponferrada"),113L,13),new TempData(new String("Mulhacen"),114L,14),new TempData(new String("Soria"),114L,16),new TempData(new String("Mulhacen"),115L,27),new TempData(new String("Madrid"),115L,14),new TempData(new String("Mostoles"),115L,21),new TempData(new String("Puerto de Navacerrada"),115L,22),new TempData(new String("Soria"),115L,29),new TempData(new String("Ponferrada"),115L,15) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(20)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(27))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_117")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_118 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_118") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_118")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),105L,28),new TempData(new String("Sevilla"),105L,10),new TempData(new String("Mostoles"),105L,17),new TempData(new String("Salamanca"),105L,30),new TempData(new String("Soria"),105L,15),new TempData(new String("Ponferrada"),105L,24),new TempData(new String("La Linea"),106L,17),new TempData(new String("Madrid"),106L,25),new TempData(new String("Mostoles"),106L,12),new TempData(new String("Salamanca"),106L,10),new TempData(new String("Soria"),106L,15),new TempData(new String("Ponferrada"),106L,16),new TempData(new String("Mulhacen"),107L,22),new TempData(new String("Sevilla"),107L,26),new TempData(new String("La Linea"),107L,26),new TempData(new String("Madrid"),107L,28),new TempData(new String("Mostoles"),107L,29),new TempData(new String("Puerto de Navacerrada"),107L,26),new TempData(new String("Salamanca"),107L,19),new TempData(new String("Ponferrada"),107L,20),new TempData(new String("Sevilla"),108L,28),new TempData(new String("La Linea"),108L,19),new TempData(new String("Madrid"),108L,22),new TempData(new String("Puerto de Navacerrada"),108L,27),new TempData(new String("Salamanca"),108L,13),new TempData(new String("Soria"),108L,28),new TempData(new String("Mulhacen"),109L,23),new TempData(new String("La Linea"),109L,14),new TempData(new String("Madrid"),109L,23),new TempData(new String("Puerto de Navacerrada"),109L,10),new TempData(new String("Salamanca"),109L,29),new TempData(new String("Soria"),109L,29),new TempData(new String("Sevilla"),110L,22),new TempData(new String("Mostoles"),110L,28),new TempData(new String("Mulhacen"),111L,16),new TempData(new String("Mostoles"),111L,14),new TempData(new String("Salamanca"),111L,20),new TempData(new String("Soria"),111L,18),new TempData(new String("Ponferrada"),111L,22),new TempData(new String("Mulhacen"),112L,15),new TempData(new String("Sevilla"),112L,21),new TempData(new String("La Linea"),112L,12),new TempData(new String("Puerto de Navacerrada"),112L,10),new TempData(new String("Soria"),112L,21),new TempData(new String("Ponferrada"),112L,30),new TempData(new String("Mulhacen"),113L,15),new TempData(new String("Puerto de Navacerrada"),113L,20),new TempData(new String("Soria"),113L,11) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(28))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_118")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_119 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_119") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_119")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("La Linea"),107L,24),new TempData(new String("Madrid"),107L,30),new TempData(new String("Mostoles"),107L,20),new TempData(new String("Puerto de Navacerrada"),107L,13),new TempData(new String("Salamanca"),107L,17),new TempData(new String("Mulhacen"),108L,20),new TempData(new String("La Linea"),108L,28),new TempData(new String("Puerto de Navacerrada"),108L,28),new TempData(new String("Soria"),108L,28),new TempData(new String("Salamanca"),109L,17),new TempData(new String("Soria"),109L,20),new TempData(new String("Ponferrada"),109L,20),new TempData(new String("La Linea"),110L,16),new TempData(new String("Madrid"),110L,27),new TempData(new String("Mostoles"),110L,25),new TempData(new String("Salamanca"),110L,18),new TempData(new String("Mulhacen"),111L,25),new TempData(new String("Sevilla"),111L,30),new TempData(new String("La Linea"),111L,17),new TempData(new String("Madrid"),111L,22),new TempData(new String("Mostoles"),111L,11),new TempData(new String("Puerto de Navacerrada"),111L,17),new TempData(new String("Salamanca"),111L,25),new TempData(new String("Soria"),111L,30),new TempData(new String("Ponferrada"),111L,12),new TempData(new String("Mulhacen"),112L,26),new TempData(new String("La Linea"),112L,21),new TempData(new String("Mostoles"),112L,13),new TempData(new String("Puerto de Navacerrada"),112L,24),new TempData(new String("Salamanca"),112L,25),new TempData(new String("Soria"),112L,27),new TempData(new String("Ponferrada"),112L,26),new TempData(new String("Mulhacen"),113L,17),new TempData(new String("Sevilla"),113L,18),new TempData(new String("La Linea"),113L,30),new TempData(new String("Madrid"),113L,24),new TempData(new String("Mostoles"),113L,18),new TempData(new String("Puerto de Navacerrada"),113L,10),new TempData(new String("Salamanca"),113L,14),new TempData(new String("Soria"),113L,13),new TempData(new String("Madrid"),114L,25),new TempData(new String("Soria"),114L,26),new TempData(new String("Ponferrada"),114L,27),new TempData(new String("Mulhacen"),115L,22),new TempData(new String("Sevilla"),115L,24),new TempData(new String("Mostoles"),115L,10),new TempData(new String("Puerto de Navacerrada"),115L,13),new TempData(new String("Soria"),115L,21),new TempData(new String("Ponferrada"),115L,10) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_119")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_120 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_120") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_120")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),109L,19),new TempData(new String("La Linea"),109L,25),new TempData(new String("Salamanca"),109L,23),new TempData(new String("Sevilla"),110L,23),new TempData(new String("Madrid"),110L,24),new TempData(new String("Salamanca"),110L,22),new TempData(new String("Mulhacen"),111L,20),new TempData(new String("Sevilla"),111L,13),new TempData(new String("La Linea"),111L,12),new TempData(new String("Madrid"),111L,20),new TempData(new String("Puerto de Navacerrada"),111L,22),new TempData(new String("Soria"),111L,25),new TempData(new String("Mulhacen"),112L,30),new TempData(new String("Sevilla"),112L,16),new TempData(new String("La Linea"),112L,23),new TempData(new String("Madrid"),112L,27),new TempData(new String("Soria"),112L,19),new TempData(new String("Mulhacen"),113L,17),new TempData(new String("Mostoles"),113L,11),new TempData(new String("Puerto de Navacerrada"),113L,17),new TempData(new String("Salamanca"),113L,25),new TempData(new String("Ponferrada"),113L,16),new TempData(new String("Madrid"),114L,18),new TempData(new String("Mostoles"),114L,18),new TempData(new String("Salamanca"),114L,18),new TempData(new String("Ponferrada"),114L,14),new TempData(new String("Mulhacen"),115L,22),new TempData(new String("Sevilla"),115L,10),new TempData(new String("Madrid"),115L,30),new TempData(new String("Salamanca"),115L,24),new TempData(new String("Soria"),115L,28),new TempData(new String("Mulhacen"),116L,16),new TempData(new String("Sevilla"),116L,27),new TempData(new String("La Linea"),116L,24),new TempData(new String("Madrid"),116L,23),new TempData(new String("Mostoles"),116L,15),new TempData(new String("Puerto de Navacerrada"),116L,15),new TempData(new String("Soria"),116L,20),new TempData(new String("Ponferrada"),116L,21),new TempData(new String("Mulhacen"),117L,26),new TempData(new String("Madrid"),117L,26),new TempData(new String("Mostoles"),117L,23),new TempData(new String("Salamanca"),117L,25),new TempData(new String("Mulhacen"),118L,11),new TempData(new String("Puerto de Navacerrada"),118L,25),new TempData(new String("Salamanca"),118L,23),new TempData(new String("Mulhacen"),119L,23),new TempData(new String("Sevilla"),119L,28),new TempData(new String("Mostoles"),119L,25),new TempData(new String("Soria"),119L,21),new TempData(new String("Ponferrada"),119L,25),new TempData(new String("Puerto de Navacerrada"),120L,30),new TempData(new String("Salamanca"),120L,11),new TempData(new String("Ponferrada"),120L,29) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_120")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_121 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_121") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_121")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),111L,25),new TempData(new String("Sevilla"),111L,27),new TempData(new String("La Linea"),111L,23),new TempData(new String("Puerto de Navacerrada"),111L,22),new TempData(new String("Soria"),111L,23),new TempData(new String("Madrid"),112L,19),new TempData(new String("Mostoles"),112L,21),new TempData(new String("Puerto de Navacerrada"),112L,17),new TempData(new String("Salamanca"),112L,26),new TempData(new String("La Linea"),113L,18),new TempData(new String("Madrid"),113L,22),new TempData(new String("Mostoles"),113L,17),new TempData(new String("Salamanca"),113L,16),new TempData(new String("Mulhacen"),114L,10),new TempData(new String("La Linea"),114L,30),new TempData(new String("Mostoles"),114L,13),new TempData(new String("Soria"),114L,27),new TempData(new String("Ponferrada"),114L,21),new TempData(new String("Mulhacen"),115L,13),new TempData(new String("Sevilla"),115L,22),new TempData(new String("Madrid"),115L,30),new TempData(new String("Puerto de Navacerrada"),115L,13),new TempData(new String("Ponferrada"),115L,26),new TempData(new String("Sevilla"),116L,13),new TempData(new String("Mostoles"),116L,18),new TempData(new String("Puerto de Navacerrada"),116L,18),new TempData(new String("Salamanca"),116L,16),new TempData(new String("Ponferrada"),116L,11),new TempData(new String("Madrid"),117L,23),new TempData(new String("Mostoles"),117L,18),new TempData(new String("La Linea"),118L,22),new TempData(new String("Madrid"),118L,18),new TempData(new String("Mostoles"),118L,13),new TempData(new String("Puerto de Navacerrada"),118L,12),new TempData(new String("Salamanca"),118L,30),new TempData(new String("Soria"),118L,16),new TempData(new String("Mulhacen"),119L,27),new TempData(new String("Madrid"),119L,12),new TempData(new String("Mostoles"),119L,26),new TempData(new String("Puerto de Navacerrada"),119L,29),new TempData(new String("Salamanca"),119L,16),new TempData(new String("Soria"),119L,27),new TempData(new String("Ponferrada"),119L,16),new TempData(new String("Sevilla"),120L,28),new TempData(new String("La Linea"),120L,18),new TempData(new String("Mostoles"),120L,13),new TempData(new String("Puerto de Navacerrada"),120L,10),new TempData(new String("Salamanca"),120L,10),new TempData(new String("Soria"),120L,10),new TempData(new String("Ponferrada"),120L,26),new TempData(new String("Sevilla"),121L,30),new TempData(new String("Puerto de Navacerrada"),121L,11),new TempData(new String("Soria"),121L,23),new TempData(new String("Ponferrada"),121L,10) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(27)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(27))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_121")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_122 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_122") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_122")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Sevilla"),103L,20),new TempData(new String("La Linea"),103L,18),new TempData(new String("Madrid"),103L,15),new TempData(new String("Puerto de Navacerrada"),103L,14),new TempData(new String("Salamanca"),103L,30),new TempData(new String("Ponferrada"),103L,11),new TempData(new String("La Linea"),104L,22),new TempData(new String("Madrid"),104L,29),new TempData(new String("Salamanca"),104L,18),new TempData(new String("Soria"),104L,25),new TempData(new String("Ponferrada"),104L,25),new TempData(new String("Sevilla"),105L,11),new TempData(new String("La Linea"),105L,15),new TempData(new String("Mostoles"),105L,14),new TempData(new String("Salamanca"),105L,30),new TempData(new String("Ponferrada"),105L,21),new TempData(new String("Sevilla"),106L,30),new TempData(new String("La Linea"),106L,18),new TempData(new String("Madrid"),106L,26),new TempData(new String("Puerto de Navacerrada"),106L,21),new TempData(new String("Salamanca"),106L,22),new TempData(new String("Soria"),106L,12),new TempData(new String("Mulhacen"),107L,20),new TempData(new String("Mostoles"),107L,18),new TempData(new String("Ponferrada"),107L,26),new TempData(new String("Mulhacen"),108L,20),new TempData(new String("Sevilla"),108L,14),new TempData(new String("Madrid"),108L,29),new TempData(new String("Puerto de Navacerrada"),108L,18),new TempData(new String("Ponferrada"),108L,11),new TempData(new String("Mulhacen"),109L,20),new TempData(new String("Madrid"),109L,30),new TempData(new String("Puerto de Navacerrada"),109L,24),new TempData(new String("Salamanca"),109L,23),new TempData(new String("Mulhacen"),110L,21),new TempData(new String("Sevilla"),110L,22),new TempData(new String("La Linea"),110L,15),new TempData(new String("Madrid"),110L,27),new TempData(new String("Mostoles"),110L,23),new TempData(new String("Puerto de Navacerrada"),110L,24),new TempData(new String("Salamanca"),110L,15),new TempData(new String("Ponferrada"),110L,13),new TempData(new String("Mulhacen"),111L,19),new TempData(new String("Mostoles"),111L,16),new TempData(new String("Puerto de Navacerrada"),111L,26),new TempData(new String("Soria"),111L,21),new TempData(new String("Sevilla"),112L,26),new TempData(new String("Mostoles"),112L,21),new TempData(new String("Mulhacen"),113L,20),new TempData(new String("Madrid"),113L,23),new TempData(new String("Mostoles"),113L,26),new TempData(new String("Soria"),113L,17),new TempData(new String("Ponferrada"),113L,30),new TempData(new String("Mulhacen"),114L,25) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_122")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_123 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_123") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_123")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),104L,15),new TempData(new String("Sevilla"),104L,20),new TempData(new String("La Linea"),104L,29),new TempData(new String("Puerto de Navacerrada"),104L,14),new TempData(new String("Salamanca"),104L,15),new TempData(new String("Ponferrada"),104L,22),new TempData(new String("Mulhacen"),105L,21),new TempData(new String("Sevilla"),105L,22),new TempData(new String("Puerto de Navacerrada"),105L,15),new TempData(new String("Salamanca"),105L,17),new TempData(new String("Soria"),105L,21),new TempData(new String("Ponferrada"),105L,29),new TempData(new String("Mulhacen"),106L,16),new TempData(new String("Sevilla"),106L,15),new TempData(new String("Salamanca"),106L,29),new TempData(new String("Soria"),106L,25),new TempData(new String("Mulhacen"),107L,23),new TempData(new String("Mostoles"),107L,11),new TempData(new String("Puerto de Navacerrada"),107L,16),new TempData(new String("Mulhacen"),108L,28),new TempData(new String("La Linea"),108L,19),new TempData(new String("Madrid"),108L,12),new TempData(new String("Mostoles"),108L,12),new TempData(new String("Puerto de Navacerrada"),108L,21),new TempData(new String("Salamanca"),108L,10),new TempData(new String("Mulhacen"),109L,29),new TempData(new String("Sevilla"),109L,23),new TempData(new String("Madrid"),109L,16),new TempData(new String("Mostoles"),109L,14),new TempData(new String("Puerto de Navacerrada"),109L,10),new TempData(new String("Salamanca"),109L,23),new TempData(new String("Sevilla"),110L,14),new TempData(new String("La Linea"),110L,27),new TempData(new String("Madrid"),110L,15),new TempData(new String("Salamanca"),110L,14),new TempData(new String("Mulhacen"),111L,30),new TempData(new String("La Linea"),112L,30),new TempData(new String("Mostoles"),112L,23),new TempData(new String("Puerto de Navacerrada"),112L,22),new TempData(new String("Salamanca"),112L,16),new TempData(new String("Sevilla"),113L,30),new TempData(new String("Madrid"),113L,11),new TempData(new String("Puerto de Navacerrada"),113L,24),new TempData(new String("Ponferrada"),113L,28),new TempData(new String("Sevilla"),114L,21),new TempData(new String("La Linea"),114L,11),new TempData(new String("Mulhacen"),115L,29),new TempData(new String("Sevilla"),115L,29),new TempData(new String("La Linea"),115L,15),new TempData(new String("Salamanca"),115L,15),new TempData(new String("Soria"),115L,30),new TempData(new String("Ponferrada"),115L,13),new TempData(new String("Sevilla"),116L,28),new TempData(new String("Madrid"),116L,10),new TempData(new String("Puerto de Navacerrada"),116L,22),new TempData(new String("Salamanca"),116L,30),new TempData(new String("Ponferrada"),116L,20),new TempData(new String("Sevilla"),117L,28),new TempData(new String("La Linea"),117L,16),new TempData(new String("Salamanca"),117L,30),new TempData(new String("Soria"),117L,16),new TempData(new String("Ponferrada"),117L,14) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(16)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(23)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(30))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_123")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_124 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_124") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_124")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),104L,18),new TempData(new String("Mostoles"),104L,28),new TempData(new String("Soria"),104L,19),new TempData(new String("Ponferrada"),104L,28),new TempData(new String("Sevilla"),105L,18),new TempData(new String("La Linea"),105L,17),new TempData(new String("Madrid"),105L,11),new TempData(new String("Mostoles"),105L,19),new TempData(new String("Salamanca"),105L,12),new TempData(new String("Soria"),105L,11),new TempData(new String("Mulhacen"),106L,20),new TempData(new String("Sevilla"),106L,13),new TempData(new String("Mostoles"),106L,18),new TempData(new String("Puerto de Navacerrada"),106L,10),new TempData(new String("Ponferrada"),106L,23),new TempData(new String("La Linea"),107L,28),new TempData(new String("Madrid"),107L,11),new TempData(new String("Mostoles"),107L,10),new TempData(new String("Soria"),107L,17),new TempData(new String("Ponferrada"),107L,28),new TempData(new String("Mulhacen"),108L,24),new TempData(new String("Puerto de Navacerrada"),108L,21),new TempData(new String("Salamanca"),108L,26),new TempData(new String("La Linea"),109L,27),new TempData(new String("Mostoles"),109L,10),new TempData(new String("Puerto de Navacerrada"),109L,27),new TempData(new String("Sevilla"),110L,23),new TempData(new String("La Linea"),110L,18),new TempData(new String("Mostoles"),110L,15),new TempData(new String("Puerto de Navacerrada"),110L,20),new TempData(new String("Salamanca"),110L,19),new TempData(new String("Ponferrada"),110L,10),new TempData(new String("Mulhacen"),111L,19),new TempData(new String("Sevilla"),111L,19),new TempData(new String("Madrid"),111L,14),new TempData(new String("Mostoles"),111L,25),new TempData(new String("Ponferrada"),111L,17),new TempData(new String("Mulhacen"),112L,20),new TempData(new String("Sevilla"),112L,11),new TempData(new String("Mostoles"),112L,13),new TempData(new String("La Linea"),113L,28),new TempData(new String("Puerto de Navacerrada"),113L,13),new TempData(new String("Salamanca"),113L,23),new TempData(new String("Soria"),113L,22),new TempData(new String("La Linea"),114L,23),new TempData(new String("Puerto de Navacerrada"),114L,25),new TempData(new String("Soria"),114L,17),new TempData(new String("Ponferrada"),114L,28),new TempData(new String("Mulhacen"),115L,13),new TempData(new String("Sevilla"),115L,30),new TempData(new String("Mostoles"),115L,10),new TempData(new String("Puerto de Navacerrada"),115L,11),new TempData(new String("Salamanca"),115L,12),new TempData(new String("Soria"),115L,17),new TempData(new String("Puerto de Navacerrada"),116L,29),new TempData(new String("Salamanca"),116L,17),new TempData(new String("Ponferrada"),116L,15),new TempData(new String("Sevilla"),117L,18),new TempData(new String("La Linea"),117L,12),new TempData(new String("Puerto de Navacerrada"),117L,16),new TempData(new String("Sevilla"),118L,20),new TempData(new String("Madrid"),118L,10),new TempData(new String("Soria"),118L,11) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(26)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(14)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(22)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(24))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_124")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_125 () 
  {
    if (ResultsHandler.isTimedout())
    {
      Assertions.assertTrue(false,new String("Testing stopped due to global timeout -- too slow execution")) ;
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_125") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_125")) ;
if (ok_sofar)
  ok_sofar = new MaxTemperatures(new TempData[] { new TempData(new String("Mulhacen"),106L,21),new TempData(new String("La Linea"),106L,24),new TempData(new String("Puerto de Navacerrada"),106L,21),new TempData(new String("Soria"),106L,22),new TempData(new String("Ponferrada"),106L,29),new TempData(new String("La Linea"),107L,11),new TempData(new String("Madrid"),107L,15),new TempData(new String("Mostoles"),107L,18),new TempData(new String("Salamanca"),107L,11),new TempData(new String("Ponferrada"),107L,30),new TempData(new String("Madrid"),108L,13),new TempData(new String("Puerto de Navacerrada"),108L,21),new TempData(new String("Mulhacen"),109L,21),new TempData(new String("La Linea"),109L,24),new TempData(new String("Puerto de Navacerrada"),109L,22),new TempData(new String("Madrid"),110L,22),new TempData(new String("Mostoles"),110L,22),new TempData(new String("Soria"),110L,26),new TempData(new String("Ponferrada"),110L,28),new TempData(new String("Mostoles"),111L,23),new TempData(new String("Salamanca"),111L,12),new TempData(new String("Soria"),111L,14),new TempData(new String("Ponferrada"),111L,14),new TempData(new String("Salamanca"),112L,23),new TempData(new String("Soria"),112L,17),new TempData(new String("Mulhacen"),113L,21),new TempData(new String("Sevilla"),113L,28),new TempData(new String("Puerto de Navacerrada"),113L,29),new TempData(new String("Salamanca"),114L,24),new TempData(new String("La Linea"),115L,18),new TempData(new String("Madrid"),115L,12),new TempData(new String("Puerto de Navacerrada"),115L,23),new TempData(new String("Ponferrada"),115L,17),new TempData(new String("Madrid"),116L,18),new TempData(new String("Mostoles"),116L,10),new TempData(new String("Puerto de Navacerrada"),116L,11),new TempData(new String("Ponferrada"),116L,16),new TempData(new String("Mulhacen"),117L,18),new TempData(new String("Sevilla"),117L,21),new TempData(new String("Mostoles"),117L,24),new TempData(new String("Puerto de Navacerrada"),117L,19),new TempData(new String("Mulhacen"),118L,21),new TempData(new String("La Linea"),118L,13),new TempData(new String("Madrid"),118L,13),new TempData(new String("Mostoles"),118L,19),new TempData(new String("Puerto de Navacerrada"),118L,24),new TempData(new String("Salamanca"),118L,12),new TempData(new String("Ponferrada"),118L,18),new TempData(new String("Mulhacen"),119L,12),new TempData(new String("Sevilla"),119L,23),new TempData(new String("La Linea"),119L,17),new TempData(new String("Salamanca"),119L,20),new TempData(new String("Soria"),119L,27),new TempData(new String("Ponferrada"),119L,22),new TempData(new String("Mulhacen"),120L,14),new TempData(new String("La Linea"),120L,12),new TempData(new String("Madrid"),120L,25),new TempData(new String("Soria"),120L,30),new TempData(new String("Ponferrada"),120L,21),new TempData(new String("Puerto de Navacerrada"),121L,25),new TempData(new String("Ponferrada"),121L,22),new TempData(new String("La Linea"),122L,12),new TempData(new String("Madrid"),122L,25),new TempData(new String("Mostoles"),122L,19),new TempData(new String("Salamanca"),122L,15),new TempData(new String("Ponferrada"),122L,23) }).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<String,Integer>(new String("Sevilla"),new Integer(28)),new es.upm.aedlib.Pair<String,Integer>(new String("Salamanca"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mostoles"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Madrid"),new Integer(25)),new es.upm.aedlib.Pair<String,Integer>(new String("Ponferrada"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Soria"),new Integer(30)),new es.upm.aedlib.Pair<String,Integer>(new String("Puerto de Navacerrada"),new Integer(29)),new es.upm.aedlib.Pair<String,Integer>(new String("La Linea"),new Integer(24)),new es.upm.aedlib.Pair<String,Integer>(new String("Mulhacen"),new Integer(21))))) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING,new String("*** TIMEOUT! *** Very slow or non-terminating execution"),exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED,new String("Internal testing error; please report this to teachers"),exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest(new String("test_125")) ;
    ResultsHandler.add_result(new String("maxTemperatures"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd5";
}





static class TempMapsUtils {
  public static void resetPrinter() {
  }

  public static String printer(Object obj) {
    if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "("+printer(p.getLeft())+","+printer(p.getRight())+")";
    } else return TestUtils.printer(obj, x -> printer(x));
  }


  static boolean correctMap
    (TestCall<Map<String,Integer>,NodePositionList<Pair<String,Integer>>> call,
     TestResult<Map<String,Integer>,NodePositionList<Pair<String,Integer>>> result,
     NodePositionList<Pair<String,Integer>> expected) {
    
    if (expected == null) {
      if (result.getValue() != null) {
          TestUtils.printError
            (TestUtils.ExecutionTime.UNRELATED,
             "\nthe call\n  "+call.toString()+
             "\n\nreturned a map\n  "+printer(result.getValue())+
             "\n\nbut should have returned null");
          return false;
      } else return true;
    }

      PositionList<Pair<String,Integer>> entries =
        new NodePositionList<Pair<String,Integer>>();
      for (Entry<String,Integer> entry : result.getValue().entries()) {
        entries.addLast
          (new Pair<String,Integer>(entry.getKey(),entry.getValue()));
      }

      if (!TestUtils.sameElements(entries,expected)) {
          TestUtils.printError
            (TestUtils.ExecutionTime.UNRELATED,
             "\nthe call\n  "+call.toString()+
             "\n\nreturned a map\n  "+printer(result.getValue())+
             "\n\nwith elements that do not match the expected elements\n  "+printer(expected));
          return false;
      }
      
      return true;
    }
}


























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+obj.toString()+"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
      if (!s1.equals(s2)) 
        return false;
      else
        return true;
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

      if (it1.hasNext() != it2.hasNext())
        return false;
      return true;

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
            if (!parameterTypes[i].isInstance(params[i]))
              equals = false;
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = true;
      
      if (newer.length != original.length) {
	  ok_sofar = false;
      }

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(value,expected)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }      
  }

  private static boolean equalsWithArrays(Object a, Object b) {
    if (a == null) return b == null;
    if (b == null) return a == null;
    if (a.equals(b)) return true;
    if (a instanceof Object[] && b instanceof Object[]) {
      Object[] obj_a = (Object[]) a;
      Object[] obj_b = (Object[]) b;
      return Arrays.deepEquals(obj_a,obj_b);
    } else if (a instanceof int[] && b instanceof int[]) {
      int[] obj_a = (int[]) a;
      int[] obj_b = (int[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof char[] && b instanceof char[]) {
      char[] obj_a = (char[]) a;
      char[] obj_b = (char[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof long[] && b instanceof long[]) {
      long[] obj_a = (long[]) a;
      long[] obj_b = (long[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof float[] && b instanceof float[]) {
      float[] obj_a = (float[]) a;
      float[] obj_b = (float[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof double[] && b instanceof double[]) {
      double[] obj_a = (double[]) a;
      double[] obj_b = (double[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof byte[] && b instanceof byte[]) {
      byte[] obj_a = (byte[]) a;
      byte[] obj_b = (byte[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof short[] && b instanceof short[]) {
      short[] obj_a = (short[]) a;
      short[] obj_b = (short[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else if (a instanceof boolean[] && b instanceof boolean[]) {
      boolean[] obj_a = (boolean[]) a;
      boolean[] obj_b = (boolean[]) b;
      return Arrays.equals(obj_a,obj_b);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class Compactar extends TestCall<es.upm.aedlib.positionlist.PositionList<Integer>,Object>
{
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1;
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1_orig;
  
  public Compactar (es.upm.aedlib.positionlist.NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.compactar")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.PositionList<Integer> call () throws Exception
  {
    return Utils.compactar(x_1) ;
  }
  
  public boolean checkResult (Object expected) 
  {
    if (expected instanceof Throwable)
    {
      Throwable t = (Throwable) expected ;
      if (!throwsException(t.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class MaxTemperatures extends TestCall<es.upm.aedlib.map.Map<String,Integer>,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>>>
{
  TempData[] x_1;
  TempData[] x_1_orig;
  
  public MaxTemperatures (TempData[] x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = x_1.clone() ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.maxTemperatures")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.map.Map<String,Integer> call () 
  {
    return Utils.maxTemperatures(x_1) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<String,Integer>> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged_array(x_1,x_1_orig))
      return false ;
    if (!TempMapsUtils.correctMap(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class DeleteRepeated extends TestCall<es.upm.aedlib.positionlist.PositionList<Integer>,es.upm.aedlib.positionlist.PositionList<Integer>>
{
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1;
  es.upm.aedlib.positionlist.NodePositionList<Integer> x_1_orig;
  
  public DeleteRepeated (es.upm.aedlib.positionlist.NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new es.upm.aedlib.positionlist.NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.deleteRepeated")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.PositionList<Integer> call () 
  {
    return Utils.deleteRepeated(x_1) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.PositionList<Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}












 
static class BaseResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds*1000;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {};
    }
 
    return sb.toString();
  }
  
}





static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}

static class ResultsHandler extends BaseResultsHandler {
  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    int goodOnes = 0;
    for (String key : results_sofar.keySet()) {
      if (results_sofar.get(key)) {
	++goodOnes;
      } 
    }

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return goodOnes >= 1;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName))
        System.out.println("succeeded");
      else
        System.out.println("failed");
    }

    System.out.println("\n------------------------------------------");
    if (results_ok())
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
    else
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
  }
}

static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}
