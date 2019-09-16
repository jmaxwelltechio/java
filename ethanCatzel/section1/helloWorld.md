
[xxx](###xxx)

[yyy](###yyy)

---


### xxx
first output

```
public class Main {
    public static void main(String[] args) {
        if (1 == 1) {
            String a = "my first program";
            System.out.println(a);
        }
    }
}
```

<!--- #################################### --->
---
<!--- #################################### --->

### yyy

reserved words: class, public, static, void, int, String

variables: hello_world, hello

blocks of code: { }

expressions: (a + 2 * 3)

array items: [5, 8]

statement: System.out.println(a);

string: ""

characters: ''



<!--- #################################### --->
---
<!--- #################################### --->


construct expressions using operators:
```
public class Main {
    public static void main(String[] args) {

        int xxx = 300;
        int yyy = 200;
        System.out.println(xxx / yyy);  // answer is 1 instead of 1.5, since they are is integer
    }

}
```


construct expressions using operators:
```
public class Main {
    public static void main(String[] args) {
        String aaa = "Hello";
        String bbb = "Hello";
        System.out.println(aaa + bbb);          // HelloHello
        System.out.println(aaa.concat(bbb));    // HelloHello
    }
}
```


comparison
```
public class Main {
    public static void main(String[] args) {
        String aaa = "Hello";
        String bbb = "Hello";
        System.out.println(aaa == bbb);         // this is actually false, because this compares memory address
        System.out.println(aaa.equals(bbb));    // correct way
    }
}
```


logical operators:
```
public class Main {
    public static void main(String[] args) {

        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);


        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
    }
}
```


java keywords

* => [here](images/Java_Keywords.png)