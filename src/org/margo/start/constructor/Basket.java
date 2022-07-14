package org.margo.start.constructor;

public class Basket {
   private final short size;
   private int price;
   public Basket(short size) {
      this.size = size;
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
   @Override
   public String toString() {
      return "Basket size: " + size + " price: " + price;

   }
}
