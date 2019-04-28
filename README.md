# JavaTea

End-to-end functional automation testing framework for Java


## Getting Started

### Step 1: Prerequisites

You'll need:

* [Java 1.8 or later](https://www.oracle.com/technetwork/java/javase/)
* [Maven 3.1.6 or later](https://maven.apache.org/)
* [Chrome browser](https://www.google.com/chrome/) 
* [ChromeDriver](http://chromedriver.chromium.org/) - WebDriver for Chrome

We assumed that Maven and ChromeDriver are installed in the folders below:

    /                            # Root
    ├── apache-maven-3.6.1       # Maven installation root
    │   └── ...
    │
    ├── webdrivers               # Web Drivers folder
    │   └── chromedriver.exe     # Executable file of ChromeDriver
    └── ...


### Step 2: Download sample files and store in your machine.

Download the following files:

* pom.xml(https://github.com/teafarm/javatea/tree/master/examples/GoogleSearch/pom.xml)
* GoogleSearchTest.javat(https://github.com/teafarm/javatea/tree/master/examples/GoogleSearch/src/test/GoogleSearchTest.javat)

Store the files in the following folder structure:

    .
    ├── pom.xml   # POM XML file
    └── src
         └── test
              └── javat
                   └── GoogleSearchTest.javat   # JavaTea source file


### Step 3: Compile and Run

```
C:> SET PATH=/apache-maven-3.6.1/bin;/webdrivers;C:/Windows/System32
C:> mvn exec:java
C:> mvn test
```

A chrome browser will be opened and show a Google site. And a keyword search will be executed automatically.


## Documentation

* [User Guide](https://github.com/teafarm/javatea/tree/master/doc/JavaTeaUserGuide.pdf)
* [Javadoc](https://htmlpreview.github.io/?https://github.com/teafarm/javatea/blob/master/doc/api/tea/TeaBase.html)

## History
 
Version 0.0.1 (2019-05-01)
 
## Credits
 
Developer - Masayuki Otoshi
 
## License

The MIT License (MIT)

Copyright (c) 2019 Masayuki Otoshi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
