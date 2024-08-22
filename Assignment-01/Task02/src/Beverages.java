public abstract class Beverages {
    private boolean wantsExtras;

    protected abstract void brew();

    protected abstract void addCondiments();

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    protected void addExtras() {
        // Default implementation does nothing
    }
}
