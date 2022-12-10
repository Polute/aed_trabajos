
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
// File generated at: 2022/12/1 -- 12:53:37
// Seed: {1669,895615,66432}
//
//////////////////////////////////////////////////////////////////////



package aed.urgencias;

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
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.SortedListPriorityQueue;
import es.upm.aedlib.set.*;
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
@SuppressWarnings({"unused"})
public class TesterLab6 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(80,60) ;
    TestData.setTesterType(true) ;
    TestUtils.ensureAedlibVersion(2,10,0) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_02") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_02")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_03") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_03")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19472172Y"),6,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19472172Y"),6,2,2)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_04") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_04")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21427672B"),8,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21427672B"),8,8,8)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_05") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_05")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,1).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_06") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_06")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_07") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_07")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74688114A"),4,8).doCall().checkResult(new PacienteNoExisteException()) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_08") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_08")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("93668112Y")).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_09") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_09")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_10") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_10")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15747763F"),2,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15747763F"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88278411A"),6,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88278411A"),6,8,8)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_11") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_11")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54291999O"),10,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54291999O"),10,2,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54291999O"),10,2,2)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_12") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_12")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59954355E"),4,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59954355E"),4,3,3)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("59954355E"),10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59954355E"),4,3,3)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_13") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_13")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,78,8).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("26641343C"),7,9).doCall().checkResult(new PacienteNoExisteException()) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_14") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_14")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("65782933L"),6,8).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91734995U"),5,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91734995U"),5,11,11)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_15") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_15")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("81193761J"),0).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_16") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_16")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43861792E"),2,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43861792E"),2,3,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92832244M"),10,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92832244M"),10,12,12)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_17") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_17")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),2,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),2,0,0)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1,5).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),1,10,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),1,0,5)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_18") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_18")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),4,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),4,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),4,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),4,1,1)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_19") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_19")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),5,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_20") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_20")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("111"),2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,5,5)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_21") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_21")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),6,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),6,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),4,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,0,2)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_22") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_22")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11486155V"),10,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11486155V"),10,1,1)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("11486155V")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11486155V"),10,1,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11486155V"),10,1,1)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(3,1)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_23") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_23")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32445564X"),2,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32445564X"),2,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32445564X"),6,8).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("94685666X"),10).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32445564X"),12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32445564X"),2,2,2)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_24") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_24")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67151727J"),3,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67151727J"),3,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32391987T"),9,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32391987T"),9,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99936214N"),8,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99936214N"),8,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61227187J"),5,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61227187J"),5,16,16)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_25") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_25")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68176787V"),6,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68176787V"),6,9,9)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("68176787V"),16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68176787V"),6,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15394271L"),8,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15394271L"),8,17,17)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15394271L"),8,17,17)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_26") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_26")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("72769531T"),2).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99236752F"),9,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99236752F"),9,12,12)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99236752F"),9,12,12)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(1,1)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_27") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_27")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),0,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),0,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),1,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),1,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),2,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),2,2,2)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),0,0,0)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_28") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_28")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("222"),2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(10,1)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_29") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_29")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86925556J"),3,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86925556J"),3,8,8)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86925556J"),3,8,8)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46162486Z"),6,19).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97178588N"),3,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97178588N"),3,25,25)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_30") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_30")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("96577786B")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67899722G"),5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("36437429Q"),9).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("41264661V"),6,19).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_31") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_31")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31174837P"),7,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31174837P"),7,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75589839I"),3,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75589839I"),3,9,9)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75589839I"),3,9,9)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(6,1)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_32") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_32")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29254243M"),0,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29254243M"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("29254243M"),9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29254243M"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63488184S"),1,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63488184S"),1,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58244962V"),8,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58244962V"),8,20,20)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73158781P"),9,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73158781P"),9,25,25)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("58244962V")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58244962V"),8,20,20)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_33") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_33")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85839257U"),7,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85839257U"),7,2,2)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85839257U"),7,2,2) })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85839257U"),7,2,2) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("36852512X"),6).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85839257U"),7,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68643917H"),10,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68643917H"),10,19,19)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_34") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_34")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95183669G"),1,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95183669G"),1,2,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95183669G"),1,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63279734W"),3,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63279734W"),3,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38398677J"),4,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38398677J"),4,17,17)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63279734W"),3,10,10),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38398677J"),4,17,17) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63279734W"),3,10,10)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_35") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_35")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("64918567N"),4).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("35882739H"),5,14).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95626377H"),7,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95626377H"),7,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95626377H"),7,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,32).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_36") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_36")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,1,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("222"),7,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),7,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("333"),8,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),8,100,100)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,1500,2000).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),4,1,2000)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,4000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("222"),6,2,2000)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,5000).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("333"),7,100,2000)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_37") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_37")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37644951P"),3,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37644951P"),3,5,5)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37644951P"),3,5,5)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("43623784Q")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("53427595F"),16).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34252195D"),6,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34252195D"),6,17,17)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34252195D"),22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34252195D"),6,17,17)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_38") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_38")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("39599123I")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("85915391S"),8).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64677586X"),3,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64677586X"),3,14,14)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("64677586X"),22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64677586X"),3,14,14)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_39") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_39")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27872699F"),0,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27872699F"),0,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45877965D"),10,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45877965D"),10,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21625796M"),0,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21625796M"),0,15,15)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("46413289C")).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_40") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_40")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69598662U"),4,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69598662U"),4,1,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69598662U"),4,1,1)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(5,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77995689D"),2,10).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_41") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_41")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42369575U"),2,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42369575U"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42369575U"),2,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42369575U"),2,6,6)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42369575U"),10,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42369575U"),10,6,23)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42369575U"),10,6,23) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("42369575U"),32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42369575U"),10,6,23)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("68252782O"),0,37).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35754546G"),4,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35754546G"),4,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35754546G"),4,42,42)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_42") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_42")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91567899C"),10,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91567899C"),10,3,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91567899C"),10,3,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,22).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91574658V"),10,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91574658V"),10,24,24)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91574658V"),10,24,24) })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_43") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_43")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91471115F"),1,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471115F"),1,9,9)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91471115F"),13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471115F"),1,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42353815J"),10,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42353815J"),10,20,20)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("42353815J"),7,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42353815J"),7,20,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69797355B"),1,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69797355B"),1,33,33)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69797355B"),1,33,33)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_44") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_44")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71145185Z"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71145185Z"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12146178R"),6,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12146178R"),6,15,15)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71145185Z"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76799424H"),0,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76799424H"),0,26,26)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76799424H"),0,26,26),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12146178R"),6,15,15) })) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("76799424H")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76799424H"),0,26,26)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45874762H"),10,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45874762H"),10,34,34)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76799424H"),0,26,26)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12146178R"),6,15,15)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_45") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_45")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("23231646G")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("25568681Z")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67544991O"),1,1).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67544991O"),1,1,1)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67544991O"),11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67544991O"),1,1,1)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91181178B"),1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91181178B"),1,13,13)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_46") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_46")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19397227P"),4,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19397227P"),4,0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("19397227P"),7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19397227P"),4,0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43893477X"),3,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43893477X"),3,16,16)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51283344K"),5,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51283344K"),5,18,18)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43893477X"),3,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43893477X"),3,16,16)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88742592X"),5,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88742592X"),5,32,32)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("88742592X"),33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88742592X"),5,32,32)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_47") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_47")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34616937C"),0,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34616937C"),0,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51436348Z"),6,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51436348Z"),6,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45911634C"),8,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45911634C"),8,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33682393I"),9,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33682393I"),9,17,17)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34616937C"),3,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34616937C"),3,4,23)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34616937C"),3,4,23),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51436348Z"),6,8,8),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45911634C"),8,13,13),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33682393I"),9,17,17) })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34616937C"),3,4,23),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51436348Z"),6,8,8),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45911634C"),8,13,13),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33682393I"),9,17,17) })) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("33682393I")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33682393I"),9,17,17)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45911634C"),33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45911634C"),8,13,13)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_48") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_48")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("93484792T"),1,2).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33718629N"),8,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33718629N"),8,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34861397O"),8,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34861397O"),8,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76756856L"),2,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76756856L"),2,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26233876O"),10,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26233876O"),10,21,21)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32326882G"),9,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32326882G"),9,26,26)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76756856L"),2,19,19)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(8,1)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33718629N"),8,9,9)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_49") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_49")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,41,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27322537Y"),6,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27322537Y"),6,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85731582L"),2,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85731582L"),2,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85853293I"),8,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85853293I"),8,21,21)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("27322537Y")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27322537Y"),6,8,8)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("85731582L"),8,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85731582L"),8,13,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45487781Q"),1,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45487781Q"),1,38,38)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39137142Z"),1,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39137142Z"),1,47,47)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39166587U"),5,53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39166587U"),5,53,53)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("85731582L"),56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85731582L"),8,13,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22265423P"),4,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22265423P"),4,59,59)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_50") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_50")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26959924H"),3,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26959924H"),3,4,4)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26959924H"),3,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28942952J"),1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28942952J"),1,17,17)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34457621S"),5,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34457621S"),5,20,20)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("34457621S")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34457621S"),5,20,20)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34457621S"),1,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34457621S"),1,20,21)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34457621S"),5,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34457621S"),5,20,23)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28942952J"),1,17,17)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("34457621S")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34457621S"),5,20,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71688438M"),9,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71688438M"),9,29,29)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_51") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_51")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,1).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("111")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,0,0)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("111")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("111"),4).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("111"),2,5).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,100,7).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("111"),5,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,20,20)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("111"),5,20,20)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_52") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_52")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("12211381D"),4,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12211381D"),4,0,0)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("12211381D"),4,0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61356218H"),5,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61356218H"),5,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16248859Z"),0,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16248859Z"),0,22,22)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16248859Z"),0,22,22)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37443398L"),7,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37443398L"),7,35,35)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61356218H"),5,19,19)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(41,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37443398L"),7,35,35)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(57,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59493954G"),6,60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59493954G"),6,60,60)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39225788E"),7,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39225788E"),7,61,61)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59493954G"),6,60,60)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92462951O"),9,76).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92462951O"),9,76,76)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_53") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_53")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16675672Y"),2,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16675672Y"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16675672Y"),2,7,7) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16675672Y"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83111895F"),9,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83111895F"),9,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83111895F"),9,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,39).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(20,2)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,10,46).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24446135B"),1,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24446135B"),1,52,52)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,40,61).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24446135B"),1,52,52)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35527131A"),4,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35527131A"),4,73,73)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("35527131A"),78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35527131A"),4,73,73)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(39,3)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_54") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_54")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("85198922S"),10,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85198922S"),10,9,9)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("85198922S"),9,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85198922S"),9,9,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("38684515D"),2,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38684515D"),2,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49784555Q"),5,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49784555Q"),5,16,16)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53892163S"),1,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53892163S"),1,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27155122U"),6,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27155122U"),6,22,22)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53892163S"),1,18,18)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("49784555Q"),1,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49784555Q"),1,16,36)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("28116997Z"),7,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28116997Z"),7,45,45)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49784555Q"),1,16,36)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("38684515D"),2,15,15)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("28116997Z"),3,56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28116997Z"),3,45,56)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("28116997Z"),1,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("28116997Z"),1,45,64)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("85198922S"),2,67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("85198922S"),2,9,67)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_55") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_55")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86212719Z"),2,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86212719Z"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,82,16).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77477283B"),5,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77477283B"),5,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82159243U"),9,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82159243U"),9,34,34)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82159243U"),6,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82159243U"),6,34,36)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86212719Z"),2,7,7)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(35,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82159243U"),9,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82159243U"),9,34,44)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82159243U"),2,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82159243U"),2,34,45)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77477283B"),7,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77477283B"),7,24,55)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("77477283B"),3,60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77477283B"),3,24,60)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19233635L"),6,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19233635L"),6,65,65)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24784232N"),1,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24784232N"),1,74,74)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("82159243U"),80).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82159243U"),2,34,45)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_56") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_56")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18782419I"),9,0).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18782419I"),9,0,0)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("18782419I"),9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18782419I"),9,0,0)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,4,13).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47878716R"),1,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47878716R"),1,15,15)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("47878716R"),18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47878716R"),1,15,15)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,19).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("85165425S"),10,28).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92234252S"),7,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92234252S"),7,31,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97377884S"),3,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97377884S"),3,38,38)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("92234252S"),7,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92234252S"),7,31,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91614322X"),2,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91614322X"),2,52,52)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,87,62).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("97377884S")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97377884S"),3,38,38)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("97377884S"),69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97377884S"),3,38,38)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_57") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_57")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19643958R"),0,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19643958R"),0,4,4)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48565218V"),8,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48565218V"),8,10,10)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("19643958R"),9,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19643958R"),9,4,16)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("19643958R"),23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19643958R"),9,4,16)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("48565218V"),7,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48565218V"),7,10,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37956999W"),7,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37956999W"),7,36,36)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37956999W"),8,44).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37956999W"),8,36,44)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93418672I"),6,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93418672I"),6,47,47)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93418672I"),6,47,47)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("48565218V"),57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48565218V"),7,10,31)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37956999W"),4,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37956999W"),4,36,64)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("37956999W")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37956999W"),4,36,64)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37956999W"),4,36,64)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74743462L"),9,71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74743462L"),9,71,71)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74743462L"),9,71,71)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_58") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_58")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36298487U"),0,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36298487U"),0,8,8)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36298487U"),0,8,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31712314Q"),3,15).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31712314Q"),3,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74354163L"),8,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74354163L"),8,19,19)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("31712314Q")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31712314Q"),3,15,15)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27374876R"),8,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27374876R"),8,29,29)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31712314Q"),3,15,15),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74354163L"),8,19,19),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27374876R"),8,29,29) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("27374876R"),31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27374876R"),8,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75228452D"),4,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75228452D"),4,39,39)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31712314Q"),3,15,15),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75228452D"),4,39,39),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74354163L"),8,19,19) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31712314Q"),3,15,15)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75228452D"),4,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88266412Y"),6,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88266412Y"),6,58,58)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("99471813M"),2,62).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("19122685H"),9,68).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("19122685H"),9,68,68)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88266412Y"),6,58,58)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_59") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_59")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88617831U"),2,9).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63427555A"),5,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63427555A"),5,12,12)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("63427555A"),6,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63427555A"),6,12,22)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63427555A"),6,12,22) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63427555A"),6,12,22)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77253313W"),6,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77253313W"),6,34,34)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95681588I"),4,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95681588I"),4,41,41)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95681588I"),4,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("81382145C"),10,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81382145C"),10,57,57)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59538245I"),3,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59538245I"),3,59,59)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("59538245I"),64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59538245I"),3,59,59)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("81382145C"),1,71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("81382145C"),1,57,71)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88632245Z"),3,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88632245Z"),3,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77253313W"),10,80).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62211228Q"),4,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62211228Q"),4,90,90)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_60") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_60")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74738759J"),1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74738759J"),1,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54548543E"),0,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54548543E"),0,6,6)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74738759J"),7,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74738759J"),7,5,8)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66543355M"),5,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66543355M"),5,14,14)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54548543E"),0,6,6)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66543355M"),5,14,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74738759J"),9,42).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("69831387V"),10,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69831387V"),10,46,46)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,47).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74738759J"),7,5,8)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("69831387V"),49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("69831387V"),10,46,46)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("69826322H")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21943377O"),7,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21943377O"),7,59,59)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21943377O"),62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21943377O"),7,59,59)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11546824T"),10,65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11546824T"),10,65,65)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47584146R"),8,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47584146R"),8,74,74)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_61") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_61")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("89152936B"),3,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89152936B"),3,2,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,7).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("89152936B"),3,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24394861V"),7,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24394861V"),7,12,12)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24394861V"),7,12,12)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("37394698L"),7,27).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34433861F"),5,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34433861F"),5,30,30)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34433861F"),35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34433861F"),5,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62736942U"),0,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62736942U"),0,37,37)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62736942U"),0,37,37)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48643548K"),2,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48643548K"),2,45,45)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48643548K"),7,48).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48643548K"),2,45,45)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("77342362B"),0,56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77342362B"),0,56,56)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("66847111Y"),4,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66847111Y"),4,66,66)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("77342362B"),0,56,56)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57252287G"),5,77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57252287G"),5,77,77)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("66847111Y"),4,66,66)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57252287G"),5,77,77) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("57252287G"),0,86).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57252287G"),0,77,86)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,88).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57252287G"),0,77,86)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_62") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_62")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,40,3).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67133684R"),2,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67133684R"),2,10,10)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("67133684R"),19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67133684R"),2,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37589544C"),6,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37589544C"),6,27,27)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("37589544C")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37589544C"),6,27,27)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34139533V"),7,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34139533V"),7,36,36)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86951399D"),4,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86951399D"),4,43,43)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34139533V"),8,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34139533V"),8,36,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86951399D"),4,43,43)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37589544C"),6,27,27),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34139533V"),8,36,49) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37589544C"),6,27,27)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34139533V"),69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34139533V"),8,36,49)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86995349A"),4,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86995349A"),4,73,73)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86995349A"),4,73,73)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49536568S"),7,80).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49536568S"),7,80,80)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63962571R"),6,88).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63962571R"),6,88,88)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63962571R"),6,88,88),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49536568S"),7,80,80) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("63962571R"),6,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63962571R"),6,88,88)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,104).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63962571R"),6,88,88)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49536568S"),7,80,80) })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_63") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_63")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("82493229G"),4,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),4,6,6)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82493229G"),3,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),3,6,12)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),3,6,12) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82493229G"),4,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),4,6,13)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("82493229G"),8,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),8,6,18)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("82493229G"),8,6,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16486924F"),9,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16486924F"),9,32,32)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16486924F"),9,32,32)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("76286178N"),4,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76286178N"),4,41,41)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76286178N"),4,41,41) })) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(29,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86896117J"),6,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86896117J"),6,45,45)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("76286178N"),53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("76286178N"),4,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87268638D"),10,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87268638D"),10,54,54)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86896117J"),6,45,45)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87268638D"),10,54,54)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,49,76).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,77).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,80).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("61642682C"),83).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71649519I"),1,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71649519I"),1,89,89)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_64") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_64")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("24658438H"),6,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24658438H"),6,16,16)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,6,26).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("24658438H"),8,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24658438H"),8,16,31)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("24658438H"),34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("24658438H"),8,16,31)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47313359H"),2,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47313359H"),2,43,43)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48144624Y"),7,45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48144624Y"),7,45,45)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("48144624Y"),5,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48144624Y"),5,45,55)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96623679B"),5,62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96623679B"),5,62,62)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,68).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47313359H"),2,43,43)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58247135C"),0,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58247135C"),0,69,69)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,78).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58247135C"),0,69,69)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29822449E"),6,85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29822449E"),6,85,85)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,86).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48144624Y"),5,45,55)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96623679B"),5,62,62),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29822449E"),6,85,85) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("29822449E"),8,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29822449E"),8,85,96)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11926581S"),5,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11926581S"),5,98,98)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("29822449E"),3,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29822449E"),3,85,100)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("25132361Q"),4,101).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29822449E"),3,85,100)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_65") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_65")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36726446T"),10,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36726446T"),10,6,6)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("36726446T"),10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36726446T"),10,6,6)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("79879719D"),16).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21288884W"),5,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21288884W"),5,26,26)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21288884W"),2,36).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,2,39).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21288884W"),42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21288884W"),4,26,39)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,43).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("62758841W"),47).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79729743R"),7,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79729743R"),7,55,55)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91471558E"),10,64).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471558E"),10,64,64)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79729743R"),7,55,55)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471558E"),10,64,64) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91471558E"),8,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471558E"),8,64,72)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91471558E"),7,82).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471558E"),7,64,82)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,47,88).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21218824R"),6,92).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21218824R"),6,92,92)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91471558E"),10,101).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91471558E"),10,64,101)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("21218824R"),5,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21218824R"),5,92,108)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23474491B"),5,111).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23474491B"),5,111,111)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64423679U"),4,114).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64423679U"),4,114,114)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94168168W"),5,124).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94168168W"),5,124,124)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42831361T"),10,127).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42831361T"),10,127,127)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_66") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_66")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71733134G"),5,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71733134G"),5,2,2)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71733134G"),3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71733134G"),5,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34714632T"),6,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34714632T"),6,11,11)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34714632T"),6,11,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53363387R"),8,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53363387R"),8,18,18)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53363387R"),8,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17547711O"),7,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17547711O"),7,34,34)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(12,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87971679L"),9,35).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87971679L"),9,35,35)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("87971679L")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87971679L"),9,35,35)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17547711O"),7,34,34)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87971679L"),9,35,35)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34842719S"),9,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34842719S"),9,52,52)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34842719S"),9,61).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("34842719S"),71).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34842719S"),9,52,52)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18235764Z"),8,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18235764Z"),8,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84255244D"),9,80).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84255244D"),9,80,80)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97878662G"),7,82).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97878662G"),7,82,82)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("84255244D"),87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84255244D"),9,80,80)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71958383M"),1,93).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71958383M"),1,93,93)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71958383M"),1,93,93)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("18235764Z")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18235764Z"),8,79,79)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14449681J"),1,103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14449681J"),1,103,103)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_67") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_67")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64341639M"),3,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64341639M"),3,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75991465M"),5,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75991465M"),5,12,12)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71922168I"),4,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71922168I"),4,18,18)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64341639M"),3,5,5)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71922168I"),36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71922168I"),4,18,18)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("75991465M")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75991465M"),5,12,12)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13631216T"),9,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13631216T"),9,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83459486A"),1,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83459486A"),1,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83459486A"),1,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75375995U"),2,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75375995U"),2,52,52)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88634373Y"),8,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88634373Y"),8,57,57)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("13631216T"),65).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13631216T"),9,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87477336R"),7,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87477336R"),7,74,74)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75375995U"),2,52,52),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75991465M"),5,12,12),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87477336R"),7,74,74),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88634373Y"),8,57,57) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75375995U"),2,52,52)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75991465M"),5,12,12)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87477336R"),7,74,74),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88634373Y"),8,57,57) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36958793I"),9,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36958793I"),9,91,91)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("88634373Y"),1,93).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88634373Y"),1,57,93)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,95).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88634373Y"),1,57,93)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41687764D"),0,105).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41687764D"),0,105,105)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87927668G"),8,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87927668G"),8,108,108)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_68") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_68")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17194647I"),6,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17194647I"),6,4,4)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17194647I"),6,4,4)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(9,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32713462J"),7,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32713462J"),7,18,18)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32713462J"),0,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32713462J"),0,18,26)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44657698R"),3,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44657698R"),3,33,33)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32713462J"),0,18,26)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,98,43).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97574386D"),1,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97574386D"),1,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29669442N"),7,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29669442N"),7,52,52)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34132247Y"),9,60).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58319869P"),5,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58319869P"),5,61,61)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44657698R"),4,62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44657698R"),4,33,62)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64464645R"),5,67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64464645R"),5,67,67)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11175744Z"),4,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11175744Z"),4,75,75)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97574386D"),4,81).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97574386D"),4,48,81)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("17887326B"),2,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("17887326B"),2,91,91)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("64464645R"),4,95).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64464645R"),4,67,95)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42971521B"),9,103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42971521B"),9,103,103)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97574386D"),3,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97574386D"),3,48,108)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(30,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34287399Z"),10,114).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34287399Z"),10,114,114)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91871588G"),2,124).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91871588G"),2,124,124)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78895819E"),7,128).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78895819E"),7,128,128)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_69") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_69")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,2).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13511821P"),5,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13511821P"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("61928328G"),5,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61928328G"),5,13,13)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13511821P"),5,5,5),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61928328G"),5,13,13) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("61928328G"),10,17).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61928328G"),10,13,17)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13511821P"),5,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97713926F"),7,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97713926F"),7,30,30)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("97713926F"),31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97713926F"),7,30,30)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21382555Q"),10,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21382555Q"),10,37,37)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21382555Q"),0,40).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47126695T"),1,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47126695T"),1,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47126695T"),1,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("61928328G"),10,13,17)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21382555Q"),10,37,37)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49753491Y"),10,62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49753491Y"),10,62,62)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49753491Y"),10,62,62) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("16674786S"),3,71).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49753491Y"),10,62,62)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64859399R"),4,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64859399R"),4,74,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55848816C"),5,80).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55848816C"),5,80,80)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64859399R"),4,74,74)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68352966V"),6,84).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68352966V"),6,84,84)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,71,92).doCall().checkResult(null) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_70") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_70")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(0,0)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25924328Y"),10,3).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25924328Y"),10,3,3)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25924328Y"),10,3,3) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18672787N"),6,12).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18672787N"),6,12,12)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("18672787N")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18672787N"),6,12,12)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18672787N"),6,12,12)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("25924328Y"),2,20).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25924328Y"),2,3,20)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31465556W"),9,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31465556W"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("31465556W")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31465556W"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83884757B"),0,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83884757B"),0,30,30)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31465556W"),32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31465556W"),9,29,29)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("83884757B"),5,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83884757B"),5,30,42)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25924328Y"),2,3,20),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83884757B"),5,30,42) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,50).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25924328Y"),2,3,20)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83884757B"),5,30,42)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(75,3)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78853182N"),2,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78853182N"),2,57,57)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(75,3)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78853182N"),2,57,57)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84539855Q"),1,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84539855Q"),1,63,63)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84539855Q"),3,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84539855Q"),3,63,72)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84539855Q"),3,63,72)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,95,78).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93268457F"),6,87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93268457F"),6,87,87)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_71") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_71")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,6).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,12).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("73184743Q")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71515696T"),10,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71515696T"),10,13,13)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71515696T"),10,13,13)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11231453S"),2,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),2,23,23)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),2,23,23) })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),2,23,23) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("11231453S"),7,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),7,23,30)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("11231453S"),8,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),8,23,31)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("11231453S"),7,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),7,23,40)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11231453S"),7,23,40)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,50).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72436124G"),2,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72436124G"),2,54,54)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("72436124G"),60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72436124G"),2,54,54)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,64).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(20,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,74).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,64,83).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45397789S"),9,93).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45397789S"),9,93,93)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45397789S"),94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45397789S"),9,93,93)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43373596A"),9,100).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43373596A"),9,100,100)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43373596A"),0,105).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43373596A"),0,100,105)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29637155N"),6,107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29637155N"),6,107,107)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43373596A"),5,114).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43373596A"),5,100,114)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_72") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_72")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94123438R"),6,8).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94123438R"),6,8,8)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("94123438R"),5,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94123438R"),5,8,10)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,16).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94123438R"),5,8,10)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,50,26).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75829856H"),9,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75829856H"),9,34,34)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91896947G"),3,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91896947G"),3,38,38)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("75829856H"),41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75829856H"),9,34,34)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91896947G"),3,38,38)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,54).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57155139X"),2,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57155139X"),2,55,55)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("57155139X"),7,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57155139X"),7,55,63)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73468845K"),3,67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73468845K"),3,67,67)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73468845K"),3,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73468845K"),3,67,67)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("26739617J"),9,75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26739617J"),9,75,75)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("26739617J"),3,82).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26739617J"),3,75,82)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,92).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73468845K"),3,67,67)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("35921838E"),8,97).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35921838E"),8,97,97)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,102).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("26739617J"),3,75,82)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55936337R"),0,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55936337R"),0,108,108)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55936337R"),0,108,108)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57155139X"),7,55,63),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35921838E"),8,97,97) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57155139X"),7,55,63)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35921838E"),8,97,97) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("35921838E"),8,97,97)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("69754815C"),128).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58113814X"),3,133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58113814X"),3,133,133)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("58113814X"),137).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58113814X"),3,133,133)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94641415B"),0,140).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94641415B"),0,140,140)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_73") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_73")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94527583I"),9,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94527583I"),9,9,9)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,41,11).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22491638I"),9,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22491638I"),9,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71152427V"),7,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71152427V"),7,21,21)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("94527583I"),23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94527583I"),9,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74142632I"),0,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74142632I"),0,31,31)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74142632I"),5,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74142632I"),5,31,40)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("22491638I"),45).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22491638I"),9,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87729414H"),2,53).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87729414H"),2,53,53)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87729414H"),2,53,53)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63558318D"),10,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63558318D"),10,72,72)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(10,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97571894F"),5,82).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97571894F"),5,82,82)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("73451514J"),7,92).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73451514J"),7,92,92)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("36866663L"),9,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36866663L"),9,96,96)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97571894F"),8,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97571894F"),8,82,98)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("73451514J"),104).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("73451514J"),7,92,92)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("63558318D"),5,109).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63558318D"),5,72,109)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("74142632I"),118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74142632I"),5,31,40)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("36866663L"),0,121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36866663L"),0,96,121)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36866663L"),0,96,121),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63558318D"),5,72,109),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71152427V"),7,21,21),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97571894F"),8,82,98) })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36866663L"),0,96,121),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63558318D"),5,72,109),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71152427V"),7,21,21),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97571894F"),8,82,98) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("63558318D"),123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63558318D"),5,72,109)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71152427V"),1,131).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,138).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("36866663L"),0,96,121)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86183967J"),9,142).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86183967J"),9,142,142)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56548146Y"),3,144).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56548146Y"),3,144,144)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("86183967J"),148).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86183967J"),9,142,142)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("59538485J"),8,151).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("59538485J"),8,151,151)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_74") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_74")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("61148868I"),4).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92953964V"),1,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92953964V"),1,5,5)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("92953964V"),9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92953964V"),1,5,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62335629L"),7,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62335629L"),7,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55326117O"),2,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55326117O"),2,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("94594399P"),6,21).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94594399P"),6,21,21)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25944849E"),7,26).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25944849E"),7,26,26)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55326117O"),2,13,13),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94594399P"),6,21,21),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62335629L"),7,10,10),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25944849E"),7,26,26) })) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55326117O"),2,13,13),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94594399P"),6,21,21),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62335629L"),7,10,10),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25944849E"),7,26,26) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55326117O"),2,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14114829M"),1,34).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14114829M"),1,34,34)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("22375531S"),3,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22375531S"),3,39,39)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,40,41).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("54324381G"),0,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54324381G"),0,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72347984H"),1,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72347984H"),1,58,58)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("86328269R"),0,63).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86328269R"),0,63,63)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,48,66).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("14114829M"),67).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14114829M"),1,34,34)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("62335629L"),76).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62335629L"),6,10,66)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57432385C"),5,85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57432385C"),5,85,85)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("94594399P"),0,89).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94594399P"),0,21,89)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,99).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("54324381G"),0,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49654615Q"),8,105).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49654615Q"),8,105,105)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52724486L"),5,110).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52724486L"),5,110,110)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,118).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("86328269R"),0,63,63)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("25944849E"),2,119).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25944849E"),2,26,119)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("94594399P"),0,21,89)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(226,4)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72347984H"),1,58,58),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25944849E"),2,26,119),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("22375531S"),3,39,39),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57432385C"),5,85,85),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52724486L"),5,110,110),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49654615Q"),8,105,105) })) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_75") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_75")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("43699553N"),8,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43699553N"),8,2,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43699553N"),5,11).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43699553N"),5,2,11)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32134474F"),10,18).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32134474F"),10,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("55287552J"),5,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55287552J"),5,28,28)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("43699553N"),4,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43699553N"),4,2,36)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92342426C"),7,41).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92342426C"),7,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41427935U"),1,48).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41427935U"),1,48,48)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37138375I"),5,58).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37138375I"),5,58,58)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("37138375I"),60).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37138375I"),5,58,58)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("11154864I"),5,66).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("32134474F")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32134474F"),10,18,18)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97312821O"),5,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97312821O"),5,70,70)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41427935U"),1,48,48)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,76).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("43699553N"),4,2,36)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("32134474F"),0,85).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32134474F"),0,18,85)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(99,2)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,88).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32134474F"),0,18,85)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("55287552J"),5,28,28)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31625292Z"),8,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31625292Z"),8,96,96)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97312821O"),5,70,70),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92342426C"),7,41,41),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31625292Z"),8,96,96) })) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(231,4)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("92342426C"),7,97).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92342426C"),7,41,41)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97286752B"),0,101).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97286752B"),0,101,101)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29113314G"),6,106).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29113314G"),6,106,106)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("51245947Q"),4,111).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51245947Q"),4,111,111)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("97286752B")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97286752B"),0,101,101)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34985834C"),0,117).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34985834C"),0,117,117)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93785793L"),8,120).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93785793L"),8,120,120)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("78328358Y"),10,121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78328358Y"),10,121,121)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97286752B"),0,101,101)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34985834C"),0,117,117),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51245947Q"),4,111,111),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97312821O"),5,70,70),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29113314G"),6,106,106),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92342426C"),7,41,41),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31625292Z"),8,96,96),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93785793L"),8,120,120),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("78328358Y"),10,121,121) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("51245947Q"),2,128).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("51245947Q"),2,111,128)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_76") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_76")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("95932333J"),8,5).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95932333J"),8,5,5)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("95932333J"),7,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95932333J"),7,5,13)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("95932333J"),7,5,13)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("46546337V")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,32).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74843769B"),10,36).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74843769B"),10,36,36)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,3,37).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83724599N"),9,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83724599N"),9,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87265324Z"),8,52).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87265324Z"),8,52,52)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,62).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87265324Z"),8,52,52)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74843769B"),7,68).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74843769B"),7,36,68)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,72).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74843769B"),7,36,68)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("57476243Y"),9,77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57476243Y"),9,77,77)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83724599N"),9,42,42)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("57476243Y"),9,77,77)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91266734E"),9,92).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91266734E"),9,92,92)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("91266734E")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91266734E"),9,92,92)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91266734E"),8,96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91266734E"),8,92,96)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("91266734E"),106).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91266734E"),8,92,96)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68896973F"),6,109).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68896973F"),6,109,109)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68896973F"),6,109,109) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18697141T"),2,113).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18697141T"),2,113,113)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18697141T"),2,113,113),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68896973F"),6,109,109) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("18697141T"),5,123).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18697141T"),5,113,123)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("18697141T"),133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18697141T"),5,113,123)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,139).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68896973F"),6,109,109)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,45,148).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21331677I"),2,153).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21331677I"),2,153,153)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("72395745Q"),5,155).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72395745Q"),5,155,155)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,161).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21331677I"),2,153,153)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("72395745Q"),6,163).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72395745Q"),6,155,163)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("72395745Q"),9,165).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72395745Q"),9,155,165)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("72395745Q")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72395745Q"),9,155,165)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("72395745Q"),171).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("72395745Q"),9,155,165)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("88159581E"),10,172).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("88159581E"),10,172,172)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_77") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_77")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33411227X"),3,2).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33411227X"),3,2,2)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27574113U"),0,10).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27574113U"),0,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62992131W"),9,13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62992131W"),9,13,13)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56846655V"),9,22).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56846655V"),9,22,22)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("16682113J"),8,25).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16682113J"),8,25,25)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,27).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27574113U"),0,10,10)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56846655V"),9,34).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56846655V"),6,44).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("62992131W"),3,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62992131W"),3,13,46)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(17,1)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("62992131W"),7,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62992131W"),7,13,49)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67913749L"),10,54).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67913749L"),10,54,54)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(17,1)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("33411227X"),56).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33411227X"),3,2,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("56846655V"),4,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56846655V"),4,22,61)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(17,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("92563136P"),4,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92563136P"),4,70,70)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,74).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56846655V"),4,22,61)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("16682113J"),75).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("16682113J"),8,25,25)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("62992131W"),77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62992131W"),7,13,49)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92563136P"),4,70,70),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67913749L"),10,54,54) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,79).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("92563136P"),4,70,70)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,86).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67913749L"),10,54,54)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("49233837R"),5,95).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49233837R"),5,95,95)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23438227S"),2,99).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23438227S"),2,99,99)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,108).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23438227S"),2,99,99)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("49233837R"),112).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("49233837R"),5,95,95)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("86798223Q"),120).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,126).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71748696J"),10,136).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71748696J"),10,136,136)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,17,140).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47263878E"),3,147).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47263878E"),3,147,147)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("47263878E"),154).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47263878E"),3,147,147)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39633297J"),2,155).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39633297J"),2,155,155)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("62581734X"),2,157).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("62581734X"),2,157,157)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("71748696J"),0,158).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71748696J"),0,136,158)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11789614N"),9,168).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11789614N"),9,168,168)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_78") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_78")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33523367E"),5,9).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33523367E"),5,9,9)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33523367E"),5,9,9) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87289214X"),7,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87289214X"),7,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("14229968B"),0,29).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14229968B"),0,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("56412485X"),6,33).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56412485X"),6,33,33)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("14229968B")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14229968B"),0,29,29)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("97534128Y"),5,43).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97534128Y"),5,43,43)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74576521E"),7,46).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74576521E"),7,46,46)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("31468513U"),7,52).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,57).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("14229968B"),0,29,29)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,59).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33523367E"),5,9,9)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("63943958M"),5,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63943958M"),5,69,69)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11124148Q"),8,70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11124148Q"),8,70,70)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("87289214X"),3,77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87289214X"),3,19,77)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,86).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87289214X"),3,19,77)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("74576521E"),96).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74576521E"),7,46,46)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("63943958M"),5,98).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63943958M"),5,69,69)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("63943958M"),107).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("63943958M"),5,69,69)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97534128Y"),5,43,43),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56412485X"),6,33,33),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11124148Q"),8,70,70) })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("97534128Y"),5,43,43)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("34217896Z"),2,121).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34217896Z"),2,121,121)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("34217896Z"),5,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34217896Z"),5,121,126)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,131).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("34217896Z"),5,121,126)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56412485X"),6,33,33),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11124148Q"),8,70,70) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("11124148Q"),133).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11124148Q"),8,70,70)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(227,5)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45233469Z"),3,135).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45233469Z"),3,135,135)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("18932853B"),6,139).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),6,139,139)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79463912W"),3,144).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79463912W"),3,144,144)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45233469Z"),3,135,135),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79463912W"),3,144,144),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56412485X"),6,33,33),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),6,139,139) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("83863369O"),0,147).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83863369O"),0,147,147)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("79463912W")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79463912W"),3,144,144)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46456122S"),1,156).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46456122S"),1,156,156)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83863369O"),0,147,147),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46456122S"),1,156,156),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45233469Z"),3,135,135),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79463912W"),3,144,144),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("56412485X"),6,33,33),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),6,139,139) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("18932853B"),9,165).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),9,139,165)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("18932853B"),0,171).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),0,139,171)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67476613K"),3,180).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67476613K"),3,180,180)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,23,189).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,190).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("83863369O"),0,147,147)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("31326142W"),4,195).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31326142W"),4,195,195)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74427777R"),3,204).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74427777R"),3,204,204)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,208).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("18932853B"),0,139,171)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("31326142W"),217).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("31326142W"),4,195,195)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,226).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46456122S"),0,156,189)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_79") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_79")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37955742J"),10,4).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37955742J"),10,4,4)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("37955742J"),13).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37955742J"),10,4,4)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("52227197C")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74654469X"),9,16).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("98816334X"),6,23).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98816334X"),6,23,23)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,28).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("98816334X"),6,23,23)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29211778Q"),8,32).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29211778Q"),8,32,32)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("96495796O"),5,37).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96495796O"),5,37,37)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29211778Q"),0,45).doCall().checkResult(new PacienteExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("96495796O"),5,55).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96495796O"),5,37,37)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,17,63).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("96495796O"),10,66).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96495796O"),10,37,66)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(5,1)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("93699429X"),8,73).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93699429X"),8,73,73)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,81).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29211778Q"),7,32,63)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("46235521H"),8,90).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46235521H"),8,90,90)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(54,2)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46235521H"),4,91).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46235521H"),4,90,91)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25626799K"),5,94).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25626799K"),5,94,94)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46235521H"),8,95).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46235521H"),8,90,95)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("58785428N"),1,103).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58785428N"),1,103,103)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,112).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("58785428N"),1,103,103)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("96495796O"),122).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("96495796O"),10,37,66)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52447141V"),1,126).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52447141V"),1,126,126)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("46235521H"),6,129).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46235521H"),6,90,129)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,131).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52447141V"),1,126,126)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,139).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25626799K"),5,94,94)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("46235521H"),144).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("46235521H"),6,90,129)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("97194182O"),0,154).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("93699429X"),0,164).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93699429X"),0,73,164)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,173).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("93699429X"),0,73,164)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32364871D"),182).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("36427151Q")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("99668118O"),5,191).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99668118O"),5,191,191)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("99668118O"),192).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("99668118O"),5,191,191)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("67258836E"),6,199).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67258836E"),6,199,199)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,206).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("67258836E"),6,199,199)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("44852452A"),0,212).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),0,212,212)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44852452A"),4,221).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),4,212,221)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44852452A"),5,224).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),5,212,224)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),5,212,224) })) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(220,7)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("44852452A"),1,229).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),1,212,229)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("13676189A"),8,235).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("13676189A"),8,235,235)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11431991T"),5,236).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11431991T"),5,236,236)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,240).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("44852452A"),1,212,229)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71136329J"),9,245).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71136329J"),9,245,245)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("33632194S"),5,250).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("33632194S"),5,250,250)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
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
TestResult<Urgencias,Void> v_0 = null ;
Urgencias v_1 = null ;
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = new String("test_80") ;
boolean ok_sofar = true ;
ResultsHandler.startTest(new String("test_80")) ;
if (ok_sofar)
{
  v_0 = new Constructor().doCall() ;
  ok_sofar = v_0.checkResult(null) ;
}
if (ok_sofar)
  v_1 = v_0.getValue() ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("74169815L"),10,6).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74169815L"),10,6,6)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74169815L"),10,6,6) })) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("74169815L"),3,14).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74169815L"),3,6,14)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("11588721U"),9,19).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11588721U"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("11588721U")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11588721U"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87524363O"),10,24).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87524363O"),10,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,30).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("74169815L"),3,6,14)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,31).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("11588721U"),9,19,19)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("29426616P"),0,38).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29426616P"),0,38,38)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("87524363O")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87524363O"),10,24,24)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("79539739W"),5,39).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79539739W"),5,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("64737881H"),2,40).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64737881H"),2,40,40)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("53387877F"),4,42).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53387877F"),4,42,42)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("23588637P"),4,49).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23588637P"),4,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,51).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("29426616P"),0,38,38)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,61).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("64737881H"),2,40,40)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,69).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("53387877F"),4,42,42)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("87524363O"),70).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87524363O"),10,24,24)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,77).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("23588637P"),4,49,49)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,83).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("79539739W"),5,39,39)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("75959763W"),6,87).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75959763W"),6,87,87)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("25142421J"),3,92).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25142421J"),3,92,92)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(169,7)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,102).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("25142421J"),3,92,92)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39176351M"),10,104).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39176351M"),10,104,104)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("39176351M"),105).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39176351M"),10,104,104)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("71227571C"),5,115).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71227571C"),5,115,115)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("75959763W"),120).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("75959763W"),6,87,87)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("71227571C"),124).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("71227571C"),5,115,115)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,133).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48243643Q"),6,137).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48243643Q"),6,137,137)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,142).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48243643Q"),6,137,137)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("73831447W"),5,151).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] {  })) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,159).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("85878929M")).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("84348737R"),6,167).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("32455288N"),4,172).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32455288N"),4,172,172)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("32455288N"),181).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("32455288N"),4,172,172)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("68682536P"),6,184).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68682536P"),6,184,184)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37484685Y"),1,186).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37484685Y"),1,186,186)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,194).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37484685Y"),1,186,186)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("47781919H"),2,195).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47781919H"),2,195,195)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,197).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("47781919H"),2,195,195)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,204).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("68682536P"),6,184,184)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("41964179C"),2,210).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41964179C"),2,210,210)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,212).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("41964179C"),2,210,210)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("21412565C"),5,222).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21412565C"),5,222,222)) ;
