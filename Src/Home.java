class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private final String vegetables;
    private final String mayo;

    public Burger(String bun, String meat, String cheese, String vegetables, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.mayo = mayo;
        displayIngredients();
    }

    public Burger(String bun, String meat, String cheese, String vegetables) {
        this(bun, meat, cheese, vegetables, "немає");
    }
    public Burger(String bun, String meat, String cheese) {
        this(bun, meat, cheese, "немає");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
    }
    private void displayIngredients() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + vegetables);
        System.out.println("Майонез: " + mayo);
        System.out.println();
    }
}