package pwo.lab09.builder;

import java.util.Scanner;

public class _run {

    public static void main(String[] args) {
        TxtPic1 txtPic = new TxtPic1('.', '*', 20, "txtpic1.txt");
        txtPic.save();
        TxtPic2 txtPic2 = new TxtPic2();

        txtPic2
                .setBackground('_')
                .setForeground('*')
                .setSize(20)
                .setFileName("txtpic2.txt")
                .createTxtPic()
                .save();
        
        TxtPic3 txtPic3 = new TxtPic3();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Podaj znak tła:");
        char background = sc.next().charAt(0);
        
        System.out.println("Podaj znak obrazka:");
        char foreground = sc.next().charAt(0);
        
        System.out.println("Podaj rozmiar:");
        int size = sc.nextInt();

        txtPic3
                .setBackground(background)
                .setForeground(foreground)
                .setSize(size)
                .setFileName("txtpic3.txt")
                .createTxtPic()
                .save();
    }
}
