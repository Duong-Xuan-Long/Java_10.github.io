# Java_10.github.ioko
phân biệt a++ và ++a

TH1:
```java 
int a =1;
a++;
System.out.println(a);
```
thì a sẽ cho kết quả bằng 1 tương tự với ++a;

TH2:khi gán biến 

```java
int a=1;
int b=++a;
int c=a++;
System.out.println(b);
System.out.println(c);
```
trong TH này b sẽ nhận giá trị của a sau khi a tăng giá trị là 2
nên có kết quả là 2,còn c thì sẽ nhận giá trị của a trước khi tăng là 1 nên có giá trị là 1 còn a sau đó mới tăng lên 2  