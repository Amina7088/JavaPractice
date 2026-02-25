error id: file:///C:/Users/User/OneDrive/school/2/B/Buteelt/code/lab2/f.csa311.25b-lab02/java/src/main/java/edu/cmu/cs/cs214/lab02/Main.java:_empty_/Shape#
file:///C:/Users/User/OneDrive/school/2/B/Buteelt/code/lab2/f.csa311.25b-lab02/java/src/main/java/edu/cmu/cs/cs214/lab02/Main.java
empty definition using pc, found symbol in pc: _empty_/Shape#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 201
uri: file:///C:/Users/User/OneDrive/school/2/B/Buteelt/code/lab2/f.csa311.25b-lab02/java/src/main/java/edu/cmu/cs/cs214/lab02/Main.java
text:
```scala
package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        @@Shape circle = new Circle(5);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer1 = new Renderer(circle);
        renderer.draw();
        renderer1.draw();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Shape#