9:00 to 10:00 --->parallel execution & Exception Handling
10:00 to 10:30 --->POM-Cucumber
10:30 to 11:00 --->BreakOut+Break
11:00 to 11:30 --->POM-ThreadLocal
11:30 to 12:00 --->POM-Excel Integration
12:00 to 12:30 --->ExtentReports

ExceptionHandling:
Exception:
 Abnormal behaviour that interrrupts the program flow.
 Types:
  1)checked(compile time)---->due to i/o errors/environental
  2)unchecked(Runtime)--->during the execution of the program

  Exception Handling is done using try/catch mechanism:
  try{

  }
  catch{

  }
  finally{--->block will be executed irrespective failure of the the catch block.

  }

  POM with Cucumber: For TestNG _POM : - with driver as static -> sequential execution is possible - To have sequential and parallel execution declare Parameterized Constructor in each pages For Cucumber_POM: - Constructor should not be defined - With driver as static -> sequential execution is possible.
  private-accessed only with in the class static-belong to class and not to any instance and it ensures on copy for each of the class. final-once the ocject is initialized,it cannot change it.

Java class which is used to access each thread independently private static final ThreadLocal chDriver = new ThreadLocal(); private: - This variable can be accessed only within the class static+final - constant -> cannot change the value.