if (ok_sofar)
  ok_sofar = new GetPaciente(v_1,new String("21412565C")).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21412565C"),5,222,222)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(216,13)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("21412565C"),226).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("21412565C"),5,222,222)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(216,13)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,37,232).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("29795967T"),242).doCall().checkResult(new PacienteNoExisteException()) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("91778186J"),10,251).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),10,251,251)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("39626183S"),3,258).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39626183S"),3,258,258)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("39626183S"),10,266).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39626183S"),10,258,266)) ;
if (ok_sofar)
  ok_sofar = new InformacionEspera(v_1).doCall().checkResult(new es.upm.aedlib.Pair<Integer,Integer>(216,13)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("91778186J"),2,267).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),2,251,267)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("37416854F"),1,274).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37416854F"),1,274,274)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37416854F"),1,274,274),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),2,251,267),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39626183S"),10,258,266) })) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("39626183S"),284).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("39626183S"),10,258,266)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,294).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("37416854F"),1,274,274)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("45165412S"),6,300).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45165412S"),6,300,300)) ;
if (ok_sofar)
  ok_sofar = new SalirPaciente(v_1,new String("45165412S"),307).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("45165412S"),6,300,300)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48488288H"),3,311).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48488288H"),3,311,311)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),2,251,267),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48488288H"),3,311,311) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("42155226B"),6,313).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42155226B"),6,313,313)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("48488288H"),1,321).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48488288H"),1,311,321)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,322).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48488288H"),1,311,321)) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,36,329).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("27331952N"),6,334).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27331952N"),6,334,334)) ;
