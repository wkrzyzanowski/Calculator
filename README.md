# Simple Calculator

This application:
 - allow to make simple mathematical calculations like: <br/>
 
 ACTION | INSTRUCTION | DESCRIPTION
 --- | --- | ---
 *ADDITION* | ADD (number) | Add number to result
 *SUBTRACTION* | SUBTRACT (number) | Subtract number from result
 *MULTIPLICATION* | MULTIPLY (number) | Multiply result by number
 *DIVISION* | DIVIDE (number) | Divide result by number
 *MODULO* | MODULO (number) | Modulo divide result by number
 -|-|-
 **APPLY** | APPLY (number) | Number is set as initial result
 
 Instructions in input file should be in new lines and number should be separated by "whitespace".
 <br/>
 <br/>
 <br/>
 
 # Build and deploy:
 Application uses [**Maven**][1] to build and deploy.
 

 In project directory just type in console to build project:
 ```sh
 mvn clean install
 ```
 
 To run application **JDK at least 10.0.2 is required**.
 <br/>
 Application can be run by using console command in **target** directory:
  ```sh
  cd target/
  ```
  And then you run app with std input stream:
  ```sh
  java -jar StorewareCalc.jar < ../TEST_FILES/TEST1.txt
  ``` 
  Then result will be printed (as float number with two decimal places, with Locale.US - dot separated):
  ```sh
  4.00
  ```
 
 [1]: https://maven.apache.org/install.html
 
 <br/>
 <br/>
 <br/>
  
  # Input file specification:
  Input file:
  - should be in *.txt format
  - should contains possible instructions with space-separated numbers (int or double)
  - **!!! everyone input file should contain APPLY (number) inputInstructionPattern as last action !!!**
  - inputInstructionPattern can be write as lower or upper case letters
  - instructions after **APPLY** will be omitted!
  
  ### EXAMPLE SimpleTestFile.txt
  ```sh
  ADD 2
  SUBTRACT 1.5
  APPLY 10
  ``` 
  
  ### EXAMPLE SimpleTestFile.txt OUTPUT:
  ```sh
  10.50
  ```