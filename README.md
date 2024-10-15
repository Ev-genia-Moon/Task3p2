# Testability. Введение в ООП

## Цель задания

1. Написать свои сервисные классы.
2. Научиться писать многофайловую программу.

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода Intellij Idea Community Version.
2. Откройте IDEA и создайте новый Java-проект. Под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии.
3. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта, а не с какой-либо другой.
4. Правильно настройте репозиторий в плане .gitignore. Проигнорируйте папки .idea и out и .iml-файл — их в репозитории быть не должно.
5. Выполните в IDEA требуемую задачу согласно условию.
6. Проверьте соблюдение правил форматирования кода.
7. Закоммитьте и отправьте в репозиторий содержимое папки проекта.

## Задание 1 

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать приложение для расчёта миль. Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются.

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс BonusMilesService: File -> New -> Java Class, вводите название и нажимаете Enter.

Определите в нём метод calculate, который:

принимает на вход один параметр: цену билета, типа int;
анализируя значение переданного параметра, возвращает рассчитанное количество миль.

<b>Разместите следующий код в классе Main:

  public class Main {  
  
      public static void main(String[] args) {  
      
          BonusMilesService service = new BonusMilesService();  
          
          int price = 10_000;  
          
          int miles = service.calculate(price); // должно получиться 500  
          
          System.out.println(miles);  
          
      }  
      
  }  
  
</b>

Убедитесь, что выводимое в консоль значение соответствует логике расчёта бонуса. Проверьте на разных примерах.

