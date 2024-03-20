# Задача 8. Подбор пароля

Вы “ответственно” подходите к информационной безопасности и храните свои пароли в файлах в виде MD5-хешей (https://ru.wikipedia.org/wiki/MD5, https://www.baeldung.com/java-md5).

Но, к сожалению, вы забыли и никак не можете вспомнить свой пароль от учетной записи в почте. Хотя у вас остался его хеш 40682260CC011947FC2D0B1A927138C5. Вы точно помните, что пароль состоял из 7 букв латинского алфавита, и что все они были строчными.

Для генерации хеша вы используете функцию hashPassword

```
private static final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

private static String toHexString(byte[] bytes) {
  StringBuilder hex = new StringBuilder(bytes.length * 2);
  for (byte b : bytes) {
    hex.append(HEX_DIGITS[(b & 0xff) >> 4]);
    hex.append(HEX_DIGITS[b & 0x0f]);
  }
  return hex.toString();
}

private static String hashPassword(String password) {
  MessageDigest digest;
  try {
    digest = MessageDigest.getInstance("MD5");
  } catch (NoSuchAlgorithmException e) {
    throw new RuntimeException(e);
  }
  digest.update(password.getBytes());
  byte[] bytes = digest.digest();
  return toHexString(bytes);
}

```

Напишите программу, которая методом полного перебора (https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BB%D0%BD%D1%8B%D0%B9_%D0%BF%D0%B5%D1%80%D0%B5%D0%B1%D0%BE%D1%80) напомнит вам пароль. Причем за наиболее короткий срок - пароль вам нужен как можно быстрее. Для ускорения процесса вы решили перебор выполнять в несколько потоков.

Количество потоков - входные данные для программы, задается первым аргументом командной строки. Хеш пароля - вторым аргументом. Найденный пароль печатается в стандартный поток вывода.


Доп.задание (не учитывается при простановке баллов): переведите задачу на virtual threads. Сравните производительность, зафиксируйте и запишите результаты сравнения