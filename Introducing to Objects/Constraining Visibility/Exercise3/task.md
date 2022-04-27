## Освоение IDE: "Извлечение функции"

IntelliJ IDEA разрешает извлекать повторяющий код в функцию. Выберите следующий код в первой функции:

```
if (x <= 0) {
    System.out.printf("Некорректные вводные: %s должен быть положительным", x);
    return;
}
```

- Используйте <span class="control">`Extract Function`</span> или <span class="shortcut">&shortcut:
  ExtractMethod;</span> комбинацию.
- Нажмите главное меню и выберите <span class="control">`Refactor | Extract | Function`</span>.
- Напишите новое название функции `checkArgument` и нажмите <span class="shortcut">&shortcut:EditorEnter;</span>.