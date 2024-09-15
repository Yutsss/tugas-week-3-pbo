**Nama :** Adyuta Prajahita Murdianto

**NRP :** 5025221186

**Kelas :** PBO A

## **Code**

```java
public class TicketMachine

{
    private int price; 

    private int balance;

    private int total;



    /**

     * Constructor for objects of class TicketMachine

     */

    public TicketMachine(int inputPrice)

    {

        if(inputPrice > 0){

            this.price = inputPrice;

        } else {

            this.price = 20;

        }

        this.balance = 0;

        this.total = 0;

    }

    public int getBalance()

    {

        return balance;

    }

    
    public int getPrice()

    {

        return price;

    }

    

    public void insertMoney(int amount)

    {

        if(amount > 0){

            balance = balance + amount;

        }else{

            System.out.println("Use a positive amount: " + amount);

        }

    }

    

    public void print()

    {

        if(balance >= price) {

            System.out.println("#######################");

            System.out.println("# The BlueJ Line");

            System.out.println("# Ticket");

            System.out.println("# " + this.price + " cents.");

            System.out.println("#######################");

            System.out.println();


            total = total + price;

            balance -= price;

        } else {

            System.out.println("You must insert at least: " + 

            (this.price - this.balance) + " more cents.");

        }

    }

}
```

## **Penjelasan**

**Attribute

```java
    private int price; 

    private int balance;

    private int total;
```

`Price: ` Harga ticket.

`Balance: ` Total uang dari customer.

`total: ` Total pembelian yang dilakukan oleh customer.

**Constructor**

```java
    public TicketMachine(int inputPrice)

    {

        if(inputPrice > 0){

            this.price = inputPrice;

        } else {

            this.price = 20;

        }

        this.balance = 0;

        this.total = 0;

    }
```

Constructor pada class `TicketMachine` digunakan untuk set value setiap attributenya. Constructor menerima sebuah parameter `inputPrice` yang akan menjadi value dari `price`. Ketika value `inputPrice` yang di inputkan kurang dari sama dengan `0`, maka value `price` akan di set dengan default value `20`. Untuk attribute lainnya akan di set ke `0`.

**Methods**

``getBalance``

```java
    public int getBalance()

    {

        return balance;

    }
```

Method ini digunakan untuk mendapatkan nilai `balance` saat ini. 

``getPrice``

```java
    public int getPrice()

    {

        return price;

    }
```

Method ini digunakan untuk mendapatkan nilai `price` atau harga dari tiket.

``insertMoney``

```java
    public void insertMoney(int amount)

    {

        if(amount > 0){

            balance = balance + amount;

        }else{

            System.out.println("Use a positive amount: " + amount);

        }

    }
```

Method ini digunakan untuk menambah atau top-up uang yang dimiliki oleh customer. Method ini menerima parameter berupa `amount` atau jumlah uang yang ingin ditambahkan ke saldo customer. Value `amount` yang diterima hanya nilai yang sesuai atau lebih dari `0`. Ketika tidak sesuai atau kurang dari `0`, maka nilai `balance` tidak akan diupdate dan akan menampilkan pesan error beserta nilai `amount` yang diinputkan.

``print``

```java
    public void print()

    {

        if(balance >= price) {

            System.out.println("#######################");

            System.out.println("# The BlueJ Line");

            System.out.println("# Ticket");

            System.out.println("# " + this.price + " cents.");

            System.out.println("#######################");

            System.out.println();


            total = total + price;

            balance -= price;

        } else {

            System.out.println("You must insert at least: " + 

            (this.price - this.balance) + " more cents.");

        }

    }
```

Method ini digunakan untuk menghandle sistem pembelian tiket. Ketika uang dari customer cukup untuk membeli tiket, maka tiket akan tercetak, lalu `total` dan `balace` akan diupdate. Jika uang customer tidak cukup, sistem akan mencetak pesan error serta berapa kekurangan uamg yang dibutuhkan oleh customer untuk membeli tiket.