## Освоение IDE: Анализируем Stacktrace

Для нахождение дефекта через исключения после запуска программы - используйте 
<span class="control">`Analyze stacktrace`</span>:

```text
Exception in thread "main" java.lang.IllegalStateException: Что-то пошло не так
	at Task.foo(Task.java:8)
	at Task.bar(Task.java:12)
	at Task.main(Task.java:4)
```
