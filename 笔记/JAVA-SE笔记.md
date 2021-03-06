# 一、环境搭建

## 1. JDK

​		目前开发常用版本为--JDK8

### 1.1 卸载JDK

1. 删除安装目录

     		2. 删除环境变量 JAVA_HOME,path中java相关内容
                   		3. cmd，输入java -version 如果现实没有相关内容，表示卸载完成



### 1.2 JDK安装

1. 记住安装路径

2. 设置环境变量

   a. 我的电脑---右键属性

   b. 环境变量设置--系统变量--添加

   ​		键： JAVA_HOME，值：jdk安装路径

   c. 系统环境变量path中新建

   ​		%JAVA_HOME%\bin

   ​         %JAVA_HOME%\jre\bin

   3. cmd输入 java -version 验证是否安装成功

   

## 2.  Hello World

   ``` java
Hello.java
    
    public class Hello{
        
        public static void main(String[] args){
            System.out.print("Hello World!");
        }
    }


Hello.java文件所在目录下运行 cmd指令
    
    1. 编译Hello.java，生成class文件 ：  javac Hello.java
    2. 运行编译后的生成的class文件 ：  java Hello
   ```



**注意事项 **：

1. 文件名与类名要保持一致

2. 注意大小写敏感

3. 要使用英文符号

   

## 3. IDE工具： IntelliJ IDEA

### 3.1 工具安装

网址：

