/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;
import Business.*;

/**
 *
 * @author hp
 */
public class MainClass {

    private Product product;
    private Supplier supplier = new Supplier();

    public void create() {
        product = new Product();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.print("Enter Name:  ");
        product.setName(scan.nextLine());
        System.out.print("Enter Availability number:  ");
        product.setAvailNum(scan.nextInt());
        System.out.println("Enter Price:  ");
        product.setPrice(scan.nextDouble());
        scan.nextLine();
        System.out.println("Enter description:  ");
        product.setDescription(scan.nextLine());
        product.setSupplier(supplier);
        System.out.println("Enter Supplier name:  ");
        supplier.setSupplierName(scan.nextLine());
        System.out.println("Enter Supplier Address:  ");
        supplier.setSupplierAddress(scan.nextLine());

    }

    public void view() {
        Scanner scan = new Scanner(System.in);
        System.out.println(product.getName());
        System.out.println(product.getAvailNum());
        System.out.println(product.getPrice());

        System.out.println(product.getDescription());

        System.out.println(product.getSupplier().getSupplierName());
        System.out.println(product.getSupplier().getSupplierAddress());

    }

    public void update() {
        product = new Product();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.print("Enter Name:  ");
        product.setName(scan.nextLine());
        System.out.print("Enter Availability number:  ");
        product.setAvailNum(scan.nextInt());
        System.out.println("Enter Price:  ");
        product.setPrice(scan.nextDouble());
        scan.nextLine();
        System.out.println("Enter description:  ");
        product.setDescription(scan.nextLine());
        product.setSupplier(supplier);
        System.out.println("Enter Supplier name:  ");
        supplier.setSupplierName(scan.nextLine());
        System.out.println("Enter Supplier Address:  ");
        supplier.setSupplierAddress(scan.nextLine());

    }

    public static void main(String args[]) {
        int ch;
        MainClass mainclass = new MainClass();
        Scanner choose = new Scanner(System.in);
        mainclass.create();
        mainclass.view();

        System.out.println("Do you want to update ??  1 = yes 2 = no");
        ch = choose.nextInt();
        if (ch == 1) {
            mainclass.update();
            mainclass.view();
            System.exit(0);
        } else if (ch == 2) {
            System.exit(0);
        }

    }

}
