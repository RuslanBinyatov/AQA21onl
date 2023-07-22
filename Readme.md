### **End-2-end тест-кейс "Совершение покупки в интернет-магазине"**

1. Перейти на сайт https://www.saucedemo.com
2. Ввести логин, выбрать из списка (например standard_user)
3. Ввести пароль secret_sauce
4. Нажать кнопку "Login"
5. Выбрать любой прайс, нажать кнопку "Add to card"
6. Перейти в карзину кликнув на значёк в верхнем правом углу
7. Нажать кнопку "Checkout"
8. В поле "First name" ввести свое имя
9. В поле "Last name" ввести свою фамилию
10. В поле "Zip/Postal Code" ввести любое трехзначное число
11. Нажать кнопку "Continue"
12. Нажать кнопку "Finish"

**Ожидаемый результат:** отображается надпись
"Thank you for your order!"


## End to End Test
### Steps to reproduce
1. Open **Authorization page** https://www.saucedemo.com
2. Enter Username "standard_user"
3. Enter Password "secret_sauce"
4. Click on the button "Login"
5. On the **Products page** add product "Backpack" to cart
6. Click shopping cart link
7. On the **Cart page** click on the button "Checkout"
8. Enter First Name "Duke" in the form on the **Checkout page**
9. Enter Last Name "Poul"
10. Enter Zip/Postal Code "453"
11. Click on the button "Continue"
12. On the **Overview page** click on the button "Finish"