[JetBrains: Essential tools for software developers and teams](https://www.jetbrains.com/)



注意： 

选择路径后，勾选64位快捷方式和java



### 3.2 快捷键

1. psvm  ----可快速输入  public static void main(){}的主函数模板
2. sout ----可快速输入  System.out.print()
3. ctrl+D----复制当前行的内容到下一行



# 二、 JAVA 基础语法

## 1. 数据类型

java是强数据类型语言，所有变量都需要提前声明，然后才可以使用。

java的数据类型分为基本类型和引用类型。

例如：

``` java
//强数据类型语言中，变量一定要先声明，然后才可以使用

string name="我是字符型变量name的值";
//string类型属于引用类型。

```



### 1.1 八大基础类型

``` java
int num1=10;
byte num2=20;
short num3=30;
long num4=40L;  //long类型的变量值需要在最后加L

char name='中';  //char占2个byte，1个中文汉字占2个byte，所以1个char只能存储1个汉字

float num5= 10.2F; //float类型的变量值，需要在末尾加上F
double num6=3.141567873388732827339;

boolean flag=true;  //boolean布尔型变量的值只能是 true或者false

```



### 1.2 扩展知识

  #### 1.2.1 整数扩展

二进制：0b开头

八进制：0开头

十进制：

十六进制：0x开头



### 1.3 数据类型转换

#### 1.3.1 说明

数据类型的等级/容量，由低到高排列如下：

byte，short, char---int---long---float---double



等级/容量  由高级转为低级，就要强制转换。

反之，从低级转为高级，则系统会自动转换完成。



强制转换，由于是从高容量转到低容量，容易出现内存溢出，或精度不准确等问题。

**布尔类型的值，不能进行转换！**



#### 1.3.2 强制转换

把容量/等级 高的类型，转成 容量/等级 低的类型时，就是强制转换。

强制转换需要在被转换的变量前用（）标明要转成的目标类型。



例如：

``` java
/*
把等级高的int转成等级低的byte类型，
由于byte最大值为127，但是num1的值是128，此时就会造成内存溢出
*/
int num1=128;
byte num2=(byte)num1;

System.out.println(num1);
System.out.println(num2); //会变成 -128，内存溢出。


/*
把等级高的float类型，转成int类型，就会造成精度不准确的问题。
float类型的变量值 3.14转成int类型后，会变成3
*/

float num3=3.14f;
int num4=(int)num3;

System.out.println(num3);
System.out.println(num4); //会变成3，精度不准。


```



#### 1.3.3 自动转换

当把容量/等级 低的类型，转成 容量/等级 高的类型时，由于高等级的类型兼容性/容量更大，能够兼容低等级的类型，所以，无须强制转换，系统会自动转换。



#### 1.3.4 注意

计算大数字时，要留意数据类型的最大值，如果运算结果超出最大值，会造成内存溢出。

```java
int n1=10_0000_0000; //JDK7新特性，可以用下划线区分数字，易于读。
int n2=20;

//n1 X n2,的结果是200亿，会大于int类型最大值21亿，会内存溢出。
int n3=n1*n2;
System.out.println(n3);

//由于先计算结果然后才会赋值给变量，所以下面也会溢出
long n4=n1*n2;
System.out.println(n4);

//先进行类型转换，然后计算，再赋值给变量，才会正常
long n5=(long)n1*n2;
System.out.println(n5);
```

## 2. 变量

#### 2.1 变量声明

Java是强类型语言，所有变量都需要先声明其类型。

变量一般包含： 变量类型、变量名、变量的作用域

声明变量要注意命名规范，并已英文的分号结尾。

例如：

```java
int num1=10;
char c='a';
String name="andy";
```



#### 2.2 变量作用域

变量作用域分为三类： 类变量、实例变量、局部变量。

变量默认值：

 1. 数值型： 0 或者 0.0 

 2. 布尔型：false

 3. **除了基础数据类型意外，其余类型数据默认值均为null**

    

``` java
public class Hello{
    
    //类变量，前面加static
    static int snum=100;
    
    //实例变量，可以不初始化。会有默认值
    String name;  // string类型默认值为 null
    int age; //数值类型的默认值为0或者0.0，分别对应整数和浮点数
    
    public static void main(String[] args){
        //局部变量，声明时必须初始化（赋值）才能使用，只能在方法内部使用
        int i=10;
        System.out.println(i);
        
        //实例变量使用方法
        Hello h=new Hello(); //1. 实例化类
        System.out.println(h.name);
        System.out.println(h.age);
        
        //类变量在类内可以直接调用
        System.out.println(snum);
    }
}
```

#### 2. 3. 常量

常量是初始化以后就不能改变的特殊变量，通常以大写字母来声明，且要加修饰符final

```java
//声明一个常量
final double PI=3.14;
```

#### 2.4. 命名规范

所有的命名都要求简明，符合字面意思，做到见名知意。

1. 类成员变量命名： 首字母小写+驼峰原则。 例如：lastName，monthSalary
2. 局部变量命名：同上
3. 常亮命名：全部大写字母，可以加下划线。 例如: JAVA_HOME, PI
4. 类名：首字母大写 + 驼峰原则。 例如：Demo4， GoodStudent
5. 方法名： 首字母小写 + 驼峰原则。 例如： run()， handsUp()



### 3. 运算符

算数运算符： + 、 - 、 * 、 / 、  % 、 ++ 、 --

赋值运算符： =      例： a=10； 把10赋值给a

关系运算符：> ,  < ,   >= ,  <= , == ， != ,  instance of

逻辑运算符：&& ,  || ,  !   (与、或、非) 

---

位运算符：& , | , ^ , ~ , >> , << , >>>   （不常用，仅做了解）

条件运算符：   ？ ：  （偷懒用法）

扩展复制运算符： += , -= , *= , /=  （偷懒用法）



#### 3.1 二元运算符

+,-,*,/这种只对两个数进行运算的，叫二元运算符。

进行除法运算（/）时，最好使用float或者double类型，而非 int类型，避免出现精度问题。

``` java
int a=10;
int b=20;

System.out.println(a/b);  //系统输出结果为 0 ，明显出现了精度问题。
//两个int类型的值做除法，结果还是int类型，导致运算出来的结果0.5被强制转为int类型的 0 ；
//做除法最好使用float或者double类型

System.out.println((float)a/b); //输出结果正确， 0.5
    
```



**扩展：**

​		long、int、short、char类型进行运算时，如果long参与，那么结果就是long类型。

​		如果没有long类型的值参与运算，那么运算结果就都是int类型。



####  3.2 关系运算符

​		关系运算符用于比较，返回的结果为布尔值，只有 是、否 两个结果。

​		

#### 3.3 一元运算符

一元运算符 ++（自增） ，  --（自减）；

```
/*
a++和 ++a都是 对变量a执行+1操作：
	b=a++：先把a原有的值赋值给b，然后a执行+1操作。
	b=++a：a先执行+1操作，然后把最新的结果赋值给b。
*/	

    public static void main(String[] args) {
        int a=3;
        int b=a++;  // 把a的变量值3赋给b，然后a执行+1操作，变成4。a=4，b=3.
        int c=++a;  // a（值是4）先执行+1操作变成5，然后把5赋值给c。 a=5, c=5

        System.out.println(a); //a经过2次自增，由3变5
        System.out.println(b); //b被赋值为a最初的变量值3
        System.out.println(c); //c被赋值为a经过两次+1的结果5
    }
```

#### 3.4 逻辑运算

逻辑与（&&）--- AND ：  a &&b , 只有当 a与b都为true时，结果才为true。

逻辑或（||）--- OR：  a || b , 当 a 或 b 其中一个为 true时，结果就为 true。

逻辑非（！）---取反： !(a&&b), 取反值，当 a&&b为true时，结果为 false，反之为true。



​      **扩展**：短路运算

​					a && b ,当 a的值为false时，系统即可直接判断结果为false，后面b的表达式不会执行运算。



#### 3.5 位运算符（二进制相关）

```
按二进制的位进行与或非等操作

A= 0011 1100
B= 0000 1101

按位与： A & B = 0000 1100 --------AB两个数字对应的位上都为1时，结果为1，否则为0.
按位或： A | B = 0011 1101 --------AB两个数字对应的位上只要有一个为1，结果就为1，否则为0.
按位异或：A ^ B= 0011 0001 ---------AB两个数字对应的位上，数字相同结果为0，不同则为1.
按位取反： ~B  = 1111 0010 ---------数字对应位的反值.

扩展面试题：如何最快速计算2X8的结果？答案是使用位运算符左移： 2<<3

         /*
              二进制数     -----    十进制数
            0000 0000    ------      0
            0000 0001    ------      1
            0000 0010    ------      2
            0000 0011    ------      3
            0000 0100    ------      4
            0000 1000    ------      8
            0001 0000    ------      16

            二进制中，1每向左移动1位，相当于 乘以 2。 每向右移动1位，相当于 除以 2.
            所以 向左位移 <<  ==X2， 向右位移 >>  ==/2

            因为2x8可以分解为 1X2X2X2，即二进制中的向左位移3次： 2<<3
            最终结果为16。
          */
```

#### 3.6 扩展运算符

	##### 3.6.1 自增自减

+= 自增、-=自减

```
a+=b ------  a = a+b
a-=b ------ a = a-b
```

##### 3.6.2 字符串连接符

```
/*
字符串连接符号：
面试题扩展： 关于字符串连接符“ + ”
    加号可用于连接变量值与字符串，有拼接效果。
    需要注意字符串所处位置不同，结果不同。
 */
System.out.println(""+a+b); // 字符串在最前面，a+b不执行加法运算，直接输出 1020
System.out.println(a+b+""); // 字符串在最后面，字符串前面的 a+b执行加法运算，输出 30
System.out.println(a+b+""+c+a);// 字符串在中间，字符串前面的运算可执行，字符串后的运算不执行，输出 303010
```

##### 3.6.3 三元运算符

```
/*
三元运算符
X?Y:Z ----如果X为true，结果为Y，否则结果为Z
 */
int score=79;
String pingfen =score >60?"及格":"不及格"; //如果score大于60，想变量pingfen赋值“及格”，如果不大于60，则赋值“不及格”

System.out.println(pingfen);
```

 

#### 3.7 扩展

JAVA中很多的运算都可以借助**工具类**来实现。

例如： 现实中的幂运算 2^3=2X2X2=8，这种幂运算在java中不能直接用 2^3来写。

​			需要借助工具类 Math来实现。

``` java
//java中的幂运算，可借助工具类Math实现
System.out.println(Math.pow(2,3));  //输出结果为2的3次方，8.
```



### 4. 包机制

###  5. javaDos





## 三、JAVA 流程控制

### 1. Scanner用户交互类

java.util.Scanner类，可以获取用户输入，是jdk5新特性。

基础语法：

``` java
import java.util.Scanner;

Scanner s=new Scanner(System.in);
//使用hasNext()或hasNextLine()方法判断是否存在用户输入
//使用next()或nextLine()方法获取用户输入
if(s.hasNext()){
    String content=s.next();
    System.out.print(content);
}
//Scanner使用完毕后，要关闭IO流。
s.close();
```

**nextLine()方法与 next()使用方法相同，但有如下区别：**

1. next()方法获取输入是，以用户输入的有效内容最后的空格符作为结束标志，返回空格符前的所有内容，不接收空格符。
2. nextLine()方法以用户输入有效内容中的回车符作为结束标志，返回回车符前所有数据，可以接收空格符。

还有很多与nextLine()类似的方法，以获取对应类型的数据： nextInt()、nextFloat()、nextDouble()等等



**注意：一定要在所有的scanner全部使用完毕后，再关闭。 不然会 java.util.NoSuchElementException错误。**



### 2. 选择结构

#### 2.1 if单选结构

 当if结构中的布尔表达式为true时，就执行if中的代码。

``` java

if(a<b){
    System.out.print("a大于b");
}
```

#### 2.2 if双选结构

```java
if(score>60){
    System.out.println("你及格了");
}else{
    System.out.println("你不及格");
}
```

#### 2.3  if--else if 多选

#### 2.4  if嵌套

#### 2.5 switch结构

JDK7新增支持字符串表达式（根本原理就是比较字符串的hash值）

``` java
String name="京东";

switch(name){
    case "苏宁":
        System.out.print("suning");
        break;
    case "京东":
        System.out.print("JD");
        break;
    case "国美":
        System.out.print("Gome");
        break;
    default:
        System.out.print("没有匹配的内容");
}
```

每个case后面如果不加break；就会出现**case穿透**bug，case后面所有的语句都将执行。

### 3. 循环结构

#### 3.1 while循环

**while循环：先判断，后执行。如条件不成立，不执行循环代码**

```
//只要条件表达式不为false，while循环会一直执行。
//应避免出现死循环（一直循环不停）
```

```
//用while循环计算1+2+3+4+.....100的结果

int i=0;
int sum=0;

while(i<=100){
    sum=sum+i;
    i++;
}
System.out.println("结果是："+sum);
```

#### 3.2 do...while循环

**do...while循环：先执行一次，然后判断条件是否成立，来决定是否继续执行。**

```java
int a=0;
do{
    System.out.println("a");//先执行一次，然后在判断while条件，因条件不成立，停止执行。
}while(a>0);
```

#### 3.3 for循环

快捷键： 100.for---快速搭建从0到100的for循环结构体

```java
/*
for循环联系3：
99乘法表
 */

for (int j = 1; j <= 9; j++) {

    for (int i = 1; i <= j; i++) {

        System.out.print(i+" X "+j+" = "+(i*j)+"\t"); //打印乘法表

    }
    System.out.print("\n");  //输出换行符，调整最终样式

}
```

#### 3.4 增强for循环

JDK5新特性，主要用于循环遍历数组或集合。

``` java
int[] num={10,20,30,40};
for(int i:num){//i必须指定数据类型
    System.out.print(i);
}
```



## 四、JAVA方法

方法类似于其他语言中的函数，就是由一个由多行代码组成，用于实现某个指定功能的代码块。

方法设计时应注意方法的原子性，即每个方法只用于实现一个功能。

### 1. 方法的定义

一个方法大体由一下几个部分组成：

1. 修饰符：public 、static、final等等等。是可选项，非必须。
2. 返回值类型： int、String、float等等数据类型。如果没有返回值，则写void
3. 方法名：需要遵循命名规则--小写字母开头 + 驼峰原则，例如： myFirstMethod（）
4. 参数类型及参数名： 参数为可选项。方法的参数分为两种： 形参和实参。
   1. 形参： 在定义方法时，写在方法名后面（）中，用户方法内调用的参数。
   2. 实参： 在外部调用该方法时，向方法传递的实际需要运算的参数。



``` java
public int addNumber(int a, int b){  //a 、b 为形参
    return(a+b); //return不但可以返回值，还会结束符方法的运行
}

//调用方法
int sum=addNumber(33,22); //33，22为实参
```



### 2. 方法的重载（overload）

在同一个类中，存在多个**同名，但是参数不同的**方法时，这种存在形式就成为方法的重载。

重载的方法参数的不同可以表现在 **参数个数不同、参数类型不同、甚至是排列顺序不同。**



重载是JAVA中多态性的一种表现。表现的是在同一个类中的多态性。



### 3. 可变参数

```java
/*
可变参数：
可以向方法传递一个同类型的、不确定个数的参数。
可变参数必须放在参数列表的最后。
一个方法只允许有一个可变参数
 */
 
    Demo3 demo3 = new Demo3();
        demo3.selectMax(1,2,3,4);
        demo3.selectMax(6,2,23,4);
        demo3.selectMax(199,33,53,49);

 
 public void selectMax(int... i){
        //可变参数的本质是一个数组
        int j=0;
        for(j=0; j<i.length; j++){
            System.out.println("i["+j+"]="+i[j]);
        }
    }
```

### 4. 递归（重要概念）

递归就是方法调用方法自身，只适用于循环调用层次较浅的计算，否则容易内存溢出。

递归需要包含两部分：

1. 递归头：规定什么时候停止调用自身。 没有递归头将会死循环。
2. 递归体：什么时候调用自身。

```java
//实现阶乘的递归算法： 3的阶乘就是 3X2X1，以此类推

public int f(int n){
    if(n==1){
        return 1;  //1的阶乘为1，直接返回结果（递归头）
    }else{
        return n*f(n-1);  //递归体
    }
}
```

## 五、 数组

1. 数组是 **同一类型的**数据的 **有序**排列的集合。
2. 数组需要通过声明后，才可以使用。
3. 数组长度是固定的，声明后不可改变大小。

#### 1. 声明方式：

数据类型[]   变量名 = new 数据类型 [ 数组大小 ]

``` java
int[] nums=new int[10]; //定义了一个长度为10的数组。
```



给数组赋值： 可通过数组的下标，来访问数组内的元素

``` java
nums[0]=1; //赋予数组元素的值要符合数组定义时候声明的数据类型。
```

``` java
 /*
        数组：
        多个同一数据类型的有序排列的集合。
         */

        int[] nums=new int[10];//声明了一个int类型，长度为10的数组。

        //可以根据数组元素的下标志来进行访问
        nums[0]=1; //数组下标从0开始
        nums[1]=2;
        nums[2]=3;
        //数组元素如果没有赋值，其默认值与数据类型的默认值一致。
        
        //System.out.println(nums.length); //通过数组的.length属性可以获取数据的长度

        //通过增强型for循环，可以方便的遍历数组
        for (int x:nums){//x必须指定数据类型
            System.out.println(x);
        }
```

#### 2. 声明方式

##### 2.1 静态声明

静态声明的数组，声明和赋值是同时进行的。完成后的数组固定大小，不能改变。

``` java
int[] nums1={1,2,3,4,5};
```



##### 2.2 动态声明

动态声明可以搭配JAVA内存机制进行理解

``` java
int[] nums2=new int(5); //此时已经在内存的栈中声明了数组，且在堆中开辟了相应大小的空间。但是并未赋值，此时每个数组元素的默认值都是int的默认值：0；
nums2[0]=1;
nums2[1]=2; //赋值。


//还有另一种写法

int[] c; //内存栈中存放c
c=new int[5];//内存堆中开辟空间
c[o]=1;//给元素赋值

```

#### 3. 数组边界

数组下标值是0到数组长度-1。

int[] a={1,2,3,4,5};//数组的长度是5；

数组a的下标是从0开始到4。

如果试图访问 a[5],就会触发数组下标越界错误。ArrayIndexOutOfBoundsExceptions



#### 4. 数组的使用

1. for循环操作数组
2. for增强型，通常用于打印数组元素内容
3. 数组作为参数
4. 数组作为返回值

#### 5. 多维数组

数组嵌套数组

``` java
int[][] nums={{1,2},{3,4},{5,6}};  //二维数组
/*
如果需要读取第一个数组元素中的第二个值： nums[0][1];
*/

        //打印所有数组元素
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("nums["+i+"]["+j+"]="+nums[i][j]);
            }
        }

```

#### 6. 官方数组工具类：Arrays类

官方提供了很多常用的方法，可以直接调用，具体可查看官方文档。（java.util.arrays）

``` java
import java.util.Arrays; //导入工具类包

int[] nums={34,786,1,0,6546,234234,23};
System.out.println(Arrays.toString(nums)); //调用Arrays工具类的toString方法显示数组元素。
```



#### 7. 冒泡排序（八大排序之一）

原理：每次都对比数组中相邻的两个元素，比较大小。每次都能产生一个较大的数字，并交换元素的位置。

```
/**
 * 冒泡排序
 * @param myArrays
 * @return
 {1,3,2,0,5}
 */
public static int[] mySort(int[] myArrays){
    int tmp=0;//用于交换数组元素时，存放临时数据。
    //外层循环控制冒泡排序比较的次数
    for (int i = 0; i < myArrays.length-1; i++) {
        for (int j = 0; j < myArrays.length-1-i; j++) { //每次比较，都会产生一个较大的数，以后就不用去比较了，所以减i
            //比较相邻的两个元素，如果后面的元素比前面的大，则交换位置。（降序排列，如升序则相反）
            if(myArrays[j+1]>myArrays[j]){
                tmp=myArrays[j];
                myArrays[j]=myArrays[j+1];
                myArrays[j+1]=tmp;
            }
        }
    }
    return myArrays;
}
```

#### 8. 压缩数组---稀疏数组

当一个数组中存在很多相同的值时，可以考虑使用压缩数组，即在一个数组中记录下原数组的行数、列数、以及有效值的个数，同时标记处有效值所在的行数、列数和具体值。



例如：保存五子棋棋局

​		棋盘可以理解为一个11行，11列的二维数组，无子格用0表示，黑棋用1表示，白棋用2表示。

![image-20201208102941264](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201208102941264.png)

​		此时，数组中有大量的相同值0，此时就可以用稀疏数组来进行压缩。

​        稀疏数组工作原理如下：新建数组，记录原数组中的相关信息（几行几列，每个有效值在什么位置等）

​        ![image-20201208103121440](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201208103121440.png)



## 六、面向对象编程（OOP）

### 1. 面向过程与面向对象

面向对象是以类的方式组织代码，以对象的形式封装数据，具体实现细节上使用面向过程的按顺序执行方式实现。



### 2. 类与对象的关系

1. 类是一种抽象的数据类型，是对 **某一类**事物的描述，是模板，不代表具体的内容。
2. 对象就是类的具体实例，例如小明是 "人"类的一个实例。
3. 类实例化后，就会返回一个对象。

``` java
//声明一个类
public class Student{
    //每个类中都有属性和方法
    
    String name; //属性
    int age;
    
    //给学生类定义一个方法叫学习
    public void study(){
        System.out.print(this.name+"正在学习");
    }
}

//实例化类,类实例化后会返回一个对象
Student xm=new Student();
xm.name="小明";
xm.age=18;
//调用学习方法
xm.study(); //输出 小明正在学习
```

### 3. 构造方法

使用new关键字实例化类，其本质就是调用类的构造方法。构造方法的主要作用之一，就是给类的实例化对象的属性一个初始的默认值。

每个类都有一个默认的构造方法（无参数构造方法）。

还可以定义带参数的构造函数， **如果定义了有参数的构造方法，那么无参数的构造方法一定要显式定义**



**构造方法是一个与类名相同的，没有返回值（也不写void）的方法**



快捷键： alt + insert ---> constructor  --------------快速生成构造方法



``` java
public class Student{
    String name;
    
    public Student(){
        //无参数构造方法
        this.name="默认名字";
    }
    
    public Student(String name){
        this.name=name;//用参数name给实例化对象的name属性赋值。
    }
}
```

### 4. 创建对象时的内存分析

![image-20201208152746358](C:\Users\h\Desktop\java\studyJAVA\笔记\img\image-20201208152746358.png)

### 5. 封装

1. 程序设计要求： 高内聚，低耦合。即类内部数据的操作细节在自己内部完成，不由外部干涉。 仅暴露少量必要的的接口提供给外部调用。
2. 属性私有化： private。 private修饰的属性不能直接使用   对象.属性名的方式操作，需要在类内定义set/get方法，供外部操作使用。
3. alt+insert---setter and getter ----------> 快速创建 set/get方法



```java
public class Student {
    /*
    类的封装：
      1. 高内聚、低耦合。 数据操作在类内完成，不由外部干涉。仅暴露少量必要的接口给外部调用。
      2. 属性私有化（private）,属性的赋值与获取均交由公共方法get/set实现，不能直接 对象.属性名来操纵。
     */
    private String name;
    private int age;
    
    //快捷键 alt+ insert 可以快速生成 set/get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //可以在方法内部增加数据合法性验证
        if(age>120 || age<0){
            this.age =3;
        }else{
            this.age = age;
        }
    }
}

///////////////实例化调用/////////////////////

public static void main(String[] args) {
        //实例化Student类的对象
        Student s1 = new Student();
        /*
        由于Student中属性是私有的，所以不能使用 s1.name   s1.age等形式操作.
        要调用类内定义的set/get方法来操作属性
         */
        s1.setName("Andy");//setName()方法，设置s1的属性值。
        s1.setAge(35);

        System.out.println(s1.getName());//getName()方法，获取属性值
        System.out.println(s1.getAge());

    }
```

### 6. 继承 extends

继承本质上是对 **一批类**的抽象，以更好的实现对现实世界的建模。

类与类之间的关系除了继承还有 依赖、组合、聚合等多种。

继承关系的两个类中，一个是父类（基类），一个是子类（派生类），子类继承父类用关键字 **extends**表示。

**JAVA中只有单继承，没有多继承**  --------一个儿子只有一个亲生父亲，一个父亲可能有多个儿子。

``` java
public class Person{
    //父类中有一个sleep()方法
    public void sleep(){
        System.out.print("睡觉了");
    }
}

//子类继承父类
public class ChineseMan extends Person{
   
}

public class App{ //任何类都默认继承object类
    
    public static void main(String[] args){
        
        //实例化chineseMan类
        ChineseMan cm=new ChineseMan(){
            //子类中并未声明sleep()方法，但是因为继承于Person类，所以也可以直接调用sleep方法 
            cm.sleep();
        }
    }
    
}
```

### 7. 重写 （override）

重写是JAVA中多态的一种表现类型（重载也是一种），表现的是在**有继承关系**的两个类中存在的多态性。

可以简单理解为： 

​		当子类从父类那里继承来的方法不能满足子类需求是，子类可以往里面添加一些功能，对方法进行扩充。

​		子类的对象使用这种方法时，将调用**子类中的**定义，对它而言，父类中的定义如同被"屏蔽"了。



简单举例：

​		动物类（Animal），派生出了鸡(Chicken)和狗(Dog)两个子类，相对于动物类中的 "叫"shout() 这个方法，鸡的叫方法是“啼叫()”，而狗的叫方法是“吠叫()”。



``` java
 /*
    重写父类的方法： alt + insert ---overridemethod

    在进行方法重写的时候需要遵循以下规则才能实现方法重写：
    1. 子类方法的参数列表必须和父类中被重写的方法的参数列表相同（参数个数和参数类型），否则只能实现方法的重载。
    2. 子类方法的返回值类型必须和父类中被重写的方法返回值类型相同，否则只能实现方法重载。
    3. 在Java规定，子类方法的访问权限不能比父类中被重写的方法的访问权限更小，必须大于或等于父类的访问权限。
    4. 在重写的过程中，如果父类中被重写的方法抛出异常，则子类中的方法也要抛出异常。但是抛出的异常也有一定的约束--->子类不能抛出比父类更多的异常，只能抛出比父类更小的异常，或者不抛出异常。
       例如：父类方法抛出Exception，那么子类就只能抛出IOException或者抛出比Exception小的异常或者不抛出异常。

     */

class Animal{
    public void shout(){
        System.out.print("Animal shout!");
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.print("Dog's shout...");
    }
}

class Chicken extends Animal{
    public void shout(){
        System.out.print("Chicken's shout...");
    }
}
```



---

重载与重写都是java中多态性的表现，区别如下：



　**重载与重写的区别:**

| **区别点**     | **重载**                           | **重写（覆写）**                       |
| -------------- | ---------------------------------- | -------------------------------------- |
| 英文           | Overloading                        | Overiding                              |
| 定义           | 方法名称相同，参数的类型或个数不同 | 方法名称、参数类型、返回值类型全部相同 |
| 对权限没有要求 | 被重写的方法不能拥有更严格的权限   |                                        |
| 范围           | 发生在一个类中                     | 发生在继承类中                         |



### 8. 抽象类（abstract）

加 abstract关键字的类，叫抽象类，加abstract的方法叫做抽象方法（抽象方法只有方法名，没有方法体）。

抽象类中的方法只作为约束，没有具体实现代码， **不能new抽象类的实例，必须通过子类继承抽象类**然后才能实现相应的功能。



### 9. 接口（interface）

接口就是定义实现的规则，就是约束。使用interface关键字声明接口，而非 class。

``` java
public interface UserService{
    //接口中的方法也只制定规则，不具体实现。
    //接口中定义的都是默认public abstract的
    public abstract void addUser(String name);
    public abstract void delUser(String name);
}

/*
* 接口的实现类，要使用 implements关键字，一个实现类可以同时实现多个接口。
* 实现类的命名，一般再结尾处加上 Impl 以便标识。
*/
public class UserServiceImpl implements UserService{
    
    /*
    实现类中 必须 实现接口类的所有方法
     */
    @Override
    public void addUser(String name) {

    }

    @Override
    public void delUser(String name) {

    }
    
}

```

## 七、 异常机制

异常基本可以分为： 检查性异常、运行时异常和错误。

java中的异常处理框架可以抛出异常、捕获异常，用以处理程序中可能会出现的问题。



快捷键： 选中需要抛出异常的代码， ctrl + alt + t ，可快速包裹上try...catch异常处理结构。



``` java
int a=1; b=0;

try{
    System.out.print(a/b) //因为被除数不能为0，所以这里可以监控一下，如果为0出现异常时，异常就会被catch捕获
}catch(Exception e){
    //此处当捕获到异常时，会执行。
}finally{
    //不管有无异常，finally都会被执行，非必须。
}
```



可以用多个catch来捕获多个异常，catch异常时要注意异常的范围大小顺序，范围最大的写最后。

 **建议在最后catch一个 Exception**，避免漏掉异常。





### 自定义异常

不常用，扩展知识。





# 日积月累

### 英文单词

operator: 运算符

cast：转换

struct：结构、结构体

terminate: （使）停止、终止

odd number： 奇数

even number：偶数

inherit：继承

implements：实现、实施、执行





### IDEA快捷键

1. alt + 回车-------如果代码有错误（红色波浪线标出的），可以有提示信息。

2. psvm  ----可快速输入  public static void main(){}的主函数模板

3. sout ----可快速输入  System.out.print()

4. ctrl+D----复制当前行的内容到下一行

5. alt + insert ---> constructor  --------------快速生成构造方法

6. alt+insert--->setter and getter ---------- 快速创建 set/get方法

7. alt+insert--->overridemethod ---------- 重写父类的方法

8. ctrl + h  -----打开类的继承结构树

9.  ctrl + alt + t  ----------给代码包裹各种结构体

   

### 编程小知识

	1. long、int、short、char类型进行运算时，如果long参与，那么结果就是long类型。如果没有long类型的值参与运算，那么运算结果就都是int类型。
 	2. static 、final 等修饰符，可以不分先后顺序。
 	3. 计算大数字时，要留意数据类型的最大值，如果运算结果超出最大值，会造成内存溢出。（例如int类型最大是2147483647）
 	4. JAVA中很多计算都可以使用工具类来快速实现，例如幂运算，可以使用Math.pow()方法快速实现。
      	5. 按住Ctrl并点击类名，可以打开该类，浏览详细代码。
       	6. java内存分析
       	7. 稀疏数组
       	8. 冒泡排序



### 面试题

1. 如何最快速计算2X8的结果？答案是：使用位运算符左移： 2<<3

```JAVA
     /*
          二进制数     -----    十进制数
        0000 0000    ------      0
        0000 0001    ------      1
        0000 0010    ------      2
        0000 0011    ------      3
        0000 0100    ------      4
        0000 1000    ------      8
        0001 0000    ------      16

        二进制中，1每向左移动1位，相当于 乘以 2。 每向右移动1位，相当于 除以 2.
        所以 向左位移 <<  ==X2， 向右位移 >>  ==/2

        因为2x8可以分解为 1X2X2X2，即二进制中的向左位移3次： 2<<3
        最终结果为16。
      */
```
2. 关于字符串连接符“ + ”

   ```JAVA
     /* 加号可用于连接变量值与字符串，有拼接效果。
       需要注意字符串所处位置不同，结果不同。
    */
   System.out.println(""+a+b); // 字符串在最前面，a+b不执行加法运算，直接输出 1020
   System.out.println(a+b+""); // 字符串在最后面，字符串前面的 a+b执行加法运算，输出 30
   System.out.println(a+b+""+c+a);// 字符串在中间，字符串前面的运算可执行，字符串后的运算不执行，输出 303010
   ```

   i