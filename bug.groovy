```groovy
def someMethod() {
  def list = [1, 2, 3, null, 5]
  list.each { println it * 2 }
}

someMethod()
```