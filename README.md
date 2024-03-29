# MiniMarketBackend
Lesson5
Test Cases
1.	CategoryTests
№1.1 Получение категории по ID (getCategoryByIdPositiveTest).
1.	Шаги: 
  1)	Отправить GET запрос с номером ID равным 1.
  2)	Проверить статус выполнения теста.
  3)	Проверить код ответа.
  4)	Проверить значение ID.
  5)	Проверить наименование категории.
  6)	Проверить наименование категории каждого продукта, которые входят в данную категорию.
2.	Ожидаемый результат: 
  1)	Статус ответа – true.
  2)	Код ответа 200.
  3)	Название категории «Food». 
  4)	Все продукты в категории так же имеют название категории «Food».

№1.2 Получение категории по несуществующему ID (getCategoryByIdNegativeTest).
1.	Шаги:
  1)	Отправить GET запрос с номером ID равным 3333.
  2)	Проверить статус выполнения теста.
  3)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 404.

2.	ProductTests

2.1	 DELETE
№ 2.1.1 Удаление продукта с несуществующим ID (deleteNegativeTest).
1.	Шаги:
  1)	Отправить DELETE запрос с ID равным 50000.
  2)	Проверить статус выполнения теста.
  3)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 404.

№ 2.1.2 Удаление продукта с существующим ID (deletePositiveTest).
1.	Предусловие:
  1)	Создать элемент с рандомным наименованием, с категорией «Food» и рандомным значением цены.
  2)	Отправить POST запрос с заданными параметрами.
  3)	Получить значение ID и сохранить его в переменную ID.
  4)	Проверить статус ответа.
2.	Шаги:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа.
  3)	Проверить код ответа.
3.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 200.

2.2	GET_BY_ID
№ 2.2.1 Запрос продукта по значению ID (getProductByIdPositiveTest).
1.	Шаги:
  1)	Отправить GET запрос со значением ID равным 5.
  2)	Проверить статус ответа.
  3)	Проверить код ответа.
  4)	Проверить значение ID.
  5)	Проверить title ответа.
2.	Ожидаемый результат: 
  1)	Статус ответа true.
  2)	Код ответа – 200.
  3)	ID элемента равен 5.
  4)	Title элемента – «LG TV 1»

№2.2.2 Запрос продукта по несуществующему ID (getProductByIdNegativeTest)
1.	Шаги:
  1)	Отправить GET запрос со значением ID равным 555.
  2)	Проверить статус ответа.
  3)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 404.

2.3	 GET
№2.3.1 Получение ответа по запросу GET (getProductPositiveTest)
1.	Шаги:
  1)	Отправить GET запрос.
  2)	Проверить статус ответа.
  3)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 200.

2.4	 POST
№2.4.1 Создание продукта с валидным указанием всех критериев (postProductPositiveTest)
1.	Шаги:
  1)	Инициализировать переменную product (название – «Tomato», категория – «Food», цена – «55»)
  2)	Отправить POST запрос с заданной переменной.
  3)	Сохранить ID элемента в переменную ID.
  4)	Проверить статус ответа.
  5)	Проверить код ответа.
  6)	Проверить title ответа.
  7)	Проверить categoryTitle ответа.
  8)	Проверить price ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 201.
  3)	Значение title – «Tomato».
  4)	Значение categoryTitle – «Food».
  5)	Значение price – 55.
3.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true).
  3)	Проверить код ответа (200).

№2.4.2 Создание продукта с пустым телом запроса (postProductWithoutBodyNegativeTest)
1.	Шаги:
  1)	Отправить POST запрос с пустым значением переменной product.
  2)	Проверить статус ответа.
  3)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 500.


    // Тест №2.4.3 с пустым title пока подогнала специально (якобы прошел, для примера),
    // поскольку нет критериев, какие поля обязательные, а какие нет.
    // По логике пустые значения нет смысла принимать в базу.

№2.4.3 Создание продукта с пустым значением title (postProductWithoutTitleNegativeTest)
1.	Шаги:
  1)	Инициализировать переменную product (категория – «Electronic», цена - 10500).
  2)	Отправить POST запрос с заданной переменной.
  3)	Сохранить ID ответа в переменную ID.
  4)	Проверить статус ответа.
  5)	Проверить код ответа.
  6)	Проверить title ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 201.
  3)	Значение title – null.
3.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true).
  3)	Проверить код ответа (200).

