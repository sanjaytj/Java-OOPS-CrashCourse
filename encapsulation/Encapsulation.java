package org.example.javaSamplePrograms.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(31000);
        System.out.println(l1.getPrice());
    }
    //1. public doWork is accessible even in the ClassAndObjects at point [32]
//     void doWork()
//    {
//        System.out.println("working working");
//    }

    /*
    2. when made private - doWork is accessible in only this class (Not even in diff class in same package)
     private void doWork()
    {
        System.out.println("working working");
    }
     */
    static class Laptop
    {
        int ram;
        private int price;

        public void setPrice(int price)
        {
            //4. to make it more encapsulated (only Admin can change price)

            //5. check if user is Admin
//            boolean isAdmin = false;
            boolean isAdmin = true;
            if(!isAdmin) //6. if not an admin
            {
                System.out.println("You cannot change the price");
            }
            else
            {
                //3. Does not let to change the price if not an Admin
                this.price = price;
            }

        }
//4. rightClick -> Generate -> gettersSetters -> click on ram and price
        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getPrice() {
            return price;
        }
    }

}