if (ok_sofar)
  ok_sofar = new CambiarPrioridad(v_1,new String("27331952N"),9,338).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27331952N"),9,334,338)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),1,251,329),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42155226B"),6,313,313),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27331952N"),9,334,338) })) ;
if (ok_sofar)
  ok_sofar = new AumentaPrioridad(v_1,19,340).doCall().checkResult(null) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("87875917J"),7,346).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87875917J"),7,346,346)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("84283412Y"),10,354).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84283412Y"),10,354,354)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("15555286Z"),2,360).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15555286Z"),2,360,360)) ;
if (ok_sofar)
  ok_sofar = new AtenderPaciente(v_1,369).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("91778186J"),1,251,329)) ;
if (ok_sofar)
  ok_sofar = new PacientesEsperando(v_1).doCall().checkResult(new es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>(new aed.urgencias.TesterLab6.UrgenciasPaciente[] { new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("15555286Z"),2,360,360),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("42155226B"),5,313,340),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("87875917J"),7,346,346),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("27331952N"),9,334,338),new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("84283412Y"),10,354,354) })) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("48672823Y"),2,374).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("48672823Y"),2,374,374)) ;
if (ok_sofar)
  ok_sofar = new AdmitirPaciente(v_1,new String("52191856U"),3,381).doCall().checkResult(new aed.urgencias.TesterLab6.UrgenciasPaciente(new String("52191856U"),3,381,381)) ;
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
    ResultsHandler.add_result(new String("urgencias2022"),resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterLab6";
}