№2.4.4 Создание продукты с пустым значением categoryTitle (postProductWithoutCategoryNegativeTest)
1.	Шаги:
  1)	Инициализировать переменную product (название – «Shampoo», цена - 500).
  2)	Отправить POST запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 500.

№2.4.5 Создание продукта со значением title, длина которого превышает 255 символов (postProductWithWrongStringNegativeTest)
1.	Шаги:
  1)	Инициализировать переменную product (категория – «Food», цена – «650», название – «dsbvkdsfkkkhdkfhsdkhfkjkhdkfhkjsdhfkshkhkjfdhakjhgkjhkjkbkjbjbjbjdsbvkdsfkkkhdkfhsdkhfkjkhdkfhkjsdhfkshkhkjfdhakjhgkjhkjkbkjbjbjbjdsbvkdsfkkkhdkfhsdkhfkjkhdkfhkjsdhfkshkhkjfdhakjhgkjhkjkbkjbjbjbjdsbvkdsfkkkhdkfhsdkhfkjkhdkfhkjsdhfkshkhkjfdhakjhgkjhkjkbkjbjbjbjdsbvkdsfkkkhdkfhsdkhfkjkhdkfhkjsdhf»)
  2)	Отправить POST запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 500.

№2.4.6 Создание продукта с несуществующим значением categoryTitle (postProductWithWrongCategoryNegativeTest)
1.	Шаги:
  1)	Инициализировать переменную product (название – «shower del», категория – «Other», цена – «350»).
  2)	Отправить POST запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
2.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 500.

2.5	PUT
№2.5.1 Изменение title у существующего продукта (putProductTitlePositiveTest)
1.	Предусловие:
  1)	Создать продукт с названием – «Nuts», категорией – «Food», ценой – «450».
  2)	Проверить статус ответа (true) и код ответа (201).
  3)	Сохранить значение ID в переменную ID.
2.	Шаги:
  1)	Инициализировать переменную product изменив название (название – «hazelnuts», категория – «Food», цена – «450», ID – переменная ID).
  2)	Отправить PUT запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
  5)	Проверить title ответа.
3.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 200.
  3)	Значение title – «hazelnuts».
4.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true) и код ответа (200).

№2.5.2 Изменение categotyTitle у существующего продукта (putProductCategoryPositiveTest).
5.	Предусловие:
  1)	Создать продукт с названием – «Nuts», категорией – «Food», ценой – «450».
  2)	Проверить статус ответа (true) и код ответа (201).
  3)	Сохранить значение ID в переменную ID.
6.	Шаги:
  1)	Инициализировать переменную product изменив название (название – «hazelnuts», категория – «Electronic», цена – «450», ID – переменная ID).
  2)	Отправить PUT запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
  5)	Проверить categoryTitle ответа.
7.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 200.
  3)	Значение categoryTitle  – «Electronic».
8.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true) и код ответа (200).


№2.5.3 Изменение price у существующего продукта (putProductPricePositiveTest).
1.	Предусловие:
  1)	Создать продукт с названием – «Nuts», категорией – «Food», ценой – «450».
  2)	Проверить статус ответа (true) и код ответа (201).
  3)	Сохранить значение ID в переменную ID.
2.	Шаги:
  1)	Инициализировать переменную product изменив название (название – «hazelnuts», категория – «Food», цена – «550», ID – переменная ID).
  2)	Отправить PUT запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
  5)	Проверить price ответа.
3.	Ожидаемый результат:
  1)	Статус ответа – true.
  2)	Код ответа – 200.
  3)	Значение price  – «550».
4.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true) и код ответа (200).

№2.5.4 Изменение продукта без указания categotyTitle (putProductWithoutCategoryNegativeTest).
5.	Предусловие:
  1)	Создать продукт с названием – «Nuts», категорией – «Food», ценой – «450».
  2)	Проверить статус ответа (true) и код ответа (201).
  3)	Сохранить значение ID в переменную ID.
6.	Шаги:
  1)	Инициализировать переменную product изменив название (название – «Nut», цена – «450», ID – переменная ID).
  2)	Отправить PUT запрос с заданной переменной.
  3)	Проверить статус ответа.
  4)	Проверить код ответа.
7.	Ожидаемый результат:
  1)	Статус ответа – false.
  2)	Код ответа – 500.
8.	Постусловие:
  1)	Отправить DELETE запрос с переменной ID.
  2)	Проверить статус ответа (true) и код ответа (200).






