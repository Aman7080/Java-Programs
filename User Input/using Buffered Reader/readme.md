# Program To demonstrate how to take user Input in Java 
## Using Buffered Reader 
Import Buffered Reader from Java.io package individually.

If imported individually, then InputStreamReader should also be imported
``` 
import java.io.BufferedReader;
import java.io.InputStreamReader;
```
or import everything from package
```
import java.io.*;
```
It throws some exception so add ```throws exception``` after main 
```
public static void main(String[] args) throws Exception {
// program body
}
```
Define BufferedReader in main like
```
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```
any name can be used in place of br

Then take user input using br.readLine()
```
String str = br.readLine();
```
If you want to take input as integer then you have to parse it using ```Integer.parseInt```
```
int num = Integer.parseInt(br.readLine());
```
