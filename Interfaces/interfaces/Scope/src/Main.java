public class Main {
    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVar1());
        System.out.println(var4);
        scopeInstance.timesTwo();

        ScopeCheck.InnerClass;
    }
}