static class UrgenciasPaciente {
  String DNI;
  int prioridad;
  int tiempoAdmision;
  int tiempoAdmisionEnPrioridad;

  public UrgenciasPaciente(String DNI, int prioridad, int tiempoAdmision, int tiempoAdmisionEnPrioridad) {
    this.DNI = DNI;
    this.prioridad = prioridad;
    this.tiempoAdmision = tiempoAdmision;
    this.tiempoAdmisionEnPrioridad = tiempoAdmisionEnPrioridad;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Paciente) {
      Paciente paciente = (Paciente) obj;
      return DNI.equals(paciente.getDNI())
	&& prioridad == paciente.getPrioridad()
	&& tiempoAdmision == paciente.getTiempoAdmision()
	&& tiempoAdmisionEnPrioridad == paciente.getTiempoAdmisionEnPrioridad();
    } else return false;
  }

  @Override
  public int hashCode() {
    return DNI.hashCode();
  }

  @Override
  public String toString() {
     return "<\""+DNI.toString()+"\","+prioridad+","+tiempoAdmision+","+tiempoAdmisionEnPrioridad+">";
  }
}

static class UrgenciasUtils2022 {
  static HashMap<Object,String> urgenciasNames = null;

  public static void resetPrinter() {
    urgenciasNames = null;
  }

