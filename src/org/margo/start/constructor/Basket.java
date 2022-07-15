package org.margo.start.constructor;

public class Basket {
   private final short size;
   private int price;

   private Flower[] flowers;
   public Basket(short size) {
      this.size = size;
      this.flowers = new Flower[size];
   }
   public short getSize() {
      return size;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public int getPrice() {
      return price;
   }
   // Корзина принимает цветок
   public void putFlower(Flower flower) {
      flower[0] = "1";
      }

   @Override
   public String toString() {
      return "Basket size: " + size + " price: " + price;
   }

}
