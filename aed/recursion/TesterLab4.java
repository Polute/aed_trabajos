
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
// File generated at: 2022/11/10 -- 12:36:6
// Seed: {1668,80135,10176}
//
//////////////////////////////////////////////////////////////////////



package aed.recursion;

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
import java.util.Hashtable;
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
public class TesterLab4 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(90,60) ;
    TestData.setTesterType(true) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
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
TestData.testName = new String("test_01") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_01")) ;
if (ok_sofar)
  ok_sofar = new RecursionCheck(new String("aed.recursion"),new String("Explorador"),new String("explora"),new Integer(1)).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_01")) ;
    ResultsHandler.add_result(new String("recursionCheck"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
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
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
  ok_sofar = new RecursionCheck(new String("aed.recursion"),new String("Utils"),new String("findBottom"),new Integer(1)).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_02")) ;
    ResultsHandler.add_result(new String("recursionCheck"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
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
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
  ok_sofar = new RecursionCheck(new String("aed.recursion"),new String("Utils"),new String("joinMultiSets"),new Integer(2)).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_03")) ;
    ResultsHandler.add_result(new String("recursionCheck"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
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
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
  ok_sofar = new RecursionCheck(new String("aed.recursion"),new String("Utils"),new String("multiply"),new Integer(2)).doCall().checkResult(new Boolean(true)) ;
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
    ResultsHandler.stopTest(new String("test_04")) ;
    ResultsHandler.add_result(new String("recursionCheck"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
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
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
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
    ResultsHandler.stopTest(new String("test_05")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
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
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(172),new Integer(-53)).doCall().checkResult(new Integer(-9116)) ;
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
    ResultsHandler.stopTest(new String("test_06")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
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
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(299),new Integer(-198)).doCall().checkResult(new Integer(-59202)) ;
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
    ResultsHandler.stopTest(new String("test_07")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
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
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-128),new Integer(-439)).doCall().checkResult(new Integer(56192)) ;
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
    ResultsHandler.stopTest(new String("test_08")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
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
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(507),new Integer(-131)).doCall().checkResult(new Integer(-66417)) ;
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
    ResultsHandler.stopTest(new String("test_09")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
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
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-19),new Integer(-672)).doCall().checkResult(new Integer(12768)) ;
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
    ResultsHandler.stopTest(new String("test_10")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
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
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-528),new Integer(242)).doCall().checkResult(new Integer(-127776)) ;
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
    ResultsHandler.stopTest(new String("test_11")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
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
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(659),new Integer(-186)).doCall().checkResult(new Integer(-122574)) ;
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
    ResultsHandler.stopTest(new String("test_12")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
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
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(442),new Integer(-424)).doCall().checkResult(new Integer(-187408)) ;
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
    ResultsHandler.stopTest(new String("test_13")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
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
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(441),new Integer(-431)).doCall().checkResult(new Integer(-190071)) ;
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
    ResultsHandler.stopTest(new String("test_14")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
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
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(234),new Integer(640)).doCall().checkResult(new Integer(149760)) ;
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
    ResultsHandler.stopTest(new String("test_15")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
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
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-29),new Integer(886)).doCall().checkResult(new Integer(-25694)) ;
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
    ResultsHandler.stopTest(new String("test_16")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
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
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(293),new Integer(-626)).doCall().checkResult(new Integer(-183418)) ;
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
    ResultsHandler.stopTest(new String("test_17")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
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
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(800),new Integer(181)).doCall().checkResult(new Integer(144800)) ;
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
    ResultsHandler.stopTest(new String("test_18")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
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
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-371),new Integer(846)).doCall().checkResult(new Integer(-313866)) ;
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
    ResultsHandler.stopTest(new String("test_19")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
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
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-445),new Integer(-793)).doCall().checkResult(new Integer(352885)) ;
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
    ResultsHandler.stopTest(new String("test_20")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
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
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(468),new Integer(-971)).doCall().checkResult(new Integer(-454428)) ;
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
    ResultsHandler.stopTest(new String("test_21")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
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
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(884),new Integer(-821)).doCall().checkResult(new Integer(-725764)) ;
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
    ResultsHandler.stopTest(new String("test_22")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
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
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(-993),new Integer(730)).doCall().checkResult(new Integer(-724890)) ;
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
    ResultsHandler.stopTest(new String("test_23")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
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
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
  ok_sofar = new Multiply(new Integer(986),new Integer(-877)).doCall().checkResult(new Integer(-864722)) ;
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
    ResultsHandler.stopTest(new String("test_24")) ;
    ResultsHandler.add_result(new String("multiply"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
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
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
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
    ResultsHandler.stopTest(new String("test_25")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
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
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0) }),new Integer(1))) ;
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
    ResultsHandler.stopTest(new String("test_26")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
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
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(29576),new MyInteger(29957) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0) }),new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_27")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
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
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(31351),new MyInteger(4155) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1) }),new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_28")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
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
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(1) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(1) }),new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_29")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
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
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(2) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0) }),new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_30")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
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
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(2),new MyInteger(1) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1) }),new Integer(2))) ;
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
    ResultsHandler.stopTest(new String("test_31")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
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
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(68520),new MyInteger(3567),new MyInteger(56473),new MyInteger(90651) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1) }),new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_32")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
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
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(2),new MyInteger(2),new MyInteger(1),new MyInteger(5) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(2) }),new Integer(4))) ;
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
    ResultsHandler.stopTest(new String("test_33")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
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
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(9),new MyInteger(8),new MyInteger(7),new MyInteger(6),new MyInteger(5),new MyInteger(4),new MyInteger(3),new MyInteger(2),new MyInteger(1) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(8) }),new Integer(9))) ;
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
    ResultsHandler.stopTest(new String("test_34")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
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
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(9),new MyInteger(8),new MyInteger(7),new MyInteger(6),new MyInteger(1),new MyInteger(2),new MyInteger(3),new MyInteger(4),new MyInteger(5),new MyInteger(6),new MyInteger(7) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(4) }),new Integer(11))) ;
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
    ResultsHandler.stopTest(new String("test_35")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
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
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(39875),new MyInteger(83938),new MyInteger(15001),new MyInteger(34208),new MyInteger(26922),new MyInteger(45002),new MyInteger(59311),new MyInteger(91010),new MyInteger(57671),new MyInteger(72208),new MyInteger(50660),new MyInteger(614),new MyInteger(58606),new MyInteger(49921),new MyInteger(85527),new MyInteger(87640),new MyInteger(25412),new MyInteger(47549),new MyInteger(70996),new MyInteger(19612),new MyInteger(37286),new MyInteger(20125),new MyInteger(46336),new MyInteger(54120) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(2),new MyInteger(4),new MyInteger(8),new MyInteger(11),new MyInteger(13),new MyInteger(16),new MyInteger(19),new MyInteger(21) }),new Integer(24))) ;
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
    ResultsHandler.stopTest(new String("test_36")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
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
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(1),new MyInteger(2),new MyInteger(4),new MyInteger(5),new MyInteger(6),new MyInteger(7),new MyInteger(8),new MyInteger(9),new MyInteger(10),new MyInteger(11),new MyInteger(12),new MyInteger(13),new MyInteger(14),new MyInteger(15),new MyInteger(16),new MyInteger(17),new MyInteger(18),new MyInteger(19),new MyInteger(20),new MyInteger(21),new MyInteger(22),new MyInteger(23),new MyInteger(24),new MyInteger(25),new MyInteger(26),new MyInteger(27),new MyInteger(28),new MyInteger(29),new MyInteger(30) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0) }),new Integer(30))) ;
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
    ResultsHandler.stopTest(new String("test_37")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
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
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(30),new MyInteger(29),new MyInteger(28),new MyInteger(27),new MyInteger(26),new MyInteger(25),new MyInteger(24),new MyInteger(23),new MyInteger(22),new MyInteger(21),new MyInteger(20),new MyInteger(19),new MyInteger(18),new MyInteger(17),new MyInteger(16),new MyInteger(15),new MyInteger(14),new MyInteger(13),new MyInteger(12),new MyInteger(11),new MyInteger(10),new MyInteger(9),new MyInteger(8),new MyInteger(7),new MyInteger(6),new MyInteger(5),new MyInteger(4),new MyInteger(3),new MyInteger(2),new MyInteger(1) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(29) }),new Integer(30))) ;
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
    ResultsHandler.stopTest(new String("test_38")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
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
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(95617),new MyInteger(97571),new MyInteger(15564),new MyInteger(22725),new MyInteger(14931),new MyInteger(64080),new MyInteger(10972),new MyInteger(93051),new MyInteger(45625),new MyInteger(10745),new MyInteger(90498),new MyInteger(12153),new MyInteger(17778),new MyInteger(57179),new MyInteger(44871),new MyInteger(32027),new MyInteger(8619),new MyInteger(73495),new MyInteger(74331),new MyInteger(70678),new MyInteger(24454),new MyInteger(80041),new MyInteger(72403),new MyInteger(37274),new MyInteger(76634),new MyInteger(77037),new MyInteger(24804),new MyInteger(86591),new MyInteger(62131),new MyInteger(83728),new MyInteger(21268) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(2),new MyInteger(4),new MyInteger(6),new MyInteger(9),new MyInteger(11),new MyInteger(16),new MyInteger(20),new MyInteger(23),new MyInteger(26),new MyInteger(28),new MyInteger(30) }),new Integer(31))) ;
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
    ResultsHandler.stopTest(new String("test_39")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
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
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(40200),new MyInteger(7729),new MyInteger(466),new MyInteger(90844),new MyInteger(94326),new MyInteger(5972),new MyInteger(7770),new MyInteger(13547),new MyInteger(1576),new MyInteger(63958),new MyInteger(24423),new MyInteger(22631),new MyInteger(83378),new MyInteger(46870),new MyInteger(66043),new MyInteger(99492),new MyInteger(70948),new MyInteger(47324),new MyInteger(25572),new MyInteger(17858),new MyInteger(55551),new MyInteger(51580),new MyInteger(26495),new MyInteger(25846),new MyInteger(82299),new MyInteger(45210),new MyInteger(93425),new MyInteger(56038),new MyInteger(42994),new MyInteger(32207),new MyInteger(63986),new MyInteger(25745),new MyInteger(73312),new MyInteger(38798),new MyInteger(51946),new MyInteger(82092),new MyInteger(86503),new MyInteger(6898),new MyInteger(61204),new MyInteger(79724),new MyInteger(17048),new MyInteger(20098),new MyInteger(90753),new MyInteger(34291),new MyInteger(76400),new MyInteger(53579),new MyInteger(15515) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(2),new MyInteger(5),new MyInteger(8),new MyInteger(11),new MyInteger(13),new MyInteger(19),new MyInteger(23),new MyInteger(25),new MyInteger(29),new MyInteger(31),new MyInteger(33),new MyInteger(37),new MyInteger(40),new MyInteger(43),new MyInteger(46) }),new Integer(47))) ;
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
    ResultsHandler.stopTest(new String("test_40")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
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
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(15319),new MyInteger(64697),new MyInteger(35054),new MyInteger(36387),new MyInteger(73276),new MyInteger(65065),new MyInteger(38256),new MyInteger(22653),new MyInteger(97391),new MyInteger(15176),new MyInteger(17246),new MyInteger(14056),new MyInteger(86254),new MyInteger(65728),new MyInteger(63749),new MyInteger(2095),new MyInteger(98069),new MyInteger(37304),new MyInteger(27427),new MyInteger(43366),new MyInteger(66476),new MyInteger(31246),new MyInteger(53259),new MyInteger(59303),new MyInteger(49499),new MyInteger(72443),new MyInteger(76613),new MyInteger(52067),new MyInteger(83343),new MyInteger(51018),new MyInteger(44401),new MyInteger(62985),new MyInteger(92335),new MyInteger(56759),new MyInteger(94458),new MyInteger(53444),new MyInteger(31901),new MyInteger(19471),new MyInteger(56518),new MyInteger(61318),new MyInteger(85243),new MyInteger(63540),new MyInteger(77482),new MyInteger(81718),new MyInteger(11852),new MyInteger(90929),new MyInteger(83847),new MyInteger(86810) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(2),new MyInteger(7),new MyInteger(9),new MyInteger(11),new MyInteger(15),new MyInteger(18),new MyInteger(21),new MyInteger(24),new MyInteger(27),new MyInteger(30),new MyInteger(33),new MyInteger(37),new MyInteger(41),new MyInteger(44),new MyInteger(46) }),new Integer(48))) ;
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
    ResultsHandler.stopTest(new String("test_41")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
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
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(5593),new MyInteger(29654),new MyInteger(53468),new MyInteger(96528),new MyInteger(18092),new MyInteger(73322),new MyInteger(12023),new MyInteger(17619),new MyInteger(96792),new MyInteger(33520),new MyInteger(39987),new MyInteger(57084),new MyInteger(43604),new MyInteger(81627),new MyInteger(213),new MyInteger(24476),new MyInteger(80435),new MyInteger(9918),new MyInteger(70728),new MyInteger(15794),new MyInteger(61709),new MyInteger(82673),new MyInteger(55485),new MyInteger(38513),new MyInteger(73946),new MyInteger(86097),new MyInteger(33062),new MyInteger(30807),new MyInteger(91302),new MyInteger(42060),new MyInteger(32309),new MyInteger(69189),new MyInteger(69146),new MyInteger(5746),new MyInteger(60774),new MyInteger(26294),new MyInteger(19558),new MyInteger(77463),new MyInteger(79488),new MyInteger(84955),new MyInteger(24076),new MyInteger(70806),new MyInteger(30799),new MyInteger(95156),new MyInteger(67991),new MyInteger(28617),new MyInteger(54206),new MyInteger(98368),new MyInteger(55057),new MyInteger(1395),new MyInteger(55964) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(4),new MyInteger(6),new MyInteger(9),new MyInteger(12),new MyInteger(14),new MyInteger(17),new MyInteger(19),new MyInteger(23),new MyInteger(27),new MyInteger(30),new MyInteger(33),new MyInteger(36),new MyInteger(40),new MyInteger(42),new MyInteger(45),new MyInteger(49) }),new Integer(51))) ;
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
    ResultsHandler.stopTest(new String("test_42")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
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
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(69973),new MyInteger(73239),new MyInteger(74071),new MyInteger(32115),new MyInteger(79793),new MyInteger(93770),new MyInteger(56851),new MyInteger(71325),new MyInteger(50844),new MyInteger(69639),new MyInteger(70246),new MyInteger(6154),new MyInteger(35671),new MyInteger(51856),new MyInteger(21800),new MyInteger(88642),new MyInteger(51716),new MyInteger(35787),new MyInteger(89683),new MyInteger(70456),new MyInteger(50674),new MyInteger(59477),new MyInteger(1199),new MyInteger(71058),new MyInteger(25231),new MyInteger(17189),new MyInteger(59528),new MyInteger(7601),new MyInteger(4484),new MyInteger(99896),new MyInteger(5321),new MyInteger(66951),new MyInteger(92294),new MyInteger(42527),new MyInteger(48391),new MyInteger(17623),new MyInteger(17982),new MyInteger(31351),new MyInteger(75941),new MyInteger(87933),new MyInteger(45120),new MyInteger(27628),new MyInteger(57730),new MyInteger(50606),new MyInteger(14723),new MyInteger(26439),new MyInteger(48524),new MyInteger(61440),new MyInteger(19821),new MyInteger(98858),new MyInteger(96068),new MyInteger(83477) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(3),new MyInteger(6),new MyInteger(8),new MyInteger(11),new MyInteger(14),new MyInteger(17),new MyInteger(20),new MyInteger(22),new MyInteger(25),new MyInteger(28),new MyInteger(30),new MyInteger(33),new MyInteger(35),new MyInteger(41),new MyInteger(44),new MyInteger(48),new MyInteger(51) }),new Integer(52))) ;
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
    ResultsHandler.stopTest(new String("test_43")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_44 () 
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
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(58215),new MyInteger(51944),new MyInteger(72141),new MyInteger(47648),new MyInteger(76799),new MyInteger(34787),new MyInteger(20741),new MyInteger(7880),new MyInteger(28648),new MyInteger(19109),new MyInteger(32379),new MyInteger(83338),new MyInteger(97421),new MyInteger(83006),new MyInteger(64338),new MyInteger(971),new MyInteger(92901),new MyInteger(7306),new MyInteger(95382),new MyInteger(62656),new MyInteger(78486),new MyInteger(8869),new MyInteger(89153),new MyInteger(55045),new MyInteger(6153),new MyInteger(61163),new MyInteger(2025),new MyInteger(17975),new MyInteger(665),new MyInteger(23054),new MyInteger(36576),new MyInteger(11460),new MyInteger(18195),new MyInteger(15399),new MyInteger(20311),new MyInteger(14907),new MyInteger(40093),new MyInteger(90092),new MyInteger(26825),new MyInteger(66512),new MyInteger(68711),new MyInteger(40139),new MyInteger(76734),new MyInteger(53321),new MyInteger(5779),new MyInteger(86903),new MyInteger(61806),new MyInteger(60259),new MyInteger(71803),new MyInteger(19441),new MyInteger(66275),new MyInteger(23757),new MyInteger(80746),new MyInteger(20033),new MyInteger(73996),new MyInteger(4439),new MyInteger(45018) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(3),new MyInteger(7),new MyInteger(9),new MyInteger(15),new MyInteger(17),new MyInteger(19),new MyInteger(21),new MyInteger(24),new MyInteger(26),new MyInteger(28),new MyInteger(31),new MyInteger(33),new MyInteger(35),new MyInteger(38),new MyInteger(41),new MyInteger(44),new MyInteger(47),new MyInteger(49),new MyInteger(51),new MyInteger(53),new MyInteger(55) }),new Integer(57))) ;
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
    ResultsHandler.stopTest(new String("test_44")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_45 () 
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
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(39836),new MyInteger(5628),new MyInteger(34708),new MyInteger(46698),new MyInteger(53784),new MyInteger(62810),new MyInteger(45846),new MyInteger(36166),new MyInteger(68951),new MyInteger(5376),new MyInteger(61335),new MyInteger(47245),new MyInteger(41164),new MyInteger(72843),new MyInteger(96751),new MyInteger(6555),new MyInteger(30386),new MyInteger(86331),new MyInteger(82210),new MyInteger(36472),new MyInteger(68623),new MyInteger(22979),new MyInteger(19808),new MyInteger(66671),new MyInteger(2876),new MyInteger(15641),new MyInteger(6900),new MyInteger(92975),new MyInteger(67896),new MyInteger(46709),new MyInteger(35552),new MyInteger(60184),new MyInteger(25520),new MyInteger(84780),new MyInteger(7499),new MyInteger(982),new MyInteger(78617),new MyInteger(64293),new MyInteger(54031),new MyInteger(98733),new MyInteger(61697),new MyInteger(71832),new MyInteger(56822),new MyInteger(25074),new MyInteger(27162),new MyInteger(47320),new MyInteger(85332),new MyInteger(73645),new MyInteger(28965),new MyInteger(58407),new MyInteger(17993),new MyInteger(15140),new MyInteger(67967),new MyInteger(36399),new MyInteger(13492),new MyInteger(83202),new MyInteger(21818),new MyInteger(77640),new MyInteger(6638),new MyInteger(49416),new MyInteger(18546) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(7),new MyInteger(9),new MyInteger(12),new MyInteger(15),new MyInteger(19),new MyInteger(22),new MyInteger(24),new MyInteger(26),new MyInteger(30),new MyInteger(32),new MyInteger(35),new MyInteger(38),new MyInteger(40),new MyInteger(43),new MyInteger(48),new MyInteger(51),new MyInteger(54),new MyInteger(56),new MyInteger(58),new MyInteger(60) }),new Integer(61))) ;
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
    ResultsHandler.stopTest(new String("test_45")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_46 () 
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
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(79733),new MyInteger(77097),new MyInteger(46113),new MyInteger(55779),new MyInteger(58363),new MyInteger(7410),new MyInteger(33311),new MyInteger(85210),new MyInteger(92177),new MyInteger(60793),new MyInteger(23466),new MyInteger(68543),new MyInteger(5887),new MyInteger(88986),new MyInteger(71863),new MyInteger(40099),new MyInteger(42244),new MyInteger(15472),new MyInteger(43427),new MyInteger(55070),new MyInteger(17741),new MyInteger(11441),new MyInteger(6982),new MyInteger(10523),new MyInteger(5591),new MyInteger(82210),new MyInteger(54545),new MyInteger(82813),new MyInteger(43383),new MyInteger(18134),new MyInteger(5267),new MyInteger(46215),new MyInteger(92563),new MyInteger(54172),new MyInteger(18756),new MyInteger(51539),new MyInteger(11342),new MyInteger(60398),new MyInteger(83608),new MyInteger(14946),new MyInteger(5526),new MyInteger(31901),new MyInteger(80083),new MyInteger(944),new MyInteger(32014),new MyInteger(21007),new MyInteger(53602),new MyInteger(66911),new MyInteger(17307),new MyInteger(12141),new MyInteger(59652),new MyInteger(30051),new MyInteger(35300),new MyInteger(95685),new MyInteger(85709),new MyInteger(99286),new MyInteger(57745),new MyInteger(89143),new MyInteger(47763),new MyInteger(40634),new MyInteger(42184),new MyInteger(86191) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(2),new MyInteger(5),new MyInteger(10),new MyInteger(12),new MyInteger(15),new MyInteger(17),new MyInteger(22),new MyInteger(24),new MyInteger(26),new MyInteger(30),new MyInteger(34),new MyInteger(36),new MyInteger(40),new MyInteger(43),new MyInteger(45),new MyInteger(49),new MyInteger(51),new MyInteger(54),new MyInteger(56),new MyInteger(59) }),new Integer(62))) ;
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
    ResultsHandler.stopTest(new String("test_46")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_47 () 
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
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(87353),new MyInteger(57649),new MyInteger(77153),new MyInteger(81444),new MyInteger(93519),new MyInteger(19433),new MyInteger(43486),new MyInteger(98096),new MyInteger(21606),new MyInteger(17660),new MyInteger(97435),new MyInteger(99200),new MyInteger(10243),new MyInteger(87829),new MyInteger(99598),new MyInteger(97498),new MyInteger(32545),new MyInteger(76678),new MyInteger(89589),new MyInteger(86706),new MyInteger(63997),new MyInteger(13445),new MyInteger(87913),new MyInteger(24354),new MyInteger(27671),new MyInteger(5153),new MyInteger(11502),new MyInteger(7996),new MyInteger(84992),new MyInteger(73143),new MyInteger(55834),new MyInteger(30737),new MyInteger(83075),new MyInteger(16626),new MyInteger(3704),new MyInteger(70035),new MyInteger(60781),new MyInteger(49692),new MyInteger(87680),new MyInteger(64499),new MyInteger(8915),new MyInteger(82907),new MyInteger(57186),new MyInteger(29807),new MyInteger(57705),new MyInteger(39547),new MyInteger(28025),new MyInteger(79334),new MyInteger(65487),new MyInteger(21276),new MyInteger(87809),new MyInteger(93398),new MyInteger(49806),new MyInteger(43675),new MyInteger(45826),new MyInteger(49832),new MyInteger(29886),new MyInteger(87410),new MyInteger(85230),new MyInteger(20862),new MyInteger(71999),new MyInteger(20201),new MyInteger(11615),new MyInteger(86397) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(5),new MyInteger(9),new MyInteger(12),new MyInteger(16),new MyInteger(21),new MyInteger(23),new MyInteger(25),new MyInteger(27),new MyInteger(31),new MyInteger(34),new MyInteger(37),new MyInteger(40),new MyInteger(43),new MyInteger(46),new MyInteger(49),new MyInteger(53),new MyInteger(56),new MyInteger(59),new MyInteger(62) }),new Integer(64))) ;
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
    ResultsHandler.stopTest(new String("test_47")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_48 () 
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
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(46385),new MyInteger(9622),new MyInteger(19134),new MyInteger(76694),new MyInteger(19900),new MyInteger(26331),new MyInteger(84052),new MyInteger(19690),new MyInteger(33344),new MyInteger(65168),new MyInteger(52988),new MyInteger(97682),new MyInteger(53566),new MyInteger(92867),new MyInteger(49149),new MyInteger(60023),new MyInteger(71604),new MyInteger(3348),new MyInteger(83078),new MyInteger(15019),new MyInteger(65420),new MyInteger(17518),new MyInteger(12067),new MyInteger(32215),new MyInteger(92068),new MyInteger(67428),new MyInteger(85995),new MyInteger(16297),new MyInteger(36640),new MyInteger(56004),new MyInteger(78766),new MyInteger(93075),new MyInteger(53419),new MyInteger(14481),new MyInteger(39902),new MyInteger(57971),new MyInteger(72534),new MyInteger(33538),new MyInteger(81520),new MyInteger(59454),new MyInteger(82908),new MyInteger(51153),new MyInteger(62491),new MyInteger(78548),new MyInteger(84852),new MyInteger(93925),new MyInteger(33244),new MyInteger(53312),new MyInteger(70450),new MyInteger(58374),new MyInteger(70026),new MyInteger(28444),new MyInteger(1094),new MyInteger(7095),new MyInteger(25540),new MyInteger(75730),new MyInteger(11260),new MyInteger(47199),new MyInteger(60769),new MyInteger(86711),new MyInteger(47453),new MyInteger(71117),new MyInteger(59743),new MyInteger(47250),new MyInteger(43432),new MyInteger(67203),new MyInteger(15226) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(4),new MyInteger(7),new MyInteger(10),new MyInteger(12),new MyInteger(14),new MyInteger(17),new MyInteger(19),new MyInteger(22),new MyInteger(25),new MyInteger(27),new MyInteger(33),new MyInteger(37),new MyInteger(39),new MyInteger(41),new MyInteger(46),new MyInteger(49),new MyInteger(52),new MyInteger(56),new MyInteger(60),new MyInteger(64),new MyInteger(66) }),new Integer(67))) ;
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
    ResultsHandler.stopTest(new String("test_48")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_49 () 
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
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(92761),new MyInteger(98477),new MyInteger(18687),new MyInteger(16916),new MyInteger(67054),new MyInteger(21405),new MyInteger(26184),new MyInteger(27999),new MyInteger(83116),new MyInteger(16569),new MyInteger(99040),new MyInteger(34043),new MyInteger(69173),new MyInteger(92867),new MyInteger(88629),new MyInteger(2246),new MyInteger(75709),new MyInteger(39179),new MyInteger(86300),new MyInteger(72898),new MyInteger(51227),new MyInteger(57640),new MyInteger(24623),new MyInteger(73452),new MyInteger(22246),new MyInteger(67541),new MyInteger(78372),new MyInteger(46430),new MyInteger(37511),new MyInteger(88990),new MyInteger(53803),new MyInteger(51564),new MyInteger(4555),new MyInteger(85212),new MyInteger(99637),new MyInteger(81785),new MyInteger(16562),new MyInteger(74951),new MyInteger(72427),new MyInteger(21352),new MyInteger(16964),new MyInteger(53716),new MyInteger(56402),new MyInteger(62396),new MyInteger(16529),new MyInteger(2236),new MyInteger(31688),new MyInteger(36095),new MyInteger(49952),new MyInteger(2059),new MyInteger(46592),new MyInteger(795),new MyInteger(12604),new MyInteger(89349),new MyInteger(50630),new MyInteger(49551),new MyInteger(22488),new MyInteger(43443),new MyInteger(9204),new MyInteger(63566),new MyInteger(26778),new MyInteger(13919),new MyInteger(21397),new MyInteger(41531),new MyInteger(44483),new MyInteger(91984),new MyInteger(52944),new MyInteger(77325),new MyInteger(95051) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(3),new MyInteger(5),new MyInteger(9),new MyInteger(11),new MyInteger(15),new MyInteger(17),new MyInteger(20),new MyInteger(22),new MyInteger(24),new MyInteger(28),new MyInteger(32),new MyInteger(36),new MyInteger(40),new MyInteger(45),new MyInteger(49),new MyInteger(51),new MyInteger(56),new MyInteger(58),new MyInteger(61),new MyInteger(66) }),new Integer(69))) ;
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
    ResultsHandler.stopTest(new String("test_49")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_50 () 
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
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(6820),new MyInteger(47915),new MyInteger(23843),new MyInteger(45739),new MyInteger(14297),new MyInteger(94900),new MyInteger(26202),new MyInteger(89306),new MyInteger(37107),new MyInteger(1833),new MyInteger(77346),new MyInteger(50635),new MyInteger(66010),new MyInteger(64593),new MyInteger(91908),new MyInteger(57775),new MyInteger(25755),new MyInteger(53875),new MyInteger(29191),new MyInteger(21126),new MyInteger(93190),new MyInteger(23439),new MyInteger(93168),new MyInteger(60793),new MyInteger(73869),new MyInteger(3766),new MyInteger(34147),new MyInteger(62611),new MyInteger(15309),new MyInteger(57394),new MyInteger(10863),new MyInteger(46374),new MyInteger(73448),new MyInteger(13891),new MyInteger(38861),new MyInteger(14806),new MyInteger(5481),new MyInteger(65320),new MyInteger(67527),new MyInteger(65162),new MyInteger(99700),new MyInteger(69704),new MyInteger(1089),new MyInteger(59099),new MyInteger(38049),new MyInteger(22946),new MyInteger(72866),new MyInteger(46047),new MyInteger(92477),new MyInteger(25955),new MyInteger(13861),new MyInteger(54371),new MyInteger(44475),new MyInteger(79241),new MyInteger(31437),new MyInteger(46075),new MyInteger(51454),new MyInteger(42979),new MyInteger(62394),new MyInteger(41947),new MyInteger(77589),new MyInteger(89181),new MyInteger(33070),new MyInteger(22024),new MyInteger(17998),new MyInteger(48094),new MyInteger(18574),new MyInteger(66331),new MyInteger(85398),new MyInteger(19483),new MyInteger(425),new MyInteger(63218),new MyInteger(86619),new MyInteger(52664),new MyInteger(87189),new MyInteger(16153),new MyInteger(27914),new MyInteger(52110),new MyInteger(88724) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(2),new MyInteger(4),new MyInteger(6),new MyInteger(9),new MyInteger(11),new MyInteger(13),new MyInteger(16),new MyInteger(19),new MyInteger(21),new MyInteger(23),new MyInteger(25),new MyInteger(28),new MyInteger(30),new MyInteger(33),new MyInteger(36),new MyInteger(39),new MyInteger(42),new MyInteger(45),new MyInteger(47),new MyInteger(50),new MyInteger(52),new MyInteger(54),new MyInteger(57),new MyInteger(59),new MyInteger(64),new MyInteger(66),new MyInteger(70),new MyInteger(73),new MyInteger(75) }),new Integer(79))) ;
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
    ResultsHandler.stopTest(new String("test_50")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_51 () 
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
TestData.testName = new String("test_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_51")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(51889),new MyInteger(80006),new MyInteger(76927),new MyInteger(18106),new MyInteger(30050),new MyInteger(60202),new MyInteger(73968),new MyInteger(74668),new MyInteger(74632),new MyInteger(91166),new MyInteger(952),new MyInteger(67035),new MyInteger(68839),new MyInteger(31686),new MyInteger(82396),new MyInteger(1552),new MyInteger(2071),new MyInteger(23075),new MyInteger(99765),new MyInteger(5013),new MyInteger(30964),new MyInteger(81205),new MyInteger(83829),new MyInteger(47160),new MyInteger(7091),new MyInteger(73254),new MyInteger(5303),new MyInteger(64940),new MyInteger(41113),new MyInteger(45277),new MyInteger(32916),new MyInteger(71907),new MyInteger(43512),new MyInteger(81106),new MyInteger(15826),new MyInteger(57064),new MyInteger(10969),new MyInteger(42024),new MyInteger(14300),new MyInteger(70012),new MyInteger(93918),new MyInteger(85403),new MyInteger(36212),new MyInteger(67658),new MyInteger(76547),new MyInteger(5674),new MyInteger(62118),new MyInteger(13331),new MyInteger(69786),new MyInteger(88209),new MyInteger(59134),new MyInteger(71729),new MyInteger(96405),new MyInteger(24615),new MyInteger(83554),new MyInteger(3093),new MyInteger(21170),new MyInteger(50245),new MyInteger(4290),new MyInteger(18274),new MyInteger(87235),new MyInteger(15344),new MyInteger(70877),new MyInteger(97726),new MyInteger(28594),new MyInteger(23166),new MyInteger(2791),new MyInteger(15130),new MyInteger(99456),new MyInteger(94841),new MyInteger(58576),new MyInteger(8934),new MyInteger(31264),new MyInteger(38902),new MyInteger(67574),new MyInteger(68632),new MyInteger(28558),new MyInteger(53936),new MyInteger(5056) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(3),new MyInteger(8),new MyInteger(10),new MyInteger(13),new MyInteger(15),new MyInteger(19),new MyInteger(24),new MyInteger(26),new MyInteger(28),new MyInteger(30),new MyInteger(32),new MyInteger(34),new MyInteger(36),new MyInteger(38),new MyInteger(42),new MyInteger(45),new MyInteger(47),new MyInteger(50),new MyInteger(53),new MyInteger(55),new MyInteger(58),new MyInteger(61),new MyInteger(66),new MyInteger(71),new MyInteger(76),new MyInteger(78) }),new Integer(79))) ;
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
    ResultsHandler.stopTest(new String("test_51")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_52 () 
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
TestData.testName = new String("test_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_52")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(82532),new MyInteger(98759),new MyInteger(36980),new MyInteger(35019),new MyInteger(26748),new MyInteger(96535),new MyInteger(78744),new MyInteger(73531),new MyInteger(47693),new MyInteger(93260),new MyInteger(80880),new MyInteger(41687),new MyInteger(65538),new MyInteger(30512),new MyInteger(23262),new MyInteger(68506),new MyInteger(94598),new MyInteger(84106),new MyInteger(5652),new MyInteger(91692),new MyInteger(88929),new MyInteger(85331),new MyInteger(91871),new MyInteger(19226),new MyInteger(13700),new MyInteger(59784),new MyInteger(37616),new MyInteger(81065),new MyInteger(68149),new MyInteger(56589),new MyInteger(84807),new MyInteger(12314),new MyInteger(92342),new MyInteger(65088),new MyInteger(403),new MyInteger(90897),new MyInteger(1094),new MyInteger(33289),new MyInteger(23653),new MyInteger(85580),new MyInteger(28104),new MyInteger(43846),new MyInteger(25392),new MyInteger(84518),new MyInteger(33912),new MyInteger(46715),new MyInteger(8742),new MyInteger(41301),new MyInteger(69374),new MyInteger(89457),new MyInteger(25764),new MyInteger(35430),new MyInteger(15440),new MyInteger(63071),new MyInteger(49499),new MyInteger(23729),new MyInteger(52106),new MyInteger(14832),new MyInteger(92723),new MyInteger(46187),new MyInteger(80042),new MyInteger(70312),new MyInteger(86395),new MyInteger(72269),new MyInteger(12851),new MyInteger(20818),new MyInteger(22894),new MyInteger(28123),new MyInteger(93145),new MyInteger(6175),new MyInteger(72942),new MyInteger(88291),new MyInteger(50649),new MyInteger(27154),new MyInteger(7924),new MyInteger(20330),new MyInteger(82760),new MyInteger(85507),new MyInteger(60587),new MyInteger(68969),new MyInteger(20550),new MyInteger(42035),new MyInteger(98396),new MyInteger(15376),new MyInteger(84354),new MyInteger(16582),new MyInteger(60285),new MyInteger(10363) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(0),new MyInteger(4),new MyInteger(8),new MyInteger(11),new MyInteger(14),new MyInteger(18),new MyInteger(21),new MyInteger(24),new MyInteger(26),new MyInteger(29),new MyInteger(31),new MyInteger(34),new MyInteger(36),new MyInteger(38),new MyInteger(40),new MyInteger(42),new MyInteger(44),new MyInteger(46),new MyInteger(50),new MyInteger(52),new MyInteger(55),new MyInteger(57),new MyInteger(59),new MyInteger(61),new MyInteger(64),new MyInteger(69),new MyInteger(74),new MyInteger(78),new MyInteger(80),new MyInteger(83),new MyInteger(85),new MyInteger(87) }),new Integer(88))) ;
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
    ResultsHandler.stopTest(new String("test_52")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_53 () 
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
TestData.testName = new String("test_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_53")) ;
if (ok_sofar)
  ok_sofar = new FindBottom(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(68450),new MyInteger(11937),new MyInteger(54476),new MyInteger(71670),new MyInteger(34918),new MyInteger(57016),new MyInteger(54501),new MyInteger(57324),new MyInteger(15089),new MyInteger(32899),new MyInteger(52556),new MyInteger(87651),new MyInteger(34234),new MyInteger(1601),new MyInteger(50969),new MyInteger(18475),new MyInteger(90310),new MyInteger(2539),new MyInteger(40119),new MyInteger(43081),new MyInteger(89402),new MyInteger(30702),new MyInteger(68968),new MyInteger(58189),new MyInteger(72440),new MyInteger(19681),new MyInteger(51086),new MyInteger(61601),new MyInteger(10002),new MyInteger(52562),new MyInteger(5432),new MyInteger(43492),new MyInteger(85860),new MyInteger(69318),new MyInteger(78205),new MyInteger(96049),new MyInteger(99614),new MyInteger(2002),new MyInteger(53483),new MyInteger(2706),new MyInteger(83944),new MyInteger(39244),new MyInteger(23163),new MyInteger(94489),new MyInteger(64957),new MyInteger(40533),new MyInteger(146),new MyInteger(94612),new MyInteger(50605),new MyInteger(84003),new MyInteger(43104),new MyInteger(68436),new MyInteger(20148),new MyInteger(31599),new MyInteger(66483),new MyInteger(1909),new MyInteger(18654),new MyInteger(37590),new MyInteger(66615),new MyInteger(36161),new MyInteger(57424),new MyInteger(95198),new MyInteger(93280),new MyInteger(70957),new MyInteger(15124),new MyInteger(87785),new MyInteger(67901),new MyInteger(11444),new MyInteger(53898),new MyInteger(25544),new MyInteger(23415),new MyInteger(28842),new MyInteger(13275),new MyInteger(59821),new MyInteger(12589),new MyInteger(23270),new MyInteger(58477),new MyInteger(69876),new MyInteger(14810),new MyInteger(40234),new MyInteger(95775),new MyInteger(88130),new MyInteger(52618),new MyInteger(58270),new MyInteger(12875),new MyInteger(59359),new MyInteger(77627),new MyInteger(32625),new MyInteger(20539),new MyInteger(67085),new MyInteger(89202),new MyInteger(92966),new MyInteger(51632),new MyInteger(94753),new MyInteger(25236),new MyInteger(79416),new MyInteger(21853),new MyInteger(19502) })).doCall().checkResult(new es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>(new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(new MyInteger[] { new MyInteger(1),new MyInteger(4),new MyInteger(6),new MyInteger(8),new MyInteger(13),new MyInteger(15),new MyInteger(17),new MyInteger(21),new MyInteger(23),new MyInteger(25),new MyInteger(28),new MyInteger(30),new MyInteger(33),new MyInteger(37),new MyInteger(39),new MyInteger(42),new MyInteger(46),new MyInteger(48),new MyInteger(50),new MyInteger(52),new MyInteger(55),new MyInteger(59),new MyInteger(64),new MyInteger(67),new MyInteger(70),new MyInteger(72),new MyInteger(74),new MyInteger(78),new MyInteger(82),new MyInteger(84),new MyInteger(88),new MyInteger(92),new MyInteger(94),new MyInteger(97) }),new Integer(98))) ;
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
    ResultsHandler.stopTest(new String("test_53")) ;
    ResultsHandler.add_result(new String("findBottom"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_54 () 
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
TestData.testName = new String("test_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_54")) ;
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
    ResultsHandler.stopTest(new String("test_54")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_55 () 
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
TestData.testName = new String("test_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_55")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray())).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray())) ;
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
    ResultsHandler.stopTest(new String("test_55")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_56 () 
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
TestData.testName = new String("test_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_56")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray()),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1))))) ;
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
    ResultsHandler.stopTest(new String("test_56")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_57 () 
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
TestData.testName = new String("test_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_57")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray())).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1))))) ;
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
    ResultsHandler.stopTest(new String("test_57")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_58 () 
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
TestData.testName = new String("test_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_58")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3))))) ;
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
    ResultsHandler.stopTest(new String("test_58")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_59 () 
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
TestData.testName = new String("test_59") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_59")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_59")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_60 () 
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
TestData.testName = new String("test_60") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_60")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray())).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_60")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_61 () 
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
TestData.testName = new String("test_61") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_61")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_61")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_62 () 
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
TestData.testName = new String("test_62") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_62")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_62")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_63 () 
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
TestData.testName = new String("test_63") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_63")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_63")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_64 () 
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
TestData.testName = new String("test_64") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_64")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_64")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_65 () 
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
TestData.testName = new String("test_65") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_65")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(6)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3))))) ;
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
    ResultsHandler.stopTest(new String("test_65")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_66 () 
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
TestData.testName = new String("test_66") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_66")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))) ;
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
    ResultsHandler.stopTest(new String("test_66")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_67 () 
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
TestData.testName = new String("test_67") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_67")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_67")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_68 () 
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
TestData.testName = new String("test_68") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_68")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(6)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_68")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_69 () 
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
TestData.testName = new String("test_69") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_69")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))) ;
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
    ResultsHandler.stopTest(new String("test_69")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_70 () 
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
TestData.testName = new String("test_70") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_70")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(5))))) ;
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
    ResultsHandler.stopTest(new String("test_70")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_71 () 
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
TestData.testName = new String("test_71") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_71")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_71")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_72 () 
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
TestData.testName = new String("test_72") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_72")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3))))) ;
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
    ResultsHandler.stopTest(new String("test_72")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_73 () 
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
TestData.testName = new String("test_73") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_73")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(6)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))) ;
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
    ResultsHandler.stopTest(new String("test_73")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_74 () 
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
TestData.testName = new String("test_74") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_74")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(5))))) ;
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
    ResultsHandler.stopTest(new String("test_74")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_75 () 
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
TestData.testName = new String("test_75") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_75")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))) ;
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
    ResultsHandler.stopTest(new String("test_75")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_76 () 
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
TestData.testName = new String("test_76") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_76")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(5))))) ;
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
    ResultsHandler.stopTest(new String("test_76")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_77 () 
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
TestData.testName = new String("test_77") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_77")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(6)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_77")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_78 () 
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
TestData.testName = new String("test_78") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_78")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(2))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(5))))) ;
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
    ResultsHandler.stopTest(new String("test_78")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_79 () 
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
TestData.testName = new String("test_79") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_79")) ;
if (ok_sofar)
  ok_sofar = new JoinMultiSets(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(1)))),new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(2)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(1)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(3))))).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(TestUtils.toGenericArray(new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 97),new Integer(4)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 98),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 99),new Integer(5)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 100),new Integer(3)),new es.upm.aedlib.Pair<Character,Integer>(new Character((char) 101),new Integer(4))))) ;
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
    ResultsHandler.stopTest(new String("test_79")) ;
    ResultsHandler.add_result(new String("joinMultiSets"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_80 () 
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
TestData.testName = new String("test_80") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_80")) ;
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
    ResultsHandler.stopTest(new String("test_80")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_81 () 
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
TestData.testName = new String("test_81") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_81")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,false) }, { new Punto(null,true,true,false,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,false),new Punto(null,false,false,false,false) }, { new Punto(null,false,true,false,false),new Punto(null,false,false,false,false),new Punto(null,false,true,false,true),new Punto(86,false,false,true,false) } },0,0)).doCall().checkResult(new Integer(86)) ;
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
    ResultsHandler.stopTest(new String("test_81")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_82 () 
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
TestData.testName = new String("test_82") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_82")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,true),new Punto(null,false,false,true,false),new Punto(48,true,false,false,true),new Punto(null,true,false,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,false,true,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,false) }, { new Punto(null,false,false,false,true),new Punto(null,true,false,true,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,false) }, { new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false) } },0,0)).doCall().checkResult(new Integer(48)) ;
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
    ResultsHandler.stopTest(new String("test_82")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_83 () 
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
TestData.testName = new String("test_83") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_83")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,false,false,false,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,false) }, { new Punto(null,false,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,true,false,false) }, { new Punto(null,true,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,false,false,true),new Punto(null,true,false,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,false,false,true),new Punto(null,false,true,true,false) }, { new Punto(null,true,true,false,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,false) }, { new Punto(null,false,true,false,false),new Punto(null,false,true,false,true),new Punto(null,true,false,true,false) }, { new Punto(null,false,false,false,true),new Punto(null,false,false,true,false),new Punto(null,true,true,false,false) }, { new Punto(21,false,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,true,false,false) }, { new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false) } },0,0)).doCall().checkResult(new Integer(21)) ;
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
    ResultsHandler.stopTest(new String("test_83")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_84 () 
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
TestData.testName = new String("test_84") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_84")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,true),new Punto(null,false,false,true,false),new Punto(null,true,false,false,false) }, { new Punto(null,true,true,false,true),new Punto(74,true,false,true,false),new Punto(null,true,true,false,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,false) }, { new Punto(null,false,false,false,true),new Punto(null,true,false,true,false),new Punto(null,false,true,false,false) }, { new Punto(null,true,false,false,false),new Punto(null,true,true,false,true),new Punto(null,false,false,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,false),new Punto(null,true,false,false,false) }, { new Punto(null,false,true,false,false),new Punto(null,false,false,false,true),new Punto(null,true,true,true,false) }, { new Punto(null,false,false,false,false),new Punto(null,true,false,false,true),new Punto(null,false,true,true,false) }, { new Punto(null,true,false,false,false),new Punto(null,false,true,false,true),new Punto(null,false,false,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false) } },0,0)).doCall().checkResult(new Integer(74)) ;
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
    ResultsHandler.stopTest(new String("test_84")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_85 () 
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
TestData.testName = new String("test_85") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_85")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,false) }, { new Punto(null,true,true,false,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,true),new Punto(null,true,true,true,false),new Punto(null,true,false,false,false) }, { new Punto(null,true,true,false,true),new Punto(null,false,false,true,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,false),new Punto(null,true,false,false,false),new Punto(null,true,false,false,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false),new Punto(80,false,true,false,true),new Punto(null,false,true,true,false),new Punto(null,true,true,false,true),new Punto(null,true,false,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false),new Punto(null,false,true,false,false),new Punto(null,false,true,false,false) } },0,0)).doCall().checkResult(new Integer(80)) ;
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
    ResultsHandler.stopTest(new String("test_85")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_86 () 
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
TestData.testName = new String("test_86") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_86")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,true),new Punto(null,false,false,true,false) }, { new Punto(null,true,true,false,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,false),new Punto(null,true,false,false,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,false),new Punto(null,true,true,false,false),new Punto(null,true,true,false,true),new Punto(null,true,false,true,false),new Punto(null,false,false,false,false) }, { new Punto(null,false,true,false,true),new Punto(null,true,false,true,false),new Punto(null,true,true,false,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,false) }, { new Punto(null,true,false,false,true),new Punto(null,false,true,true,false),new Punto(null,true,true,false,false),new Punto(null,false,true,false,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,false) }, { new Punto(null,true,true,false,false),new Punto(null,true,false,false,true),new Punto(null,false,true,true,false),new Punto(null,true,false,false,false),new Punto(null,false,true,false,true),new Punto(34,true,true,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,true),new Punto(null,false,true,true,false),new Punto(null,false,false,false,false),new Punto(null,false,true,false,false) } },0,0)).doCall().checkResult(new Integer(34)) ;
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
    ResultsHandler.stopTest(new String("test_86")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_87 () 
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
TestData.testName = new String("test_87") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_87")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,false),new Punto(null,true,false,false,false),new Punto(null,true,false,false,true),new Punto(null,false,false,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,false),new Punto(null,true,true,false,true),new Punto(86,false,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,true,false,true,true),new Punto(null,true,true,true,false),new Punto(null,true,false,false,true),new Punto(null,true,false,true,false),new Punto(null,false,false,false,false) }, { new Punto(null,true,false,false,false),new Punto(null,true,true,false,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,true),new Punto(null,true,true,true,false),new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,true,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,true),new Punto(null,true,true,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,false),new Punto(null,false,true,false,false) } },0,0)).doCall().checkResult(new Integer(86)) ;
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
    ResultsHandler.stopTest(new String("test_87")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_88 () 
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
TestData.testName = new String("test_88") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_88")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,true,false,false,false),new Punto(91,true,false,false,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,false),new Punto(null,true,false,false,false),new Punto(null,false,true,false,true),new Punto(null,false,true,true,false),new Punto(null,false,true,false,false),new Punto(null,true,true,false,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,true,false,true,false),new Punto(null,false,true,false,false),new Punto(null,true,false,false,false),new Punto(null,true,false,false,true),new Punto(null,true,false,true,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false),new Punto(null,false,false,false,false) }, { new Punto(null,false,false,false,true),new Punto(null,true,true,true,true),new Punto(null,false,false,true,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,false),new Punto(null,false,true,false,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,false),new Punto(null,true,false,false,false) }, { new Punto(null,false,false,false,true),new Punto(null,false,true,true,false),new Punto(null,false,false,false,false),new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,false),new Punto(null,false,true,false,false) } },0,0)).doCall().checkResult(new Integer(91)) ;
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
    ResultsHandler.stopTest(new String("test_88")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_89 () 
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
TestData.testName = new String("test_89") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_89")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,false,false,false,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,true),new Punto(null,false,false,true,true),new Punto(null,true,false,true,false) }, { new Punto(null,true,false,false,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,false),new Punto(null,true,true,false,true),new Punto(null,true,false,true,true),new Punto(null,false,true,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,true),new Punto(null,true,false,true,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,false) }, { new Punto(null,true,false,false,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,true),new Punto(null,true,false,true,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,true,true,false),new Punto(null,false,true,false,false),new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false),new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(69,false,false,true,true),new Punto(null,false,false,true,false) } },0,0)).doCall().checkResult(new Integer(69)) ;
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
    ResultsHandler.stopTest(new String("test_89")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_90 () 
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
TestData.testName = new String("test_90") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_90")) ;
if (ok_sofar)
  ok_sofar = new Explora(new Lugar(new Punto[][] { { new Punto(null,false,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,false),new Punto(null,true,false,false,true),new Punto(null,false,false,true,false),new Punto(null,true,false,false,false),new Punto(null,false,false,false,false),new Punto(null,true,false,false,true),new Punto(null,true,false,true,false) }, { new Punto(null,true,false,false,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,false),new Punto(null,false,true,false,false),new Punto(null,false,false,false,true),new Punto(null,false,true,true,true),new Punto(null,true,true,true,false) }, { new Punto(null,false,true,false,false),new Punto(null,false,true,false,true),new Punto(null,true,true,true,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,true),new Punto(null,false,false,true,true),new Punto(null,false,false,true,false),new Punto(null,false,false,false,true),new Punto(null,true,true,true,false) }, { new Punto(14,true,false,false,false),new Punto(null,true,false,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,true),new Punto(null,true,false,true,true),new Punto(null,true,true,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,false,true,false,false),new Punto(null,true,false,false,true),new Punto(null,true,false,true,false),new Punto(null,true,false,false,false),new Punto(null,false,true,false,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,false) }, { new Punto(null,true,true,false,false),new Punto(null,true,false,false,false),new Punto(null,false,true,false,false),new Punto(null,true,true,false,false),new Punto(null,true,true,false,true),new Punto(null,true,false,true,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,true),new Punto(null,false,true,true,false) }, { new Punto(null,true,true,false,false),new Punto(null,true,true,false,true),new Punto(null,false,false,true,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,true),new Punto(null,true,true,true,false),new Punto(null,true,true,false,false),new Punto(null,true,true,false,false),new Punto(null,true,false,false,false) }, { new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,false,false,true,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false),new Punto(null,false,true,false,true),new Punto(null,false,true,true,true),new Punto(null,false,true,true,false),new Punto(null,false,true,false,false) } },0,0)).doCall().checkResult(new Integer(14)) ;
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
    ResultsHandler.stopTest(new String("test_90")) ;
    ResultsHandler.add_result(new String("explora"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab4";
}




static class MazeChecker {

  static boolean checkExplore(Explora call,
                              TestResult<Pair<Object,PositionList<Lugar>>,Integer> result,
                              Integer expected)
  {
    boolean ok_sofar = true;
    
    if (!call.noException() || !call.nonNull())
      ok_sofar = false;

    if (ok_sofar) {
      Pair<Object,PositionList<Lugar>> pair =
	result.getValue();

      if (pair == null)
	ok_sofar = (expected == null);

      if (!ok_sofar) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+call+" returned null"+
	   " but should have returned a pair with a tesoro "+expected);
      }
      
      if (pair != null) {
	Object treasure = pair.getLeft();
	PositionList<Lugar> path = pair.getRight();
	
	if (treasure != null)
	  ok_sofar = ok_sofar && treasure.equals(expected);
	else
	  ok_sofar = false;
	
	if (!ok_sofar) {
	  TestUtils.printError
	    (TestUtils.ExecutionTime.UNRELATED,
	     "the call "+call+" returned the tesoro "+treasure+
	     " but should have returned "+expected);
	}
      
	if (ok_sofar && path == null) {
	  TestUtils.printError
	    (TestUtils.ExecutionTime.UNRELATED,
	     "the call "+call+" returned the path null");
	  ok_sofar = false;
	}
	
	if (ok_sofar) {
	  ok_sofar =
	    checkPCPath(path, treasure, call.x_1.cueva, call.toString());
	}
      }
    }
    
    if (!ok_sofar) {
      TestData.message("\nLaberinto inicial: (x marca la posicion inicial, $ el tesoro) ");
      TestData.message(Punto.printPuntos(call.x_1_orig.cueva,0,0));
      TestData.message("\nLaberinto despues de la exploracion ($ el tesoro, y con simbol de tiza \".\"):");
      TestData.message(Punto.printPuntos(call.x_1.cueva));
      return false;
    }
    return ok_sofar;
  }


  static boolean checkPCPath(PositionList<Lugar> path, Object treasure, Punto[][] puntos, String callString) {
    Lugar currentLugar = new Lugar(puntos,0,0);
    Position<Lugar> cursor = path.first();

    if (cursor != null) {
      Lugar pathLugar = cursor.element();
      if (!currentLugar.equals(pathLugar)) {
        TestUtils.printError
          (TestUtils.ExecutionTime.UNRELATED,
           "the call "+callString+" returned a path "+path+" with the initial lugar "+pathLugar+"; should be (0,0)");
        return false;
      }
    }

    if (cursor == null) {
        TestUtils.printError
          (TestUtils.ExecutionTime.UNRELATED,
           "the call "+callString+" returned an empty path; at least one position is required");
        return false;
    }

    while (cursor != path.last()) {

      Lugar pathLugar = cursor.element();
      if (pathLugar == null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " that contains a null element");
	return false;
      }

      cursor = path.next(cursor);
      Lugar nextPathLugar = cursor.element();
      boolean found = false;

      for (Lugar nextLugar : currentLugar.caminos()) {
	if (nextPathLugar.equals(nextLugar)) {
	  found = true;
          currentLugar = nextLugar;
        }
      }

      if (!found) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which cannot be taken; cannot find a valid path between "+pathLugar+" and "+nextPathLugar);
	return false;
      }
    }

    if (!currentLugar.tieneTesoro()) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a lugar "+
	   " which does not contain any tesoro ");
	return false;
    }

    if (!currentLugar.getTesoro().equals(treasure)) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a lugar "+
	   " which has a tesoro "+currentLugar.getTesoro()+
	   " which is distinct from the tesoro "+
	   " returned by the call to "+callString);
	return false;
    }
    return true;
  }
}




static class CheckRecursion {

  // Try to determine whether the starterName method is recursive.
  // If the bcel library is not available, fail with a message
  // indicating that no analysis was done. 
    @SuppressWarnings({"unchecked","rawtypes"}) 
    static boolean recursionCheck(String packageName, String className, String starterName, int arity) {
    try {
      String fullClassName =
        packageName+"."+className;
      Class<?> cl =
        Class.forName(fullClassName).getClass();
      String path =
        new String("classes"+'/'+packageName+"."+className).replace('.','/')+".class";
    
      java.lang.Class classParserClass;
      try {
	classParserClass = java.lang.Class.forName("org.apache.bcel.classfile.ClassParser");
      } catch (Throwable exc) {
        return true;
      }

      java.lang.reflect.Constructor classParserConstructor =
	classParserClass.getConstructor(path.getClass());
      java.lang.reflect.Method parse =
	classParserClass.getMethod("parse");

      Object cp = null;
      Object jc = null;
    
      cp = classParserConstructor.newInstance(path);
      jc = parse.invoke(cp);

      Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls =
        new Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>>();

      java.lang.Class ccfgClass =
	java.lang.Class.forName(packageName+".ClassCFG");
      java.lang.reflect.Constructor ccfgConstructor =
	ccfgClass.getConstructor(jc.getClass(), calls.getClass());

      Object ccfg = ccfgConstructor.newInstance(jc, calls);
      java.lang.reflect.Method start = ccfgClass.getMethod("start");
      start.invoke(ccfg);

      boolean result = 
        isRecursive
        (new Pair<String,Integer>
         (packageName+"."+className+"."+starterName,arity),
         new HashSet<Pair<String,Integer>>(),
         calls);
      
      if (!result)
	TestUtils.printWarning(TestUtils.ExecutionTime.UNRELATED,
	  "la implementacion de "+starterName+
	   " no parece recursivo aunque es OBLIGATORIO "+
	   "-- compruebalo manualmente!\n");

      try {
        java.lang.Class rhClass =
          java.lang.Class.forName(packageName+".ResultsHandler");
        java.lang.reflect.Field completedAnalysis =
          rhClass.getField("completedAnalysis");
        completedAnalysis.setBoolean(null,true);
      } catch (Throwable texc) { };

      return true;
    } catch (Throwable exc) {
      TestUtils.printWarning(TestUtils.ExecutionTime.UNRELATED,
                             "cannot analyze whether the method "+
                             starterName+" is recursive");
      exc.printStackTrace();
      return true;
    }
  }

  static boolean isRecursive(Pair<String,Integer> current,
			     HashSet<Pair<String,Integer>> seen,
			     Hashtable<Pair<String,Integer>,HashSet<Pair<String,Integer>>> calls) {
    if (seen.contains(current)) {
      return true;
    }
    
    HashSet<Pair<String,Integer>> nexts = calls.get(current);
    seen.add(current);
    
    if (nexts == null) return false;
    else {
      for (Pair<String,Integer> next : nexts)
	if (isRecursive(next,seen,calls)) return true;
    }
    
    return false;
  }

}

 

static class Recursividad2021Checker {

  public static boolean
    checkBottom(TestCall<Integer,Pair<ArrayIndexedList<MyInteger>,Integer>> call,
                TestResult<Integer,Pair<ArrayIndexedList<MyInteger>,Integer>> result,
                Pair<ArrayIndexedList<MyInteger>,Integer> expectedPair) {

    ArrayIndexedList<MyInteger> expected = expectedPair.getLeft();
    Integer arraySize = expectedPair.getRight();
    long opCounter = MyInteger.getCounter();
    MyInteger.setCounter(0);

    long log2size = Math.round(Math.log(arraySize) / Math.log(2));

    if (opCounter > log2size*4) {
      TestUtils.printWarning
        (TestUtils.ExecutionTime.DURING,
         "during the call "+call.toString()+" "+opCounter+
         " comparisons were made; the complexity of the algorithm does not appear to be logarithmic");
    }

    Integer resultValue = result.getValue();
    if (!TestUtils.memberElements(new MyInteger(resultValue),expected)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
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


static class Explora extends TestCall<es.upm.aedlib.Pair<Object,es.upm.aedlib.positionlist.PositionList<Lugar>>,Integer>
{
  Lugar x_1;
  Lugar x_1_orig;
  
  public Explora (Lugar x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new Lugar(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Explorador.explora")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Pair<Object,es.upm.aedlib.positionlist.PositionList<Lugar>> call () 
  {
    return Explorador.explora(x_1) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!MazeChecker.checkExplore(this,result,expected))
      return false ;
    return true ;
  }
  
}


static class JoinMultiSets extends TestCall<es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>>
{
  es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_1;
  es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_1_orig;
  es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_2;
  es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_2_orig;
  
  public JoinMultiSets (es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_1,es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> x_2)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(x_1) ;
    this.x_2 = x_2 ;
    if (x_2 == null)
      x_2_orig = null ;
    else
      x_2_orig = new es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>>(x_2) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.joinMultiSets")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_2_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> call () 
  {
    return Utils.joinMultiSets(x_1,x_2) ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<es.upm.aedlib.Pair<Character,Integer>> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_2)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!unchanged(x_2,x_2_orig))
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Multiply extends TestCall<Integer,Integer>
{
  Integer x_1;
  Integer x_2;
  
  public Multiply (Integer x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.multiply")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return Utils.multiply(x_1,x_2) ;
  }
  
  public boolean checkResult (Integer expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class RecursionCheck extends TestCall<Boolean,Boolean>
{
  String x_1;
  String x_2;
  String x_3;
  Integer x_4;
  
  public RecursionCheck (String x_1,String x_2,String x_3,Integer x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("CheckRecursion.recursionCheck")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_4)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Boolean call () 
  {
    return CheckRecursion.recursionCheck(x_1,x_2,x_3,x_4) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class FindBottom extends TestCall<Integer,es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer>>
{
  es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger> x_1;
  es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger> x_1_orig;
  
  public FindBottom (es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>(x_1) ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("Utils.findBottom")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_1_orig)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Integer call () 
  {
    return Utils.findBottom(x_1) ;
  }
  
  public boolean checkResult (es.upm.aedlib.Pair<es.upm.aedlib.indexedlist.ArrayIndexedList<MyInteger>,Integer> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
    if (!Recursividad2021Checker.checkBottom(this,result,expected))
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

    int numSuccesses = 0;
    
    for (String key : results_sofar.keySet()) {
      if (!key.equals("recursionCheck") && results_sofar.get(key)) ++numSuccesses;
    }

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return numSuccesses >= 3;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      if (!testName.equals("recursionCheck")) {
        System.out.print("Testing results for "+testName+": ");
        if (results_sofar.get(testName))
          System.out.println("succeeded");
        else
          System.out.println("failed");
      }
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
