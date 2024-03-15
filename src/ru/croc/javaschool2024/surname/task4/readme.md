# Задача 4. Удаление комментариев

В текстах программ на Java могут использоваться многострочные (/* ... */) и однострочные (// ...) комментарии. Реализовать метод, принимающий на вход строковую переменную - исходный текст программы на Java, вырезающий из этой строки все комментарии и возвращающий результат в виде строки.
```
public static void main(String[] args) {
  String source = “...”; // test data
  String noComments = removeJavaComments(source);
  System.out.println(noComments);
}

```
Пример
```
/*
 * My first ever program in Java!
 */
class Hello { // class body starts here 
  
  /* main method */
  public static void main(String[] args/* we put command line arguments here*/) {
    // this line prints my first greeting to the screen
    System.out.println("Hi!"); // :)
  }
} // the end
// to be continued...
```

Результат
```

class Hello { 
  
  
  public static void main(String[] args) {
    
    System.out.println("Hi!"); 
  }
} 

``` 
