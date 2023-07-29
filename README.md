#  Java Spring Boot Dependency Injection

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Spring Boot Dependency Injection

 ### Görev 1
 * Spring Initializr kullanarak bir Spring Boot projesi oluşturun.
 * İçerisinde ```Spring Web``` dependency eklenmeli.
 * Maven dependency management sistemini kullanarak tüm dependencyleri install edin.
 * Uygulamanızı  ```8585``` portundan ayağa kaldırın.
 * Spring devtools kullanarak uygulamanızın her değişim sonrasında kendisini restart etmesini sağlayınız.
 * Uygulamamızda ```main``` metodumuzun bulunduğu paket dışında iki adet daha paket tanımlayınız. ```model``` ve ```tax``` isminde olabilirler.
 * Uygulamamızda ```main``` metodumuzun bulunduğu paket içerisine ```rest``` isimli bir paket oluşturunuz.
 * ```rest``` paketi içerisinde ````DeveloperController```` isimli bir controller tanımlayınız.
 * ```model``` paketi içerisinde ````Developer```` isminde bir adet abstract class oluşturunuz. ```id, name, salary ve experience``` isimli 4 adet değişken tanımlayınız.
 * experience değeri enum tipinde olmalı JUNIOR, MID ve SENIOR değerlerinden birini almalı.
 * ````Developer```` sınıfı içerisinde tüm ````instance variable```` değerlerini set eden bir adet constructor tanımlayınız.
 * ```Developer``` sınıfını kullanan(ilişkinin nasıl olması gerektiğini siz tanımlamalısınız.) 3 ayrı sınıf tanımlayınız. ````JuniorDeveloper````, ````MidDeveloper````, ````SeniorDeveloper````
 
 ### Görev 2
 * tax paketinin içerisine bir adet ````Taxable```` isimli interface tanımlayınız.
 * İçerisinde ````getTaxRate```` isimli bir adet metod tanımlayınız.
 * ````DeveloperTax```` isimli bir adet sınıf yazınız. Taxable interface implement etmeli. getTaxRate methodu sizin belirleyeceğiniz bir değeri dönmeli.

 ### Görev 3
 * Controller sınıfı içerisinde bir adet ```developers``` adında Map tanımlayın. ```Map<Integer, Developer>``` şeklinde değer almalı.
 * DeveloperController sınıfı içerisinde bir adet constructor tanımlanmalı Taxable interface ```Dependency Injection``` yöntemiyle çağırılmalı
 * Amacımız CRUD işlemlerini tanımlayan endpointler yazmak. 
 * [GET]/workintech/developers => tüm developers mapinin value değerlerini ```List``` olarak döner.
 * [GET]/workintech/developers/{id} => ilgili id deki developer mapte varsa value değerini döner.
 * [POST]/workintech/developers => ```id, name, salary ve experience``` değerlerini alır, experience tipine bakarak uygun developer objesini oluşturup developers mapine ekler.
 * [PUT]/workintech/developers/{id} => İlgili id deki map değerini ```Request Body``` içerisinden aldığı id değeri ile günceller.
 * [DELETE]/workintech/developers/{id} => İlgili id değerini mapten siler.
 * Tüm endpointlerin dönüş değerleri JSON formatında olmalı.
 
