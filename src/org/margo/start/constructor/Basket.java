package org.margo.start.constructor;

public class Basket {
   private final short size;
   private int price;
   private Flower[] flowers;
   private int flowersInBasketCounter = 0;
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
      if (flowersInBasketCounter < size ) {
         flowers[flowersInBasketCounter] = flower;
         flowersInBasketCounter++;
      }
   }
   @Override
   public String toString() {
      String list = "";
      for (int i=0; i < size; i++) {
         list = list + flowers[i];
      }
      return "Basket size: " + size + " price: " + price + " flowers: " + list;
   }
}
