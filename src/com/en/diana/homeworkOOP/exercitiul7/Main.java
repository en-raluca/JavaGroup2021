package com.en.diana.homeworkOOP.exercitiul7;

public class Main {
    public static void main(String[] args) {
        PaperBook carte = new PaperBook("Acolo unde canta racii", "Delia Owens", 50, 54,
                "Carturesti", "Str. Unirii");
        ElectronicBook eBook = new ElectronicBook("Imparatul mustelor", "Wwilliam Golding", 69,
                "Amazon", "electronic");
        System.out.println(carte.applyShippingCost(15));
        carte.setCostTransport(78);
        System.out.println(eBook.getFormat());
        String site = eBook.getNameOfWebsiteShop();
        System.out.println(site);
        carte.setCostTransport(7.6);
        System.out.println(carte.getCostTransport());
    }
}
