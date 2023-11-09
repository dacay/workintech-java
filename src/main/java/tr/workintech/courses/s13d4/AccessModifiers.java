package tr.workintech.courses.s13d4;

public class AccessModifiers {

    // Access modifier, siniftaki bir "elemanin" kimler tarafindan erisilebildigini belirleyen anahtar kelimelerdir.

    // private -> sadece ve sadece sinifin icinden erisilebilir
    private int x = 1;

    // package-level -> sinifin icinden ve ayni package'daki elemanlardan erisilebiliyor
    int y = 2;

    // protected -> sinifin icinden, alt siniflardan ve ayni package'daki siniflardan erisilebiliyor
    protected int z = 3;

    // public -> her yerden erisilebilir
    public int t = 4;

    private void privateHelperMethod() {

    }

    void packageLevelMethod() {

    }

    protected void protectedMethod() {

    }

    public void publicMethod() {

    }
}