  public static String printer(Object obj) {
    if (obj instanceof Urgencias) {
      if (urgenciasNames == null)
        urgenciasNames = new HashMap<Object,String>();
      String name = urgenciasNames.get(obj);
      if (name == null) {
        name = "urgencias";
        urgenciasNames.put(obj,name);
      }
      return name;
    } else return TestUtils.printer(obj, x -> printer(x));
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

    if (!equalsWithArrays(expected,value)) {
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

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class InformacionEspera extends TestCall<es.upm.aedlib.Pair<Integer,Integer>,Object>
{
  Urgencias x_1;
  
  public InformacionEspera (Urgencias x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".informacionEspera")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public es.upm.aedlib.Pair<Integer,Integer> call () throws PacienteNoExisteException
  {
    return x_1.informacionEspera() ;
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
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class Constructor extends TestCall<Urgencias,Void>
{
  
  public Constructor ()
  {
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(new String("new Urgencias")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Urgencias call () 
  {
    return new UrgenciasAED() ;
  }
  
  public boolean checkResult (Void expected) 
  {
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class CambiarPrioridad extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  Integer x_4;
  
  public CambiarPrioridad (Urgencias x_1,String x_2,Integer x_3,Integer x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".cambiarPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_4)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteNoExisteException
  {
    return x_1.cambiarPrioridad(x_2,x_3,x_4) ;
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
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class AumentaPrioridad extends TestCall<Void,Throwable>
{
  Urgencias x_1;
  Integer x_2;
  Integer x_3;
  
  public AumentaPrioridad (Urgencias x_1,Integer x_2,Integer x_3)
  {
    voidReturn = true ;
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".aumentaPrioridad")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Void call () throws PacienteNoExisteException
  {
    x_1.aumentaPrioridad(x_2,x_3) ;
    return null ;
  }
  
  public boolean checkResult (Throwable expected) 
  {
    if (expected != null)
    {
      if (!throwsException(expected.getClass().getCanonicalName()))
        return false ;
      return true ;
    }
    if (!noException())
      return false ;
    return true ;
  }
  
}


static class AdmitirPaciente extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  Integer x_4;
  
  public AdmitirPaciente (Urgencias x_1,String x_2,Integer x_3,Integer x_4)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
    this.x_4 = x_4 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".admitirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_4)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteExisteException
  {
    return x_1.admitirPaciente(x_2,x_3,x_4) ;
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
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class SalirPaciente extends TestCall<Paciente,Object>
{
  Urgencias x_1;
  String x_2;
  Integer x_3;
  
  public SalirPaciente (Urgencias x_1,String x_2,Integer x_3)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
    this.x_3 = x_3 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".salirPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(", ")) ;
    output.append(TesterCode.printer(x_3)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () throws PacienteNoExisteException
  {
    return x_1.salirPaciente(x_2,x_3) ;
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
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class GetPaciente extends TestCall<Paciente,aed.urgencias.TesterLab6.UrgenciasPaciente>
{
  Urgencias x_1;
  String x_2;
  
  public GetPaciente (Urgencias x_1,String x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".getPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () 
  {
    return x_1.getPaciente(x_2) ;
  }
  
  public boolean checkResult (aed.urgencias.TesterLab6.UrgenciasPaciente expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class AtenderPaciente extends TestCall<Paciente,aed.urgencias.TesterLab6.UrgenciasPaciente>
{
  Urgencias x_1;
  Integer x_2;
  
  public AtenderPaciente (Urgencias x_1,Integer x_2)
  {
    this.x_1 = x_1 ;
    this.x_2 = x_2 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".atenderPaciente")) ;
    output.append(new String("(")) ;
    output.append(TesterCode.printer(x_2)) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Paciente call () 
  {
    return x_1.atenderPaciente(x_2) ;
  }
  
  public boolean checkResult (aed.urgencias.TesterLab6.UrgenciasPaciente expected) 
  {
    if (!noException())
      return false ;
    if (!valuesMatch(expected))
      return false ;
    return true ;
  }
  
}


static class PacientesEsperando extends TestCall<Iterable<Paciente>,es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente>>
{
  Urgencias x_1;
  
  public PacientesEsperando (Urgencias x_1)
  {
    this.x_1 = x_1 ;
  }
  
  public String toString () 
  {
    StringBuilder output = new StringBuilder() ;
    output.append(TesterCode.printer(x_1)) ;
    output.append(new String(".pacientesEsperando")) ;
    output.append(new String("(")) ;
    output.append(new String(")")) ;
    return output.toString() ;
  }
  
  public Iterable<Paciente> call () 
  {
    return x_1.pacientesEsperando() ;
  }
  
  public boolean checkResult (es.upm.aedlib.positionlist.NodePositionList<aed.urgencias.TesterLab6.UrgenciasPaciente> expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!TestUtils.sameElementsInOrder(this,result.getValue(),expected))
    //if (!valuesMatch(expected))
      return false ;
    return true ;
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









 
static class ResultsHandler {
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


static class TesterCode
{
  
  public static void resetPrinter () 
  {
    UrgenciasUtils2022.resetPrinter() ;
  }
  
  public static String printer (Object obj) 
  {
    return UrgenciasUtils2022.printer(obj) ;
  }
  
}


}
