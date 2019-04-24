# JavaTea

End-to-end testing framework for Java

## Getting Started

STEP 1: Create a test file named `FirstTest.javat`.
Make directories `src/test/javatea` and store the `FirstTest.javat` in it.

```
import org.junit.jupiter.api.Test;
public class FirstTest extends tea.TeaBase {
  @Test
  public void test() {
    createDriver('chrome');
    driver.get('http://www.google.com');
    #
      'name:q' = 'JavaTea'
      'name:btnK' = true
    ;
  }
}
```

STEP 2: Copy the following `pom.xml` into your machine.

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>javatea-sample</groupId>
  <artifactId>javatea-sample</artifactId>
  <version>1.0.0</version>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  </properties>

  <build>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>1.6.0</version>
        <executions>
          <execution>
            <id>javatea-execution</id>
            <goals><goal>java</goal></goals>
          </execution>
        </executions>
        <configuration>
          <includePluginDependencies>true</includePluginDependencies>
          <mainClass>tea.JavaTea</mainClass>
          <arguments>
            <argument>-i</argument>
            <argument>src/test/javat</argument>
            <argument>-o</argument>
            <argument>src/test/java</argument>
            <argument>FirstTest.javat</argument>
          </arguments>
        </configuration>
      </plugin>

      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.22.0</version>
        <configuration>
          <reportFormat>plain</reportFormat>
          <includes>
            <include>**/*Test*.java</include>
          </includes>
        </configuration>
      </plugin>

      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.6.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>

  <dependencies>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>5.4.2</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.4.2</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>1.6.0</version>
      <type>maven-plugin</type>
    </dependency>

    <dependency>
      <groupId>com.github.teafarm.javatea</groupId>
      <artifactId>javatea</artifactId>
      <version>0.0.1-SNAPSHOT</version>
    </dependency>

  </dependencies>
</project>
```

STEP 3: Download an execution file of Selenium WebDriver for Chrome.
Note that you have to choose right version according to your Brome browser installed on your machine.

* [Chrome WebDriver](http://chromedriver.chromium.org/)


STEP 4: Add two directories below into PATH and run the pom.

* Maven bin directory
* The directory where you stored the chromedriver.exe downloaded in previous step.

```
SET PATH=/apache-maven-3.6.1/bin;/webdrivers
mvn exec:java
mvn test
```

A chrome browser will be opened and search a keyword 'JavaTea' on Google.


## Documentation

* [User Guide](https://github.com/teafarm/javatea/tree/master/doc/JavaTeaUserGuide.pdf)
* [Javadoc](https://htmlpreview.github.io/?https://github.com/teafarm/javatea/blob/master/doc/api/tea/TeaBase.html)

## History
 
Version 0.0.1 (2019-04-24)
 
## Credits
 
Developer - Masayuki Otoshi
 
## License

The MIT License (MIT)

Copyright (c) 2019 Masayuki Otoshi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
