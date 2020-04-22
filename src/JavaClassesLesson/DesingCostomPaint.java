package JavaClassesLesson;

public class DesingCostomPaint extends DesingPaint {
    protected String glossy;
    protected String extraGlossy;
    protected String durable;
    protected String superDurable;

    public DesingCostomPaint(String colorName, double sqFeet, double totalPrice, String glossy, String extraGlossy, String durable, String superDurable) {
        super(colorName, sqFeet, totalPrice);
        this.glossy = glossy;
        this.extraGlossy = extraGlossy;
        this.durable = durable;
        this.superDurable = superDurable;
    }

    public DesingCostomPaint(String colorName, double sqFeet, double totalPrice) {
        super(colorName, sqFeet, totalPrice);
    }
    public String changeGloss(String newGloss){
        this.glossy=newGloss;
        return glossy;
    }
    public String changeDurability(String newDurability){
        this.durable=newDurability;
        return durable;

    }
    public double calculateCustomPrice() {
        double pricePerGallon = 32.99;
        if (this.glossy.equalsIgnoreCase("glossy")) {
            pricePerGallon += 2;
        } else if (this.glossy.equalsIgnoreCase("extra Glossy")) {
            pricePerGallon += 3;
        } else {
            System.out.println("no proper value");
        }
        if (this.durable.equalsIgnoreCase("Durable")) {
            pricePerGallon += 2;
        } else if (this.superDurable.equalsIgnoreCase("Extra Durable")) {
            pricePerGallon += 3;
        } else {
            System.out.println(" no Value at all");
        }
        return pricePerGallon;
    }}
